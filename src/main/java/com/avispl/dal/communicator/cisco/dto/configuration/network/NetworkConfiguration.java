/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfiguration {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "DNS")
    private NetworkConfigurationDNS DNS;
    @XmlElement(name = "IEEE8021X")
    private NetworkConfigurationIEEE8021X IEEE8021X;
    @XmlElement(name = "IPv4")
    private NetworkConfigurationIPv4 IPv4;
    @XmlElement(name = "IPv6")
    private NetworkConfigurationIPv4 IPv6;
    @XmlElement(name = "QoS")
    private NetworkConfigurationQoS QoS;
    @XmlElement(name = "VLAN")
    private NetworkConfigurationVLAN vlan;
    @XmlElement(name = "IPStack")
    private ValueSpaceRefHolder ipStack;
    @XmlElement(name = "MTU")
    private ValueSpaceRefHolder mtu;
    @XmlElement(name = "Speed")
    private ValueSpaceRefHolder speed;

    public ValueSpaceRefHolder getMtu() {
        return mtu;
    }

    public void setMtu(ValueSpaceRefHolder mtu) {
        this.mtu = mtu;
    }

    public ValueSpaceRefHolder getIpStack() {
        return ipStack;
    }

    public void setIpStack(ValueSpaceRefHolder ipStack) {
        this.ipStack = ipStack;
    }

    public NetworkConfigurationDNS getDNS() {
        return DNS;
    }

    public void setDNS(NetworkConfigurationDNS DNS) {
        this.DNS = DNS;
    }

    public NetworkConfigurationIEEE8021X getIEEE8021X() {
        return IEEE8021X;
    }

    public void setIEEE8021X(NetworkConfigurationIEEE8021X IEEE8021X) {
        this.IEEE8021X = IEEE8021X;
    }

    public NetworkConfigurationIPv4 getIPv4() {
        return IPv4;
    }

    public void setIPv4(NetworkConfigurationIPv4 IPv4) {
        this.IPv4 = IPv4;
    }

    public NetworkConfigurationIPv4 getIPv6() {
        return IPv6;
    }

    public void setIPv6(NetworkConfigurationIPv4 IPv6) {
        this.IPv6 = IPv6;
    }

    public NetworkConfigurationQoS getQoS() {
        return QoS;
    }

    public void setQoS(NetworkConfigurationQoS qoS) {
        QoS = qoS;
    }

    public NetworkConfigurationVLAN getVlan() {
        return vlan;
    }

    public void setVlan(NetworkConfigurationVLAN vlan) {
        this.vlan = vlan;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public ValueSpaceRefHolder getSpeed() {
        return speed;
    }

    public void setSpeed(ValueSpaceRefHolder speed) {
        this.speed = speed;
    }
}
