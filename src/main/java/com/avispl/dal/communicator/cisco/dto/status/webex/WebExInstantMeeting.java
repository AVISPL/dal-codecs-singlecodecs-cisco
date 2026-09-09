/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webex;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * WebEx instant meetings details of the device
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on June 6, 2023
 * @since 1.1.4
 */
public class WebExInstantMeeting {
    @JacksonXmlProperty(localName="Availability")
    private String availability;

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
}
