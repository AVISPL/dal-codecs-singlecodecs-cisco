/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.systemunit;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device System Unit Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SystemUnitConfiguration {
    @JacksonXmlProperty(localName="IrSensor")
    private ValueSpaceRefHolder irSensor;
    @JacksonXmlProperty(localName="Name")
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
