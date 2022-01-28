/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


/**
 * Device User Interface Configuration Accessibility class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class UserInterfaceConfigurationAccessibility {
    @JacksonXmlProperty(localName="IncomingCallNotification")
    private ValueSpaceRefHolder incomingCallNotification;

    /**
     * Retrieves {@link #incomingCallNotification}
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
