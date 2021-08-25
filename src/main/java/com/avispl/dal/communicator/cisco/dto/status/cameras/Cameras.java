/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device cameras status class.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Cameras {
    @XmlElement(name = "Camera")
    private Camera[] cameras;

    /**
     * Retrieves {@code {@link #cameras}}
     *
     * @return value of {@link #cameras}
     */
    public Camera[] getCameras() {
        return cameras;
    }

    /**
     * Sets {@code cameras}
     *
     * @param cameras the {@code com.avispl.dal.communicator.cisco.dto.status.cameras.Camera[]} field
     */
    public void setCameras(Camera[] cameras) {
        this.cameras = cameras;
    }
}
