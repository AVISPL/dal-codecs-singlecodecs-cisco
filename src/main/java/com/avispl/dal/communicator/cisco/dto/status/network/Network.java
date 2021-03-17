/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import com.avispl.dal.communicator.cisco.dto.status.network.dns.DNS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Network {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "CDP")
    private CDP cdp;
    @XmlElement(name = "DNS")
    private DNS dns;
    @XmlElement(name = "Ethernet")
    private Ethernet ethernet;
    @XmlElement(name = "IPv4")
    private IPv4 iPv4;
    @XmlElement(name = "IPv6")
    private IPv6 iPv6;

    public CDP getCdp() {
        return cdp;
    }

    public void setCdp(CDP cdp) {
        this.cdp = cdp;
    }

    public DNS getDns() {
        return dns;
    }

    public void setDns(DNS dns) {
        this.dns = dns;
    }

    public Ethernet getEthernet() {
        return ethernet;
    }

    public void setEthernet(Ethernet ethernet) {
        this.ethernet = ethernet;
    }

    public IPv4 getiPv4() {
        return iPv4;
    }

    public void setiPv4(IPv4 iPv4) {
        this.iPv4 = iPv4;
    }

    public IPv6 getiPv6() {
        return iPv6;
    }

    public void setiPv6(IPv6 iPv6) {
        this.iPv6 = iPv6;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
