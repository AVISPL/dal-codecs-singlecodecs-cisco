/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class H323Configuration {
    @XmlElement(name = "CallSetup")
    private H323ConfigurationCallSetup callSetup;
    @XmlElement(name = "Encryption")
    private H323ConfigurationEncryption encryption;
    @XmlElement(name = "Gatekeeper")
    private H323ConfigurationGatekeeper gatekeeper;
    @XmlElement(name = "H323Alias")
    private H323ConfigurationAlias alias;
    @XmlElement(name = "NAT")
    private H323ConfigurationNAT nat;

    public H323ConfigurationCallSetup getCallSetup() {
        return callSetup;
    }

    public void setCallSetup(H323ConfigurationCallSetup callSetup) {
        this.callSetup = callSetup;
    }

    public H323ConfigurationEncryption getEncryption() {
        return encryption;
    }

    public void setEncryption(H323ConfigurationEncryption encryption) {
        this.encryption = encryption;
    }

    public H323ConfigurationGatekeeper getGatekeeper() {
        return gatekeeper;
    }

    public void setGatekeeper(H323ConfigurationGatekeeper gatekeeper) {
        this.gatekeeper = gatekeeper;
    }

    public H323ConfigurationAlias getAlias() {
        return alias;
    }

    public void setAlias(H323ConfigurationAlias alias) {
        this.alias = alias;
    }

    public H323ConfigurationNAT getNat() {
        return nat;
    }

    public void setNat(H323ConfigurationNAT nat) {
        this.nat = nat;
    }
}
