/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Video Configuration Input class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoConfigurationInput {
    @JacksonXmlProperty(localName = "Connector")
    @JacksonXmlElementWrapper(useWrapping = false)
    private VideoConfigurationConnector[] connectors;

    /**
     * Retrieves {@code {@link #connectors}}
     *
     * @return value of {@link #connectors}
     */
    public VideoConfigurationConnector[] getConnectors() {
        return connectors;
    }

    /**
     * Sets {@code connectors}
     *
     * @param connectors the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationConnector[]} field
     */
    public void setConnectors(VideoConfigurationConnector[] connectors) {
        this.connectors = connectors;
    }
}
