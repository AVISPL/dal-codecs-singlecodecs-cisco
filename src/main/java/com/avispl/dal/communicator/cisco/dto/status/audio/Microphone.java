/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device microphone status class.
 * Represents microphone status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Microphone {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="ConnectionStatus")
    private String connectionStatus;
    @JacksonXmlProperty(localName="EcReferenceDelay")
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
