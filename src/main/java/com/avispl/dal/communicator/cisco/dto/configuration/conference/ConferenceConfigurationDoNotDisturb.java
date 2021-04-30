/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Conference Configuration Do Not Disturb class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceConfigurationDoNotDisturb {
    @XmlElement(name = "DefaultTimeout")
    private ValueSpaceRefHolder defaultTimeout;

    /**
     * Retrieves {@code {@link #defaultTimeout}}
     *
     * @return value of {@link #defaultTimeout}
     */
    public ValueSpaceRefHolder getDefaultTimeout() {
        return defaultTimeout;
    }

    /**
     * Sets {@code defaultTimeout}
     *
     * @param defaultTimeout the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultTimeout(ValueSpaceRefHolder defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
    }
}
