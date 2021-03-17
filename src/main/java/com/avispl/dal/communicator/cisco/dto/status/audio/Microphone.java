/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Microphone {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "ConnectionStatus")
    private String connectionStatus;
    @XmlElement(name = "EcReferenceDelay")
    private String ecReferenceDelay;

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getEcReferenceDelay() {
        return ecReferenceDelay;
    }

    public void setEcReferenceDelay(String ecReferenceDelay) {
        this.ecReferenceDelay = ecReferenceDelay;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
