/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

    public String getBytes() {
        return bytes;
    }

    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public String getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(String channelRate) {
        this.channelRate = channelRate;
    }

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getJitter() {
        return jitter;
    }

    public void setJitter(String jitter) {
        this.jitter = jitter;
    }

    public String getLastIntervalLost() {
        return lastIntervalLost;
    }

    public void setLastIntervalLost(String lastIntervalLost) {
        this.lastIntervalLost = lastIntervalLost;
    }

    public String getLastIntervalReceived() {
        return lastIntervalReceived;
    }

    public void setLastIntervalReceived(String lastIntervalReceived) {
        this.lastIntervalReceived = lastIntervalReceived;
    }

    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
    }

    public String getMaxJitter() {
        return maxJitter;
    }

    public void setMaxJitter(String maxJitter) {
        this.maxJitter = maxJitter;
    }

    public String getPackets() {
        return packets;
    }

    public void setPackets(String packets) {
        this.packets = packets;
    }
}
