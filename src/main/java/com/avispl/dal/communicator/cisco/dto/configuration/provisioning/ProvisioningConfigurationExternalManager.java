/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.provisioning;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device Provisioning Configuration External Manager class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ProvisioningConfigurationExternalManager {
    @XmlElement(name = "Address")
    private ValueSpaceRefHolder address;
    @XmlElement(name = "AlternateAddress")
    private ValueSpaceRefHolder alternateAddress;
    @XmlElement(name = "Domain")
    private ValueSpaceRefHolder domain;
    @XmlElement(name = "Path")
    private ValueSpaceRefHolder path;
    @XmlElement(name = "Protocol")
    private ValueSpaceRefHolder protocol;

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
     * Retrieves {@code {@link #alternateAddress}}
     *
     * @return value of {@link #alternateAddress}
     */
    public ValueSpaceRefHolder getAlternateAddress() {
        return alternateAddress;
    }

    /**
     * Sets {@code alternateAddress}
     *
     * @param alternateAddress the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setAlternateAddress(ValueSpaceRefHolder alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    /**
     * Retrieves {@code {@link #domain}}
     *
     * @return value of {@link #domain}
     */
    public ValueSpaceRefHolder getDomain() {
        return domain;
    }

    /**
     * Sets {@code domain}
     *
     * @param domain the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDomain(ValueSpaceRefHolder domain) {
        this.domain = domain;
    }

    /**
     * Retrieves {@code {@link #path}}
     *
     * @return value of {@link #path}
     */
    public ValueSpaceRefHolder getPath() {
        return path;
    }

    /**
     * Sets {@code path}
     *
     * @param path the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setPath(ValueSpaceRefHolder path) {
        this.path = path;
    }

    /**
     * Retrieves {@code {@link #protocol}}
     *
     * @return value of {@link #protocol}
     */
    public ValueSpaceRefHolder getProtocol() {
        return protocol;
    }

    /**
     * Sets {@code protocol}
     *
     * @param protocol the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setProtocol(ValueSpaceRefHolder protocol) {
        this.protocol = protocol;
    }
}
