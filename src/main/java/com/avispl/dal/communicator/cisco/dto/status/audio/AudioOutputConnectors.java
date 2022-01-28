/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio output connectos status class.
 * Represents an audio output connectors status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioOutputConnectors {
    @JacksonXmlProperty(localName="Line")
    @JacksonXmlElementWrapper(useWrapping = false)
    private AudioOutputLine[] lines;

    /**
     * Retrieves {@link #lines}
     *
     * @return value of {@link #lines}
     */
    public AudioOutputLine[] getLines() {
        return lines;
    }

    /**
     * Sets {@code lines}
     *
     * @param lines the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioOutputLine[]} field
     */
    public void setLines(AudioOutputLine[] lines) {
        this.lines = lines;
    }
}
