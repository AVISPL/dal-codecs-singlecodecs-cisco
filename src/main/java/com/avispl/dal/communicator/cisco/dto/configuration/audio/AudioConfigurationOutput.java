/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration Output class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioConfigurationOutput {
    @JacksonXmlProperty(localName="Line")
    @JacksonXmlElementWrapper(useWrapping = false)
    private AudioConfigurationLine[] lines;

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
}
