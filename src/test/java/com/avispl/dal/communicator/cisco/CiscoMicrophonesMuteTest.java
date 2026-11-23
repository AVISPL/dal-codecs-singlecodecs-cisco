/*
 * Copyright (c) 2026 AVI-SPL, Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import com.avispl.symphony.api.dal.dto.control.AdvancedControllableProperty;
import com.avispl.symphony.api.dal.dto.control.ControllableProperty;

/**
 * MicrophonesMute keeps the value set by the user until the device reports a status requested after the control (SYAL-1411).
 */
@Tag("unitTest")
public class CiscoMicrophonesMuteTest {

	private static final String MUTE = "Audio#MicrophonesMute";

	/** Communicator that answers every putxml with status OK, without a device. */
	static class TestCommunicator extends CiscoCommunicator {
		final List<Object> posted = new ArrayList<>();

		@Override
		@SuppressWarnings("unchecked")
		protected <Request, Response> Response doPost(String uri, Request request, Class<Response> responseClass) {
			posted.add(request);
			return (Response) "<Command><MicrophonesMuteResult status=\"OK\"/></Command>";
		}

		@Override
		protected <Request> ResponseEntity<?> doPost(String uri, Request request) {
			posted.add(request);
			return ResponseEntity.ok().build();
		}
	}

	private TestCommunicator communicator;

	@BeforeEach
	void setUp() {
		communicator = new TestCommunicator();
		communicator.setHost("127.0.0.1");
	}

	private void control(String value) throws Exception {
		ControllableProperty property = new ControllableProperty();
		property.setProperty(MUTE);
		property.setValue(value);
		communicator.controlProperty(property);
	}

	private boolean isControlCoolDown() throws Exception {
		Method method = CiscoCommunicator.class.getDeclaredMethod("isValidControlCoolDown");
		method.setAccessible(true);
		return (boolean) method.invoke(communicator);
	}

	private void setStatusRequestTimestamp(long timestamp) throws Exception {
		Field field = CiscoCommunicator.class.getDeclaredField("ciscoStatusRequestTimestamp");
		field.setAccessible(true);
		field.setLong(communicator, timestamp);
	}

	private void applyPendingMute(Map<String, String> statistics, List<AdvancedControllableProperty> controls) throws Exception {
		Method method = CiscoCommunicator.class.getDeclaredMethod("applyPendingMicrophonesMute", Map.class, List.class);
		method.setAccessible(true);
		method.invoke(communicator, statistics, controls);
	}

	private List<AdvancedControllableProperty> muteSwitch(int value) {
		List<AdvancedControllableProperty> controls = new ArrayList<>();
		AdvancedControllableProperty.Switch toggle = new AdvancedControllableProperty.Switch();
		toggle.setLabelOn("On");
		toggle.setLabelOff("Off");
		controls.add(new AdvancedControllableProperty(MUTE, new java.util.Date(), toggle, value));
		return controls;
	}

	/**
	 * Mute goes through the regular control path: the response is checked and the control cooldown starts, so the next
	 * poll serves the cached state instead of rebuilding it from the device status.
	 */
	@Test
	void testMuteStartsControlCooldown() throws Exception {
		control("1");
		Assertions.assertEquals(1, communicator.posted.size());
		Assertions.assertTrue(isControlCoolDown());
	}

	/**
	 * A status requested before the mute control still says Off: the toggle and the statistic keep On.
	 */
	@Test
	void testStaleStatusDoesNotRevertMute() throws Exception {
		setStatusRequestTimestamp(System.currentTimeMillis() - 10000);
		control("1");

		Map<String, String> statistics = new HashMap<>();
		statistics.put(MUTE, "Off");
		List<AdvancedControllableProperty> controls = muteSwitch(0);
		applyPendingMute(statistics, controls);

		Assertions.assertEquals("On", statistics.get(MUTE));
		Assertions.assertEquals(1, controls.get(0).getValue());
	}

	/**
	 * A status requested after the control is the source of truth again.
	 */
	@Test
	void testFreshStatusWins() throws Exception {
		control("1");
		Thread.sleep(5);
		setStatusRequestTimestamp(System.currentTimeMillis());

		Map<String, String> statistics = new HashMap<>();
		statistics.put(MUTE, "Off");
		List<AdvancedControllableProperty> controls = muteSwitch(0);
		applyPendingMute(statistics, controls);

		Assertions.assertEquals("Off", statistics.get(MUTE));
		Assertions.assertEquals(0, controls.get(0).getValue());
	}
}
