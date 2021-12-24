/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio input status class.
 * Represents an audio input status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioInput {
    @JacksonXmlProperty(localName="Connectors")
    private AudioInputConnectors connectors;

    /**
     * Retrieves {@code {@link #connectors}}
     *
     * @return value of {@link #connectors}
     */
    public AudioInputConnectors getConnectors() {
        return connectors;
    }

    /**
     * Sets {@code connectors}
     *
     * @param connectors the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioInputConnectors} field
     */
    public void setConnectors(AudioInputConnectors connectors) {
        this.connectors = connectors;
    }
}
