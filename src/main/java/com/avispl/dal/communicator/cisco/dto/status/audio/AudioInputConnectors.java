/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio input connectors status class.
 * Represents an audio input connectors status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioInputConnectors {
    @JacksonXmlProperty(localName="Microphone")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Microphone[] microphones;

    /**
     * Retrieves {@link #microphones}
     *
     * @return value of {@link #microphones}
     */
    public Microphone[] getMicrophones() {
        return microphones;
    }

    /**
     * Sets {@code microphones}
     *
     * @param microphones the {@code com.avispl.dal.communicator.cisco.dto.status.audio.Microphone[]} field
     */
    public void setMicrophones(Microphone[] microphones) {
        this.microphones = microphones;
    }
}
