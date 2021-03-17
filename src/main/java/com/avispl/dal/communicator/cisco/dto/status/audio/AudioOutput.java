/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioOutput {
    @XmlElement(name = "Connectors")
    private AudioOutputConnectors connectors;

    public AudioOutputConnectors getConnectors() {
        return connectors;
    }

    public void setConnectors(AudioOutputConnectors connectors) {
        this.connectors = connectors;
    }
}
