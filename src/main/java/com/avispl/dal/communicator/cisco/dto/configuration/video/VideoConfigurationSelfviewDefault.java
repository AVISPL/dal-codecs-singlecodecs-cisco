/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Video Configuration Selfview - Default class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfigurationSelfviewDefault {
    @XmlElement(name = "FullscreenMode")
    private ValueSpaceRefHolder fullscreenMode;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "OnMonitorRole")
    private ValueSpaceRefHolder onMonitorRole;
    @XmlElement(name = "PIPPosition")
    private ValueSpaceRefHolder pipPosition;

    /**
     * Retrieves {@code {@link #fullscreenMode}}
     *
     * @return value of {@link #fullscreenMode}
     */
    public ValueSpaceRefHolder getFullscreenMode() {
        return fullscreenMode;
    }

    /**
     * Sets {@code fullscreenMode}
     *
     * @param fullscreenMode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setFullscreenMode(ValueSpaceRefHolder fullscreenMode) {
        this.fullscreenMode = fullscreenMode;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    /**
     * Retrieves {@code {@link #onMonitorRole}}
     *
     * @return value of {@link #onMonitorRole}
     */
    public ValueSpaceRefHolder getOnMonitorRole() {
        return onMonitorRole;
    }

    /**
     * Sets {@code onMonitorRole}
     *
     * @param onMonitorRole the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setOnMonitorRole(ValueSpaceRefHolder onMonitorRole) {
        this.onMonitorRole = onMonitorRole;
    }

    /**
     * Retrieves {@code {@link #pipPosition}}
     *
     * @return value of {@link #pipPosition}
     */
    public ValueSpaceRefHolder getPipPosition() {
        return pipPosition;
    }

    /**
     * Sets {@code pipPosition}
     *
     * @param pipPosition the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setPipPosition(ValueSpaceRefHolder pipPosition) {
        this.pipPosition = pipPosition;
    }
}
