/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkport;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkPortConfiguration {
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
