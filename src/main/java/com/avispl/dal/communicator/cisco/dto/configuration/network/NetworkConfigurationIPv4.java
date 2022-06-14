/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration IPv4 class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkConfigurationIPv4 {
    @JacksonXmlProperty(localName="Address")
    private ValueSpaceRefHolder address;
    @JacksonXmlProperty(localName="Assignment")
    private ValueSpaceRefHolder assignment;
    @JacksonXmlProperty(localName="Gateway")
    private ValueSpaceRefHolder gateway;
    @JacksonXmlProperty(localName="SubnetMask")
    private ValueSpaceRefHolder subnetMask;

    /**
     * Retrieves {@link #address}
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
     * Retrieves {@link #assignment}
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
     * Retrieves {@link #gateway}
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

    /**
     * Retrieves {@link #subnetMask}
     *
     * @return value of {@link #subnetMask}
     */
    public ValueSpaceRefHolder getSubnetMask() {
        return subnetMask;
    }

    /**
     * Sets {@code subnetMask}
     *
     * @param subnetMask the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setSubnetMask(ValueSpaceRefHolder subnetMask) {
        this.subnetMask = subnetMask;
    }
}
