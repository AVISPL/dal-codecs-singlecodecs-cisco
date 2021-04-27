/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Audio input connectors status class.
 * Represents an audio input connectors status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioInputConnectors {
    @XmlElement(name = "Microphone")
    private Microphone[] microphones;

    /**
     * Retrieves {@code {@link #microphones}}
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
