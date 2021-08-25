/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device proximity status class
 * Represents proximity node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Proximity {
    @XmlElement(name = "Services")
    private ProximityServices proximityServices;

    /**
     * Retrieves {@code {@link #proximityServices}}
     *
     * @return value of {@link #proximityServices}
     */
    public ProximityServices getProximityServices() {
        return proximityServices;
    }

    /**
     * Sets {@code proximityServices}
     *
     * @param proximityServices the {@code com.avispl.dal.communicator.cisco.dto.status.root.ProximityServices} field
     */
    public void setProximityServices(ProximityServices proximityServices) {
        this.proximityServices = proximityServices;
    }
}
