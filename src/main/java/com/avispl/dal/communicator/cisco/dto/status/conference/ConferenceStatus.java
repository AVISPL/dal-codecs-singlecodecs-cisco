/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device conference status class
 * Represents conferenceStatus node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class ConferenceStatus {
    @JacksonXmlProperty(localName="ActiveSpeaker")
    private ActiveConferenceSpeaker activeSpeaker;
    @JacksonXmlProperty(localName="DoNotDisturb")
    private String doNotDisturb;
    @JacksonXmlProperty(localName="Multipoint")
    private Multipoint multipoint;
    @JacksonXmlProperty(localName="Presentation")
    private Presentation presentation;
    @JacksonXmlProperty(localName="SpeakerLock")
    private SpeakerLock speakerLock;

    /**
     * Retrieves {@link #activeSpeaker}
     *
     * @return value of {@link #activeSpeaker}
     */
    public ActiveConferenceSpeaker getActiveSpeaker() {
        return activeSpeaker;
    }

    /**
     * Sets {@code activeSpeaker}
     *
     * @param activeSpeaker the {@code com.avispl.dal.communicator.cisco.dto.status.conference.ActiveConferenceSpeaker} field
     */
    public void setActiveSpeaker(ActiveConferenceSpeaker activeSpeaker) {
        this.activeSpeaker = activeSpeaker;
    }

    /**
     * Retrieves {@link #doNotDisturb}
     *
     * @return value of {@link #doNotDisturb}
     */
    public String getDoNotDisturb() {
        return doNotDisturb;
    }

    /**
     * Sets {@code doNotDisturb}
     *
     * @param doNotDisturb the {@code java.lang.String} field
     */
    public void setDoNotDisturb(String doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
    }

    /**
     * Retrieves {@link #multipoint}
     *
     * @return value of {@link #multipoint}
     */
    public Multipoint getMultipoint() {
        return multipoint;
    }

    /**
     * Sets {@code multipoint}
     *
     * @param multipoint the {@code com.avispl.dal.communicator.cisco.dto.status.conference.Multipoint} field
     */
    public void setMultipoint(Multipoint multipoint) {
        this.multipoint = multipoint;
    }

    /**
     * Retrieves {@link #presentation}
     *
     * @return value of {@link #presentation}
     */
    public Presentation getPresentation() {
        return presentation;
    }

    /**
     * Sets {@code presentation}
     *
     * @param presentation the {@code com.avispl.dal.communicator.cisco.dto.status.conference.Presentation} field
     */
    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    /**
     * Retrieves {@link #speakerLock}
     *
     * @return value of {@link #speakerLock}
     */
    public SpeakerLock getSpeakerLock() {
        return speakerLock;
    }

    /**
     * Sets {@code speakerLock}
     *
     * @param speakerLock the {@code com.avispl.dal.communicator.cisco.dto.status.conference.SpeakerLock} field
     */
    public void setSpeakerLock(SpeakerLock speakerLock) {
        this.speakerLock = speakerLock;
    }
}
