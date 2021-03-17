/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class VideoInputSource {
    @XmlElement(name = "ConnectorId")
    private String connectorId;
    @XmlElement(name = "FormatStatus")
    private String formatStatus;
    @XmlElement(name = "FormatType")
    private String formatType;
    @XmlElement(name = "MediaChannelId")
    private String mediaChannelId;
    @XmlElement(name = "Resolution")
    private SourceResolution resolution;

    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public String getFormatStatus() {
        return formatStatus;
    }

    public void setFormatStatus(String formatStatus) {
        this.formatStatus = formatStatus;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public String getMediaChannelId() {
        return mediaChannelId;
    }

    public void setMediaChannelId(String mediaChannelId) {
        this.mediaChannelId = mediaChannelId;
    }

    public SourceResolution getResolution() {
        return resolution;
    }

    public void setResolution(SourceResolution resolution) {
        this.resolution = resolution;
    }
}
