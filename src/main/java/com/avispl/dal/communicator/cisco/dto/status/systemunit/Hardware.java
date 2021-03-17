/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Hardware {
    @XmlElement(name = "Module")
    private HardwareModule module;
    @XmlElement(name = "Monitoring")
    private HardwareMonitoring monitoring;
    @XmlElement(name = "Temperature")
    private String temperature;

    public HardwareModule getModule() {
        return module;
    }

    public void setModule(HardwareModule module) {
        this.module = module;
    }

    public HardwareMonitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(HardwareMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
