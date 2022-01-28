/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Video Configuration Selfview class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VideoConfigurationSelfview {
    @JacksonXmlProperty(localName="Default")
    private VideoConfigurationSelfviewDefault selfviewDefault;
    @JacksonXmlProperty(localName="OnCall")
    private VideoConfigurationSelfviewOnCall onCall;

    /**
     * Retrieves {@link #selfviewDefault}
     *
     * @return value of {@link #selfviewDefault}
     */
    public VideoConfigurationSelfviewDefault getSelfviewDefault() {
        return selfviewDefault;
    }

    /**
     * Sets {@code selfviewDefault}
     *
     * @param selfviewDefault the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationSelfviewDefault} field
     */
    public void setSelfviewDefault(VideoConfigurationSelfviewDefault selfviewDefault) {
        this.selfviewDefault = selfviewDefault;
    }

    /**
     * Retrieves {@link #onCall}
     *
     * @return value of {@link #onCall}
     */
    public VideoConfigurationSelfviewOnCall getOnCall() {
        return onCall;
    }

    /**
     * Sets {@code onCall}
     *
     * @param onCall the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationSelfviewOnCall} field
     */
    public void setOnCall(VideoConfigurationSelfviewOnCall onCall) {
        this.onCall = onCall;
    }
}
