/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

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

    public NetworkServicesConfigurationCDP getCdp() {
        return cdp;
    }

    public void setCdp(NetworkServicesConfigurationCDP cdp) {
        this.cdp = cdp;
    }

    public NetworkServicesConfigurationH323 getH323() {
        return h323;
    }

    public void setH323(NetworkServicesConfigurationH323 h323) {
        this.h323 = h323;
    }

    public NetworkServicesConfigurationHTTP getHttp() {
        return http;
    }

    public void setHttp(NetworkServicesConfigurationHTTP http) {
        this.http = http;
    }

    public NetworkServicesConfigurationNTP getNtp() {
        return ntp;
    }

    public void setNtp(NetworkServicesConfigurationNTP ntp) {
        this.ntp = ntp;
    }

    public NetworkServicesConfigurationSIP getSip() {
        return sip;
    }

    public void setSip(NetworkServicesConfigurationSIP sip) {
        this.sip = sip;
    }

    public NetworkServicesConfigurationSSH getSsh() {
        return ssh;
    }

    public void setSsh(NetworkServicesConfigurationSSH ssh) {
        this.ssh = ssh;
    }

    public NetworkServicesConfigurationTelnet getTelnet() {
        return telnet;
    }

    public void setTelnet(NetworkServicesConfigurationTelnet telnet) {
        this.telnet = telnet;
    }

    public NetworkServicesConfigurationUPnP getuPnP() {
        return uPnP;
    }

    public void setuPnP(NetworkServicesConfigurationUPnP uPnP) {
        this.uPnP = uPnP;
    }

    public ValueSpaceRefHolder getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(ValueSpaceRefHolder welcomeText) {
        this.welcomeText = welcomeText;
    }

    public NetworkServicesConfigurationSNMP getSnmp() {
        return snmp;
    }

    public void setSnmp(NetworkServicesConfigurationSNMP snmp) {
        this.snmp = snmp;
    }

    public NetworkServicesConfigurationHTTPS getHttps() {
        return https;
    }

    public void setHttps(NetworkServicesConfigurationHTTPS https) {
        this.https = https;
    }
}
