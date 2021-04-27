/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Output class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationOutput {
    @XmlElement(name = "Line")

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
