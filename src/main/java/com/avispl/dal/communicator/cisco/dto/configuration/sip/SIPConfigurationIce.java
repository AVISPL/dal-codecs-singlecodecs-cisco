/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.sip;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device SIP Configuration Ice class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SIPConfigurationIce {
    @XmlElement(name = "DefaultCandidate")
    private ValueSpaceRefHolder defaultCandidate;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@code {@link #defaultCandidate}}
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
     * Retrieves {@code {@link #mode}}
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
