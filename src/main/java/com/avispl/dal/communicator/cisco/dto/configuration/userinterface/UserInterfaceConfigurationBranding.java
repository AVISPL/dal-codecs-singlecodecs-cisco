/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device User Interface Configuration Branding class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class UserInterfaceConfigurationBranding {
    @JacksonXmlProperty(localName="AwakeBranding")
    private UserInterfaceConfigurationAwakeBranding awakeBranding;

    /**
     * Retrieves {@link #awakeBranding}
     *
     * @return value of {@link #awakeBranding}
     */
    public UserInterfaceConfigurationAwakeBranding getAwakeBranding() {
        return awakeBranding;
    }

    /**
     * Sets {@code awakeBranding}
     *
     * @param awakeBranding the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationAwakeBranding} field
     */
    public void setAwakeBranding(UserInterfaceConfigurationAwakeBranding awakeBranding) {
        this.awakeBranding = awakeBranding;
    }
}
