/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device media netstat status class
 * Represents media netstat node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Netstat {
    @JacksonXmlProperty(localName="Bytes")
    private String bytes;
    @JacksonXmlProperty(localName="ChannelRate")
    private String channelRate;
    @JacksonXmlProperty(localName="Drop")
    private String drop;
    @JacksonXmlProperty(localName="Jitter")
    private String jitter;
    @JacksonXmlProperty(localName="LastIntervalLost")
    private String lastIntervalLost;
    @JacksonXmlProperty(localName="LastIntervalReceived")
    private String lastIntervalReceived;
    @JacksonXmlProperty(localName="Loss")
    private String loss;
    @JacksonXmlProperty(localName="MaxJitter")
    private String maxJitter;
    @JacksonXmlProperty(localName="Packets")
    private String packets;

    /**
     * Retrieves {@link #bytes}
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
     * Retrieves {@link #channelRate}
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
     * Retrieves {@link #drop}
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
     * Retrieves {@link #jitter}
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
     * Retrieves {@link #lastIntervalLost}
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
     * Retrieves {@link #lastIntervalReceived}
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
     * Retrieves {@link #loss}
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
     * Retrieves {@link #maxJitter}
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
     * Retrieves {@link #packets}
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
