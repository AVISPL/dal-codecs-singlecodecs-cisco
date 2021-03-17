/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VideoOutputDevice getConnectedDevice() {
        return connectedDevice;
    }

    public void setConnectedDevice(VideoOutputDevice connectedDevice) {
        this.connectedDevice = connectedDevice;
    }

    public SourceResolution getResolution() {
        return resolution;
    }

    public void setResolution(SourceResolution resolution) {
        this.resolution = resolution;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
