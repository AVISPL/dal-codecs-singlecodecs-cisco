/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Legacy content channel data information.
 * Legacy firmware versions provide media channel content data as a part of Audio/Video nodes within an active Call
 *
 * @author Maksym.Rossiytsev
 * @since 1.1.0
 * */
public class CallChannelData {
    @JacksonXmlProperty(isAttribute = true, localName = "status")
    private String status;
    @JacksonXmlProperty(localName="Rate")
    private Float rate;
    @JacksonXmlProperty(localName="TotalPackets")
    private Integer totalPackets;
    @JacksonXmlProperty(localName="PacketLoss")
    private Integer packetLoss;
    @JacksonXmlProperty(localName="Jitter")
    private Float jitter;
    @JacksonXmlProperty(localName="Protocol")
    private String codec;

    /**
     * Retrieves {@code {@link #status}}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@code {@link #rate}}
     *
     * @return value of {@link #rate}
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Sets {@code rate}
     *
     * @param rate the {@code java.lang.String} field
     */
    public void setRate(Float rate) {
        this.rate = rate;
    }

    /**
     * Retrieves {@code {@link #totalPackets}}
     *
     * @return value of {@link #totalPackets}
     */
    public Integer getTotalPackets() {
        return totalPackets;
    }

    /**
     * Sets {@code totalPackets}
     *
     * @param totalPackets the {@code java.lang.String} field
     */
    public void setTotalPackets(Integer totalPackets) {
        this.totalPackets = totalPackets;
    }

    /**
     * Retrieves {@code {@link #packetLoss}}
     *
     * @return value of {@link #packetLoss}
     */
    public Integer getPacketLoss() {
        return packetLoss;
    }

    /**
     * Sets {@code packetLoss}
     *
     * @param packetLoss the {@code java.lang.String} field
     */
    public void setPacketLoss(Integer packetLoss) {
        this.packetLoss = packetLoss;
    }

    /**
     * Retrieves {@code {@link #jitter}}
     *
     * @return value of {@link #jitter}
     */
    public Float getJitter() {
        return jitter;
    }

    /**
     * Sets {@code jitter}
     *
     * @param jitter the {@code java.lang.String} field
     */
    public void setJitter(Float jitter) {
        this.jitter = jitter;
    }

    /**
     * Retrieves {@code {@link #codec }}
     *
     * @return value of {@link #codec}
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Sets {@code protocol}
     *
     * @param codec the {@code java.lang.String} field
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }
}
