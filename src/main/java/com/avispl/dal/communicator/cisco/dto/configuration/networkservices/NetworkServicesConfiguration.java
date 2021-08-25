/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Network Services Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkServicesConfiguration {
    @XmlElement(name = "CDP")
    private NetworkServicesConfigurationCDP cdp;
    @XmlElement(name = "H323")
    private NetworkServicesConfigurationH323 h323;
    @XmlElement(name = "HTTP")
    private NetworkServicesConfigurationHTTP http;
    @XmlElement(name = "HTTPS")
    private NetworkServicesConfigurationHTTPS https;
    @XmlElement(name = "NTP")
    private NetworkServicesConfigurationNTP ntp;
    @XmlElement(name = "SIP")
    private NetworkServicesConfigurationSIP sip;
    @XmlElement(name = "SNMP")
    private NetworkServicesConfigurationSNMP snmp;
    @XmlElement(name = "SSH")
    private NetworkServicesConfigurationSSH ssh;
    @XmlElement(name = "Telnet")
    private NetworkServicesConfigurationTelnet telnet;
    @XmlElement(name = "UPnP")
    private NetworkServicesConfigurationUPnP uPnP;
    @XmlElement(name = "WelcomeText")
    private ValueSpaceRefHolder welcomeText;

    /**
     * Retrieves {@code {@link #cdp}}
     *
     * @return value of {@link #cdp}
     */
    public NetworkServicesConfigurationCDP getCdp() {
        return cdp;
    }

    /**
     * Sets {@code cdp}
     *
     * @param cdp the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationCDP} field
     */
    public void setCdp(NetworkServicesConfigurationCDP cdp) {
        this.cdp = cdp;
    }

    /**
     * Retrieves {@code {@link #h323}}
     *
     * @return value of {@link #h323}
     */
    public NetworkServicesConfigurationH323 getH323() {
        return h323;
    }

    /**
     * Sets {@code h323}
     *
     * @param h323 the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationH323} field
     */
    public void setH323(NetworkServicesConfigurationH323 h323) {
        this.h323 = h323;
    }

    /**
     * Retrieves {@code {@link #http}}
     *
     * @return value of {@link #http}
     */
    public NetworkServicesConfigurationHTTP getHttp() {
        return http;
    }

    /**
     * Sets {@code http}
     *
     * @param http the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationHTTP} field
     */
    public void setHttp(NetworkServicesConfigurationHTTP http) {
        this.http = http;
    }

    /**
     * Retrieves {@code {@link #https}}
     *
     * @return value of {@link #https}
     */
    public NetworkServicesConfigurationHTTPS getHttps() {
        return https;
    }

    /**
     * Sets {@code https}
     *
     * @param https the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationHTTPS} field
     */
    public void setHttps(NetworkServicesConfigurationHTTPS https) {
        this.https = https;
    }

    /**
     * Retrieves {@code {@link #ntp}}
     *
     * @return value of {@link #ntp}
     */
    public NetworkServicesConfigurationNTP getNtp() {
        return ntp;
    }

    /**
     * Sets {@code ntp}
     *
     * @param ntp the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationNTP} field
     */
    public void setNtp(NetworkServicesConfigurationNTP ntp) {
        this.ntp = ntp;
    }

    /**
     * Retrieves {@code {@link #sip}}
     *
     * @return value of {@link #sip}
     */
    public NetworkServicesConfigurationSIP getSip() {
        return sip;
    }

    /**
     * Sets {@code sip}
     *
     * @param sip the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationSIP} field
     */
    public void setSip(NetworkServicesConfigurationSIP sip) {
        this.sip = sip;
    }

    /**
     * Retrieves {@code {@link #snmp}}
     *
     * @return value of {@link #snmp}
     */
    public NetworkServicesConfigurationSNMP getSnmp() {
        return snmp;
    }

    /**
     * Sets {@code snmp}
     *
     * @param snmp the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationSNMP} field
     */
    public void setSnmp(NetworkServicesConfigurationSNMP snmp) {
        this.snmp = snmp;
    }

    /**
     * Retrieves {@code {@link #ssh}}
     *
     * @return value of {@link #ssh}
     */
    public NetworkServicesConfigurationSSH getSsh() {
        return ssh;
    }

    /**
     * Sets {@code ssh}
     *
     * @param ssh the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationSSH} field
     */
    public void setSsh(NetworkServicesConfigurationSSH ssh) {
        this.ssh = ssh;
    }

    /**
     * Retrieves {@code {@link #telnet}}
     *
     * @return value of {@link #telnet}
     */
    public NetworkServicesConfigurationTelnet getTelnet() {
        return telnet;
    }

    /**
     * Sets {@code telnet}
     *
     * @param telnet the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationTelnet} field
     */
    public void setTelnet(NetworkServicesConfigurationTelnet telnet) {
        this.telnet = telnet;
    }

    /**
     * Retrieves {@code {@link #uPnP}}
     *
     * @return value of {@link #uPnP}
     */
    public NetworkServicesConfigurationUPnP getuPnP() {
        return uPnP;
    }

    /**
     * Sets {@code uPnP}
     *
     * @param uPnP the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfigurationUPnP} field
     */
    public void setuPnP(NetworkServicesConfigurationUPnP uPnP) {
        this.uPnP = uPnP;
    }

    /**
     * Retrieves {@code {@link #welcomeText}}
     *
     * @return value of {@link #welcomeText}
     */
    public ValueSpaceRefHolder getWelcomeText() {
        return welcomeText;
    }

    /**
     * Sets {@code welcomeText}
     *
     * @param welcomeText the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setWelcomeText(ValueSpaceRefHolder welcomeText) {
        this.welcomeText = welcomeText;
    }
}
