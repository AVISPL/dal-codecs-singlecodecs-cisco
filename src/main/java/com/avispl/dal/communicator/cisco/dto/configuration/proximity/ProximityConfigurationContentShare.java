/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Proximity Configuration Content Share class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ProximityConfigurationContentShare {
    @XmlElement(name = "FromClients")
    private ValueSpaceRefHolder fromClients;
    @XmlElement(name = "ToClients")
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
