/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device camera position status class.
 * Represents camera position structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CameraPosition {
    @JacksonXmlProperty(localName="Focus")
    private String focus;
    @JacksonXmlProperty(localName="Pan")
    private String pan;
    @JacksonXmlProperty(localName="Tilt")
    private String tilt;
    @JacksonXmlProperty(localName="Zoom")
    private String zoom;

    /**
     * Retrieves {@link #focus}
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
     * Retrieves {@link #pan}
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
     * Retrieves {@link #tilt}
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
     * Retrieves {@link #zoom}
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
