/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Proximity Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProximityConfiguration {
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;
    @JacksonXmlProperty(localName="Services")
    private ProximityConfigurationServices services;

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

    /**
     * Retrieves {@link #services}
     *
     * @return value of {@link #services}
     */
    public ProximityConfigurationServices getServices() {
        return services;
    }

    /**
     * Sets {@code services}
     *
     * @param services the {@code com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfigurationServices} field
     */
    public void setServices(ProximityConfigurationServices services) {
        this.services = services;
    }
}
