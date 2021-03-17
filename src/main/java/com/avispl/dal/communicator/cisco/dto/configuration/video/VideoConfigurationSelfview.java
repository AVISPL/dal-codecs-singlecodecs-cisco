/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfigurationSelfview {
    @XmlElement(name = "Default")
    private VideoConfigurationSelfviewDefault selfviewDefault;
    @XmlElement(name = "OnCall")
    private VideoConfigurationSelfviewOnCall onCall;

    public VideoConfigurationSelfviewDefault getSelfviewDefault() {
        return selfviewDefault;
    }

    public void setSelfviewDefault(VideoConfigurationSelfviewDefault selfviewDefault) {
        this.selfviewDefault = selfviewDefault;
    }

    public VideoConfigurationSelfviewOnCall getOnCall() {
        return onCall;
    }

    public void setOnCall(VideoConfigurationSelfviewOnCall onCall) {
        this.onCall = onCall;
    }
}
