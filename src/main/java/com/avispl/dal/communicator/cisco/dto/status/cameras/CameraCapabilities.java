/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device camera capabilities status class.
 * Represents camera capabilities structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CameraCapabilities {
    @JacksonXmlProperty(localName="Options")
    private String options;

    /**
     * Retrieves {@code {@link #options}}
     *
     * @return value of {@link #options}
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets {@code options}
     *
     * @param options the {@code java.lang.String} field
     */
    public void setOptions(String options) {
        this.options = options;
    }
}
