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
    private NetworkConfigurationDNS networkConfigurationDNS;
    @JacksonXmlProperty(localName="IEEE8021X")
    private NetworkConfigurationIEEE8021X networkConfigurationIEEE8021X;
    @JacksonXmlProperty(localName="IPv4")
    private NetworkConfigurationIPv4 networkConfigurationIPv4;
    @JacksonXmlProperty(localName="IPv6")
    private NetworkConfigurationIPv6 networkConfigurationIPv6;
    @JacksonXmlProperty(localName="QoS")
    private NetworkConfigurationQoS networkConfigurationQoS;
    @JacksonXmlProperty(localName="VLAN")
    private NetworkConfigurationVLAN networkConfigurationVLAN;
    @JacksonXmlProperty(localName="IPStack")
    private ValueSpaceRefHolder networkConfigurationIPStack;
    @JacksonXmlProperty(localName="MTU")
    private ValueSpaceRefHolder networkConfigurationMTU;
    @JacksonXmlProperty(localName="Speed")
    private ValueSpaceRefHolder networkConfigurationSpeed;

    /**
     * Retrieves {@link #item}
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
     * Retrieves {@link #networkConfigurationDNS }
     *
     * @return value of {@link #networkConfigurationDNS}
     */
    public NetworkConfigurationDNS getNetworkConfigurationDNS() {
        return networkConfigurationDNS;
    }

    /**
     * Sets {@code DNS}
     *
     * @param networkConfigurationDNS the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationDNS} field
     */
    public void setNetworkConfigurationDNS(NetworkConfigurationDNS networkConfigurationDNS) {
        this.networkConfigurationDNS = networkConfigurationDNS;
    }

    /**
     * Retrieves {@link #networkConfigurationIEEE8021X }
     *
     * @return value of {@link #networkConfigurationIEEE8021X}
     */
    public NetworkConfigurationIEEE8021X getNetworkConfigurationIEEE8021X() {
        return networkConfigurationIEEE8021X;
    }

    /**
     * Sets {@code IEEE8021X}
     *
     * @param networkConfigurationIEEE8021X the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIEEE8021X} field
     */
    public void setNetworkConfigurationIEEE8021X(NetworkConfigurationIEEE8021X networkConfigurationIEEE8021X) {
        this.networkConfigurationIEEE8021X = networkConfigurationIEEE8021X;
    }

    /**
     * Retrieves {@link #networkConfigurationIPv4 }
     *
     * @return value of {@link #networkConfigurationIPv4}
     */
    public NetworkConfigurationIPv4 getNetworkConfigurationIPv4() {
        return networkConfigurationIPv4;
    }

    /**
     * Sets {@code IPv4}
     *
     * @param networkConfigurationIPv4 the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIPv4} field
     */
    public void setNetworkConfigurationIPv4(NetworkConfigurationIPv4 networkConfigurationIPv4) {
        this.networkConfigurationIPv4 = networkConfigurationIPv4;
    }

    /**
     * Retrieves {@link #networkConfigurationIPv6 }
     *
     * @return value of {@link #networkConfigurationIPv6}
     */
    public NetworkConfigurationIPv6 getNetworkConfigurationIPv6() {
        return networkConfigurationIPv6;
    }

    /**
     * Sets {@code IPv6}
     *
     * @param networkConfigurationIPv6 the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationIPv4} field
     */
    public void setNetworkConfigurationIPv6(NetworkConfigurationIPv6 networkConfigurationIPv6) {
        this.networkConfigurationIPv6 = networkConfigurationIPv6;
    }

    /**
     * Retrieves {@link #networkConfigurationQoS }
     *
     * @return value of {@link #networkConfigurationQoS}
     */
    public NetworkConfigurationQoS getNetworkConfigurationQoS() {
        return networkConfigurationQoS;
    }

    /**
     * Sets {@code QoS}
     *
     * @param QoS the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationQoS} field
     */
    public void setNetworkConfigurationQoS(NetworkConfigurationQoS networkConfigurationQoS) {
        this.networkConfigurationQoS = networkConfigurationQoS;
    }

    /**
     * Retrieves {@link #networkConfigurationVLAN }
     *
     * @return value of {@link #networkConfigurationVLAN}
     */
    public NetworkConfigurationVLAN getNetworkConfigurationVLAN() {
        return networkConfigurationVLAN;
    }

    /**
     * Sets {@code vlan}
     *
     * @param networkConfigurationVLAN the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationVLAN} field
     */
    public void setNetworkConfigurationVLAN(NetworkConfigurationVLAN networkConfigurationVLAN) {
        this.networkConfigurationVLAN = networkConfigurationVLAN;
    }

    /**
     * Retrieves {@link #networkConfigurationIPStack }
     *
     * @return value of {@link #networkConfigurationIPStack}
     */
    public ValueSpaceRefHolder getNetworkConfigurationIPStack() {
        return networkConfigurationIPStack;
    }

    /**
     * Sets {@code ipStack}
     *
     * @param networkConfigurationIPStack the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setNetworkConfigurationIPStack(ValueSpaceRefHolder networkConfigurationIPStack) {
        this.networkConfigurationIPStack = networkConfigurationIPStack;
    }

    /**
     * Retrieves {@link #networkConfigurationMTU }
     *
     * @return value of {@link #networkConfigurationMTU}
     */
    public ValueSpaceRefHolder getNetworkConfigurationMTU() {
        return networkConfigurationMTU;
    }

    /**
     * Sets {@code mtu}
     *
     * @param networkConfigurationMTU the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setNetworkConfigurationMTU(ValueSpaceRefHolder networkConfigurationMTU) {
        this.networkConfigurationMTU = networkConfigurationMTU;
    }

    /**
     * Retrieves {@link #networkConfigurationSpeed }
     *
     * @return value of {@link #networkConfigurationSpeed}
     */
    public ValueSpaceRefHolder getNetworkConfigurationSpeed() {
        return networkConfigurationSpeed;
    }

    /**
     * Sets {@code speed}
     *
     * @param networkConfigurationSpeed the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setNetworkConfigurationSpeed(ValueSpaceRefHolder networkConfigurationSpeed) {
        this.networkConfigurationSpeed = networkConfigurationSpeed;
    }
}
