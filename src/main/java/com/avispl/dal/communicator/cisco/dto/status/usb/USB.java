/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.usb;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device USB status class
 * Represents USB node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class USB {
    @XmlElement(name = "Device")
    private Device[] devices;

    /**
     * Retrieves {@code {@link #devices}}
     *
     * @return value of {@link #devices}
     */
    public Device[] getDevices() {
        return devices;
    }

    /**
     * Sets {@code devices}
     *
     * @param devices the {@code com.avispl.dal.communicator.cisco.dto.status.usb.Device[]} field
     */
    public void setDevices(Device[] devices) {
        this.devices = devices;
    }
}
