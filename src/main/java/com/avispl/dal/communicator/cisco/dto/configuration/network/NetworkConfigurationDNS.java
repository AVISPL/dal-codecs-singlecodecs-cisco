/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration DNS class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NetworkConfigurationDNS {
    @JacksonXmlProperty(localName="Server")
    @JacksonXmlElementWrapper(useWrapping = false)
    private NetworkConfigurationServer[] servers;

    /**
     * Retrieves {@code {@link #servers}}
     *
     * @return value of {@link #servers}
     */
    public NetworkConfigurationServer[] getServers() {
        return servers;
    }

    /**
     * Sets {@code servers}
     *
     * @param servers the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer[]} field
     */
    public void setServers(NetworkConfigurationServer[] servers) {
        this.servers = servers;
    }
}
