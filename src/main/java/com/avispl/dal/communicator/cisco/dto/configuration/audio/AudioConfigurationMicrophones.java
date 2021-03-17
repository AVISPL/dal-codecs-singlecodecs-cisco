/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationMicrophones {
    @XmlElement(name = "Mute")
    private AudioConfigurationMute mute;

    public AudioConfigurationMute getMute() {
        return mute;
    }

    public void setMute(AudioConfigurationMute mute) {
        this.mute = mute;
    }
}
