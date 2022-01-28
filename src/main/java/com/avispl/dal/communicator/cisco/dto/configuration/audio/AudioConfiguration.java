/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;
import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AudioConfiguration {
    @JacksonXmlProperty(localName="DefaultVolume")
    private ValueSpaceRefHolder defaultVolume;
    @JacksonXmlProperty(localName="Input")
    private AudioConfigurationInput input;
    @JacksonXmlProperty(localName="Output")
    private AudioConfigurationOutput output;
    @JacksonXmlProperty(localName="Microphones")
    private AudioConfigurationMicrophones microphones;
    @JacksonXmlProperty(localName="SoundsAndAlerts")
    private AudioConfigurationSoundsAndAlerts soundsAndAlerts;
    @JacksonXmlProperty(localName="Ultrasound")
    private AudioConfigurationUltrasound ultrasound;

    /**
     * Retrieves {@link #defaultVolume}
     *
     * @return value of {@link #defaultVolume}
     */
    public ValueSpaceRefHolder getDefaultVolume() {
        return defaultVolume;
    }

    /**
     * Sets {@code defaultVolume}
     *
     * @param defaultVolume the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultVolume(ValueSpaceRefHolder defaultVolume) {
        this.defaultVolume = defaultVolume;
    }

    /**
     * Retrieves {@link #input}
     *
     * @return value of {@link #input}
     */
    public AudioConfigurationInput getInput() {
        return input;
    }

    /**
     * Sets {@code input}
     *
     * @param input the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationInput} field
     */
    public void setInput(AudioConfigurationInput input) {
        this.input = input;
    }

    /**
     * Retrieves {@link #output}
     *
     * @return value of {@link #output}
     */
    public AudioConfigurationOutput getOutput() {
        return output;
    }

    /**
     * Sets {@code output}
     *
     * @param output the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationOutput} field
     */
    public void setOutput(AudioConfigurationOutput output) {
        this.output = output;
    }

    /**
     * Retrieves {@link #microphones}
     *
     * @return value of {@link #microphones}
     */
    public AudioConfigurationMicrophones getMicrophones() {
        return microphones;
    }

    /**
     * Sets {@code microphones}
     *
     * @param microphones the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationMicrophones} field
     */
    public void setMicrophones(AudioConfigurationMicrophones microphones) {
        this.microphones = microphones;
    }

    /**
     * Retrieves {@link #soundsAndAlerts}
     *
     * @return value of {@link #soundsAndAlerts}
     */
    public AudioConfigurationSoundsAndAlerts getSoundsAndAlerts() {
        return soundsAndAlerts;
    }

    /**
     * Sets {@code soundsAndAlerts}
     *
     * @param soundsAndAlerts the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationSoundsAndAlerts} field
     */
    public void setSoundsAndAlerts(AudioConfigurationSoundsAndAlerts soundsAndAlerts) {
        this.soundsAndAlerts = soundsAndAlerts;
    }

    /**
     * Retrieves {@link #ultrasound}
     *
     * @return value of {@link #ultrasound}
     */
    public AudioConfigurationUltrasound getUltrasound() {
        return ultrasound;
    }

    /**
     * Sets {@code ultrasound}
     *
     * @param ultrasound the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationUltrasound} field
     */
    public void setUltrasound(AudioConfigurationUltrasound ultrasound) {
        this.ultrasound = ultrasound;
    }
}
