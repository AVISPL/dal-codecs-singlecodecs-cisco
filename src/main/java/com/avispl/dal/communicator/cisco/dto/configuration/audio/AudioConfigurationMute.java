/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Mute class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationMute {
    @XmlElement(name = "Enabled")
    private ValueSpaceRefHolder enabled;

    /**
     * Retrieves {@code {@link #enabled}}
     *
     * @return value of {@link #enabled}
     */
    public ValueSpaceRefHolder getEnabled() {
        return enabled;
    }

    /**
     * Sets {@code enabled}
     *
     * @param enabled the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setEnabled(ValueSpaceRefHolder enabled) {
        this.enabled = enabled;
    }
}
