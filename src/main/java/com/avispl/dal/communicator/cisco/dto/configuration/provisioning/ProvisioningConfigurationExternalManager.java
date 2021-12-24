/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.provisioning;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * Device Provisioning Configuration External Manager class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProvisioningConfigurationExternalManager {
    @JacksonXmlProperty(localName="Address")
    private ValueSpaceRefHolder address;
    @JacksonXmlProperty(localName="AlternateAddress")
    private ValueSpaceRefHolder alternateAddress;
    @JacksonXmlProperty(localName="Domain")
    private ValueSpaceRefHolder domain;
    @JacksonXmlProperty(localName="Path")
    private ValueSpaceRefHolder path;
    @JacksonXmlProperty(localName="Protocol")
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
