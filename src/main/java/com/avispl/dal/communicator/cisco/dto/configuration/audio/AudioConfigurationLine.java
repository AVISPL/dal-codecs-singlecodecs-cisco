/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationLine {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "Delay")
    private AudioConfigurationDelay delay;
    @XmlElement(name = "VideoAssociation")
    private AudioConfigurationVideoAssociation videoAssociation;

    public AudioConfigurationDelay getDelay() {
        return delay;
    }

    public void setDelay(AudioConfigurationDelay delay) {
        this.delay = delay;
    }

    public AudioConfigurationVideoAssociation getVideoAssociation() {
        return videoAssociation;
    }

    public void setVideoAssociation(AudioConfigurationVideoAssociation videoAssociation) {
        this.videoAssociation = videoAssociation;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
