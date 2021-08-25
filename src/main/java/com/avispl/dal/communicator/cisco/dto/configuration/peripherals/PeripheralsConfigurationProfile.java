/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Peripherals Configuration Profile class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class PeripheralsConfigurationProfile {
    @XmlElement(name = "Cameras")
    private ValueSpaceRefHolder cameras;
    @XmlElement(name = "ControlSystems")
    private ValueSpaceRefHolder controlSystems;
    @XmlElement(name = "TouchPanels")
    private ValueSpaceRefHolder touchPanels;

    /**
     * Retrieves {@code {@link #cameras}}
     *
     * @return value of {@link #cameras}
     */
    public ValueSpaceRefHolder getCameras() {
        return cameras;
    }

    /**
     * Sets {@code cameras}
     *
     * @param cameras the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setCameras(ValueSpaceRefHolder cameras) {
        this.cameras = cameras;
    }

    /**
     * Retrieves {@code {@link #controlSystems}}
     *
     * @return value of {@link #controlSystems}
     */
    public ValueSpaceRefHolder getControlSystems() {
        return controlSystems;
    }

    /**
     * Sets {@code controlSystems}
     *
     * @param controlSystems the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setControlSystems(ValueSpaceRefHolder controlSystems) {
        this.controlSystems = controlSystems;
    }

    /**
     * Retrieves {@code {@link #touchPanels}}
     *
     * @return value of {@link #touchPanels}
     */
    public ValueSpaceRefHolder getTouchPanels() {
        return touchPanels;
    }

    /**
     * Sets {@code touchPanels}
     *
     * @param touchPanels the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setTouchPanels(ValueSpaceRefHolder touchPanels) {
        this.touchPanels = touchPanels;
    }
}
