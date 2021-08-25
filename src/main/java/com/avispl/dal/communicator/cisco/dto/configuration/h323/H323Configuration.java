/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device H323 Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #callSetup}}
     *
     * @return value of {@link #callSetup}
     */
    public H323ConfigurationCallSetup getCallSetup() {
        return callSetup;
    }

    /**
     * Sets {@code callSetup}
     *
     * @param callSetup the {@code com.avispl.dal.communicator.cisco.dto.configuration.h323.H323ConfigurationCallSetup} field
     */
    public void setCallSetup(H323ConfigurationCallSetup callSetup) {
        this.callSetup = callSetup;
    }

    /**
     * Retrieves {@code {@link #encryption}}
     *
     * @return value of {@link #encryption}
     */
    public H323ConfigurationEncryption getEncryption() {
        return encryption;
    }

    /**
     * Sets {@code encryption}
     *
     * @param encryption the {@code com.avispl.dal.communicator.cisco.dto.configuration.h323.H323ConfigurationEncryption} field
     */
    public void setEncryption(H323ConfigurationEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * Retrieves {@code {@link #gatekeeper}}
     *
     * @return value of {@link #gatekeeper}
     */
    public H323ConfigurationGatekeeper getGatekeeper() {
        return gatekeeper;
    }

    /**
     * Sets {@code gatekeeper}
     *
     * @param gatekeeper the {@code com.avispl.dal.communicator.cisco.dto.configuration.h323.H323ConfigurationGatekeeper} field
     */
    public void setGatekeeper(H323ConfigurationGatekeeper gatekeeper) {
        this.gatekeeper = gatekeeper;
    }

    /**
     * Retrieves {@code {@link #alias}}
     *
     * @return value of {@link #alias}
     */
    public H323ConfigurationAlias getAlias() {
        return alias;
    }

    /**
     * Sets {@code alias}
     *
     * @param alias the {@code com.avispl.dal.communicator.cisco.dto.configuration.h323.H323ConfigurationAlias} field
     */
    public void setAlias(H323ConfigurationAlias alias) {
        this.alias = alias;
    }

    /**
     * Retrieves {@code {@link #nat}}
     *
     * @return value of {@link #nat}
     */
    public H323ConfigurationNAT getNat() {
        return nat;
    }

    /**
     * Sets {@code nat}
     *
     * @param nat the {@code com.avispl.dal.communicator.cisco.dto.configuration.h323.H323ConfigurationNAT} field
     */
    public void setNat(H323ConfigurationNAT nat) {
        this.nat = nat;
    }
}
