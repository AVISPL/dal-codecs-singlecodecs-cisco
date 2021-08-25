/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device active conference speaker class
 * Represents activeConferenceSpeaker node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ActiveConferenceSpeaker {
    @XmlElement(name = "CallId")
    private String callId;

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
}
