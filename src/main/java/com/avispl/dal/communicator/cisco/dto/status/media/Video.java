/*
 * Copyright (c) 2021-2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device media video status class
 * Represents media video node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Video extends CallChannelData{
    @JacksonXmlProperty(localName="ChannelRole")
    private String channelRole;
    @JacksonXmlProperty(localName="FrameRate")
    private String frameRate;
    @JacksonXmlProperty(localName="ResolutionX")
    private String resolutionX;
    @JacksonXmlProperty(localName="ResolutionY")
    private String resolutionY;
    /**@since 1.1.1*/
    @JacksonXmlProperty(localName="Resolution")
    private String resolution;

    /**
     * Retrieves {@link #channelRole}
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
     * Retrieves {@link #frameRate}
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
     * Retrieves {@link #resolutionX}
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
     * Retrieves {@link #resolutionY}
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

    /**
     * Retrieves {@link #resolution}
     *
     * @return value of {@link #resolution}
     * @since 1.1.1
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets {@code resolution}
     *
     * @param resolution the {@code java.lang.String} field
     * @since 1.1.1
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
