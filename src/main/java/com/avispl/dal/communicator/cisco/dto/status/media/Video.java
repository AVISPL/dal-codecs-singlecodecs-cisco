/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device media video status class
 * Represents media video node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #channelRole}}
     *
     * @return value of {@link #channelRole}
     */
    public String getChannelRole() {
        return channelRole;
    }

    /**
     * Sets {@code channelRole}
     *
     * @param channelRole the {@code java.lang.String} field
     */
    public void setChannelRole(String channelRole) {
        this.channelRole = channelRole;
    }

    /**
     * Retrieves {@code {@link #frameRate}}
     *
     * @return value of {@link #frameRate}
     */
    public String getFrameRate() {
        return frameRate;
    }

    /**
     * Sets {@code frameRate}
     *
     * @param frameRate the {@code java.lang.String} field
     */
    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * Retrieves {@code {@link #protocol}}
     *
     * @return value of {@link #protocol}
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets {@code protocol}
     *
     * @param protocol the {@code java.lang.String} field
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Retrieves {@code {@link #resolutionX}}
     *
     * @return value of {@link #resolutionX}
     */
    public String getResolutionX() {
        return resolutionX;
    }

    /**
     * Sets {@code resolutionX}
     *
     * @param resolutionX the {@code java.lang.String} field
     */
    public void setResolutionX(String resolutionX) {
        this.resolutionX = resolutionX;
    }

    /**
     * Retrieves {@code {@link #resolutionY}}
     *
     * @return value of {@link #resolutionY}
     */
    public String getResolutionY() {
        return resolutionY;
    }

    /**
     * Sets {@code resolutionY}
     *
     * @param resolutionY the {@code java.lang.String} field
     */
    public void setResolutionY(String resolutionY) {
        this.resolutionY = resolutionY;
    }
}
