/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration Microphone Mute class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioConfigurationMicrophones {
    @JacksonXmlProperty(localName="Mute")
    private AudioConfigurationMute mute;

    /**
     * Retrieves {@link #mute}
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
