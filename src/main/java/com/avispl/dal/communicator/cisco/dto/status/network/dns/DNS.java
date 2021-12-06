/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network.dns;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device DNS status class
 * Represents DNS node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class DNS {
    @JacksonXmlProperty(localName="Domain")
    private DNSDomain dnsDomain;
    @JacksonXmlProperty(localName="Server")
    @JacksonXmlElementWrapper(useWrapping = false)
    private DNSServer[] dnsServers;

    /**
     * Retrieves {@code {@link #dnsDomain}}
     *
     * @return value of {@link #dnsDomain}
     */
    public DNSDomain getDnsDomain() {
        return dnsDomain;
    }

    /**
     * Sets {@code dnsDomain}
     *
     * @param dnsDomain the {@code com.avispl.dal.communicator.cisco.dto.status.network.dns.DNSDomain} field
     */
    public void setDnsDomain(DNSDomain dnsDomain) {
        this.dnsDomain = dnsDomain;
    }

    /**
     * Retrieves {@code {@link #dnsServers}}
     *
     * @return value of {@link #dnsServers}
     */
    public DNSServer[] getDnsServers() {
        return dnsServers;
    }

    /**
     * Sets {@code dnsServers}
     *
     * @param dnsServers the {@code com.avispl.dal.communicator.cisco.dto.status.network.dns.DNSServer[]} field
     */
    public void setDnsServers(DNSServer[] dnsServers) {
        this.dnsServers = dnsServers;
    }
}
