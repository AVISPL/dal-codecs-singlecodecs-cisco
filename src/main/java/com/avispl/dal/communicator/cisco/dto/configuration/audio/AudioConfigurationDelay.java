/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Delay class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationDelay {
    @XmlElement(name = "DelayMs")
    private ValueSpaceRefHolder delayMs;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@code {@link #delayMs}}
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
