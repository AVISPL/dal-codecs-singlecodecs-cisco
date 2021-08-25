/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device capabilities status class
 * Represents capabilities node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Capabilities {
    @XmlElement(name = "Conference")
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
