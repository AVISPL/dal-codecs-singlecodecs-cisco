/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationDiffserv {
    @XmlElement(name = "Audio")
    private ValueSpaceRefHolder audio;
    @XmlElement(name = "Data")
    private ValueSpaceRefHolder data;
    @XmlElement(name = "ICMPv6")
    private ValueSpaceRefHolder icmpv6;
    @XmlElement(name = "NTP")
    private ValueSpaceRefHolder ntp;
    @XmlElement(name = "Signalling")
    private ValueSpaceRefHolder signalling;
    @XmlElement(name = "Video")
    private ValueSpaceRefHolder video;

    public ValueSpaceRefHolder getAudio() {
        return audio;
    }

    public void setAudio(ValueSpaceRefHolder audio) {
        this.audio = audio;
    }

    public ValueSpaceRefHolder getData() {
        return data;
    }

    public void setData(ValueSpaceRefHolder data) {
        this.data = data;
    }

    public ValueSpaceRefHolder getIcmpv6() {
        return icmpv6;
    }

    public void setIcmpv6(ValueSpaceRefHolder icmpv6) {
        this.icmpv6 = icmpv6;
    }

    public ValueSpaceRefHolder getNtp() {
        return ntp;
    }

    public void setNtp(ValueSpaceRefHolder ntp) {
        this.ntp = ntp;
    }

    public ValueSpaceRefHolder getSignalling() {
        return signalling;
    }

    public void setSignalling(ValueSpaceRefHolder signalling) {
        this.signalling = signalling;
    }

    public ValueSpaceRefHolder getVideo() {
        return video;
    }

    public void setVideo(ValueSpaceRefHolder video) {
        this.video = video;
    }
}
