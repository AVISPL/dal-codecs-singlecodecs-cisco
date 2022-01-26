/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;



/**
 * Device Network Services Configuration SNMP class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkServicesConfigurationSNMP {
    @JacksonXmlProperty(localName="CommunityName")
    private ValueSpaceRefHolder communityName;
    @JacksonXmlProperty(localName="Host")
    @JacksonXmlElementWrapper(useWrapping = false)
    private NetworkConfigurationServer[] hosts;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;
    @JacksonXmlProperty(localName="SystemContact")
    private ValueSpaceRefHolder systemContact;
    @JacksonXmlProperty(localName="SystemLocation")
    private ValueSpaceRefHolder systemLocation;

    /**
     * Retrieves {@link #communityName}
     *
     * @return value of {@link #communityName}
     */
    public ValueSpaceRefHolder getCommunityName() {
        return communityName;
    }

    /**
     * Sets {@code communityName}
     *
     * @param communityName the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setCommunityName(ValueSpaceRefHolder communityName) {
        this.communityName = communityName;
    }

    /**
     * Retrieves {@link #hosts}
     *
     * @return value of {@link #hosts}
     */
    public NetworkConfigurationServer[] getHosts() {
        return hosts;
    }

    /**
     * Sets {@code hosts}
     *
     * @param hosts the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer[]} field
     */
    public void setHosts(NetworkConfigurationServer[] hosts) {
        this.hosts = hosts;
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

    /**
     * Retrieves {@link #systemContact}
     *
     * @return value of {@link #systemContact}
     */
    public ValueSpaceRefHolder getSystemContact() {
        return systemContact;
    }

    /**
     * Sets {@code systemContact}
     *
     * @param systemContact the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setSystemContact(ValueSpaceRefHolder systemContact) {
        this.systemContact = systemContact;
    }

    /**
     * Retrieves {@link #systemLocation}
     *
     * @return value of {@link #systemLocation}
     */
    public ValueSpaceRefHolder getSystemLocation() {
        return systemLocation;
    }

    /**
     * Sets {@code systemLocation}
     *
     * @param systemLocation the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setSystemLocation(ValueSpaceRefHolder systemLocation) {
        this.systemLocation = systemLocation;
    }
}
