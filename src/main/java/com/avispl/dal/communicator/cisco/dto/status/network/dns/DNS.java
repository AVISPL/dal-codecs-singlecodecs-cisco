/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network.dns;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class DNS {
    @XmlElement(name = "Domain")
    private DNSDomain dnsDomain;
    @XmlElement(name = "Server")
    private DNSServer dnsServer;

    public DNSDomain getDnsDomain() {
        return dnsDomain;
    }

    public void setDnsDomain(DNSDomain dnsDomain) {
        this.dnsDomain = dnsDomain;
    }

    public DNSServer getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(DNSServer dnsServer) {
        this.dnsServer = dnsServer;
    }
}
