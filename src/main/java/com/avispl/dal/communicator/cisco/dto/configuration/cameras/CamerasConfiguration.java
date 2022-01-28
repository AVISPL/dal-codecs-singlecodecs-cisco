/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Cameras Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CamerasConfiguration {
    @JacksonXmlProperty(localName="Camera")
    @JacksonXmlElementWrapper(useWrapping = false)
    private CamerasConfigurationCamera[] cameras;
    @JacksonXmlProperty(localName="Preset")
    private CamerasConfigurationPreset preset;

    /**
     * Retrieves {@link #cameras}
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
     * Retrieves {@link #preset}
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
