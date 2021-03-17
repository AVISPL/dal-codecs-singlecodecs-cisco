/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.sip;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class SIPConfiguration {
    @XmlElement(name = "Ice")
    private SIPConfigurationIce ice;
    @XmlElement(name = "Proxy")

    private NetworkConfigurationServer[] proxies;
    @XmlElement(name = "URI")
    private ValueSpaceRefHolder uri;

    public SIPConfigurationIce getIce() {
        return ice;
    }

    public void setIce(SIPConfigurationIce ice) {
        this.ice = ice;
    }

    public NetworkConfigurationServer[] getProxies() {
        return proxies;
    }

    public void setProxies(NetworkConfigurationServer[] proxies) {
        this.proxies = proxies;
    }

    public ValueSpaceRefHolder getUri() {
        return uri;
    }

    public void setUri(ValueSpaceRefHolder uri) {
        this.uri = uri;
    }
}
