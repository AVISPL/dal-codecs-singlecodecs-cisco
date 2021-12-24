/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;



/**
 * Device Proximity Configuration Content Share class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProximityConfigurationContentShare {
    @JacksonXmlProperty(localName="FromClients")
    private ValueSpaceRefHolder fromClients;
    @JacksonXmlProperty(localName="ToClients")
    private ValueSpaceRefHolder toClients;

    /**
     * Retrieves {@code {@link #fromClients}}
     *
     * @return value of {@link #fromClients}
     */
    public ValueSpaceRefHolder getFromClients() {
        return fromClients;
    }

    /**
     * Sets {@code fromClients}
     *
     * @param fromClients the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setFromClients(ValueSpaceRefHolder fromClients) {
        this.fromClients = fromClients;
    }

    /**
     * Retrieves {@code {@link #toClients}}
     *
     * @return value of {@link #toClients}
     */
    public ValueSpaceRefHolder getToClients() {
        return toClients;
    }

    /**
     * Sets {@code toClients}
     *
     * @param toClients the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setToClients(ValueSpaceRefHolder toClients) {
        this.toClients = toClients;
    }
}
