/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceConfigurationAutoAnswer {
    @XmlElement(name = "Delay")
    private ValueSpaceRefHolder delay;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "Mute")
    private ValueSpaceRefHolder mute;

    public ValueSpaceRefHolder getDelay() {
        return delay;
    }

    public void setDelay(ValueSpaceRefHolder delay) {
        this.delay = delay;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public ValueSpaceRefHolder getMute() {
        return mute;
    }

    public void setMute(ValueSpaceRefHolder mute) {
        this.mute = mute;
    }
}
