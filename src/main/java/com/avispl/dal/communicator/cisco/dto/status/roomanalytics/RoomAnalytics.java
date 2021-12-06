/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device room analytics status class
 * Represents room analytics node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class RoomAnalytics {
    @JacksonXmlProperty(localName="PeoplePresence")
    private String peoplePresence;
    @JacksonXmlProperty(localName="AmbientNoise")
    private AmbientNoise ambientNoise;
    @JacksonXmlProperty(localName="Engagement")
    private Engagement engagement;
    @JacksonXmlProperty(localName="PeopleCount")
    private PeopleCount peopleCount;
    @JacksonXmlProperty(localName="Sound")
    private Sound sound;

    /**
     * Retrieves {@code {@link #peoplePresence}}
     *
     * @return value of {@link #peoplePresence}
     */
    public String getPeoplePresence() {
        return peoplePresence;
    }

    /**
     * Sets {@code peoplePresence}
     *
     * @param peoplePresence the {@code java.lang.String} field
     */
    public void setPeoplePresence(String peoplePresence) {
        this.peoplePresence = peoplePresence;
    }

    /**
     * Retrieves {@code {@link #ambientNoise}}
     *
     * @return value of {@link #ambientNoise}
     */
    public AmbientNoise getAmbientNoise() {
        return ambientNoise;
    }

    /**
     * Sets {@code ambientNoise}
     *
     * @param ambientNoise the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.AmbientNoise} field
     */
    public void setAmbientNoise(AmbientNoise ambientNoise) {
        this.ambientNoise = ambientNoise;
    }

    /**
     * Retrieves {@code {@link #engagement}}
     *
     * @return value of {@link #engagement}
     */
    public Engagement getEngagement() {
        return engagement;
    }

    /**
     * Sets {@code engagement}
     *
     * @param engagement the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.Engagement} field
     */
    public void setEngagement(Engagement engagement) {
        this.engagement = engagement;
    }

    /**
     * Retrieves {@code {@link #peopleCount}}
     *
     * @return value of {@link #peopleCount}
     */
    public PeopleCount getPeopleCount() {
        return peopleCount;
    }

    /**
     * Sets {@code peopleCount}
     *
     * @param peopleCount the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.PeopleCount} field
     */
    public void setPeopleCount(PeopleCount peopleCount) {
        this.peopleCount = peopleCount;
    }

    /**
     * Retrieves {@code {@link #sound}}
     *
     * @return value of {@link #sound}
     */
    public Sound getSound() {
        return sound;
    }

    /**
     * Sets {@code sound}
     *
     * @param sound the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.Sound} field
     */
    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
