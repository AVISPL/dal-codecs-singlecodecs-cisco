/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Sounds And Alerts class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationSoundsAndAlerts {
    @XmlElement(name = "RingTone")
    private ValueSpaceRefHolder ringTone;
    @XmlElement(name = "RingVolume")
    private ValueSpaceRefHolder ringVolume;

    /**
     * Retrieves {@code {@link #ringTone}}
     *
     * @return value of {@link #ringTone}
     */
    public ValueSpaceRefHolder getRingTone() {
        return ringTone;
    }

    /**
     * Sets {@code ringTone}
     *
     * @param ringTone the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setRingTone(ValueSpaceRefHolder ringTone) {
        this.ringTone = ringTone;
    }

    /**
     * Retrieves {@code {@link #ringVolume}}
     *
     * @return value of {@link #ringVolume}
     */
    public ValueSpaceRefHolder getRingVolume() {
        return ringVolume;
    }

    /**
     * Sets {@code ringVolume}
     *
     * @param ringVolume the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setRingVolume(ValueSpaceRefHolder ringVolume) {
        this.ringVolume = ringVolume;
    }
}
