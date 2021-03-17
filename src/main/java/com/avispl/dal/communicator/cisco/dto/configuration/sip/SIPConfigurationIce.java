/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.sip;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class SIPConfigurationIce {
    @XmlElement(name = "DefaultCandidate")
    private ValueSpaceRefHolder defaultCandidate;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    public ValueSpaceRefHolder getDefaultCandidate() {
        return defaultCandidate;
    }

    public void setDefaultCandidate(ValueSpaceRefHolder defaultCandidate) {
        this.defaultCandidate = defaultCandidate;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
