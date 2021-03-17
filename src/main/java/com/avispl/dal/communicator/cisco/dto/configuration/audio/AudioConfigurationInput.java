/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationInput {
    @XmlElement(name = "MicrophoneMode")
    private ValueSpaceRefHolder microphoneMode;
    @XmlElement(name = "Line")
    private AudioConfigurationLine[] lines;
    @XmlElement(name = "Microphone")
    private AudioConfigurationMicrophone[] microphones;

    public ValueSpaceRefHolder getMicrophoneMode() {
        return microphoneMode;
    }

    public void setMicrophoneMode(ValueSpaceRefHolder microphoneMode) {
        this.microphoneMode = microphoneMode;
    }

    public AudioConfigurationLine[] getLines() {
        return lines;
    }

    public void setLines(AudioConfigurationLine[] lines) {
        this.lines = lines;
    }

    public AudioConfigurationMicrophone[] getMicrophones() {
        return microphones;
    }

    public void setMicrophones(AudioConfigurationMicrophone[] microphones) {
        this.microphones = microphones;
    }
}
