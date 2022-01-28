/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.peripherals.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Peripherals devices response wrapper
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
public class PeripheralsListResult {
    @JacksonXmlProperty(isAttribute = true)
    private String status;
    @JacksonXmlProperty(localName = "Device")
    @JacksonXmlElementWrapper(useWrapping = false)
    private PeripheralsDevice[] peripheralsDevices;

    /**
     * Retrieves {@link #status}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@link #peripheralsDevices}
     *
     * @return value of {@link #peripheralsDevices}
     */
    public PeripheralsDevice[] getPeripheralsDevices() {
        return peripheralsDevices;
    }

    /**
     * Sets {@code peripheralsDevices}
     *
     * @param peripheralsDevices the {@code com.avispl.dal.communicator.cisco.dto.control.commands.peripherals.response.PeripheralsDevice[]} field
     */
    public void setPeripheralsDevices(PeripheralsDevice[] peripheralsDevices) {
        this.peripheralsDevices = peripheralsDevices;
    }
}
