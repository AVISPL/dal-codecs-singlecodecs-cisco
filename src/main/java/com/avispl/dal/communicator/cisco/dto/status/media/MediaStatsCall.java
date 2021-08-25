/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device media stats call status class
 * Represents media stats node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class MediaStatsCall {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "Channel")
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
