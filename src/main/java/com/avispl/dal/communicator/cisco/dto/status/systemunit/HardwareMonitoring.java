/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device hardware monitoring status class
 * Represents hardware system unit monitoring node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class HardwareMonitoring {
    @JacksonXmlProperty(localName="Fan")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Fan[] fans;

    /**
     * Retrieves {@code {@link #fans}}
     *
     * @return value of {@link #fans}
     */
    public Fan[] getFans() {
        return fans;
    }

    /**
     * Sets {@code fans}
     *
     * @param fans the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.Fan[]} field
     */
    public void setFans(Fan[] fans) {
        this.fans = fans;
    }
}
