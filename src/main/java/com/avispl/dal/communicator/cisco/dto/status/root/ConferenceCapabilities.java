/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceCapabilities {
    @XmlElement(name = "MaxActiveCalls")
    private String maxActiveCalls;
    @XmlElement(name = "MaxAudioCalls")
    private String maxAudioCalls;
    @XmlElement(name = "MaxCalls")
    private String maxCalls;
    @XmlElement(name = "MaxVideoCalls")
    private String maxVideoCalls;

    public String getMaxActiveCalls() {
        return maxActiveCalls;
    }

    public void setMaxActiveCalls(String maxActiveCalls) {
        this.maxActiveCalls = maxActiveCalls;
    }

    public String getMaxAudioCalls() {
        return maxAudioCalls;
    }

    public void setMaxAudioCalls(String maxAudioCalls) {
        this.maxAudioCalls = maxAudioCalls;
    }

    public String getMaxCalls() {
        return maxCalls;
    }

    public void setMaxCalls(String maxCalls) {
        this.maxCalls = maxCalls;
    }

    public String getMaxVideoCalls() {
        return maxVideoCalls;
    }

    public void setMaxVideoCalls(String maxVideoCalls) {
        this.maxVideoCalls = maxVideoCalls;
    }
}
