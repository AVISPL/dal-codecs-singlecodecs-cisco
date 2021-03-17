/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

    public ActiveConferenceSpeaker getActiveSpeaker() {
        return activeSpeaker;
    }

    public void setActiveSpeaker(ActiveConferenceSpeaker activeSpeaker) {
        this.activeSpeaker = activeSpeaker;
    }

    public String getDoNotDisturb() {
        return doNotDisturb;
    }

    public void setDoNotDisturb(String doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
    }

    public Multipoint getMultipoint() {
        return multipoint;
    }

    public void setMultipoint(Multipoint multipoint) {
        this.multipoint = multipoint;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public SpeakerLock getSpeakerLock() {
        return speakerLock;
    }

    public void setSpeakerLock(SpeakerLock speakerLock) {
        this.speakerLock = speakerLock;
    }
}
