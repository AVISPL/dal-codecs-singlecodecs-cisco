/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device H323 Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class H323Configuration {
    @JacksonXmlProperty(localName="CallSetup")
    private H323ConfigurationCallSetup callSetup;
    @JacksonXmlProperty(localName="Encryption")
    private H323ConfigurationEncryption encryption;
    @JacksonXmlProperty(localName="Gatekeeper")
    private H323ConfigurationGatekeeper gatekeeper;
    @JacksonXmlProperty(localName="H323Alias")
    private H323ConfigurationAlias alias;
    @JacksonXmlProperty(localName="NAT")
    private H323ConfigurationNAT nat;

    /**
     * Retrieves {@link #callSetup}
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
     * Retrieves {@link #encryption}
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
     * Retrieves {@link #gatekeeper}
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
     * Retrieves {@link #alias}
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
     * Retrieves {@link #nat}
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
