/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Channel {
    @XmlElement(name = "Audio")
    private Audio audio;
    @XmlElement(name = "Video")
    private Video video;
    @XmlElement(name = "Netstat")
    private Netstat netstat;
    @XmlElement(name = "Direction")
    private String direction;
    @XmlElement(name = "Encryption")
    private String encryption;
    @XmlElement(name = "Type")
    private String type;

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Netstat getNetstat() {
        return netstat;
    }

    public void setNetstat(Netstat netstat) {
        this.netstat = netstat;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
