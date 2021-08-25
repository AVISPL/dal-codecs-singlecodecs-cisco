/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call.response;



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/***
 * Dial command response template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class DialResult {
    @XmlAttribute(name = "status")
    private String status;
    @XmlElement(name = "CallId")
    private String callId;
    @XmlElement(name = "ConferenceId")
    private String conferenceId;

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
     * Retrieves {@code {@link #callId}}
     *
     * @return value of {@link #callId}
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets {@code callId}
     *
     * @param callId the {@code java.lang.String} field
     */
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Retrieves {@code {@link #conferenceId}}
     *
     * @return value of {@link #conferenceId}
     */
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets {@code conferenceId}
     *
     * @param conferenceId the {@code java.lang.String} field
     */
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }
}
