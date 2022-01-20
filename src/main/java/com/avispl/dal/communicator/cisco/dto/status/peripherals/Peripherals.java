/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.peripherals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Connected Peripheral devices status wrapper
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
public class Peripherals {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName="ConnectedDevice")
    private ConnectedDevice[] connectedDevice;

    /**
     * Retrieves {@code {@link #connectedDevice}}
     *
     * @return value of {@link #connectedDevice}
     */
    public ConnectedDevice[] getConnectedDevice() {
        return connectedDevice;
    }

    /**
     * Sets {@code connectedDevice}
     *
     * @param connectedDevice the {@code com.avispl.dal.communicator.cisco.dto.status.peripherals.ConnectedDevice[]} field
     */
    public void setConnectedDevice(ConnectedDevice[] connectedDevice) {
        this.connectedDevice = connectedDevice;
    }
}
