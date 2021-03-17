/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfiguration {
    @XmlElement(name = "Camera")

    private CamerasConfigurationCamera[] cameras;
    @XmlElement(name = "Preset")
    private CamerasConfigurationPreset preset;

    public CamerasConfigurationCamera[] getCameras() {
        return cameras;
    }

    public void setCameras(CamerasConfigurationCamera[] cameras) {
        this.cameras = cameras;
    }

    public CamerasConfigurationPreset getPreset() {
        return preset;
    }

    public void setPreset(CamerasConfigurationPreset preset) {
        this.preset = preset;
    }
}
