/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device ipv4 status class
 * Represents ipv4 node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class IPv4 {
    @JacksonXmlProperty(localName="Address")
    private String address;
    @JacksonXmlProperty(localName="Gateway")
    private String gateway;
    @JacksonXmlProperty(localName="SubnetMask")
    private String subnetMask;

    /**
     * Retrieves {@code {@link #address}}
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
     * Retrieves {@code {@link #gateway}}
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

    /**
     * Retrieves {@code {@link #subnetMask}}
     *
     * @return value of {@link #subnetMask}
     */
    public String getSubnetMask() {
        return subnetMask;
    }

    /**
     * Sets {@code subnetMask}
     *
     * @param subnetMask the {@code java.lang.String} field
     */
    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }
}
