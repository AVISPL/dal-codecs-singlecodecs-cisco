/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.security;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device security status class
 * Represents security node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Security {
    @JacksonXmlProperty(localName="FIPS")
    private FIPS fips;
    @JacksonXmlProperty(localName="Persistency")
    private Persistency persistency;

    /**
     * Retrieves {@link #fips}
     *
     * @return value of {@link #fips}
     */
    public FIPS getFips() {
        return fips;
    }

    /**
     * Sets {@code fips}
     *
     * @param fips the {@code com.avispl.dal.communicator.cisco.dto.status.security.FIPS} field
     */
    public void setFips(FIPS fips) {
        this.fips = fips;
    }

    /**
     * Retrieves {@link #persistency}
     *
     * @return value of {@link #persistency}
     */
    public Persistency getPersistency() {
        return persistency;
    }

    /**
     * Sets {@code persistency}
     *
     * @param persistency the {@code com.avispl.dal.communicator.cisco.dto.status.security.Persistency} field
     */
    public void setPersistency(Persistency persistency) {
        this.persistency = persistency;
    }
}
