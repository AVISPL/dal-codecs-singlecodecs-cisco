/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration Diffserv class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkConfigurationDiffserv {
    @JacksonXmlProperty(localName="Audio")
    private ValueSpaceRefHolder audio;
    @JacksonXmlProperty(localName="Data")
    private ValueSpaceRefHolder data;
    @JacksonXmlProperty(localName="ICMPv6")
    private ValueSpaceRefHolder icmpv6;
    @JacksonXmlProperty(localName="NTP")
    private ValueSpaceRefHolder ntp;
    @JacksonXmlProperty(localName="Signalling")
    private ValueSpaceRefHolder signalling;
    @JacksonXmlProperty(localName="Video")
    private ValueSpaceRefHolder video;

    /**
     * Retrieves {@code {@link #audio}}
     *
     * @return value of {@link #audio}
     */
    public ValueSpaceRefHolder getAudio() {
        return audio;
    }

    /**
     * Sets {@code audio}
     *
     * @param audio the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setAudio(ValueSpaceRefHolder audio) {
        this.audio = audio;
    }

    /**
     * Retrieves {@code {@link #data}}
     *
     * @return value of {@link #data}
     */
    public ValueSpaceRefHolder getData() {
        return data;
    }

    /**
     * Sets {@code data}
     *
     * @param data the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setData(ValueSpaceRefHolder data) {
        this.data = data;
    }

    /**
     * Retrieves {@code {@link #icmpv6}}
     *
     * @return value of {@link #icmpv6}
     */
    public ValueSpaceRefHolder getIcmpv6() {
        return icmpv6;
    }

    /**
     * Sets {@code icmpv6}
     *
     * @param icmpv6 the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setIcmpv6(ValueSpaceRefHolder icmpv6) {
        this.icmpv6 = icmpv6;
    }

    /**
     * Retrieves {@code {@link #ntp}}
     *
     * @return value of {@link #ntp}
     */
    public ValueSpaceRefHolder getNtp() {
        return ntp;
    }

    /**
     * Sets {@code ntp}
     *
     * @param ntp the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setNtp(ValueSpaceRefHolder ntp) {
        this.ntp = ntp;
    }

    /**
     * Retrieves {@code {@link #signalling}}
     *
     * @return value of {@link #signalling}
     */
    public ValueSpaceRefHolder getSignalling() {
        return signalling;
    }

    /**
     * Sets {@code signalling}
     *
     * @param signalling the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setSignalling(ValueSpaceRefHolder signalling) {
        this.signalling = signalling;
    }

    /**
     * Retrieves {@code {@link #video}}
     *
     * @return value of {@link #video}
     */
    public ValueSpaceRefHolder getVideo() {
        return video;
    }

    /**
     * Sets {@code video}
     *
     * @param video the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setVideo(ValueSpaceRefHolder video) {
        this.video = video;
    }
}
