/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Audio Configuration Echo Control class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationEchoControl {
    @XmlElement(name = "Dereverberation")
    private ValueSpaceRefHolder dereverberation;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;
    @XmlElement(name = "NoiseReduction")
    private ValueSpaceRefHolder noiseReduction;

    /**
     * Retrieves {@code {@link #dereverberation}}
     *
     * @return value of {@link #dereverberation}
     */
    public ValueSpaceRefHolder getDereverberation() {
        return dereverberation;
    }

    /**
     * Sets {@code dereverberation}
     *
     * @param dereverberation the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDereverberation(ValueSpaceRefHolder dereverberation) {
        this.dereverberation = dereverberation;
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

    /**
     * Retrieves {@code {@link #noiseReduction}}
     *
     * @return value of {@link #noiseReduction}
     */
    public ValueSpaceRefHolder getNoiseReduction() {
        return noiseReduction;
    }

    /**
     * Sets {@code noiseReduction}
     *
     * @param noiseReduction the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setNoiseReduction(ValueSpaceRefHolder noiseReduction) {
        this.noiseReduction = noiseReduction;
    }
}
