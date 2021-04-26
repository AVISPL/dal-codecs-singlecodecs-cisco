/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Cameras Configuration Brightness class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfigurationBrightness {
    @XmlElement(name = "DefaultLevel")
    private ValueSpaceRefHolder defaultLevel;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@code {@link #defaultLevel}}
     *
     * @return value of {@link #defaultLevel}
     */
    public ValueSpaceRefHolder getDefaultLevel() {
        return defaultLevel;
    }

    /**
     * Sets {@code defaultLevel}
     *
     * @param defaultLevel the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultLevel(ValueSpaceRefHolder defaultLevel) {
        this.defaultLevel = defaultLevel;
    }

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
}
