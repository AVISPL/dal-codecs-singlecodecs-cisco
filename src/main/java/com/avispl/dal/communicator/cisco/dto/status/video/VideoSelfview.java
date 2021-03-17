/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

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

    public String getFullscreenMode() {
        return fullscreenMode;
    }

    public void setFullscreenMode(String fullscreenMode) {
        this.fullscreenMode = fullscreenMode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getOnMonitorRole() {
        return onMonitorRole;
    }

    public void setOnMonitorRole(String onMonitorRole) {
        this.onMonitorRole = onMonitorRole;
    }

    public String getPipPosition() {
        return pipPosition;
    }

    public void setPipPosition(String pipPosition) {
        this.pipPosition = pipPosition;
    }
}
