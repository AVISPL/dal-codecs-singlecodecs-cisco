/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

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
    @JacksonXmlProperty(localName="Audio")
    private Audio audio;
    @JacksonXmlProperty(localName="Video")
    private Video video;
    @JacksonXmlProperty(localName="Netstat")
    private Netstat netstat;
    @JacksonXmlProperty(localName="Direction")
    private String direction;
    @JacksonXmlProperty(localName="Encryption")
    private String encryption;
    @JacksonXmlProperty(localName="Type")
    private String type;

    /**
     * Retrieves {@code {@link #audio}}
     *
     * @return value of {@link #audio}
     */
    public Audio getAudio() {
        return audio;
    }

    /**
     * Sets {@code audio}
     *
     * @param audio the {@code com.avispl.dal.communicator.cisco.dto.status.media.Audio} field
     */
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    /**
     * Retrieves {@code {@link #video}}
     *
     * @return value of {@link #video}
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets {@code video}
     *
     * @param video the {@code com.avispl.dal.communicator.cisco.dto.status.media.Video} field
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * Retrieves {@code {@link #netstat}}
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
     * Retrieves {@code {@link #direction}}
     *
     * @return value of {@link #direction}
     */
    public String getDirection() {
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
     * Retrieves {@code {@link #encryption}}
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
     * Retrieves {@code {@link #type}}
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
