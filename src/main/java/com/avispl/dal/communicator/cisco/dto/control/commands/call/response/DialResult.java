/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call.response;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/***
 * Dial command response template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DialResult {
    @JacksonXmlProperty(isAttribute = true, localName="status")
    private String status;
    @JacksonXmlProperty(localName="CallId")
    private String callId;
    @JacksonXmlProperty(localName="ConferenceId")
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
