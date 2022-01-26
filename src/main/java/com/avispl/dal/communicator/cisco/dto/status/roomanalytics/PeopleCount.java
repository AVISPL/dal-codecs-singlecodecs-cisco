/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device people count status class
 * Represents people count node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class PeopleCount {
    @JacksonXmlProperty(localName="Current")
    private String current;

    /**
     * Retrieves {@link #current}
     *
     * @return value of {@link #current}
     */
    public String getCurrent() {
        return current;
    }

    /**
     * Sets {@code current}
     *
     * @param current the {@code java.lang.String} field
     */
    public void setCurrent(String current) {
        this.current = current;
    }
}
