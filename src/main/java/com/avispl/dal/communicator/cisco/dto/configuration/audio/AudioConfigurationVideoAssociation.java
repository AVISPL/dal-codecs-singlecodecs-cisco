/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration Video Association class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AudioConfigurationVideoAssociation {
    @JacksonXmlProperty(localName="MuteOnInactiveVideo")
    private ValueSpaceRefHolder muteOnInactiveVideo;
    @JacksonXmlProperty(localName="VideoInputSource")
    private ValueSpaceRefHolder videoInputSource;

    /**
     * Retrieves {@link #muteOnInactiveVideo}
     *
     * @return value of {@link #muteOnInactiveVideo}
     */
    public ValueSpaceRefHolder getMuteOnInactiveVideo() {
        return muteOnInactiveVideo;
    }

    /**
     * Sets {@code muteOnInactiveVideo}
     *
     * @param muteOnInactiveVideo the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMuteOnInactiveVideo(ValueSpaceRefHolder muteOnInactiveVideo) {
        this.muteOnInactiveVideo = muteOnInactiveVideo;
    }

    /**
     * Retrieves {@link #videoInputSource}
     *
     * @return value of {@link #videoInputSource}
     */
    public ValueSpaceRefHolder getVideoInputSource() {
        return videoInputSource;
    }

    /**
     * Sets {@code videoInputSource}
     *
     * @param videoInputSource the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setVideoInputSource(ValueSpaceRefHolder videoInputSource) {
        this.videoInputSource = videoInputSource;
    }
}
