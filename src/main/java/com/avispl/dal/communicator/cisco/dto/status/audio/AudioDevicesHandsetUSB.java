/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Audio handset usb  status class.
 * Represents an audio usb handset devices status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioDevicesHandsetUSB {
    @XmlElement(name = "ConnectionStatus")
    private String connectionStatus;
    @XmlElement(name = "Cradle")
    private String cradle;

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
     * Retrieves {@code {@link #cradle}}
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
