/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video input source status class
 * Represents video input source node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoInputSource {
    @JacksonXmlProperty(localName="ConnectorId")
    private String connectorId;
    @JacksonXmlProperty(localName="FormatStatus")
    private String formatStatus;
    @JacksonXmlProperty(localName="FormatType")
    private String formatType;
    @JacksonXmlProperty(localName="MediaChannelId")
    private String mediaChannelId;
    @JacksonXmlProperty(localName="Resolution")
    private SourceResolution resolution;

    /**
     * Retrieves {@link #connectorId}
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
     * Retrieves {@link #formatStatus}
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
     * Retrieves {@link #formatType}
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
     * Retrieves {@link #mediaChannelId}
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
