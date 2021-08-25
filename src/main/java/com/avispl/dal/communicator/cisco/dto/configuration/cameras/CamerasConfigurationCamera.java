/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Cameras Configuration Camera class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #backlight}}
     *
     * @return value of {@link #backlight}
     */
    public CamerasConfigurationBacklight getBacklight() {
        return backlight;
    }

    /**
     * Sets {@code backlight}
     *
     * @param backlight the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationBacklight} field
     */
    public void setBacklight(CamerasConfigurationBacklight backlight) {
        this.backlight = backlight;
    }

    /**
     * Retrieves {@code {@link #brightness}}
     *
     * @return value of {@link #brightness}
     */
    public CamerasConfigurationBrightness getBrightness() {
        return brightness;
    }

    /**
     * Sets {@code brightness}
     *
     * @param brightness the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationBrightness} field
     */
    public void setBrightness(CamerasConfigurationBrightness brightness) {
        this.brightness = brightness;
    }

    /**
     * Retrieves {@code {@link #focus}}
     *
     * @return value of {@link #focus}
     */
    public CamerasConfigurationFocus getFocus() {
        return focus;
    }

    /**
     * Sets {@code focus}
     *
     * @param focus the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationFocus} field
     */
    public void setFocus(CamerasConfigurationFocus focus) {
        this.focus = focus;
    }

    /**
     * Retrieves {@code {@link #gamma}}
     *
     * @return value of {@link #gamma}
     */
    public CamerasConfigurationGamma getGamma() {
        return gamma;
    }

    /**
     * Sets {@code gamma}
     *
     * @param gamma the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationGamma} field
     */
    public void setGamma(CamerasConfigurationGamma gamma) {
        this.gamma = gamma;
    }

    /**
     * Retrieves {@code {@link #whitebalance}}
     *
     * @return value of {@link #whitebalance}
     */
    public CamerasConfigurationWhitebalance getWhitebalance() {
        return whitebalance;
    }

    /**
     * Sets {@code whitebalance}
     *
     * @param whitebalance the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfigurationWhitebalance} field
     */
    public void setWhitebalance(CamerasConfigurationWhitebalance whitebalance) {
        this.whitebalance = whitebalance;
    }

    /**
     * Retrieves {@code {@link #flip}}
     *
     * @return value of {@link #flip}
     */
    public ValueSpaceRefHolder getFlip() {
        return flip;
    }

    /**
     * Sets {@code flip}
     *
     * @param flip the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setFlip(ValueSpaceRefHolder flip) {
        this.flip = flip;
    }

    /**
     * Retrieves {@code {@link #irSensor}}
     *
     * @return value of {@link #irSensor}
     */
    public ValueSpaceRefHolder getIrSensor() {
        return irSensor;
    }

    /**
     * Sets {@code irSensor}
     *
     * @param irSensor the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setIrSensor(ValueSpaceRefHolder irSensor) {
        this.irSensor = irSensor;
    }

    /**
     * Retrieves {@code {@link #mirror}}
     *
     * @return value of {@link #mirror}
     */
    public ValueSpaceRefHolder getMirror() {
        return mirror;
    }

    /**
     * Sets {@code mirror}
     *
     * @param mirror the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMirror(ValueSpaceRefHolder mirror) {
        this.mirror = mirror;
    }
}
