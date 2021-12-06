/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Cameras Configuration Preset class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CamerasConfigurationPreset {
    @JacksonXmlProperty(localName="TriggerAutofocus")
    private ValueSpaceRefHolder triggerAutofocus;

    /**
     * Retrieves {@code {@link #triggerAutofocus}}
     *
     * @return value of {@link #triggerAutofocus}
     */
    public ValueSpaceRefHolder getTriggerAutofocus() {
        return triggerAutofocus;
    }

    /**
     * Sets {@code triggerAutofocus}
     *
     * @param triggerAutofocus the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setTriggerAutofocus(ValueSpaceRefHolder triggerAutofocus) {
        this.triggerAutofocus = triggerAutofocus;
    }
}
