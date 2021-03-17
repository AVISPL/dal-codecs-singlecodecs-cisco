/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkServicesConfigurationSNMP {
    @XmlElement(name = "CommunityName")
    private ValueSpaceRefHolder communityName;
    @XmlElement(name = "Host")

    private NetworkConfigurationServer[] hosts;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "SystemContact")
    private ValueSpaceRefHolder systemContact;
    @XmlElement(name = "SystemLocation")
    private ValueSpaceRefHolder systemLocation;

    public ValueSpaceRefHolder getCommunityName() {
        return communityName;
    }

    public void setCommunityName(ValueSpaceRefHolder communityName) {
        this.communityName = communityName;
    }

    public NetworkConfigurationServer[] getHosts() {
        return hosts;
    }

    public void setHosts(NetworkConfigurationServer[] hosts) {
        this.hosts = hosts;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public ValueSpaceRefHolder getSystemContact() {
        return systemContact;
    }

    public void setSystemContact(ValueSpaceRefHolder systemContact) {
        this.systemContact = systemContact;
    }

    public ValueSpaceRefHolder getSystemLocation() {
        return systemLocation;
    }

    public void setSystemLocation(ValueSpaceRefHolder systemLocation) {
        this.systemLocation = systemLocation;
    }
}
