/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device sound level status class
 * Represents sound level node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Level {
    @JacksonXmlProperty(localName="A")
    private String a;

    /**
     * Retrieves {@link #a}
     *
     * @return value of {@link #a}
     */
    public String getA() {
        return a;
    }

    /**
     * Sets {@code a}
     *
     * @param a the {@code java.lang.String} field
     */
    public void setA(String a) {
        this.a = a;
    }
}
