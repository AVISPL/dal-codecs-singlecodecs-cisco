/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video input status class
 * Represents video input node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoInput {
    @JacksonXmlProperty(localName="Connector")
    @JacksonXmlElementWrapper(useWrapping = false)
    private VideoInputConnector[] connectors;
    @JacksonXmlProperty(localName="MainVideoSource")
    private String mainVideoSource;
    @JacksonXmlProperty(localName="Source")
    @JacksonXmlElementWrapper(useWrapping = false)
    private VideoInputSource[] sources;

    /**
     * Retrieves {@link #connectors}
     *
     * @return value of {@link #connectors}
     */
    public VideoInputConnector[] getConnectors() {
        return connectors;
    }

    /**
     * Sets {@code connectors}
     *
     * @param connectors the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoInputConnector[]} field
     */
    public void setConnectors(VideoInputConnector[] connectors) {
        this.connectors = connectors;
    }

    /**
     * Retrieves {@link #mainVideoSource}
     *
     * @return value of {@link #mainVideoSource}
     */
    public String getMainVideoSource() {
        return mainVideoSource;
    }

    /**
     * Sets {@code mainVideoSource}
     *
     * @param mainVideoSource the {@code java.lang.String} field
     */
    public void setMainVideoSource(String mainVideoSource) {
        this.mainVideoSource = mainVideoSource;
    }

    /**
     * Retrieves {@link #sources}
     *
     * @return value of {@link #sources}
     */
    public VideoInputSource[] getSources() {
        return sources;
    }

    /**
     * Sets {@code sources}
     *
     * @param sources the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoInputSource[]} field
     */
    public void setSources(VideoInputSource[] sources) {
        this.sources = sources;
    }
}
