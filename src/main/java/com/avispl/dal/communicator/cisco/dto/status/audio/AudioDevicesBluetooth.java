/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Audio Devices Bluetooth status class.
 * Represents bluetooth audio devices status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioDevicesBluetooth {
    @XmlElement(name = "ActiveProfile")
    private String activeProfile;

    /**
     * Retrieves {@code {@link #activeProfile}}
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
