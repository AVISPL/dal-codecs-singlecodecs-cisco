/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.phonebook;




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class PhonebookConfiguration {
    @XmlElement(name = "Server")

    private PhonebookConfigurationServer[] servers;

    public PhonebookConfigurationServer[] getServers() {
        return servers;
    }

    public void setServers(PhonebookConfigurationServer[] servers) {
        this.servers = servers;
    }
}
