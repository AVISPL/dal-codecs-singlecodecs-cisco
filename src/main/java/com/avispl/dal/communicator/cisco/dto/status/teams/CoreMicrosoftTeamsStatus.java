/*
 * Copyright (c) 2023-2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Provides MS Teams application status
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class CoreMicrosoftTeamsStatus {
    @JacksonXmlProperty(localName = "Availability")
    private String availability;
    @JacksonXmlProperty(localName = "User")
    private MicrosoftTeamsUser user;
    @JacksonXmlProperty(localName = "Calling")
    private MicrosoftTeamsCalling calling;
    @JacksonXmlProperty(localName = "Software")
    private MicrosoftTeamsSoftware software;
    @JacksonXmlProperty(localName = "Pairing")
    private MicrosoftTeamsPairing pairing;
    @JacksonXmlProperty(localName = "HardwareAccelerator")
    private MicrosoftTeamsHardwareAccelerator hardwareAccelerator;

    /**
     * Retrieves {@link #availability}
     *
     * @return value of {@link #availability}
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets {@link #availability} value
     *
     * @param availability new value of {@link #availability}
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Retrieves {@link #user}
     *
     * @return value of {@link #user}
     */
    public MicrosoftTeamsUser getUser() {
        return user;
    }

    /**
     * Sets {@link #user} value
     *
     * @param user new value of {@link #user}
     */
    public void setUser(MicrosoftTeamsUser user) {
        this.user = user;
    }

    /**
     * Retrieves {@link #calling}
     *
     * @return value of {@link #calling}
     */
    public MicrosoftTeamsCalling getCalling() {
        return calling;
    }

    /**
     * Sets {@link #calling} value
     *
     * @param calling new value of {@link #calling}
     */
    public void setCalling(MicrosoftTeamsCalling calling) {
        this.calling = calling;
    }

    /**
     * Retrieves {@link #software}
     *
     * @return value of {@link #software}
     */
    public MicrosoftTeamsSoftware getSoftware() {
        return software;
    }

    /**
     * Sets {@link #software} value
     *
     * @param software new value of {@link #software}
     */
    public void setSoftware(MicrosoftTeamsSoftware software) {
        this.software = software;
    }

    /**
     * Retrieves {@link #pairing}
     *
     * @return value of {@link #pairing}
     */
    public MicrosoftTeamsPairing getPairing() {
        return pairing;
    }

    /**
     * Sets {@link #pairing} value
     *
     * @param pairing new value of {@link #pairing}
     */
    public void setPairing(MicrosoftTeamsPairing pairing) {
        this.pairing = pairing;
    }

    /**
     * Retrieves {@link #hardwareAccelerator}
     *
     * @return value of {@link #hardwareAccelerator}
     */
    public MicrosoftTeamsHardwareAccelerator getHardwareAccelerator() {
        return hardwareAccelerator;
    }

    /**
     * Sets {@link #hardwareAccelerator} value
     *
     * @param hardwareAccelerator new value of {@link #hardwareAccelerator}
     */
    public void setHardwareAccelerator(MicrosoftTeamsHardwareAccelerator hardwareAccelerator) {
        this.hardwareAccelerator = hardwareAccelerator;
    }
}
