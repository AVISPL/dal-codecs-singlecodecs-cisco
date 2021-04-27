/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device source resolution status class
 * Represents source resolution node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SourceResolution {
    @XmlElement(name = "Height")
    private String height;
    @XmlElement(name = "RefreshRate")
    private String refreshRate;
    @XmlElement(name = "Width")
    private String width;

    /**
     * Retrieves {@code {@link #height}}
     *
     * @return value of {@link #height}
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets {@code height}
     *
     * @param height the {@code java.lang.String} field
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Retrieves {@code {@link #refreshRate}}
     *
     * @return value of {@link #refreshRate}
     */
    public String getRefreshRate() {
        return refreshRate;
    }

    /**
     * Sets {@code refreshRate}
     *
     * @param refreshRate the {@code java.lang.String} field
     */
    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }

    /**
     * Retrieves {@code {@link #width}}
     *
     * @return value of {@link #width}
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets {@code width}
     *
     * @param width the {@code java.lang.String} field
     */
    public void setWidth(String width) {
        this.width = width;
    }
}
