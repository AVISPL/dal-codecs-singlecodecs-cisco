/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device media channels status class
 * Represents media channels node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class MediaChannels {
    @XmlElement(name = "Call")
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
