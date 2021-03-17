/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationMicrophone {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "EchoControl")
    private AudioConfigurationEchoControl echoControl;
    @XmlElement(name = "Level")
    private ValueSpaceRefHolder level;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    public AudioConfigurationEchoControl getEchoControl() {
        return echoControl;
    }

    public void setEchoControl(AudioConfigurationEchoControl echoControl) {
        this.echoControl = echoControl;
    }

    public ValueSpaceRefHolder getLevel() {
        return level;
    }

    public void setLevel(ValueSpaceRefHolder level) {
        this.level = level;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
