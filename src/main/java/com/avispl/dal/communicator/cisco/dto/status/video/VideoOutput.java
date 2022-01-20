/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video output status class
 * Represents video output node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoOutput {
    @JacksonXmlProperty(localName="Connector")
    @JacksonXmlElementWrapper(useWrapping = false)
    private VideoOutputConnector[] connectors;

    /**
     * Retrieves {@code {@link #connectors}}
     *
     * @return value of {@link #connectors}
     */
    public VideoOutputConnector[] getConnectors() {
        return connectors;
    }

    /**
     * Sets {@code connectors}
     *
     * @param connectors the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoOutputConnector[]} field
     */
    public void setConnectors(VideoOutputConnector[] connectors) {
        this.connectors = connectors;
    }
}
