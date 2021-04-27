/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device ipv6 status class
 * Represents ipv6 node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class IPv6 {
    @XmlElement(name = "Address")
    private String address;
    @XmlElement(name = "Gateway")
    private String gateway;

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
}
