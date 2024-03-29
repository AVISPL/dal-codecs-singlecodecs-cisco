/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.networkservices;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device ntp status class
 * Represents ntp node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NTP {
    @JacksonXmlProperty(localName="CurrentAddress")
    private String currentAddress;
    @JacksonXmlProperty(localName="Discarded")
    private String discarded;
    @JacksonXmlProperty(localName="Server")
    @JacksonXmlElementWrapper(useWrapping = false)
    private NTPServer[] servers;

    /**
     * Retrieves {@link #currentAddress}
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
     * Retrieves {@link #discarded}
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
     * Retrieves {@link #servers}
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
