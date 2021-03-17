/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Cameras {
    @XmlElement(name = "Camera")
    private Camera[] cameras;

    public Camera[] getCameras() {
        return cameras;
    }

    public void setCameras(Camera[] cameras) {
        this.cameras = cameras;
    }
}
