/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import com.avispl.dal.communicator.cisco.dto.status.network.dns.DNS;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device network status class
 * Represents network node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Network {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="CDP")
    private CDP cdp;
    @JacksonXmlProperty(localName="DNS")
    private DNS dns;
    @JacksonXmlProperty(localName="Ethernet")
    private Ethernet ethernet;
    @JacksonXmlProperty(localName="IPv4")
    private IPv4 iPv4;
    @JacksonXmlProperty(localName="IPv6")
    private IPv6 iPv6;

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #cdp}}
     *
     * @return value of {@link #cdp}
     */
    public CDP getCdp() {
        return cdp;
    }

    /**
     * Sets {@code cdp}
     *
     * @param cdp the {@code com.avispl.dal.communicator.cisco.dto.status.network.CDP} field
     */
    public void setCdp(CDP cdp) {
        this.cdp = cdp;
    }

    /**
     * Retrieves {@code {@link #dns}}
     *
     * @return value of {@link #dns}
     */
    public DNS getDns() {
        return dns;
    }

    /**
     * Sets {@code dns}
     *
     * @param dns the {@code com.avispl.dal.communicator.cisco.dto.status.network.dns.DNS} field
     */
    public void setDns(DNS dns) {
        this.dns = dns;
    }

    /**
     * Retrieves {@code {@link #ethernet}}
     *
     * @return value of {@link #ethernet}
     */
    public Ethernet getEthernet() {
        return ethernet;
    }

    /**
     * Sets {@code ethernet}
     *
     * @param ethernet the {@code com.avispl.dal.communicator.cisco.dto.status.network.Ethernet} field
     */
    public void setEthernet(Ethernet ethernet) {
        this.ethernet = ethernet;
    }

    /**
     * Retrieves {@code {@link #iPv4}}
     *
     * @return value of {@link #iPv4}
     */
    public IPv4 getiPv4() {
        return iPv4;
    }

    /**
     * Sets {@code iPv4}
     *
     * @param iPv4 the {@code com.avispl.dal.communicator.cisco.dto.status.network.IPv4} field
     */
    public void setiPv4(IPv4 iPv4) {
        this.iPv4 = iPv4;
    }

    /**
     * Retrieves {@code {@link #iPv6}}
     *
     * @return value of {@link #iPv6}
     */
    public IPv6 getiPv6() {
        return iPv6;
    }

    /**
     * Sets {@code iPv6}
     *
     * @param iPv6 the {@code com.avispl.dal.communicator.cisco.dto.status.network.IPv6} field
     */
    public void setiPv6(IPv6 iPv6) {
        this.iPv6 = iPv6;
    }
}
