/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * Device Video Configuration Selfview - Default class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoConfigurationSelfviewDefault {
    @JacksonXmlProperty(localName="FullscreenMode")
    private ValueSpaceRefHolder fullscreenMode;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;
    @JacksonXmlProperty(localName="OnMonitorRole")
    private ValueSpaceRefHolder onMonitorRole;
    @JacksonXmlProperty(localName="PIPPosition")
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
