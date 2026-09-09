/*
 * Copyright (c) 2023-2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webrtc;

import com.avispl.dal.communicator.cisco.dto.status.webrtc.teams.MicrosoftTeamsStatus;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * WebRTC node wrapper
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class WebRTCProvider {
    @JacksonXmlProperty(localName = "GoogleMeet")
    private GoogleMeetStatus googleMeetStatus;
    @JacksonXmlProperty(localName = "MicrosoftTeams")
    private MicrosoftTeamsStatus microsoftTeamsStatus;

    /**
     * Retrieves {@link #googleMeetStatus}
     *
     * @return value of {@link #googleMeetStatus}
     */
    public GoogleMeetStatus getGoogleMeetStatus() {
        return googleMeetStatus;
    }

    /**
     * Sets {@link #googleMeetStatus} value
     *
     * @param googleMeetStatus new value of {@link #googleMeetStatus}
     */
    public void setGoogleMeetStatus(GoogleMeetStatus googleMeetStatus) {
        this.googleMeetStatus = googleMeetStatus;
    }

    /**
     * Retrieves {@link #microsoftTeamsStatus}
     *
     * @return value of {@link #microsoftTeamsStatus}
     */
    public MicrosoftTeamsStatus getMicrosoftTeamsStatus() {
        return microsoftTeamsStatus;
    }

    /**
     * Sets {@link #microsoftTeamsStatus} value
     *
     * @param microsoftTeamsStatus new value of {@link #microsoftTeamsStatus}
     */
    public void setMicrosoftTeamsStatus(MicrosoftTeamsStatus microsoftTeamsStatus) {
        this.microsoftTeamsStatus = microsoftTeamsStatus;
    }
}
