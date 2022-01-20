/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device sip registration status class
 * Represents sip registration node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Registration {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="Reason")
    private String reason;
    @JacksonXmlProperty(localName="Status")
    private String status;
    @JacksonXmlProperty(localName="URI")
    private String uri;

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
     * Retrieves {@code {@link #reason}}
     *
     * @return value of {@link #reason}
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets {@code reason}
     *
     * @param reason the {@code java.lang.String} field
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Retrieves {@code {@link #status}}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@code {@link #uri}}
     *
     * @return value of {@link #uri}
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets {@code uri}
     *
     * @param uri the {@code java.lang.String} field
     */
    public void setUri(String uri) {
        this.uri = uri;
    }
}
