/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.sip;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * Device SIP Configuration Ice class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SIPConfigurationIce {
    @JacksonXmlProperty(localName="DefaultCandidate")
    private ValueSpaceRefHolder defaultCandidate;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@link #defaultCandidate}
     *
     * @return value of {@link #defaultCandidate}
     */
    public ValueSpaceRefHolder getDefaultCandidate() {
        return defaultCandidate;
    }

    /**
     * Sets {@code defaultCandidate}
     *
     * @param defaultCandidate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultCandidate(ValueSpaceRefHolder defaultCandidate) {
        this.defaultCandidate = defaultCandidate;
    }

    /**
     * Retrieves {@link #mode}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
