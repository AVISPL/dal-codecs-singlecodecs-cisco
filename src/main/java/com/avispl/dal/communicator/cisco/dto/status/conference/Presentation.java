/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device conference presentation class
 * Represents conference presentation node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Presentation {
    @JacksonXmlProperty(localName="CallId")
    private String callId;
    @JacksonXmlProperty(localName="Mode")
    private String mode;
    @JacksonXmlProperty(localName="Whiteboard")
    private Whiteboard whiteboard;

    /**
     * Retrieves {@code {@link #callId}}
     *
     * @return value of {@link #callId}
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets {@code callId}
     *
     * @param callId the {@code java.lang.String} field
     */
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code java.lang.String} field
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Retrieves {@code {@link #whiteboard}}
     *
     * @return value of {@link #whiteboard}
     */
    public Whiteboard getWhiteboard() {
        return whiteboard;
    }

    /**
     * Sets {@code whiteboard}
     *
     * @param whiteboard the {@code com.avispl.dal.communicator.cisco.dto.status.conference.Whiteboard} field
     */
    public void setWhiteboard(Whiteboard whiteboard) {
        this.whiteboard = whiteboard;
    }
}
