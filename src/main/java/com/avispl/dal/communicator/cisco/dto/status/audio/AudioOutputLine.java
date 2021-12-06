/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Audio output line status class.
 * Represents an audio output line status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class AudioOutputLine {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="DelayMs")
    private String delayMs;

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
     * Retrieves {@code {@link #delayMs}}
     *
     * @return value of {@link #delayMs}
     */
    public String getDelayMs() {
        return delayMs;
    }

    /**
     * Sets {@code delayMs}
     *
     * @param delayMs the {@code java.lang.String} field
     */
    public void setDelayMs(String delayMs) {
        this.delayMs = delayMs;
    }
}
