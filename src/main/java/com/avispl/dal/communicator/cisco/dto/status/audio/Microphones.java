/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device microphones status class.
 * Represents microphones status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Microphones {
    @JacksonXmlProperty(localName="Mute")
    private String mute;

    /**
     * Retrieves {@link #mute}
     *
     * @return value of {@link #mute}
     */
    public String getMute() {
        return mute;
    }

    /**
     * Sets {@code mute}
     *
     * @param mute the {@code java.lang.String} field
     */
    public void setMute(String mute) {
        this.mute = mute;
    }
}
