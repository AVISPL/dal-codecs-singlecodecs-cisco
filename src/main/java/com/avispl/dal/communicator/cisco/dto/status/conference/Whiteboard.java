/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device conference whiteboard class
 * Represents conference whiteboard node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Whiteboard {
    @XmlElement(name = "Mode")
    private String mode;
    @XmlElement(name = "ReleaseFloorAvailability")
    private String releaseFloorAvailability;
    @XmlElement(name = "RequestFloorAvailability")
    private String requestFloorAvailability;

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code java.lang.String} field
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Retrieves {@code {@link #releaseFloorAvailability}}
     *
     * @return value of {@link #releaseFloorAvailability}
     */
    public String getReleaseFloorAvailability() {
        return releaseFloorAvailability;
    }

    /**
     * Sets {@code releaseFloorAvailability}
     *
     * @param releaseFloorAvailability the {@code java.lang.String} field
     */
    public void setReleaseFloorAvailability(String releaseFloorAvailability) {
        this.releaseFloorAvailability = releaseFloorAvailability;
    }

    /**
     * Retrieves {@code {@link #requestFloorAvailability}}
     *
     * @return value of {@link #requestFloorAvailability}
     */
    public String getRequestFloorAvailability() {
        return requestFloorAvailability;
    }

    /**
     * Sets {@code requestFloorAvailability}
     *
     * @param requestFloorAvailability the {@code java.lang.String} field
     */
    public void setRequestFloorAvailability(String requestFloorAvailability) {
        this.requestFloorAvailability = requestFloorAvailability;
    }
}
