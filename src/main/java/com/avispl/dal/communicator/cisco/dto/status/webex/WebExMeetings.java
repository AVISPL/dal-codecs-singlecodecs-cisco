/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webex;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * WebEx meetings protocols details of the device
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on June 6, 2023
 * @since 1.1.4
 */
public class WebExMeetings {
    @JacksonXmlProperty(localName="JoinProtocol")
    private String joinProtocol;
    @JacksonXmlProperty(localName="InstantMeeting")
    private WebExInstantMeeting instantMeeting;

    /**
     * Retrieves {@link #joinProtocol}
     *
     * @return value of {@link #joinProtocol}
     */
    public String getJoinProtocol() {
        return joinProtocol;
    }

    /**
     * Sets {@link #joinProtocol} value
     *
     * @param joinProtocol new value of {@link #joinProtocol}
     */
    public void setJoinProtocol(String joinProtocol) {
        this.joinProtocol = joinProtocol;
    }

    /**
     * Retrieves {@link #instantMeeting}
     *
     * @return value of {@link #instantMeeting}
     */
    public WebExInstantMeeting getInstantMeeting() {
        return instantMeeting;
    }

    /**
     * Sets {@link #instantMeeting} value
     *
     * @param instantMeeting new value of {@link #instantMeeting}
     */
    public void setInstantMeeting(WebExInstantMeeting instantMeeting) {
        this.instantMeeting = instantMeeting;
    }
}
