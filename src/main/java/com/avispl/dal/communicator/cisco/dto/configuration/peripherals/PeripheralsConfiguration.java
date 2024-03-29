/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Peripherals Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PeripheralsConfiguration {
    @JacksonXmlProperty(localName="Profile")
    private PeripheralsConfigurationProfile profile;

    /** @since 1.1.0 */
    @JacksonXmlProperty(localName="Pairing")
    private PeripheralsPairing pairing;
    /**
     * Retrieves {@link #profile}
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

    /**
     * Retrieves {@link #pairing}
     *
     * @return value of {@link #pairing}
     * @since 1.1.0
     */
    public PeripheralsPairing getPairing() {
        return pairing;
    }

    /**
     * Sets {@code pairing}
     *
     * @param pairing the {@code com.avispl.dal.communicator.cisco.dto.configuration.peripherals.PeripheralsPairing} field
     * @since 1.1.0
     */
    public void setPairing(PeripheralsPairing pairing) {
        this.pairing = pairing;
    }
}
