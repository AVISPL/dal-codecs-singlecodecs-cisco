/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * Device User Interface Configuration Awake Branding class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class UserInterfaceConfigurationAwakeBranding {
    @JacksonXmlProperty(localName="Colors")
    private ValueSpaceRefHolder colors;

    /**
     * Retrieves {@code {@link #colors}}
     *
     * @return value of {@link #colors}
     */
    public ValueSpaceRefHolder getColors() {
        return colors;
    }

    /**
     * Sets {@code colors}
     *
     * @param colors the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setColors(ValueSpaceRefHolder colors) {
        this.colors = colors;
    }
}
