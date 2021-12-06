/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration IPv6 class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NetworkConfigurationIPv6 {
    @JacksonXmlProperty(localName="Address")
    private ValueSpaceRefHolder address;
    @JacksonXmlProperty(localName="Assignment")
    private ValueSpaceRefHolder assignment;
    @JacksonXmlProperty(localName="DHCPOptions")
    private ValueSpaceRefHolder dhcpOptions;
    @JacksonXmlProperty(localName="Gateway")
    private ValueSpaceRefHolder gateway;

    /**
     * Retrieves {@code {@link #address}}
     *
     * @return value of {@link #address}
     */
    public ValueSpaceRefHolder getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setAddress(ValueSpaceRefHolder address) {
        this.address = address;
    }

    /**
     * Retrieves {@code {@link #assignment}}
     *
     * @return value of {@link #assignment}
     */
    public ValueSpaceRefHolder getAssignment() {
        return assignment;
    }

    /**
     * Sets {@code assignment}
     *
     * @param assignment the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setAssignment(ValueSpaceRefHolder assignment) {
        this.assignment = assignment;
    }

    /**
     * Retrieves {@code {@link #dhcpOptions}}
     *
     * @return value of {@link #dhcpOptions}
     */
    public ValueSpaceRefHolder getDhcpOptions() {
        return dhcpOptions;
    }

    /**
     * Sets {@code dhcpOptions}
     *
     * @param dhcpOptions the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDhcpOptions(ValueSpaceRefHolder dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
    }

    /**
     * Retrieves {@code {@link #gateway}}
     *
     * @return value of {@link #gateway}
     */
    public ValueSpaceRefHolder getGateway() {
        return gateway;
    }

    /**
     * Sets {@code gateway}
     *
     * @param gateway the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setGateway(ValueSpaceRefHolder gateway) {
        this.gateway = gateway;
    }
}
