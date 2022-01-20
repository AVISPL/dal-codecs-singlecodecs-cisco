/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Cameras Configuration Backlights class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CamerasConfigurationBacklight {
    @JacksonXmlProperty(localName="DefaultMode")
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
