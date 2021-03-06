/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device video selfview status class
 * Represents video selfview node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoSelfview {
    @XmlElement(name = "FullscreenMode")
    private String fullscreenMode;
    @XmlElement(name = "Mode")
    private String mode;
    @XmlElement(name = "OnMonitorRole")
    private String onMonitorRole;
    @XmlElement(name = "PIPPosition")
    private String pipPosition;

    /**
     * Retrieves {@code {@link #fullscreenMode}}
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
     * Retrieves {@code {@link #onMonitorRole}}
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
     * Retrieves {@code {@link #pipPosition}}
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
