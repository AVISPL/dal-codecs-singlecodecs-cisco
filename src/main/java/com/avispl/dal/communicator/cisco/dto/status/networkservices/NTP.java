/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.networkservices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NTP {
    @XmlElement(name = "CurrentAddress")
    private String currentAddress;
    @XmlElement(name = "Discarded")
    private String discarded;
    @XmlElement(name = "Server")
    private NTPServer[] servers;

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getDiscarded() {
        return discarded;
    }

    public void setDiscarded(String discarded) {
        this.discarded = discarded;
    }

    public NTPServer[] getServers() {
        return servers;
    }

    public void setServers(NTPServer[] servers) {
        this.servers = servers;
    }
}
