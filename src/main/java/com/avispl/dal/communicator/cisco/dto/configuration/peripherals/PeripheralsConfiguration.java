/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Peripherals Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class PeripheralsConfiguration {
    @XmlElement(name = "Profile")
    private PeripheralsConfigurationProfile profile;

    /**
     * Retrieves {@code {@link #profile}}
     *
     * @return value of {@link #profile}
     */
    public PeripheralsConfigurationProfile getProfile() {
        return profile;
    }

    /**
     * Sets {@code profile}
     *
     * @param profile the {@code com.avispl.dal.communicator.cisco.dto.configuration.peripherals.PeripheralsConfigurationProfile} field
     */
    public void setProfile(PeripheralsConfigurationProfile profile) {
        this.profile = profile;
    }
}
