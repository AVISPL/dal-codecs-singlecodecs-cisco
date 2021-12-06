/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device source resolution status class
 * Represents source resolution node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class SourceResolution {
    @JacksonXmlProperty(localName="Height")
    private String height;
    @JacksonXmlProperty(localName="RefreshRate")
    private String refreshRate;
    @JacksonXmlProperty(localName="Width")
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
