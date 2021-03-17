/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class ProximityConfigurationContentShare {
    @XmlElement(name = "FromClients")
    private ValueSpaceRefHolder fromClients;
    @XmlElement(name = "ToClients")
    private ValueSpaceRefHolder toClients;

    public ValueSpaceRefHolder getFromClients() {
        return fromClients;
    }

    public void setFromClients(ValueSpaceRefHolder fromClients) {
        this.fromClients = fromClients;
    }

    public ValueSpaceRefHolder getToClients() {
        return toClients;
    }

    public void setToClients(ValueSpaceRefHolder toClients) {
        this.toClients = toClients;
    }
}
