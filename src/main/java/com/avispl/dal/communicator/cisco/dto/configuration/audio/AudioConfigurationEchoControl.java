/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationEchoControl {
    @XmlElement(name = "Dereverberation")
    private ValueSpaceRefHolder dereverberation;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "NoiseReduction")
    private ValueSpaceRefHolder noiseReduction;

    public ValueSpaceRefHolder getDereverberation() {
        return dereverberation;
    }

    public void setDereverberation(ValueSpaceRefHolder dereverberation) {
        this.dereverberation = dereverberation;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public ValueSpaceRefHolder getNoiseReduction() {
        return noiseReduction;
    }

    public void setNoiseReduction(ValueSpaceRefHolder noiseReduction) {
        this.noiseReduction = noiseReduction;
    }
}
