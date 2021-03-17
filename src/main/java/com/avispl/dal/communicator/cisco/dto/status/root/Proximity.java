/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Proximity {
    @XmlElement(name = "Services")
    private ProximityServices proximityServices;

    public ProximityServices getProximityServices() {
        return proximityServices;
    }

    public void setProximityServices(ProximityServices proximityServices) {
        this.proximityServices = proximityServices;
    }
}
