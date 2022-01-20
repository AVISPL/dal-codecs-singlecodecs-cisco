/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkConfiguration {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="DNS")
    private NetworkConfigurationDNS DNS;
    @JacksonXmlProperty(localName="IEEE8021X")
    private NetworkConfigurationIEEE8021X IEEE8021X;
    @JacksonXmlProperty(localName="IPv4")
    private NetworkConfigurationIPv4 ipV4;
    @JacksonXmlProperty(localName="IPv6")
    private NetworkConfigurationIPv4 ipV6;
    @JacksonXmlProperty(localName="QoS")
    private NetworkConfigurationQoS qos;
    @JacksonXmlProperty(localName="VLAN")
    private NetworkConfigurationVLAN vlan;
    @JacksonXmlProperty(localName="IPStack")
    private ValueSpaceRefHolder ipStack;
    @JacksonXmlProperty(localName="MTU")
    private ValueSpaceRefHolder mtu;
    @JacksonXmlProperty(localName="Speed")
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
     * Retrieves {@code {@link #ipV4 }}
     *
     * @return value of {@link #ipV4}
     */
    public NetworkConfigurationIPv4 getIpV4() {
        return ipV4;
    }

    /**
     * Sets {@code IPv4}
     *
     * @param ipV4 the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIPv4} field
     */
    public void setIpV4(NetworkConfigurationIPv4 ipV4) {
        this.ipV4 = ipV4;
    }

    /**
     * Retrieves {@code {@link #ipV6 }}
     *
     * @return value of {@link #ipV6}
     */
    public NetworkConfigurationIPv4 getIpV6() {
        return ipV6;
    }

    /**
     * Sets {@code IPv6}
     *
     * @param ipV6 the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIPv4} field
     */
    public void setIpV6(NetworkConfigurationIPv4 ipV6) {
        this.ipV6 = ipV6;
    }

    /**
     * Retrieves {@code {@link #qos }}
     *
     * @return value of {@link #qos}
     */
    public NetworkConfigurationQoS getQos() {
        return qos;
    }

    /**
     * Sets {@code QoS}
     *
     * @param QoS the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationQoS} field
     */
    public void setQos(NetworkConfigurationQoS qos) {
        this.qos = qos;
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
