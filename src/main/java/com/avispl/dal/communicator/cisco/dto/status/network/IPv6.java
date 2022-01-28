/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device ipv6 status class
 * Represents ipv6 node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class IPv6 {
    @JacksonXmlProperty(localName="Address")
    private String address;
    @JacksonXmlProperty(localName="Gateway")
    private String gateway;

    /**
     * Retrieves {@link #address}
     *
     * @return value of {@link #address}
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code java.lang.String} field
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves {@link #gateway}
     *
     * @return value of {@link #gateway}
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * Sets {@code gateway}
     *
     * @param gateway the {@code java.lang.String} field
     */
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
}
