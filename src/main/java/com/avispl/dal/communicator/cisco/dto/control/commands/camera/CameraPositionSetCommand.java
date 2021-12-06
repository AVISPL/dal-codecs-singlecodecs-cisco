/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.camera;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/***
 * Position set camera command template containing all the possible camera command options
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CameraPositionSetCommand {
    @JacksonXmlProperty(isAttribute = true)
    private String command = "True";
    @JacksonXmlProperty(localName="CameraId")
    @JacksonXmlElementWrapper(useWrapping = false)
    private ValueSpaceRefHolder[] cameraId;
    @JacksonXmlProperty(localName="Pan")
    @JacksonXmlElementWrapper(useWrapping = false)
    private ValueSpaceRefHolder[] pan;
    @JacksonXmlProperty(localName="Tilt")
    @JacksonXmlElementWrapper(useWrapping = false)
    private ValueSpaceRefHolder[] tilt;
    @JacksonXmlProperty(localName="Zoom")
    @JacksonXmlElementWrapper(useWrapping = false)
    private ValueSpaceRefHolder[] zoom;
    @JacksonXmlProperty(localName="Focus")
    @JacksonXmlElementWrapper(useWrapping = false)
    private ValueSpaceRefHolder[] focus;

    /**
     * Retrieves {@code {@link #command}}
     *
     * @return value of {@link #command}
     */
    public String getCommand() {
        return command;
    }

    /**
     * Retrieves {@code {@link #cameraId}}
     *
     * @return value of {@link #cameraId}
     */
    public ValueSpaceRefHolder[] getCameraId() {
        return cameraId;
    }

    /**
     * Sets {@code cameraId}
     *
     * @param cameraId the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder[]} field
     */
    public void setCameraId(ValueSpaceRefHolder[] cameraId) {
        this.cameraId = cameraId;
    }

    /**
     * Retrieves {@code {@link #pan}}
     *
     * @return value of {@link #pan}
     */
    public ValueSpaceRefHolder[] getPan() {
        return pan;
    }

    /**
     * Sets {@code pan}
     *
     * @param pan the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder[]} field
     */
    public void setPan(ValueSpaceRefHolder[] pan) {
        this.pan = pan;
    }

    /**
     * Retrieves {@code {@link #tilt}}
     *
     * @return value of {@link #tilt}
     */
    public ValueSpaceRefHolder[] getTilt() {
        return tilt;
    }

    /**
     * Sets {@code tilt}
     *
     * @param tilt the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder[]} field
     */
    public void setTilt(ValueSpaceRefHolder[] tilt) {
        this.tilt = tilt;
    }

    /**
     * Retrieves {@code {@link #zoom}}
     *
     * @return value of {@link #zoom}
     */
    public ValueSpaceRefHolder[] getZoom() {
        return zoom;
    }

    /**
     * Sets {@code zoom}
     *
     * @param zoom the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder[]} field
     */
    public void setZoom(ValueSpaceRefHolder[] zoom) {
        this.zoom = zoom;
    }

    /**
     * Retrieves {@code {@link #focus}}
     *
     * @return value of {@link #focus}
     */
    public ValueSpaceRefHolder[] getFocus() {
        return focus;
    }

    /**
     * Sets {@code focus}
     *
     * @param focus the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder[]} field
     */
    public void setFocus(ValueSpaceRefHolder[] focus) {
        this.focus = focus;
    }
}
