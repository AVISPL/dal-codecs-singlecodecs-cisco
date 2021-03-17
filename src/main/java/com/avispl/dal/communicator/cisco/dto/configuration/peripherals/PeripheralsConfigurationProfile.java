/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class PeripheralsConfigurationProfile {
    @XmlElement(name = "Cameras")
    private ValueSpaceRefHolder cameras;
    @XmlElement(name = "ControlSystems")
    private ValueSpaceRefHolder controlSystems;
    @XmlElement(name = "TouchPanels")
    private ValueSpaceRefHolder touchPanels;

    public ValueSpaceRefHolder getCameras() {
        return cameras;
    }

    public void setCameras(ValueSpaceRefHolder cameras) {
        this.cameras = cameras;
    }

    public ValueSpaceRefHolder getControlSystems() {
        return controlSystems;
    }

    public void setControlSystems(ValueSpaceRefHolder controlSystems) {
        this.controlSystems = controlSystems;
    }

    public ValueSpaceRefHolder getTouchPanels() {
        return touchPanels;
    }

    public void setTouchPanels(ValueSpaceRefHolder touchPanels) {
        this.touchPanels = touchPanels;
    }
}
