/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Video Association class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationVideoAssociation {
    @XmlElement(name = "MuteOnInactiveVideo")
    private ValueSpaceRefHolder muteOnInactiveVideo;
    @XmlElement(name = "VideoInputSource")
    private ValueSpaceRefHolder videoInputSource;

    /**
     * Retrieves {@code {@link #muteOnInactiveVideo}}
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
     * Retrieves {@code {@link #videoInputSource}}
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
