/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio handset usb  status class.
 * Represents an audio usb handset devices status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioDevicesHandsetUSB {
    @JacksonXmlProperty(localName="ConnectionStatus")
    private String connectionStatus;
    @JacksonXmlProperty(localName="Cradle")
    private String cradle;

    /**
     * Retrieves {@link #connectionStatus}
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
     * Retrieves {@link #cradle}
     *
     * @return value of {@link #cradle}
     */
    public String getCradle() {
        return cradle;
    }

    /**
     * Sets {@code cradle}
     *
     * @param cradle the {@code java.lang.String} field
     */
    public void setCradle(String cradle) {
        this.cradle = cradle;
    }
}
