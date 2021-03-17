/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfigurationCamera {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "Backlight")
    private CamerasConfigurationBacklight backlight;
    @XmlElement(name = "Brightness")
    private CamerasConfigurationBrightness brightness;
    @XmlElement(name = "Focus")
    private CamerasConfigurationFocus focus;
    @XmlElement(name = "Gamma")
    private CamerasConfigurationGamma gamma;
    @XmlElement(name = "Whitebalance")
    private CamerasConfigurationWhitebalance whitebalance;
    @XmlElement(name = "Flip")
    private ValueSpaceRefHolder flip;
    @XmlElement(name = "IrSensor")
    private ValueSpaceRefHolder irSensor;
    @XmlElement(name = "Mirror")
    private ValueSpaceRefHolder mirror;

    public CamerasConfigurationBacklight getBacklight() {
        return backlight;
    }

    public void setBacklight(CamerasConfigurationBacklight backlight) {
        this.backlight = backlight;
    }

    public CamerasConfigurationBrightness getBrightness() {
        return brightness;
    }

    public void setBrightness(CamerasConfigurationBrightness brightness) {
        this.brightness = brightness;
    }

    public CamerasConfigurationFocus getFocus() {
        return focus;
    }

    public void setFocus(CamerasConfigurationFocus focus) {
        this.focus = focus;
    }

    public CamerasConfigurationGamma getGamma() {
        return gamma;
    }

    public void setGamma(CamerasConfigurationGamma gamma) {
        this.gamma = gamma;
    }

    public CamerasConfigurationWhitebalance getWhitebalance() {
        return whitebalance;
    }

    public void setWhitebalance(CamerasConfigurationWhitebalance whitebalance) {
        this.whitebalance = whitebalance;
    }

    public ValueSpaceRefHolder getFlip() {
        return flip;
    }

    public void setFlip(ValueSpaceRefHolder flip) {
        this.flip = flip;
    }

    public ValueSpaceRefHolder getIrSensor() {
        return irSensor;
    }

    public void setIrSensor(ValueSpaceRefHolder irSensor) {
        this.irSensor = irSensor;
    }

    public ValueSpaceRefHolder getMirror() {
        return mirror;
    }

    public void setMirror(ValueSpaceRefHolder mirror) {
        this.mirror = mirror;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
