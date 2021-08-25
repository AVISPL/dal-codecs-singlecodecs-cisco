/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Network Configuration IPv4 class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationIPv4 {
    @XmlElement(name = "Address")
    private ValueSpaceRefHolder address;
    @XmlElement(name = "Assignment")
    private ValueSpaceRefHolder assignment;
    @XmlElement(name = "Gateway")
    private ValueSpaceRefHolder gateway;
    @XmlElement(name = "SubnetMask")
    private ValueSpaceRefHolder subnetMask;

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

    /**
     * Retrieves {@code {@link #subnetMask}}
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
