/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device User Interface Configuration Accessibility class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationAccessibility {
    @XmlElement(name = "IncomingCallNotification")
    private ValueSpaceRefHolder incomingCallNotification;

    /**
     * Retrieves {@code {@link #incomingCallNotification}}
     *
     * @return value of {@link #incomingCallNotification}
     */
    public ValueSpaceRefHolder getIncomingCallNotification() {
        return incomingCallNotification;
    }

    /**
     * Sets {@code incomingCallNotification}
     *
     * @param incomingCallNotification the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setIncomingCallNotification(ValueSpaceRefHolder incomingCallNotification) {
        this.incomingCallNotification = incomingCallNotification;
    }
}
