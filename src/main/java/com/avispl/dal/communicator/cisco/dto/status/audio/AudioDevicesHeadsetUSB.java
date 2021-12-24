/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio headset usb devices status class.
 * Represents an audio headset usb devices status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioDevicesHeadsetUSB {
    @JacksonXmlProperty(localName="ConnectionStatus")
    private String connectionStatus;
    @JacksonXmlProperty(localName="Description")
    private String description;
    @JacksonXmlProperty(localName="Manufacturer")
    private String manufacturer;

    /**
     * Retrieves {@code {@link #connectionStatus}}
     *
     * @return value of {@link #connectionStatus}
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets {@code connectionStatus}
     *
     * @param connectionStatus the {@code java.lang.String} field
     */
    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * Retrieves {@code {@link #description}}
     *
     * @return value of {@link #description}
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets {@code description}
     *
     * @param description the {@code java.lang.String} field
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves {@code {@link #manufacturer}}
     *
     * @return value of {@link #manufacturer}
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets {@code manufacturer}
     *
     * @param manufacturer the {@code java.lang.String} field
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
