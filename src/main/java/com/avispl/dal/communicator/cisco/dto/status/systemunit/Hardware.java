/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device hardware status class
 * Represents hardware systemunit node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Hardware {
    @XmlElement(name = "Module")
    private HardwareModule module;
    @XmlElement(name = "Monitoring")
    private HardwareMonitoring monitoring;
    @XmlElement(name = "Temperature")
    private String temperature;

    /**
     * Retrieves {@code {@link #module}}
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
     * Retrieves {@code {@link #monitoring}}
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
     * Retrieves {@code {@link #temperature}}
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
