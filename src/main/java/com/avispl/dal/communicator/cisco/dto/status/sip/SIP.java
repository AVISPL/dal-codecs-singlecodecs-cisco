/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class SIP {
    @XmlElement(name = "Authentication")
    private String authentication;
    @XmlElement(name = "CallForward")
    private CallForward callForward;
    @XmlElement(name = "Mailbox")
    private Mailbox mailbox;
    @XmlElement(name = "Registration")

    private Registration[] registrations;
    @XmlElement(name = "Proxy")

    private Proxy[] proxies;
    @XmlElement(name = "Secure")
    private String secure;
    @XmlElement(name = "Verified")
    private String verified;

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public CallForward getCallForward() {
        return callForward;
    }

    public void setCallForward(CallForward callForward) {
        this.callForward = callForward;
    }

    public Mailbox getMailbox() {
        return mailbox;
    }

    public void setMailbox(Mailbox mailbox) {
        this.mailbox = mailbox;
    }

    public Proxy[] getProxies() {
        return proxies;
    }

    public void setProxies(Proxy[] proxies) {
        this.proxies = proxies;
    }

    public Registration[] getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Registration[] registrations) {
        this.registrations = registrations;
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }
}
