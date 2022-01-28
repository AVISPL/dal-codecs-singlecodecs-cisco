/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Devices Bluetooth status class.
 * Represents bluetooth audio devices status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioDevicesBluetooth {
    @JacksonXmlProperty(localName="ActiveProfile")
    private String activeProfile;

    /**
     * Retrieves {@link #activeProfile}
     *
     * @return value of {@link #activeProfile}
     */
    public String getActiveProfile() {
        return activeProfile;
    }

    /**
     * Sets {@code activeProfile}
     *
     * @param activeProfile the {@code java.lang.String} field
     */
    public void setActiveProfile(String activeProfile) {
        this.activeProfile = activeProfile;
    }
}
