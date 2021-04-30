/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.sip;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device SIP Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SIPConfiguration {
    @XmlElement(name = "Ice")
    private SIPConfigurationIce ice;
    @XmlElement(name = "Proxy")
    private NetworkConfigurationServer[] proxies;
    @XmlElement(name = "URI")
    private ValueSpaceRefHolder uri;

    /**
     * Retrieves {@code {@link #ice}}
     *
     * @return value of {@link #ice}
     */
    public SIPConfigurationIce getIce() {
        return ice;
    }

    /**
     * Sets {@code ice}
     *
     * @param ice the {@code com.avispl.dal.communicator.cisco.dto.configuration.sip.SIPConfigurationIce} field
     */
    public void setIce(SIPConfigurationIce ice) {
        this.ice = ice;
    }

    /**
     * Retrieves {@code {@link #proxies}}
     *
     * @return value of {@link #proxies}
     */
    public NetworkConfigurationServer[] getProxies() {
        return proxies;
    }

    /**
     * Sets {@code proxies}
     *
     * @param proxies the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer[]} field
     */
    public void setProxies(NetworkConfigurationServer[] proxies) {
        this.proxies = proxies;
    }

    /**
     * Retrieves {@code {@link #uri}}
     *
     * @return value of {@link #uri}
     */
    public ValueSpaceRefHolder getUri() {
        return uri;
    }

    /**
     * Sets {@code uri}
     *
     * @param uri the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setUri(ValueSpaceRefHolder uri) {
        this.uri = uri;
    }
}
