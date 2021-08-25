/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.security;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device security status class
 * Represents security node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Security {
    @XmlElement(name = "FIPS")
    private FIPS fips;
    @XmlElement(name = "Persistency")
    private Persistency persistency;

    /**
     * Retrieves {@code {@link #fips}}
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
     * Retrieves {@code {@link #persistency}}
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
