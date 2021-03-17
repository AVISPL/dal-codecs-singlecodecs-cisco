/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationSoundsAndAlerts {
    @XmlElement(name = "RingTone")
    private ValueSpaceRefHolder ringTone;
    @XmlElement(name = "RingVolume")
    private ValueSpaceRefHolder ringVolume;

    public ValueSpaceRefHolder getRingTone() {
        return ringTone;
    }

    public void setRingTone(ValueSpaceRefHolder ringTone) {
        this.ringTone = ringTone;
    }

    public ValueSpaceRefHolder getRingVolume() {
        return ringVolume;
    }

    public void setRingVolume(ValueSpaceRefHolder ringVolume) {
        this.ringVolume = ringVolume;
    }
}
