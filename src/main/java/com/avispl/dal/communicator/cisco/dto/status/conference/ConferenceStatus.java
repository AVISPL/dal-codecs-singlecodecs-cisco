/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device conference status class
 * Represents conferenceStatus node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceStatus {
    @XmlElement(name = "ActiveSpeaker")
    private ActiveConferenceSpeaker activeSpeaker;
    @XmlElement(name = "DoNotDisturb")
    private String doNotDisturb;
    @XmlElement(name = "Multipoint")
    private Multipoint multipoint;
    @XmlElement(name = "Presentation")
    private Presentation presentation;
    @XmlElement(name = "SpeakerLock")
    private SpeakerLock speakerLock;

    /**
     * Retrieves {@code {@link #activeSpeaker}}
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
     * Retrieves {@code {@link #doNotDisturb}}
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
     * Retrieves {@code {@link #multipoint}}
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
     * Retrieves {@code {@link #presentation}}
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
     * Retrieves {@code {@link #speakerLock}}
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
