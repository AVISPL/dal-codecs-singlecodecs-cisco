/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device hardware module status class
 * Represents hardware module system unit node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class HardwareModule {
    @XmlElement(name = "CompatibilityLevel")
    private String compatibilityLevel;
    @XmlElement(name = "SerialNumber")
    private String serialNumber;

    /**
     * Retrieves {@code {@link #compatibilityLevel}}
     *
     * @return value of {@link #compatibilityLevel}
     */
    public String getCompatibilityLevel() {
        return compatibilityLevel;
    }

    /**
     * Sets {@code compatibilityLevel}
     *
     * @param compatibilityLevel the {@code java.lang.String} field
     */
    public void setCompatibilityLevel(String compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    /**
     * Retrieves {@code {@link #serialNumber}}
     *
     * @return value of {@link #serialNumber}
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets {@code serialNumber}
     *
     * @param serialNumber the {@code java.lang.String} field
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
