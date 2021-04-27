/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device media netstat status class
 * Represents media netstat node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Netstat {
    @XmlElement(name = "Bytes")
    private String bytes;
    @XmlElement(name = "ChannelRate")
    private String channelRate;
    @XmlElement(name = "Drop")
    private String drop;
    @XmlElement(name = "Jitter")
    private String jitter;
    @XmlElement(name = "LastIntervalLost")
    private String lastIntervalLost;
    @XmlElement(name = "LastIntervalReceived")
    private String lastIntervalReceived;
    @XmlElement(name = "Loss")
    private String loss;
    @XmlElement(name = "MaxJitter")
    private String maxJitter;
    @XmlElement(name = "Packets")
    private String packets;

    /**
     * Retrieves {@code {@link #bytes}}
     *
     * @return value of {@link #bytes}
     */
    public String getBytes() {
        return bytes;
    }

    /**
     * Sets {@code bytes}
     *
     * @param bytes the {@code java.lang.String} field
     */
    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    /**
     * Retrieves {@code {@link #channelRate}}
     *
     * @return value of {@link #channelRate}
     */
    public String getChannelRate() {
        return channelRate;
    }

    /**
     * Sets {@code channelRate}
     *
     * @param channelRate the {@code java.lang.String} field
     */
    public void setChannelRate(String channelRate) {
        this.channelRate = channelRate;
    }

    /**
     * Retrieves {@code {@link #drop}}
     *
     * @return value of {@link #drop}
     */
    public String getDrop() {
        return drop;
    }

    /**
     * Sets {@code drop}
     *
     * @param drop the {@code java.lang.String} field
     */
    public void setDrop(String drop) {
        this.drop = drop;
    }

    /**
     * Retrieves {@code {@link #jitter}}
     *
     * @return value of {@link #jitter}
     */
    public String getJitter() {
        return jitter;
    }

    /**
     * Sets {@code jitter}
     *
     * @param jitter the {@code java.lang.String} field
     */
    public void setJitter(String jitter) {
        this.jitter = jitter;
    }

    /**
     * Retrieves {@code {@link #lastIntervalLost}}
     *
     * @return value of {@link #lastIntervalLost}
     */
    public String getLastIntervalLost() {
        return lastIntervalLost;
    }

    /**
     * Sets {@code lastIntervalLost}
     *
     * @param lastIntervalLost the {@code java.lang.String} field
     */
    public void setLastIntervalLost(String lastIntervalLost) {
        this.lastIntervalLost = lastIntervalLost;
    }

    /**
     * Retrieves {@code {@link #lastIntervalReceived}}
     *
     * @return value of {@link #lastIntervalReceived}
     */
    public String getLastIntervalReceived() {
        return lastIntervalReceived;
    }

    /**
     * Sets {@code lastIntervalReceived}
     *
     * @param lastIntervalReceived the {@code java.lang.String} field
     */
    public void setLastIntervalReceived(String lastIntervalReceived) {
        this.lastIntervalReceived = lastIntervalReceived;
    }

    /**
     * Retrieves {@code {@link #loss}}
     *
     * @return value of {@link #loss}
     */
    public String getLoss() {
        return loss;
    }

    /**
     * Sets {@code loss}
     *
     * @param loss the {@code java.lang.String} field
     */
    public void setLoss(String loss) {
        this.loss = loss;
    }

    /**
     * Retrieves {@code {@link #maxJitter}}
     *
     * @return value of {@link #maxJitter}
     */
    public String getMaxJitter() {
        return maxJitter;
    }

    /**
     * Sets {@code maxJitter}
     *
     * @param maxJitter the {@code java.lang.String} field
     */
    public void setMaxJitter(String maxJitter) {
        this.maxJitter = maxJitter;
    }

    /**
     * Retrieves {@code {@link #packets}}
     *
     * @return value of {@link #packets}
     */
    public String getPackets() {
        return packets;
    }

    /**
     * Sets {@code packets}
     *
     * @param packets the {@code java.lang.String} field
     */
    public void setPackets(String packets) {
        this.packets = packets;
    }
}
