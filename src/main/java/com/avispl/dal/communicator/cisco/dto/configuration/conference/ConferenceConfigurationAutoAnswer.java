/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Conference Configuration Auto Answer class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ConferenceConfigurationAutoAnswer {
    @JacksonXmlProperty(localName="Delay")
    private ValueSpaceRefHolder delay;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;
    @JacksonXmlProperty(localName="Mute")
    private ValueSpaceRefHolder mute;

    /**
     * Retrieves {@code {@link #delay}}
     *
     * @return value of {@link #delay}
     */
    public ValueSpaceRefHolder getDelay() {
        return delay;
    }

    /**
     * Sets {@code delay}
     *
     * @param delay the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDelay(ValueSpaceRefHolder delay) {
        this.delay = delay;
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
     * Retrieves {@code {@link #mute}}
     *
     * @return value of {@link #mute}
     */
    public ValueSpaceRefHolder getMute() {
        return mute;
    }

    /**
     * Sets {@code mute}
     *
     * @param mute the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMute(ValueSpaceRefHolder mute) {
        this.mute = mute;
    }
}
