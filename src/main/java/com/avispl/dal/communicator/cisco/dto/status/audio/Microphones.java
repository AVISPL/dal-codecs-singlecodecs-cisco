/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device microphones status class.
 * Represents microphones status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Microphones {
    @XmlElement(name = "Mute")
    private String mute;

    /**
     * Retrieves {@code {@link #mute}}
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
