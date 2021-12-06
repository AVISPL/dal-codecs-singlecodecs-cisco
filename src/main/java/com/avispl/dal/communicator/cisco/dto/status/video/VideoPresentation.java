/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video presentation status class
 * Represents video presentation node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoPresentation {
    @JacksonXmlProperty(localName="PIPPosition")
    private String pipPosition;

    /**
     * Retrieves {@code {@link #pipPosition}}
     *
     * @return value of {@link #pipPosition}
     */
    public String getPipPosition() {
        return pipPosition;
    }

    /**
     * Sets {@code pipPosition}
     *
     * @param pipPosition the {@code java.lang.String} field
     */
    public void setPipPosition(String pipPosition) {
        this.pipPosition = pipPosition;
    }
}
