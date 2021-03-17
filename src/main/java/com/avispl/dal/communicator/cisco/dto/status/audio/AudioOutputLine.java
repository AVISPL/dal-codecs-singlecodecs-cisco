/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioOutputLine {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "DelayMs")
    private String delayMs;

    public String getDelayMs() {
        return delayMs;
    }

    public void setDelayMs(String delayMs) {
        this.delayMs = delayMs;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
