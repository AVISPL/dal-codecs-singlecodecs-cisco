/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioDevicesHandsetUSB {
    @XmlElement(name = "ConnectionStatus")
    private String connectionStatus;
    @XmlElement(name = "Cradle")
    private String cradle;

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getCradle() {
        return cradle;
    }

    public void setCradle(String cradle) {
        this.cradle = cradle;
    }
}
