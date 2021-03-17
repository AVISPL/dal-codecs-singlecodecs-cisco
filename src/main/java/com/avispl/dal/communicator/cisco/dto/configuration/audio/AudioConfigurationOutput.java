/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationOutput {
    @XmlElement(name = "Line")

    private AudioConfigurationLine[] lines;

    public AudioConfigurationLine[] getLines() {
        return lines;
    }

    public void setLines(AudioConfigurationLine[] lines) {
        this.lines = lines;
    }
}
