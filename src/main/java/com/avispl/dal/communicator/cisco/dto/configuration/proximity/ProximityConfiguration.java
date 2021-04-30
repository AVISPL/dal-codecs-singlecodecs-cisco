/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Proximity Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ProximityConfiguration {
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "Services")
    private ProximityConfigurationServices services;

    /**
     * Retrieves {@code {@link #mode}}
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
     * Retrieves {@code {@link #services}}
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
