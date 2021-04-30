/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Input class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationInput {
    @XmlElement(name = "MicrophoneMode")
    private ValueSpaceRefHolder microphoneMode;
    @XmlElement(name = "Line")
    private AudioConfigurationLine[] lines;
    @XmlElement(name = "Microphone")
    private AudioConfigurationMicrophone[] microphones;

    /**
     * Retrieves {@code {@link #microphoneMode}}
     *
     * @return value of {@link #microphoneMode}
     */
    public ValueSpaceRefHolder getMicrophoneMode() {
        return microphoneMode;
    }

    /**
     * Sets {@code microphoneMode}
     *
     * @param microphoneMode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMicrophoneMode(ValueSpaceRefHolder microphoneMode) {
        this.microphoneMode = microphoneMode;
    }

    /**
     * Retrieves {@code {@link #lines}}
     *
     * @return value of {@link #lines}
     */
    public AudioConfigurationLine[] getLines() {
        return lines;
    }

    /**
     * Sets {@code lines}
     *
     * @param lines the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationLine[]} field
     */
    public void setLines(AudioConfigurationLine[] lines) {
        this.lines = lines;
    }

    /**
     * Retrieves {@code {@link #microphones}}
     *
     * @return value of {@link #microphones}
     */
    public AudioConfigurationMicrophone[] getMicrophones() {
        return microphones;
    }

    /**
     * Sets {@code microphones}
     *
     * @param microphones the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationMicrophone[]} field
     */
    public void setMicrophones(AudioConfigurationMicrophone[] microphones) {
        this.microphones = microphones;
    }
}
