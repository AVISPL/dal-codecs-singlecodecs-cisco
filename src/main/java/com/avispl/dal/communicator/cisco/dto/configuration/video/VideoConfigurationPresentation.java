/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Video Configuration Presentation class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfigurationPresentation {
    @XmlElement(name = "DefaultSource")
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
