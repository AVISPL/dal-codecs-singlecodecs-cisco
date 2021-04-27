/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device microphone status class.
 * Represents microphone status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Microphone {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "ConnectionStatus")
    private String connectionStatus;
    @XmlElement(name = "EcReferenceDelay")
    private String ecReferenceDelay;

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

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
     * Retrieves {@code {@link #ecReferenceDelay}}
     *
     * @return value of {@link #ecReferenceDelay}
     */
    public String getEcReferenceDelay() {
        return ecReferenceDelay;
    }

    /**
     * Sets {@code ecReferenceDelay}
     *
     * @param ecReferenceDelay the {@code java.lang.String} field
     */
    public void setEcReferenceDelay(String ecReferenceDelay) {
        this.ecReferenceDelay = ecReferenceDelay;
    }
}
