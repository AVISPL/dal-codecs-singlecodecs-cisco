/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.statistics;

import java.util.Arrays;
import java.util.Optional;

/**
 * DynamicStatisticsDefinitions contains definitions for Dynamic property candidates.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * @since 1.2.0
 * */
public enum DynamicStatisticsDefinitions {
    ActiveCallsNumber("SystemUnit#ActiveCallsNumber"),
    SuspendedCallsNumber("SystemUnit#SuspendedCallsNumber"),
    InProgressCallsNumber("SystemUnit#InProgressCallsNumber"),
    HardwareTemperature("SystemUnit#HardwareTemperature(C)"),
    CurrentPeopleCount("RoomAnalytics#CurrentPeopleCount"),
    SoundLevelA("RoomAnalytics#SoundLevelA"),
    AmbientNoiseLevelA("RoomAnalytics#AmbientNoiseLevelA");

    private final String name;
    DynamicStatisticsDefinitions(final String name) {
        this.name = name;
    }

    /**
     * Retrieves {@link #name}
     *
     * @return value of {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * Check if dynamic property definition exists, by name.
     *
     * @param name of the property to check
     * @return true if definition exists, false otherwise
     * */
    public static boolean checkIfExists(String name) {
        Optional<DynamicStatisticsDefinitions> dynamicStatisticsProperty = Arrays.stream(DynamicStatisticsDefinitions.values()).filter(c -> name.contains(c.getName())).findFirst();
        if (dynamicStatisticsProperty.isPresent()) {
            return true;
        }
        return false;
    }
}
