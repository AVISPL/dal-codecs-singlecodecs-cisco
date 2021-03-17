/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class RoomAnalytics {
    @XmlElement(name = "PeoplePresence")
    private String peoplePresence;
    @XmlElement(name = "AmbientNoise")
    private AmbientNoise ambientNoise;
    @XmlElement(name = "Engagement")
    private Engagement engagement;
    @XmlElement(name = "PeopleCount")
    private PeopleCount peopleCount;
    @XmlElement(name = "Sound")
    private Sound sound;

    public String getPeoplePresence() {
        return peoplePresence;
    }

    public void setPeoplePresence(String peoplePresence) {
        this.peoplePresence = peoplePresence;
    }

    public AmbientNoise getAmbientNoise() {
        return ambientNoise;
    }

    public void setAmbientNoise(AmbientNoise ambientNoise) {
        this.ambientNoise = ambientNoise;
    }

    public Engagement getEngagement() {
        return engagement;
    }

    public void setEngagement(Engagement engagement) {
        this.engagement = engagement;
    }

    public PeopleCount getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(PeopleCount peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
