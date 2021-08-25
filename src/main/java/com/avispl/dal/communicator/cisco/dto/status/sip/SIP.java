/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device SIP status class
 * Represents SIP node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #authentication}}
     *
     * @return value of {@link #authentication}
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * Sets {@code authentication}
     *
     * @param authentication the {@code java.lang.String} field
     */
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * Retrieves {@code {@link #callForward}}
     *
     * @return value of {@link #callForward}
     */
    public CallForward getCallForward() {
        return callForward;
    }

    /**
     * Sets {@code callForward}
     *
     * @param callForward the {@code com.avispl.dal.communicator.cisco.dto.status.sip.CallForward} field
     */
    public void setCallForward(CallForward callForward) {
        this.callForward = callForward;
    }

    /**
     * Retrieves {@code {@link #mailbox}}
     *
     * @return value of {@link #mailbox}
     */
    public Mailbox getMailbox() {
        return mailbox;
    }

    /**
     * Sets {@code mailbox}
     *
     * @param mailbox the {@code com.avispl.dal.communicator.cisco.dto.status.sip.Mailbox} field
     */
    public void setMailbox(Mailbox mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * Retrieves {@code {@link #registrations}}
     *
     * @return value of {@link #registrations}
     */
    public Registration[] getRegistrations() {
        return registrations;
    }

    /**
     * Sets {@code registrations}
     *
     * @param registrations the {@code com.avispl.dal.communicator.cisco.dto.status.sip.Registration[]} field
     */
    public void setRegistrations(Registration[] registrations) {
        this.registrations = registrations;
    }

    /**
     * Retrieves {@code {@link #proxies}}
     *
     * @return value of {@link #proxies}
     */
    public Proxy[] getProxies() {
        return proxies;
    }

    /**
     * Sets {@code proxies}
     *
     * @param proxies the {@code com.avispl.dal.communicator.cisco.dto.status.sip.Proxy[]} field
     */
    public void setProxies(Proxy[] proxies) {
        this.proxies = proxies;
    }

    /**
     * Retrieves {@code {@link #secure}}
     *
     * @return value of {@link #secure}
     */
    public String getSecure() {
        return secure;
    }

    /**
     * Sets {@code secure}
     *
     * @param secure the {@code java.lang.String} field
     */
    public void setSecure(String secure) {
        this.secure = secure;
    }

    /**
     * Retrieves {@code {@link #verified}}
     *
     * @return value of {@link #verified}
     */
    public String getVerified() {
        return verified;
    }

    /**
     * Sets {@code verified}
     *
     * @param verified the {@code java.lang.String} field
     */
    public void setVerified(String verified) {
        this.verified = verified;
    }
}
