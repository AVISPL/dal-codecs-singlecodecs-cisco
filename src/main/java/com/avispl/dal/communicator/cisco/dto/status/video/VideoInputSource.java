/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device video input source status class
 * Represents video input source node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #connectorId}}
     *
     * @return value of {@link #connectorId}
     */
    public String getConnectorId() {
        return connectorId;
    }

    /**
     * Sets {@code connectorId}
     *
     * @param connectorId the {@code java.lang.String} field
     */
    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * Retrieves {@code {@link #formatStatus}}
     *
     * @return value of {@link #formatStatus}
     */
    public String getFormatStatus() {
        return formatStatus;
    }

    /**
     * Sets {@code formatStatus}
     *
     * @param formatStatus the {@code java.lang.String} field
     */
    public void setFormatStatus(String formatStatus) {
        this.formatStatus = formatStatus;
    }

    /**
     * Retrieves {@code {@link #formatType}}
     *
     * @return value of {@link #formatType}
     */
    public String getFormatType() {
        return formatType;
    }

    /**
     * Sets {@code formatType}
     *
     * @param formatType the {@code java.lang.String} field
     */
    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    /**
     * Retrieves {@code {@link #mediaChannelId}}
     *
     * @return value of {@link #mediaChannelId}
     */
    public String getMediaChannelId() {
        return mediaChannelId;
    }

    /**
     * Sets {@code mediaChannelId}
     *
     * @param mediaChannelId the {@code java.lang.String} field
     */
    public void setMediaChannelId(String mediaChannelId) {
        this.mediaChannelId = mediaChannelId;
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
