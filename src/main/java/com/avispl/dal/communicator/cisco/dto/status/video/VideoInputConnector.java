/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video input connector status class
 * Represents video input connector node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoInputConnector {
    @JacksonXmlProperty(localName="Connected")
    private String connected;
    @JacksonXmlProperty(localName="SignalState")
    private String signalState;
    @JacksonXmlProperty(localName="SourceId")
    private String sourceId;
    @JacksonXmlProperty(localName="Type")
    private String type;

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
     * Retrieves {@link #signalState}
     *
     * @return value of {@link #signalState}
     */
    public String getSignalState() {
        return signalState;
    }

    /**
     * Sets {@code signalState}
     *
     * @param signalState the {@code java.lang.String} field
     */
    public void setSignalState(String signalState) {
        this.signalState = signalState;
    }

    /**
     * Retrieves {@link #sourceId}
     *
     * @return value of {@link #sourceId}
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets {@code sourceId}
     *
     * @param sourceId the {@code java.lang.String} field
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
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
}
