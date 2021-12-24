/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Ethernet status class
 * Represents Ethernet node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Ethernet {
    @JacksonXmlProperty(localName="MacAddress")
    private String macAddress;
    @JacksonXmlProperty(localName="Speed")
    private String speed;

    /**
     * Retrieves {@code {@link #macAddress}}
     *
     * @return value of {@link #macAddress}
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets {@code macAddress}
     *
     * @param macAddress the {@code java.lang.String} field
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * Retrieves {@code {@link #speed}}
     *
     * @return value of {@link #speed}
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * Sets {@code speed}
     *
     * @param speed the {@code java.lang.String} field
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
