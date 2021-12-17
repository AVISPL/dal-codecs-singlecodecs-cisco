/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration IEEE8021X class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkConfigurationIEEE8021X {
    @JacksonXmlProperty(localName="Identity")
    private ValueSpaceRefHolder identity;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;
    @JacksonXmlProperty(localName="TlsVerify")
    private ValueSpaceRefHolder tlsVerify;
    @JacksonXmlProperty(localName="UseClientCertificate")
    private ValueSpaceRefHolder useClientCertificate;

    /**
     * Retrieves {@code {@link #identity}}
     *
     * @return value of {@link #identity}
     */
    public ValueSpaceRefHolder getIdentity() {
        return identity;
    }

    /**
     * Sets {@code identity}
     *
     * @param identity the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setIdentity(ValueSpaceRefHolder identity) {
        this.identity = identity;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    /**
     * Retrieves {@code {@link #tlsVerify}}
     *
     * @return value of {@link #tlsVerify}
     */
    public ValueSpaceRefHolder getTlsVerify() {
        return tlsVerify;
    }

    /**
     * Sets {@code tlsVerify}
     *
     * @param tlsVerify the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setTlsVerify(ValueSpaceRefHolder tlsVerify) {
        this.tlsVerify = tlsVerify;
    }

    /**
     * Retrieves {@code {@link #useClientCertificate}}
     *
     * @return value of {@link #useClientCertificate}
     */
    public ValueSpaceRefHolder getUseClientCertificate() {
        return useClientCertificate;
    }

    /**
     * Sets {@code useClientCertificate}
     *
     * @param useClientCertificate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setUseClientCertificate(ValueSpaceRefHolder useClientCertificate) {
        this.useClientCertificate = useClientCertificate;
    }
}
