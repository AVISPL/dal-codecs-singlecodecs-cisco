/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video selfview status class
 * Represents video selfview node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoSelfview {
    @JacksonXmlProperty(localName="FullscreenMode")
    private String fullscreenMode;
    @JacksonXmlProperty(localName="Mode")
    private String mode;
    @JacksonXmlProperty(localName="OnMonitorRole")
    private String onMonitorRole;
    @JacksonXmlProperty(localName="PIPPosition")
    private String pipPosition;

    /**
     * Retrieves {@link #fullscreenMode}
     *
     * @return value of {@link #fullscreenMode}
     */
    public String getFullscreenMode() {
        return fullscreenMode;
    }

    /**
     * Sets {@code fullscreenMode}
     *
     * @param fullscreenMode the {@code java.lang.String} field
     */
    public void setFullscreenMode(String fullscreenMode) {
        this.fullscreenMode = fullscreenMode;
    }

    /**
     * Retrieves {@link #mode}
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
     * Retrieves {@link #onMonitorRole}
     *
     * @return value of {@link #onMonitorRole}
     */
    public String getOnMonitorRole() {
        return onMonitorRole;
    }

    /**
     * Sets {@code onMonitorRole}
     *
     * @param onMonitorRole the {@code java.lang.String} field
     */
    public void setOnMonitorRole(String onMonitorRole) {
        this.onMonitorRole = onMonitorRole;
    }

    /**
     * Retrieves {@link #pipPosition}
     *
     * @return value of {@link #pipPosition}
     */
    public String getPipPosition() {
        return pipPosition;
    }

    /**
     * Sets {@code pipPosition}
     *
     * @param pipPosition the {@code java.lang.String} field
     */
    public void setPipPosition(String pipPosition) {
        this.pipPosition = pipPosition;
    }
}
