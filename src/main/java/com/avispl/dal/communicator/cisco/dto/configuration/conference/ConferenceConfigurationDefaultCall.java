/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceConfigurationDefaultCall {
    @XmlElement(name = "Protocol")
    private ValueSpaceRefHolder protocol;
    @XmlElement(name = "Rate")
    private ValueSpaceRefHolder rate;

    public ValueSpaceRefHolder getProtocol() {
        return protocol;
    }

    public void setProtocol(ValueSpaceRefHolder protocol) {
        this.protocol = protocol;
    }

    public ValueSpaceRefHolder getRate() {
        return rate;
    }

    public void setRate(ValueSpaceRefHolder rate) {
        this.rate = rate;
    }
}
