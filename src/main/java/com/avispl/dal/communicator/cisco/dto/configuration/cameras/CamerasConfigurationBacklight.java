/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Cameras Configuration Backlings class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfigurationBacklight {
    @XmlElement(name = "DefaultMode")
    private ValueSpaceRefHolder defaultMode;

    /**
     * Retrieves {@code {@link #defaultMode}}
     *
     * @return value of {@link #defaultMode}
     */
    public ValueSpaceRefHolder getDefaultMode() {
        return defaultMode;
    }

    /**
     * Sets {@code defaultMode}
     *
     * @param defaultMode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultMode(ValueSpaceRefHolder defaultMode) {
        this.defaultMode = defaultMode;
    }
}
