/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device hardware status class
 * Represents hardware systemunit node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Hardware {
    @JacksonXmlProperty(localName="Module")
    private HardwareModule module;
    @JacksonXmlProperty(localName="Monitoring")
    private HardwareMonitoring monitoring;
    @JacksonXmlProperty(localName="Temperature")
    private String temperature;

    /**
     * Retrieves {@link #module}
     *
     * @return value of {@link #module}
     */
    public HardwareModule getModule() {
        return module;
    }

    /**
     * Sets {@code module}
     *
     * @param module the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.HardwareModule} field
     */
    public void setModule(HardwareModule module) {
        this.module = module;
    }

    /**
     * Retrieves {@link #monitoring}
     *
     * @return value of {@link #monitoring}
     */
    public HardwareMonitoring getMonitoring() {
        return monitoring;
    }

    /**
     * Sets {@code monitoring}
     *
     * @param monitoring the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.HardwareMonitoring} field
     */
    public void setMonitoring(HardwareMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * Retrieves {@link #temperature}
     *
     * @return value of {@link #temperature}
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Sets {@code temperature}
     *
     * @param temperature the {@code java.lang.String} field
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
