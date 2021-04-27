/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device User Interface Configuration Features - Whiteboard class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationFeaturesWhiteboard {
    @XmlElement(name = "Start")
    private ValueSpaceRefHolder start;

    /**
     * Retrieves {@code {@link #start}}
     *
     * @return value of {@link #start}
     */
    public ValueSpaceRefHolder getStart() {
        return start;
    }

    /**
     * Sets {@code start}
     *
     * @param start the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setStart(ValueSpaceRefHolder start) {
        this.start = start;
    }
}
