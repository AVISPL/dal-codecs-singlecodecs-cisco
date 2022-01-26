/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * Device User Interface Configuration OSD class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class UserInterfaceConfigurationOSD {
    @JacksonXmlProperty(localName="Output")
    private ValueSpaceRefHolder output;

    /**
     * Retrieves {@link #output}
     *
     * @return value of {@link #output}
     */
    public ValueSpaceRefHolder getOutput() {
        return output;
    }

    /**
     * Sets {@code output}
     *
     * @param output the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setOutput(ValueSpaceRefHolder output) {
        this.output = output;
    }
}
