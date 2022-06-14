/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.h323;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device h323 gatekeeper class
 * Represents H323 gatekeeper node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class H323Gatekeeper {
    @JacksonXmlProperty(localName="Address")
    private String address;
    @JacksonXmlProperty(localName="Port")
    private String port;
    @JacksonXmlProperty(localName="Reason")
    private String reason;
    @JacksonXmlProperty(localName="Status")
    private String status;

    /**
     * Retrieves {@link #address}
     *
     * @return value of {@link #address}
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code java.lang.String} field
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves {@link #port}
     *
     * @return value of {@link #port}
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets {@code port}
     *
     * @param port the {@code java.lang.String} field
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * Retrieves {@link #reason}
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
     * Retrieves {@link #status}
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
}
