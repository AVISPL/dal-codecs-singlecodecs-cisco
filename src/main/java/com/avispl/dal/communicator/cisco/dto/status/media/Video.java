/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Video {
    @XmlElement(name = "ChannelRole")
    private String channelRole;
    @XmlElement(name = "FrameRate")
    private String frameRate;
    @XmlElement(name = "Protocol")
    private String protocol;
    @XmlElement(name = "ResolutionX")
    private String resolutionX;
    @XmlElement(name = "ResolutionY")
    private String resolutionY;

    public String getChannelRole() {
        return channelRole;
    }

    public void setChannelRole(String channelRole) {
        this.channelRole = channelRole;
    }

    public String getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(String resolutionX) {
        this.resolutionX = resolutionX;
    }

    public String getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(String resolutionY) {
        this.resolutionY = resolutionY;
    }
}
