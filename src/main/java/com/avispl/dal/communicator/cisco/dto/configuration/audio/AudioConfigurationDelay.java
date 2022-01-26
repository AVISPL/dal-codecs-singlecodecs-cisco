/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration Delay class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AudioConfigurationDelay {
    @JacksonXmlProperty(localName="DelayMs")
    private ValueSpaceRefHolder delayMs;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@link #delayMs}
     *
     * @return value of {@link #delayMs}
     */
    public ValueSpaceRefHolder getDelayMs() {
        return delayMs;
    }

    /**
     * Sets {@code delayMs}
     *
     * @param delayMs the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDelayMs(ValueSpaceRefHolder delayMs) {
        this.delayMs = delayMs;
    }

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
