/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationVLAN {
    @XmlElement(name = "Voice")
    private NetworkConfigurationVoice voice;

    public NetworkConfigurationVoice getVoice() {
        return voice;
    }

    public void setVoice(NetworkConfigurationVoice voice) {
        this.voice = voice;
    }
}
