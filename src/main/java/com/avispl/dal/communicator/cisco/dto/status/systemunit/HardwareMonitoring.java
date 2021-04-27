/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device hardware monitoring status class
 * Represents hardware system unit monitoring node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class HardwareMonitoring {
    @XmlElement(name = "Fan")

    private Fan[] fans;

    /**
     * Retrieves {@code {@link #fans}}
     *
     * @return value of {@link #fans}
     */
    public Fan[] getFans() {
        return fans;
    }

    /**
     * Sets {@code fans}
     *
     * @param fans the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.Fan[]} field
     */
    public void setFans(Fan[] fans) {
        this.fans = fans;
    }
}
