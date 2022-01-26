/*
 * Copyright (c) 2021-2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio status class
 * Represents Audio node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Audio extends CallChannelData {
    @JacksonXmlProperty(localName="Channels")
    private String channels;
    @JacksonXmlProperty(localName="Mute")
    private String mute;

    /**
     * Retrieves {@code {@link #channels}}
     *
     * @return value of {@link #channels}
     */
    public String getChannels() {
        return channels;
    }

    /**
     * Sets {@code channels}
     *
     * @param channels the {@code java.lang.String} field
     */
    public void setChannels(String channels) {
        this.channels = channels;
    }

    /**
     * Retrieves {@code {@link #mute}}
     *
     * @return value of {@link #mute}
     */
    public String getMute() {
        return mute;
    }

    /**
     * Sets {@code mute}
     *
     * @param mute the {@code java.lang.String} field
     */
    public void setMute(String mute) {
        this.mute = mute;
    }
}
