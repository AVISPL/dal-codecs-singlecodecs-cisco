/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationAwakeBranding {
    @XmlElement(name = "Colors")
    private ValueSpaceRefHolder colors;

    public ValueSpaceRefHolder getColors() {
        return colors;
    }

    public void setColors(ValueSpaceRefHolder colors) {
        this.colors = colors;
    }
}
