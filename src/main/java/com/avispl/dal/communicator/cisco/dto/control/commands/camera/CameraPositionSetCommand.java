/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.camera;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
public class CameraPositionSetCommand {
    @XmlAttribute
    private String command = "True";
    @XmlElement(name = "CameraId")
    private ValueSpaceRefHolder[] cameraId;
    @XmlElement(name = "Pan")
    private ValueSpaceRefHolder[] pan;
    @XmlElement(name = "Tilt")
    private ValueSpaceRefHolder[] tilt;
    @XmlElement(name = "Zoom")
    private ValueSpaceRefHolder[] zoom;
    @XmlElement(name = "Focus")
    private ValueSpaceRefHolder[] focus;

    public String getCommand() {
        return command;
    }

    public ValueSpaceRefHolder[] getCameraId() {
        return cameraId;
    }

    public void setCameraId(ValueSpaceRefHolder[] cameraId) {
        this.cameraId = cameraId;
    }

    public ValueSpaceRefHolder[] getPan() {
        return pan;
    }

    public void setPan(ValueSpaceRefHolder[] pan) {
        this.pan = pan;
    }

    public ValueSpaceRefHolder[] getTilt() {
        return tilt;
    }

    public void setTilt(ValueSpaceRefHolder[] tilt) {
        this.tilt = tilt;
    }

    public ValueSpaceRefHolder[] getZoom() {
        return zoom;
    }

    public void setZoom(ValueSpaceRefHolder[] zoom) {
        this.zoom = zoom;
    }

    public ValueSpaceRefHolder[] getFocus() {
        return focus;
    }

    public void setFocus(ValueSpaceRefHolder[] focus) {
        this.focus = focus;
    }
}
