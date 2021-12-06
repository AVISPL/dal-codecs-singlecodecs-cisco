/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device capabilities status class
 * Represents capabilities node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Capabilities {
    @JacksonXmlProperty(localName="Conference")
    private ConferenceCapabilities conferenceCapabilities;

    /**
     * Retrieves {@code {@link #conferenceCapabilities}}
     *
     * @return value of {@link #conferenceCapabilities}
     */
    public ConferenceCapabilities getConferenceCapabilities() {
        return conferenceCapabilities;
    }

    /**
     * Sets {@code conferenceCapabilities}
     *
     * @param conferenceCapabilities the {@code com.avispl.dal.communicator.cisco.dto.status.root.ConferenceCapabilities} field
     */
    public void setConferenceCapabilities(ConferenceCapabilities conferenceCapabilities) {
        this.conferenceCapabilities = conferenceCapabilities;
    }
}
