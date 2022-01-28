/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.sip;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device SIP Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SIPConfiguration {
    @JacksonXmlProperty(localName="Ice")
    private SIPConfigurationIce ice;
    @JacksonXmlProperty(localName="Proxy")
    @JacksonXmlElementWrapper(useWrapping = false)
    private NetworkConfigurationServer[] proxies;
    @JacksonXmlProperty(localName="URI")
    private ValueSpaceRefHolder uri;

    /**
     * Retrieves {@link #ice}
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
     * Retrieves {@link #proxies}
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
     * Retrieves {@link #uri}
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
