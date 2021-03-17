/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationVideoAssociation {
    @XmlElement(name = "MuteOnInactiveVideo")
    private ValueSpaceRefHolder muteOnInactiveVideo;
    @XmlElement(name = "VideoInputSource")
    private ValueSpaceRefHolder videoInputSource;

    public ValueSpaceRefHolder getMuteOnInactiveVideo() {
        return muteOnInactiveVideo;
    }

    public void setMuteOnInactiveVideo(ValueSpaceRefHolder muteOnInactiveVideo) {
        this.muteOnInactiveVideo = muteOnInactiveVideo;
    }

    public ValueSpaceRefHolder getVideoInputSource() {
        return videoInputSource;
    }

    public void setVideoInputSource(ValueSpaceRefHolder videoInputSource) {
        this.videoInputSource = videoInputSource;
    }
}
