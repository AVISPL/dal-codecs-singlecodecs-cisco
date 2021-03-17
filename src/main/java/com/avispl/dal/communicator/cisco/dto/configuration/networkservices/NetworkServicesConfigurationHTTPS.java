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
public class NetworkServicesConfigurationHTTPS {
    @XmlElement(name = "Server")
    private NetworkConfigurationServer server;
    @XmlElement(name = "StrictTransportSecurity")
    private ValueSpaceRefHolder strictTransportSecurity;
    @XmlElement(name = "VerifyClientCertificate")
    private ValueSpaceRefHolder verifyClientCertificate;
    @XmlElement(name = "VerifyServerCertificate")
    private ValueSpaceRefHolder verifyServerCertificate;

    public NetworkConfigurationServer getServer() {
        return server;
    }

    public void setServer(NetworkConfigurationServer server) {
        this.server = server;
    }

    public ValueSpaceRefHolder getStrictTransportSecurity() {
        return strictTransportSecurity;
    }

    public void setStrictTransportSecurity(ValueSpaceRefHolder strictTransportSecurity) {
        this.strictTransportSecurity = strictTransportSecurity;
    }

    public ValueSpaceRefHolder getVerifyClientCertificate() {
        return verifyClientCertificate;
    }

    public void setVerifyClientCertificate(ValueSpaceRefHolder verifyClientCertificate) {
        this.verifyClientCertificate = verifyClientCertificate;
    }

    public ValueSpaceRefHolder getVerifyServerCertificate() {
        return verifyServerCertificate;
    }

    public void setVerifyServerCertificate(ValueSpaceRefHolder verifyServerCertificate) {
        this.verifyServerCertificate = verifyServerCertificate;
    }
}
