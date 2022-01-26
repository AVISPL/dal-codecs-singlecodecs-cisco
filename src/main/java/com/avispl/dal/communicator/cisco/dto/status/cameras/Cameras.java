/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device cameras status class.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Cameras {
    @JacksonXmlProperty(localName="Camera")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Camera[] cameras;

    /**
     * Retrieves {@link #cameras}
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
