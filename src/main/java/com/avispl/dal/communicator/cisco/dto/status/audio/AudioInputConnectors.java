/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioInputConnectors {
    @XmlElement(name = "Microphone")
    private Microphone[] microphones;

    public Microphone[] getMicrophones() {
        return microphones;
    }

    public void setMicrophones(Microphone[] microphones) {
        this.microphones = microphones;
    }
}
