/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationIPv4 {
    @XmlElement(name = "Address")
    private ValueSpaceRefHolder address;
    @XmlElement(name = "Assignment")
    private ValueSpaceRefHolder assignment;
    @XmlElement(name = "Gateway")
    private ValueSpaceRefHolder gateway;
    @XmlElement(name = "SubnetMask")
    private ValueSpaceRefHolder subnetMask;

    public ValueSpaceRefHolder getAddress() {
        return address;
    }

    public void setAddress(ValueSpaceRefHolder address) {
        this.address = address;
    }

    public ValueSpaceRefHolder getAssignment() {
        return assignment;
    }

    public void setAssignment(ValueSpaceRefHolder assignment) {
        this.assignment = assignment;
    }

    public ValueSpaceRefHolder getGateway() {
        return gateway;
    }

    public void setGateway(ValueSpaceRefHolder gateway) {
        this.gateway = gateway;
    }

    public ValueSpaceRefHolder getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(ValueSpaceRefHolder subnetMask) {
        this.subnetMask = subnetMask;
    }
}
