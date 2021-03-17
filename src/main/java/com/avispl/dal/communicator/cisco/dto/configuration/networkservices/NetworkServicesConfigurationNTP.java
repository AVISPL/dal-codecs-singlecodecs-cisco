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
public class NetworkServicesConfigurationNTP {
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "Server")

    private NetworkConfigurationServer[] servers;

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public NetworkConfigurationServer[] getServers() {
        return servers;
    }

    public void setServers(NetworkConfigurationServer[] servers) {
        this.servers = servers;
    }
}
