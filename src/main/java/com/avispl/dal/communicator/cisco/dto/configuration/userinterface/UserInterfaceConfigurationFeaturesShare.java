/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationFeaturesShare {
    @XmlElement(name = "Start")
    private ValueSpaceRefHolder start;

    public ValueSpaceRefHolder getStart() {
        return start;
    }

    public void setStart(ValueSpaceRefHolder start) {
        this.start = start;
    }
}
