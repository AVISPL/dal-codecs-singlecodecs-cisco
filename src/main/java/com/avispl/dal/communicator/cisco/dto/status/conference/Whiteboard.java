/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device conference whiteboard class
 * Represents conference whiteboard node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Whiteboard {
    @JacksonXmlProperty(localName="Mode")
    private String mode;
    @JacksonXmlProperty(localName="ReleaseFloorAvailability")
    private String releaseFloorAvailability;
    @JacksonXmlProperty(localName="RequestFloorAvailability")
    private String requestFloorAvailability;

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
     * Retrieves {@code {@link #releaseFloorAvailability}}
     *
     * @return value of {@link #releaseFloorAvailability}
     */
    public String getReleaseFloorAvailability() {
        return releaseFloorAvailability;
    }

    /**
     * Sets {@code releaseFloorAvailability}
     *
     * @param releaseFloorAvailability the {@code java.lang.String} field
     */
    public void setReleaseFloorAvailability(String releaseFloorAvailability) {
        this.releaseFloorAvailability = releaseFloorAvailability;
    }

    /**
     * Retrieves {@code {@link #requestFloorAvailability}}
     *
     * @return value of {@link #requestFloorAvailability}
     */
    public String getRequestFloorAvailability() {
        return requestFloorAvailability;
    }

    /**
     * Sets {@code requestFloorAvailability}
     *
     * @param requestFloorAvailability the {@code java.lang.String} field
     */
    public void setRequestFloorAvailability(String requestFloorAvailability) {
        this.requestFloorAvailability = requestFloorAvailability;
    }
}
