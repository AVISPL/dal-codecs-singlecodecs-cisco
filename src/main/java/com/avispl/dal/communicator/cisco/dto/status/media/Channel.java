/*
 * Copyright (c) 2021-2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.avispl.symphony.dal.util.StringUtils;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device channel status class
 * Represents channel node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Channel {
    @JacksonXmlProperty(isAttribute = true, localName="type")
    private String attributeDirection;
    @JacksonXmlProperty(localName="Audio")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Audio[] audio;
    @JacksonXmlProperty(localName="Video")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Video[] video;
    @JacksonXmlProperty(localName="Data")
    @JacksonXmlElementWrapper(useWrapping = false)
    private CallChannelData[] data;
    @JacksonXmlProperty(localName="Netstat")
    private Netstat netstat;
    @JacksonXmlProperty(localName="Direction")
    private String direction;
    @JacksonXmlProperty(localName="Encryption")
    private String encryption;
    @JacksonXmlProperty(localName="Type")
    private String type;

    /**
     * Retrieves {@link #attributeDirection}
     *
     * @return value of {@link #attributeDirection}
     * @since 1.1.0
     */
    public String getAttributeDirection() {
        return attributeDirection;
    }

    /**
     * Sets {@code attributeDirection}
     *
     * @param attributeDirection the {@code java.lang.String} field
     * @since 1.1.0
     */
    public void setAttributeDirection(String attributeDirection) {
        this.attributeDirection = attributeDirection;
    }

    /**
     * Retrieves {@link #audio}
     *
     * @return value of {@link #audio}
     */
    public Audio[] getAudio() {
        return audio;
    }

    /**
     * Sets {@code audio}
     *
     * @param audio the {@code com.avispl.dal.communicator.cisco.dto.status.media.Audio} field
     */
    public void setAudio(Audio[] audio) {
        this.audio = audio;
    }

    /**
     * Retrieves {@link #video}
     *
     * @return value of {@link #video}
     */
    public Video[] getVideo() {
        return video;
    }

    /**
     * Sets {@code video}
     *
     * @param video the {@code com.avispl.dal.communicator.cisco.dto.status.media.Video} field
     */
    public void setVideo(Video[] video) {
        this.video = video;
    }

    /**
     * Retrieves {@link #data}
     *
     * @return value of {@link #data}
     * @since 1.1.1
     */
    public CallChannelData[] getData() {
        return data;
    }

    /**
     * Sets {@code data}
     *
     * @param data the {@code com.avispl.dal.communicator.cisco.dto.status.media.CallChannelData} field
     * @since 1.1.1
     */
    public void setData(CallChannelData[] data) {
        this.data = data;
    }

    /**
     * Retrieves {@link #netstat}
     *
     * @return value of {@link #netstat}
     */
    public Netstat getNetstat() {
        return netstat;
    }

    /**
     * Sets {@code netstat}
     *
     * @param netstat the {@code com.avispl.dal.communicator.cisco.dto.status.media.Netstat} field
     */
    public void setNetstat(Netstat netstat) {
        this.netstat = netstat;
    }

    /**
     * Retrieves call direction value based on {@link #attributeDirection} or
     * {@link #direction}. If the former is present and latter is not - former is used.
     *
     * @return value of {@link #direction}
     */
    public String getDirection() {
        if (!StringUtils.isNullOrEmpty(attributeDirection) && StringUtils.isNullOrEmpty(direction)) {
            return attributeDirection;
        }
        return direction;
    }

    /**
     * Sets {@code direction}
     *
     * @param direction the {@code java.lang.String} field
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * Retrieves {@link #encryption}
     *
     * @return value of {@link #encryption}
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * Sets {@code encryption}
     *
     * @param encryption the {@code java.lang.String} field
     */
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    /**
     * Retrieves {@link #type}
     *
     * @return value of {@link #type}
     */
    public String getType() {
        return type;
    }

    /**
     * Sets {@code type}
     *
     * @param type the {@code java.lang.String} field
     */
    public void setType(String type) {
        this.type = type;
    }
}
