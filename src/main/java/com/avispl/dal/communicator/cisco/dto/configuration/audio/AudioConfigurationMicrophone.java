/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Microphone class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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
     * Retrieves {@code {@link #echoControl}}
     *
     * @return value of {@link #echoControl}
     */
    public AudioConfigurationEchoControl getEchoControl() {
        return echoControl;
    }

    /**
     * Sets {@code echoControl}
     *
     * @param echoControl the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationEchoControl} field
     */
    public void setEchoControl(AudioConfigurationEchoControl echoControl) {
        this.echoControl = echoControl;
    }

    /**
     * Retrieves {@code {@link #level}}
     *
     * @return value of {@link #level}
     */
    public ValueSpaceRefHolder getLevel() {
        return level;
    }

    /**
     * Sets {@code level}
     *
     * @param level the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setLevel(ValueSpaceRefHolder level) {
        this.level = level;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
