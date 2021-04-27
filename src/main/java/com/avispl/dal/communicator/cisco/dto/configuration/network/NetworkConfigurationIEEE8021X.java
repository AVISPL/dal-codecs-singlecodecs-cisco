/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Network Configuration IEEE8021X class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationIEEE8021X {
    @XmlElement(name = "Identity")
    private ValueSpaceRefHolder identity;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "TlsVerify")
    private ValueSpaceRefHolder tlsVerify;
    @XmlElement(name = "UseClientCertificate")
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
