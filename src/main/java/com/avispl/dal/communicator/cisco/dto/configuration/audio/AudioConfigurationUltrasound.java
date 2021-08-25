/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Ultrasound class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationUltrasound {
    @XmlElement(name = "MaxVolume")
    private ValueSpaceRefHolder maxVolume;

    /**
     * Retrieves {@code {@link #maxVolume}}
     *
     * @return value of {@link #maxVolume}
     */
    public ValueSpaceRefHolder getMaxVolume() {
        return maxVolume;
    }

    /**
     * Sets {@code maxVolume}
     *
     * @param maxVolume the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMaxVolume(ValueSpaceRefHolder maxVolume) {
        this.maxVolume = maxVolume;
    }
}
