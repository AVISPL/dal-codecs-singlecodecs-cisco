/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.h323;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device h323 gatekeeper class
 * Represents H323 gatekeeper node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class H323Gatekeeper {
    @XmlElement(name = "Address")
    private String address;
    @XmlElement(name = "Port")
    private String port;
    @XmlElement(name = "Reason")
    private String reason;
    @XmlElement(name = "Status")
    private String status;

    /**
     * Retrieves {@code {@link #address}}
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
     * Retrieves {@code {@link #port}}
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
}
