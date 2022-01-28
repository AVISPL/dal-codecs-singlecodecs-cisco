/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video output connector status class
 * Represents video output connector node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoOutputConnector {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="Connected")
    private String connected;
    @JacksonXmlProperty(localName="Type")
    private String type;
    @JacksonXmlProperty(localName="ConnectedDevice")
    private VideoOutputDevice connectedDevice;
    @JacksonXmlProperty(localName="Resolution")
    private SourceResolution resolution;

    /**
     * Retrieves {@link #item}
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
     * Retrieves {@link #connected}
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
     * Retrieves {@link #type}
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
     * Retrieves {@link #connectedDevice}
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
     * Retrieves {@link #resolution}
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
