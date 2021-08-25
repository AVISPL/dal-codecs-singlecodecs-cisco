/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.systemunit;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device System Unit Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SystemUnitConfiguration {
    @XmlElement(name = "IrSensor")
    private ValueSpaceRefHolder irSensor;
    @XmlElement(name = "Name")
    private ValueSpaceRefHolder name;

    /**
     * Retrieves {@code {@link #irSensor}}
     *
     * @return value of {@link #irSensor}
     */
    public ValueSpaceRefHolder getIrSensor() {
        return irSensor;
    }

    /**
     * Sets {@code irSensor}
     *
     * @param irSensor the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setIrSensor(ValueSpaceRefHolder irSensor) {
        this.irSensor = irSensor;
    }

    /**
     * Retrieves {@code {@link #name}}
     *
     * @return value of {@link #name}
     */
    public ValueSpaceRefHolder getName() {
        return name;
    }

    /**
     * Sets {@code name}
     *
     * @param name the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setName(ValueSpaceRefHolder name) {
        this.name = name;
    }
}
