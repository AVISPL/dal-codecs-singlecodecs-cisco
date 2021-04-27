/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device camera position status class.
 * Represents camera position structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CameraPosition {
    @XmlElement(name = "Focus")
    private String focus;
    @XmlElement(name = "Pan")
    private String pan;
    @XmlElement(name = "Tilt")
    private String tilt;
    @XmlElement(name = "Zoom")
    private String zoom;

    /**
     * Retrieves {@code {@link #focus}}
     *
     * @return value of {@link #focus}
     */
    public String getFocus() {
        return focus;
    }

    /**
     * Sets {@code focus}
     *
     * @param focus the {@code java.lang.String} field
     */
    public void setFocus(String focus) {
        this.focus = focus;
    }

    /**
     * Retrieves {@code {@link #pan}}
     *
     * @return value of {@link #pan}
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets {@code pan}
     *
     * @param pan the {@code java.lang.String} field
     */
    public void setPan(String pan) {
        this.pan = pan;
    }

    /**
     * Retrieves {@code {@link #tilt}}
     *
     * @return value of {@link #tilt}
     */
    public String getTilt() {
        return tilt;
    }

    /**
     * Sets {@code tilt}
     *
     * @param tilt the {@code java.lang.String} field
     */
    public void setTilt(String tilt) {
        this.tilt = tilt;
    }

    /**
     * Retrieves {@code {@link #zoom}}
     *
     * @return value of {@link #zoom}
     */
    public String getZoom() {
        return zoom;
    }

    /**
     * Sets {@code zoom}
     *
     * @param zoom the {@code java.lang.String} field
     */
    public void setZoom(String zoom) {
        this.zoom = zoom;
    }
}
