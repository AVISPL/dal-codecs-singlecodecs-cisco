/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device proximity services status class
 * Represents proximity services node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class ProximityServices {
    @JacksonXmlProperty(localName="Availability")
    private String availability;

    /**
     * Retrieves {@code {@link #availability}}
     *
     * @return value of {@link #availability}
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets {@code availability}
     *
     * @param availability the {@code java.lang.String} field
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
