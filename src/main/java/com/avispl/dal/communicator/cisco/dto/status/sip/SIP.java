/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device SIP status class
 * Represents SIP node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class SIP {
    @JacksonXmlProperty(localName="Authentication")
    private String authentication;
    @JacksonXmlProperty(localName="CallForward")
    private CallForward callForward;
    @JacksonXmlProperty(localName="Mailbox")
    private Mailbox mailbox;
    @JacksonXmlProperty(localName="Registration")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Registration[] registrations;
    @JacksonXmlProperty(localName="Proxy")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Proxy[] proxies;
    @JacksonXmlProperty(localName="Secure")
    private String secure;
    @JacksonXmlProperty(localName="Verified")
    private String verified;

    /**
     * Retrieves {@link #authentication}
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
     * Retrieves {@link #callForward}
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
     * Retrieves {@link #mailbox}
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
     * Retrieves {@link #registrations}
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
     * Retrieves {@link #proxies}
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
     * Retrieves {@link #secure}
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
     * Retrieves {@link #verified}
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
