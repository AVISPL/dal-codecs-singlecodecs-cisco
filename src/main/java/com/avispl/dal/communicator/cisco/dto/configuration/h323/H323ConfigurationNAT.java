/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device H323 Configuration NAT class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class H323ConfigurationNAT {
    @JacksonXmlProperty(localName="Address")
    private ValueSpaceRefHolder address;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@link #address}
     *
     * @return value of {@link #address}
     */
    public ValueSpaceRefHolder getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setAddress(ValueSpaceRefHolder address) {
        this.address = address;
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
