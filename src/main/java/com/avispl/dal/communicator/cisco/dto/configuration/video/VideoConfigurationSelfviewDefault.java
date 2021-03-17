/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

    public ValueSpaceRefHolder getFullscreenMode() {
        return fullscreenMode;
    }

    public void setFullscreenMode(ValueSpaceRefHolder fullscreenMode) {
        this.fullscreenMode = fullscreenMode;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public ValueSpaceRefHolder getOnMonitorRole() {
        return onMonitorRole;
    }

    public void setOnMonitorRole(ValueSpaceRefHolder onMonitorRole) {
        this.onMonitorRole = onMonitorRole;
    }

    public ValueSpaceRefHolder getPipPosition() {
        return pipPosition;
    }

    public void setPipPosition(ValueSpaceRefHolder pipPosition) {
        this.pipPosition = pipPosition;
    }
}
