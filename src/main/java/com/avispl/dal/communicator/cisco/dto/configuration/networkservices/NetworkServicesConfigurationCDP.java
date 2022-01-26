/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Services Configuration CDP(Cisco Discovery Protocol) class.
 * It is a Layer 2, media-independent, and network-independent protocol that runs on
 * Cisco devices and enables networking applications to learn about directly connected devices nearby.
 * This protocol facilitates the management of Cisco devices by discovering these devices,
 * determining how they are configured, and allowing systems using different network-layer protocols to learn about each other.
 *
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NetworkServicesConfigurationCDP {
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@link #mode}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
