/*
 * Copyright (c) 2026 AVI-SPL, Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.avispl.symphony.api.dal.dto.control.AdvancedControllableProperty;

/**
 * Historical (dynamic) statistics: a property without a value is not reported as a null statistic (SYAL-1412).
 */
@Tag("unitTest")
public class CiscoHistoricalPropertiesTest {

	private static final String TEMPERATURE = "SystemUnit#HardwareTemperature(C)";
	private static final String ACTIVE_CALLS = "SystemUnit#ActiveCallsNumber";
	private static final String MUTE = "Audio#MicrophonesMute";

	private void addTypedStatisticsParameter(CiscoCommunicator communicator, Map<String, String> statistics, Map<String, String> dynamicStatistics,
			String name, String value) throws Exception {
		Method method = CiscoCommunicator.class.getDeclaredMethod("addTypedStatisticsParameter", Map.class, Map.class, String.class, String.class);
		method.setAccessible(true);
		method.invoke(communicator, statistics, dynamicStatistics, name, value);
	}

	@Test
	void testNullHistoricalValueNotReported() throws Exception {
		CiscoCommunicator communicator = new CiscoCommunicator();
		communicator.setHistoricalProperties("HardwareTemperature(C),ActiveCallsNumber");
		Map<String, String> statistics = new HashMap<>();
		Map<String, String> dynamicStatistics = new HashMap<>();

		addTypedStatisticsParameter(communicator, statistics, dynamicStatistics, TEMPERATURE, null);

		Assertions.assertFalse(statistics.containsKey(TEMPERATURE), "null value must not be put into statistics");
		Assertions.assertFalse(dynamicStatistics.containsKey(TEMPERATURE));
	}

	@Test
	void testHistoricalValueReportedAsDynamic() throws Exception {
		CiscoCommunicator communicator = new CiscoCommunicator();
		communicator.setHistoricalProperties("HardwareTemperature(C),ActiveCallsNumber");
		Map<String, String> statistics = new HashMap<>();
		Map<String, String> dynamicStatistics = new HashMap<>();

		addTypedStatisticsParameter(communicator, statistics, dynamicStatistics, ACTIVE_CALLS, "0");

		Assertions.assertEquals("0", dynamicStatistics.get(ACTIVE_CALLS));
		Assertions.assertFalse(statistics.containsKey(ACTIVE_CALLS));
	}

	@Test
	void testNullRegularValueNotReported() throws Exception {
		CiscoCommunicator communicator = new CiscoCommunicator();
		Map<String, String> statistics = new HashMap<>();
		Map<String, String> dynamicStatistics = new HashMap<>();

		addTypedStatisticsParameter(communicator, statistics, dynamicStatistics, TEMPERATURE, null);

		Assertions.assertFalse(statistics.containsKey(TEMPERATURE));
	}

	/**
	 * SYAL-1411: after a mute control, a status requested before the control doesn't revert MicrophonesMute; a status
	 * requested after it does.
	 */
	@Test
	void testMicrophonesMuteKeptUntilFreshStatus() throws Exception {
		CiscoCommunicator communicator = new CiscoCommunicator();
		long controlTime = System.currentTimeMillis();
		setField(communicator, "pendingMicrophonesMute", Boolean.TRUE);
		setField(communicator, "pendingMicrophonesMuteTimestamp", controlTime);
		Method apply = CiscoCommunicator.class.getDeclaredMethod("applyPendingMicrophonesMute", Map.class, List.class);
		apply.setAccessible(true);

		for (long statusRequested : new long[] { controlTime - 1000, controlTime + 1000 }) {
			setField(communicator, "ciscoStatusRequestTimestamp", statusRequested);
			Map<String, String> statistics = new HashMap<>();
			statistics.put(MUTE, "Off");
			List<AdvancedControllableProperty> controls = new ArrayList<>();
			controls.add(new AdvancedControllableProperty(MUTE, new Date(), new AdvancedControllableProperty.Switch(), 0));
			apply.invoke(communicator, statistics, controls);

			boolean stale = statusRequested < controlTime;
			Assertions.assertEquals(stale ? "On" : "Off", statistics.get(MUTE));
			Assertions.assertEquals(stale ? 1 : 0, controls.get(0).getValue());
		}
	}

	private static void setField(CiscoCommunicator communicator, String name, Object value) throws Exception {
		Field field = CiscoCommunicator.class.getDeclaredField(name);
		field.setAccessible(true);
		field.set(communicator, value);
	}
}
