/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Cameras Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfiguration {
    @XmlElement(name = "Camera")
    private CamerasConfigurationCamera[] cameras;
    @XmlElement(name = "Preset")
    private CamerasConfigurationPreset preset;

    /**
     * Retrieves {@code {@link #cameras}}
     *
     * @return value of {@link #cameras}
     */
    public CamerasConfigurationCamera[] getCameras() {
        return cameras;
    }

    /**
     * Sets {@code cameras}
     *
     * @param cameras the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationCamera[]} field
     */
    public void setCameras(CamerasConfigurationCamera[] cameras) {
        this.cameras = cameras;
    }

    /**
     * Retrieves {@code {@link #preset}}
     *
     * @return value of {@link #preset}
     */
    public CamerasConfigurationPreset getPreset() {
        return preset;
    }

    /**
     * Sets {@code preset}
     *
     * @param preset the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationPreset} field
     */
    public void setPreset(CamerasConfigurationPreset preset) {
        this.preset = preset;
    }
}
