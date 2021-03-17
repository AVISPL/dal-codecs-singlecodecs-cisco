/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.systemunit;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class SystemUnitConfiguration {
    @XmlElement(name = "IrSensor")
    private ValueSpaceRefHolder irSensor;
    @XmlElement(name = "Name")
    private ValueSpaceRefHolder name;

    public ValueSpaceRefHolder getIrSensor() {
        return irSensor;
    }

    public void setIrSensor(ValueSpaceRefHolder irSensor) {
        this.irSensor = irSensor;
    }

    public ValueSpaceRefHolder getName() {
        return name;
    }

    public void setName(ValueSpaceRefHolder name) {
        this.name = name;
    }
}
