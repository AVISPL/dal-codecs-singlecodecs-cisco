/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network.dns;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device DNS status class
 * Represents DNS node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class DNS {
    @XmlElement(name = "Domain")
    private DNSDomain dnsDomain;
    @XmlElement(name = "Server")
    private DNSServer dnsServer;

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
     * Retrieves {@code {@link #dnsServer}}
     *
     * @return value of {@link #dnsServer}
     */
    public DNSServer getDnsServer() {
        return dnsServer;
    }

    /**
     * Sets {@code dnsServer}
     *
     * @param dnsServer the {@code com.avispl.dal.communicator.cisco.dto.status.network.dns.DNSServer} field
     */
    public void setDnsServer(DNSServer dnsServer) {
        this.dnsServer = dnsServer;
    }
}
