/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;
import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfiguration {
    @XmlElement(name = "DefaultVolume")
    private ValueSpaceRefHolder defaultVolume;
    @XmlElement(name = "Input")
    private AudioConfigurationInput input;
    @XmlElement(name = "Output")
    private AudioConfigurationOutput output;
    @XmlElement(name = "Microphones")
    private AudioConfigurationMicrophones microphones;
    @XmlElement(name = "SoundsAndAlerts")
    private AudioConfigurationSoundsAndAlerts soundsAndAlerts;
    @XmlElement(name = "Ultrasound")
    private AudioConfigurationUltrasound ultrasound;

    public ValueSpaceRefHolder getDefaultVolume() {
        return defaultVolume;
    }

    public void setDefaultVolume(ValueSpaceRefHolder defaultVolume) {
        this.defaultVolume = defaultVolume;
    }

    public AudioConfigurationInput getInput() {
        return input;
    }

    public void setInput(AudioConfigurationInput input) {
        this.input = input;
    }

    public AudioConfigurationMicrophones getMicrophones() {
        return microphones;
    }

    public void setMicrophones(AudioConfigurationMicrophones microphones) {
        this.microphones = microphones;
    }

    public AudioConfigurationSoundsAndAlerts getSoundsAndAlerts() {
        return soundsAndAlerts;
    }

    public void setSoundsAndAlerts(AudioConfigurationSoundsAndAlerts soundsAndAlerts) {
        this.soundsAndAlerts = soundsAndAlerts;
    }

    public AudioConfigurationUltrasound getUltrasound() {
        return ultrasound;
    }

    public void setUltrasound(AudioConfigurationUltrasound ultrasound) {
        this.ultrasound = ultrasound;
    }

    public AudioConfigurationOutput getOutput() {
        return output;
    }

    public void setOutput(AudioConfigurationOutput output) {
        this.output = output;
    }
}
