/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationDNS {
    @XmlElement(name = "Server")
    private NetworkConfigurationServer[] servers;

    public NetworkConfigurationServer[] getServers() {
        return servers;
    }

    public void setServers(NetworkConfigurationServer[] servers) {
        this.servers = servers;
    }
}
