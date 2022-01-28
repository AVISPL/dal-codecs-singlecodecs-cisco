/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio output status class.
 * Represents an audio output status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioOutput {
    @JacksonXmlProperty(localName="Connectors")
    private AudioOutputConnectors connectors;

    /**
     * Retrieves {@link #connectors}
     *
     * @return value of {@link #connectors}
     */
    public AudioOutputConnectors getConnectors() {
        return connectors;
    }

    /**
     * Sets {@code connectors}
     *
     * @param connectors the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioOutputConnectors} field
     */
    public void setConnectors(AudioOutputConnectors connectors) {
        this.connectors = connectors;
    }
}
