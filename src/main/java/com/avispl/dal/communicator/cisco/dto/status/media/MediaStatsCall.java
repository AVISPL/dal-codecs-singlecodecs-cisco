/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device media stats call status class
 * Represents media stats node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class MediaStatsCall {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="Channel")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Channel[] channels;

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #channels}}
     *
     * @return value of {@link #channels}
     */
    public Channel[] getChannels() {
        return channels;
    }

    /**
     * Sets {@code channels}
     *
     * @param channels the {@code com.avispl.dal.communicator.cisco.dto.status.media.Channel[]} field
     */
    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }
}
