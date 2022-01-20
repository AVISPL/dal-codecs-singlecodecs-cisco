/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Video Configuration Presentation class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VideoConfigurationPresentation {
    @JacksonXmlProperty(localName="DefaultSource")
    private ValueSpaceRefHolder defaultSource;

    /**
     * Retrieves {@code {@link #defaultSource}}
     *
     * @return value of {@link #defaultSource}
     */
    public ValueSpaceRefHolder getDefaultSource() {
        return defaultSource;
    }

    /**
     * Sets {@code defaultSource}
     *
     * @param defaultSource the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultSource(ValueSpaceRefHolder defaultSource) {
        this.defaultSource = defaultSource;
    }
}
