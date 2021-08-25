/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Audio output connectos status class.
 * Represents an audio output connectors status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioOutputConnectors {
    @XmlElement(name = "Line")
    private AudioOutputLine[] lines;

    /**
     * Retrieves {@code {@link #lines}}
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
