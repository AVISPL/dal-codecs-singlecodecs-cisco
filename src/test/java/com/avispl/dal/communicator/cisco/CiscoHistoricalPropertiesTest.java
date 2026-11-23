/*
 * Copyright (c) 2026 AVI-SPL, Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Historical (dynamic) statistics: a property without a value is not reported as a null statistic (SYAL-1412).
 */
@Tag("unitTest")
public class CiscoHistoricalPropertiesTest {

	private static final String TEMPERATURE = "SystemUnit#HardwareTemperature(C)";
	private static final String ACTIVE_CALLS = "SystemUnit#ActiveCallsNumber";

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
}
