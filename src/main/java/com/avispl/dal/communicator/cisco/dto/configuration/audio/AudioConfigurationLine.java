/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration Line class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AudioConfigurationLine {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="Delay")
    private AudioConfigurationDelay delay;
    @JacksonXmlProperty(localName="VideoAssociation")
    private AudioConfigurationVideoAssociation videoAssociation;

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #delay}}
     *
     * @return value of {@link #delay}
     */
    public AudioConfigurationDelay getDelay() {
        return delay;
    }

    /**
     * Sets {@code delay}
     *
     * @param delay the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationDelay} field
     */
    public void setDelay(AudioConfigurationDelay delay) {
        this.delay = delay;
    }

    /**
     * Retrieves {@code {@link #videoAssociation}}
     *
     * @return value of {@link #videoAssociation}
     */
    public AudioConfigurationVideoAssociation getVideoAssociation() {
        return videoAssociation;
    }

    /**
     * Sets {@code videoAssociation}
     *
     * @param videoAssociation the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationVideoAssociation} field
     */
    public void setVideoAssociation(AudioConfigurationVideoAssociation videoAssociation) {
        this.videoAssociation = videoAssociation;
    }
}
