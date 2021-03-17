/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioOutputConnectors {
    @XmlElement(name = "Line")
    private AudioOutputLine[] lines;

    public AudioOutputLine[] getLines() {
        return lines;
    }

    public void setLines(AudioOutputLine[] lines) {
        this.lines = lines;
    }
}
