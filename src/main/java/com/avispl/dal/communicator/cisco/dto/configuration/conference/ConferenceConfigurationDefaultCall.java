/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Conference Configuration Default Call class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ConferenceConfigurationDefaultCall {
    @JacksonXmlProperty(localName="Protocol")
    private ValueSpaceRefHolder protocol;
    @JacksonXmlProperty(localName="Rate")
    private ValueSpaceRefHolder rate;

    /**
     * Retrieves {@code {@link #protocol}}
     *
     * @return value of {@link #protocol}
     */
    public ValueSpaceRefHolder getProtocol() {
        return protocol;
    }

    /**
     * Sets {@code protocol}
     *
     * @param protocol the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setProtocol(ValueSpaceRefHolder protocol) {
        this.protocol = protocol;
    }

    /**
     * Retrieves {@code {@link #rate}}
     *
     * @return value of {@link #rate}
     */
    public ValueSpaceRefHolder getRate() {
        return rate;
    }

    /**
     * Sets {@code rate}
     *
     * @param rate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setRate(ValueSpaceRefHolder rate) {
        this.rate = rate;
    }
}
