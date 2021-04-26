/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device User Interface Configuration Branding class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationBranding {
    @XmlElement(name = "AwakeBranding")
    private UserInterfaceConfigurationAwakeBranding awakeBranding;

    /**
     * Retrieves {@code {@link #awakeBranding}}
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
