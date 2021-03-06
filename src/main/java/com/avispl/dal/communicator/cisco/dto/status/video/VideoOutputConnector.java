/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device video output connector status class
 * Represents video output connector node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoOutputConnector {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "Connected")
    private String connected;
    @XmlElement(name = "Type")
    private String type;
    @XmlElement(name = "ConnectedDevice")
    private VideoOutputDevice connectedDevice;
    @XmlElement(name = "Resolution")
    private SourceResolution resolution;

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
     * Retrieves {@code {@link #connected}}
     *
     * @return value of {@link #connected}
     */
    public String getConnected() {
        return connected;
    }

    /**
     * Sets {@code connected}
     *
     * @param connected the {@code java.lang.String} field
     */
    public void setConnected(String connected) {
        this.connected = connected;
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

    /**
     * Retrieves {@code {@link #connectedDevice}}
     *
     * @return value of {@link #connectedDevice}
     */
    public VideoOutputDevice getConnectedDevice() {
        return connectedDevice;
    }

    /**
     * Sets {@code connectedDevice}
     *
     * @param connectedDevice the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoOutputDevice} field
     */
    public void setConnectedDevice(VideoOutputDevice connectedDevice) {
        this.connectedDevice = connectedDevice;
    }

    /**
     * Retrieves {@code {@link #resolution}}
     *
     * @return value of {@link #resolution}
     */
    public SourceResolution getResolution() {
        return resolution;
    }

    /**
     * Sets {@code resolution}
     *
     * @param resolution the {@code com.avispl.dal.communicator.cisco.dto.status.video.SourceResolution} field
     */
    public void setResolution(SourceResolution resolution) {
        this.resolution = resolution;
    }
}
