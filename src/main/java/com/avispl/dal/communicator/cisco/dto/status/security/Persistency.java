/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.security;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Persistency {
    @XmlElement(name = "CallHistory")
    private String callHistory;
    @XmlElement(name = "Configurations")
    private String configurations;
    @XmlElement(name = "DHCP")
    private String dhcp;
    @XmlElement(name = "LocalPhonebook")
    private String localPhonebook;

    public String getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(String callHistory) {
        this.callHistory = callHistory;
    }

    public String getConfigurations() {
        return configurations;
    }

    public void setConfigurations(String configurations) {
        this.configurations = configurations;
    }

    public String getDhcp() {
        return dhcp;
    }

    public void setDhcp(String dhcp) {
        this.dhcp = dhcp;
    }

    public String getLocalPhonebook() {
        return localPhonebook;
    }

    public void setLocalPhonebook(String localPhonebook) {
        this.localPhonebook = localPhonebook;
    }
}
