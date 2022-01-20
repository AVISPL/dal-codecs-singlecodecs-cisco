/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device ambient noise status class
 * Represents ambient noise node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AmbientNoise {
    @JacksonXmlProperty(localName="Level")
    private Level level;

    /**
     * Retrieves {@code {@link #level}}
     *
     * @return value of {@link #level}
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets {@code level}
     *
     * @param level the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.Level} field
     */
    public void setLevel(Level level) {
        this.level = level;
    }
}
