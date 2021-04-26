/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Network Services Configuration SNMP class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkServicesConfigurationSNMP {
    @XmlElement(name = "CommunityName")
    private ValueSpaceRefHolder communityName;
    @XmlElement(name = "Host")

    private NetworkConfigurationServer[] hosts;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "SystemContact")
    private ValueSpaceRefHolder systemContact;
    @XmlElement(name = "SystemLocation")
    private ValueSpaceRefHolder systemLocation;

    /**
     * Retrieves {@code {@link #communityName}}
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
     * Retrieves {@code {@link #hosts}}
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
     * Retrieves {@code {@link #mode}}
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
     * Retrieves {@code {@link #systemContact}}
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
     * Retrieves {@code {@link #systemLocation}}
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
