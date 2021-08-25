/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.networkservices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device ntp status class
 * Represents ntp node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NTP {
    @XmlElement(name = "CurrentAddress")
    private String currentAddress;
    @XmlElement(name = "Discarded")
    private String discarded;
    @XmlElement(name = "Server")
    private NTPServer[] servers;

    /**
     * Retrieves {@code {@link #currentAddress}}
     *
     * @return value of {@link #currentAddress}
     */
    public String getCurrentAddress() {
        return currentAddress;
    }

    /**
     * Sets {@code currentAddress}
     *
     * @param currentAddress the {@code java.lang.String} field
     */
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    /**
     * Retrieves {@code {@link #discarded}}
     *
     * @return value of {@link #discarded}
     */
    public String getDiscarded() {
        return discarded;
    }

    /**
     * Sets {@code discarded}
     *
     * @param discarded the {@code java.lang.String} field
     */
    public void setDiscarded(String discarded) {
        this.discarded = discarded;
    }

    /**
     * Retrieves {@code {@link #servers}}
     *
     * @return value of {@link #servers}
     */
    public NTPServer[] getServers() {
        return servers;
    }

    /**
     * Sets {@code servers}
     *
     * @param servers the {@code com.avispl.dal.communicator.cisco.dto.status.networkservices.NTPServer[]} field
     */
    public void setServers(NTPServer[] servers) {
        this.servers = servers;
    }
}
