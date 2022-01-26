/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio Configuration Echo Control class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioConfigurationEchoControl {
    @JacksonXmlProperty(localName="Dereverberation")
    private ValueSpaceRefHolder dereverberation;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;
    @JacksonXmlProperty(localName="NoiseReduction")
    private ValueSpaceRefHolder noiseReduction;

    /**
     * Retrieves {@link #dereverberation}
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
     * Retrieves {@link #mode}
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
     * Retrieves {@link #noiseReduction}
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
