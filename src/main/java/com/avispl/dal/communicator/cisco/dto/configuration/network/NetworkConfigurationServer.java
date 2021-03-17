/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationServer {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "MinimumTLSVersion")
    private ValueSpaceRefHolder minimumTLSVersion;
    @XmlElement(name = "Address")
    private ValueSpaceRefHolder address;

    public ValueSpaceRefHolder getMinimumTLSVersion() {
        return minimumTLSVersion;
    }

    public void setMinimumTLSVersion(ValueSpaceRefHolder minimumTLSVersion) {
        this.minimumTLSVersion = minimumTLSVersion;
    }

    public ValueSpaceRefHolder getAddress() {
        return address;
    }

    public void setAddress(ValueSpaceRefHolder address) {
        this.address = address;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
