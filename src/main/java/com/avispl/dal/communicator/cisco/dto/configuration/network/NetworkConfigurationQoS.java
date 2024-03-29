/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration QoS class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkConfigurationQoS {
    @JacksonXmlProperty(localName="Diffserv")
    private NetworkConfigurationDiffserv diffserv;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@link #diffserv}
     *
     * @return value of {@link #diffserv}
     */
    public NetworkConfigurationDiffserv getDiffserv() {
        return diffserv;
    }

    /**
     * Sets {@code diffserv}
     *
     * @param diffserv the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationDiffserv} field
     */
    public void setDiffserv(NetworkConfigurationDiffserv diffserv) {
        this.diffserv = diffserv;
    }

    /**
     * Retrieves {@link #mode}
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
}
