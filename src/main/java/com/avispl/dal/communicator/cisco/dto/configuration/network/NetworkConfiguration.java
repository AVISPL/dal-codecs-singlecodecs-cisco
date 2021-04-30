/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Network Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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
     * Retrieves {@code {@link #DNS}}
     *
     * @return value of {@link #DNS}
     */
    public NetworkConfigurationDNS getDNS() {
        return DNS;
    }

    /**
     * Sets {@code DNS}
     *
     * @param DNS the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationDNS} field
     */
    public void setDNS(NetworkConfigurationDNS DNS) {
        this.DNS = DNS;
    }

    /**
     * Retrieves {@code {@link #IEEE8021X}}
     *
     * @return value of {@link #IEEE8021X}
     */
    public NetworkConfigurationIEEE8021X getIEEE8021X() {
        return IEEE8021X;
    }

    /**
     * Sets {@code IEEE8021X}
     *
     * @param IEEE8021X the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIEEE8021X} field
     */
    public void setIEEE8021X(NetworkConfigurationIEEE8021X IEEE8021X) {
        this.IEEE8021X = IEEE8021X;
    }

    /**
     * Retrieves {@code {@link #IPv4}}
     *
     * @return value of {@link #IPv4}
     */
    public NetworkConfigurationIPv4 getIPv4() {
        return IPv4;
    }

    /**
     * Sets {@code IPv4}
     *
     * @param IPv4 the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIPv4} field
     */
    public void setIPv4(NetworkConfigurationIPv4 IPv4) {
        this.IPv4 = IPv4;
    }

    /**
     * Retrieves {@code {@link #IPv6}}
     *
     * @return value of {@link #IPv6}
     */
    public NetworkConfigurationIPv4 getIPv6() {
        return IPv6;
    }

    /**
     * Sets {@code IPv6}
     *
     * @param IPv6 the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIPv4} field
     */
    public void setIPv6(NetworkConfigurationIPv4 IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Retrieves {@code {@link #QoS}}
     *
     * @return value of {@link #QoS}
     */
    public NetworkConfigurationQoS getQoS() {
        return QoS;
    }

    /**
     * Sets {@code QoS}
     *
     * @param QoS the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationQoS} field
     */
    public void setQoS(NetworkConfigurationQoS qoS) {
        QoS = qoS;
    }

    /**
     * Retrieves {@code {@link #vlan}}
     *
     * @return value of {@link #vlan}
     */
    public NetworkConfigurationVLAN getVlan() {
        return vlan;
    }

    /**
     * Sets {@code vlan}
     *
     * @param vlan the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationVLAN} field
     */
    public void setVlan(NetworkConfigurationVLAN vlan) {
        this.vlan = vlan;
    }

    /**
     * Retrieves {@code {@link #ipStack}}
     *
     * @return value of {@link #ipStack}
     */
    public ValueSpaceRefHolder getIpStack() {
        return ipStack;
    }

    /**
     * Sets {@code ipStack}
     *
     * @param ipStack the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setIpStack(ValueSpaceRefHolder ipStack) {
        this.ipStack = ipStack;
    }

    /**
     * Retrieves {@code {@link #mtu}}
     *
     * @return value of {@link #mtu}
     */
    public ValueSpaceRefHolder getMtu() {
        return mtu;
    }

    /**
     * Sets {@code mtu}
     *
     * @param mtu the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMtu(ValueSpaceRefHolder mtu) {
        this.mtu = mtu;
    }

    /**
     * Retrieves {@code {@link #speed}}
     *
     * @return value of {@link #speed}
     */
    public ValueSpaceRefHolder getSpeed() {
        return speed;
    }

    /**
     * Sets {@code speed}
     *
     * @param speed the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setSpeed(ValueSpaceRefHolder speed) {
        this.speed = speed;
    }
}
