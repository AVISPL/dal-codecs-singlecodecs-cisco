/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Services Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkServicesConfiguration {
    @JacksonXmlProperty(localName="CDP")
    private NetworkServicesConfigurationCDP cdp;
    @JacksonXmlProperty(localName="H323")
    private NetworkServicesConfigurationH323 h323;
    @JacksonXmlProperty(localName="HTTP")
    private NetworkServicesConfigurationHTTP http;
    @JacksonXmlProperty(localName="HTTPS")
    private NetworkServicesConfigurationHTTPS https;
    @JacksonXmlProperty(localName="NTP")
    private NetworkServicesConfigurationNTP ntp;
    @JacksonXmlProperty(localName="SIP")
    private NetworkServicesConfigurationSIP sip;
    @JacksonXmlProperty(localName="SNMP")
    private NetworkServicesConfigurationSNMP snmp;
    @JacksonXmlProperty(localName="SSH")
    private NetworkServicesConfigurationSSH ssh;
    @JacksonXmlProperty(localName="Telnet")
    private NetworkServicesConfigurationTelnet telnet;
    @JacksonXmlProperty(localName="UPnP")
    private NetworkServicesConfigurationUPnP uPnP;
    @JacksonXmlProperty(localName="WelcomeText")
    private ValueSpaceRefHolder welcomeText;

    /**
     * Retrieves {@link #cdp}
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
     * Retrieves {@link #h323}
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
     * Retrieves {@link #http}
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
     * Retrieves {@link #https}
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
     * Retrieves {@link #ntp}
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
     * Retrieves {@link #sip}
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
     * Retrieves {@link #snmp}
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
     * Retrieves {@link #ssh}
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
     * Retrieves {@link #telnet}
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
     * Retrieves {@link #uPnP}
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
     * Retrieves {@link #welcomeText}
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
