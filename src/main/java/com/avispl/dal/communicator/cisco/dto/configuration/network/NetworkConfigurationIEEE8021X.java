/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

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

    public ValueSpaceRefHolder getIdentity() {
        return identity;
    }

    public void setIdentity(ValueSpaceRefHolder identity) {
        this.identity = identity;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public ValueSpaceRefHolder getTlsVerify() {
        return tlsVerify;
    }

    public void setTlsVerify(ValueSpaceRefHolder tlsVerify) {
        this.tlsVerify = tlsVerify;
    }

    public ValueSpaceRefHolder getUseClientCertificate() {
        return useClientCertificate;
    }

    public void setUseClientCertificate(ValueSpaceRefHolder useClientCertificate) {
        this.useClientCertificate = useClientCertificate;
    }
}
