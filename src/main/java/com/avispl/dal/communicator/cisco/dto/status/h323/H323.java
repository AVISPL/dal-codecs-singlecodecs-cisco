/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.h323;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device h323 status class
 * Represents H323 node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class H323 {
    @XmlElement(name = "Gatekeeper")
    private H323Gatekeeper gatekeeper;
    @XmlElement(name = "Mode")
    private H323Mode mode;

    /**
     * Retrieves {@code {@link #gatekeeper}}
     *
     * @return value of {@link #gatekeeper}
     */
    public H323Gatekeeper getGatekeeper() {
        return gatekeeper;
    }

    /**
     * Sets {@code gatekeeper}
     *
     * @param gatekeeper the {@code com.avispl.dal.communicator.cisco.dto.status.h323.H323Gatekeeper} field
     */
    public void setGatekeeper(H323Gatekeeper gatekeeper) {
        this.gatekeeper = gatekeeper;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public H323Mode getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.status.h323.H323Mode} field
     */
    public void setMode(H323Mode mode) {
        this.mode = mode;
    }
}
