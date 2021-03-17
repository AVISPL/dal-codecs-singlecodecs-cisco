/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.provisioning;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class ProvisioningConfigurationExternalManager {
    @XmlElement(name = "Address")
    private ValueSpaceRefHolder address;
    @XmlElement(name = "AlternateAddress")
    private ValueSpaceRefHolder alternateAddress;
    @XmlElement(name = "Domain")
    private ValueSpaceRefHolder domain;
    @XmlElement(name = "Path")
    private ValueSpaceRefHolder path;
    @XmlElement(name = "Protocol")
    private ValueSpaceRefHolder protocol;

    public ValueSpaceRefHolder getAddress() {
        return address;
    }

    public void setAddress(ValueSpaceRefHolder address) {
        this.address = address;
    }

    public ValueSpaceRefHolder getAlternateAddress() {
        return alternateAddress;
    }

    public void setAlternateAddress(ValueSpaceRefHolder alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    public ValueSpaceRefHolder getDomain() {
        return domain;
    }

    public void setDomain(ValueSpaceRefHolder domain) {
        this.domain = domain;
    }

    public ValueSpaceRefHolder getPath() {
        return path;
    }

    public void setPath(ValueSpaceRefHolder path) {
        this.path = path;
    }

    public ValueSpaceRefHolder getProtocol() {
        return protocol;
    }

    public void setProtocol(ValueSpaceRefHolder protocol) {
        this.protocol = protocol;
    }
}
