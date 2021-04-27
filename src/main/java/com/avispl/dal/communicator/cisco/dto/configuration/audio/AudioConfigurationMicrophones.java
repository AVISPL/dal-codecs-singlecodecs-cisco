/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Microphone Mute class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationMicrophones {
    @XmlElement(name = "Mute")
    private AudioConfigurationMute mute;

    /**
     * Retrieves {@code {@link #mute}}
     *
     * @return value of {@link #mute}
     */
    public AudioConfigurationMute getMute() {
        return mute;
    }

    /**
     * Sets {@code mute}
     *
     * @param mute the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationMute} field
     */
    public void setMute(AudioConfigurationMute mute) {
        this.mute = mute;
    }
}
