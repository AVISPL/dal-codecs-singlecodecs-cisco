/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.h323;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device h323 mode class
 * Represents H323 mode node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class H323Mode {
    @XmlElement(name = "Reason")
    private String reason;
    @XmlElement(name = "Status")
    private String status;

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
