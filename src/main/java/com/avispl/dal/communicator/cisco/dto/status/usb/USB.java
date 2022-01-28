/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.usb;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device USB status class
 * Represents USB node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class USB {
    @JacksonXmlProperty(localName="Device")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Device[] devices;

    /**
     * Retrieves {@link #devices}
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
