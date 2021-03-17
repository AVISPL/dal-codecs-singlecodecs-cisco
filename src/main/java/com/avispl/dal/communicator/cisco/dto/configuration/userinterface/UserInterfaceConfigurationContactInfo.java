/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationContactInfo {
    @XmlElement(name = "Type")
    private ValueSpaceRefHolder type;

    public ValueSpaceRefHolder getType() {
        return type;
    }

    public void setType(ValueSpaceRefHolder type) {
        this.type = type;
    }
}
