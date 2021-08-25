/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Ethernet status class
 * Represents Ethernet node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Ethernet {
    @XmlElement(name = "MacAddress")
    private String macAddress;
    @XmlElement(name = "Speed")
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
