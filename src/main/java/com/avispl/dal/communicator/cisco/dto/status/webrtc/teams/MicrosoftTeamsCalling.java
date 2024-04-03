/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webrtc.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * */
public class MicrosoftTeamsCalling {
    @JacksonXmlProperty(localName = "InCall")
    private String inCall;

    /**
     * Retrieves {@link #inCall}
     *
     * @return value of {@link #inCall}
     */
    public String getInCall() {
        return inCall;
    }

    /**
     * Sets {@link #inCall} value
     *
     * @param inCall new value of {@link #inCall}
     */
    public void setInCall(String inCall) {
        this.inCall = inCall;
    }
}
