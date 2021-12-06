/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device media channels status class
 * Represents media channels node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class MediaChannels {
    @JacksonXmlProperty(localName="Call")
    @JacksonXmlElementWrapper(useWrapping = false)
    private MediaStatsCall[] calls;

    /**
     * Retrieves {@code {@link #calls}}
     *
     * @return value of {@link #calls}
     */
    public MediaStatsCall[] getCalls() {
        return calls;
    }

    /**
     * Sets {@code calls}
     *
     * @param calls the {@code com.avispl.dal.communicator.cisco.dto.status.media.MediaStatsCall[]} field
     */
    public void setCalls(MediaStatsCall[] calls) {
        this.calls = calls;
    }
}
