/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public abstract class MicrosoftTeamsHardwareAcceleratorMetrics {
    @JacksonXmlProperty(localName = "Fps")
    private String fps;
    @JacksonXmlProperty(localName = "FrameCount")
    private String frameCount;
    @JacksonXmlProperty(localName = "Height")
    private String height;
    @JacksonXmlProperty(localName = "SamplePeriodUs")
    private String samplePeriodUs;
    @JacksonXmlProperty(localName = "Width")
    private String width;

    /**
     * Retrieves {@link #fps}
     *
     * @return value of {@link #fps}
     */
    public String getFps() {
        return fps;
    }

    /**
     * Sets {@link #fps} value
     *
     * @param fps new value of {@link #fps}
     */
    public void setFps(String fps) {
        this.fps = fps;
    }

    /**
     * Retrieves {@link #frameCount}
     *
     * @return value of {@link #frameCount}
     */
    public String getFrameCount() {
        return frameCount;
    }

    /**
     * Sets {@link #frameCount} value
     *
     * @param frameCount new value of {@link #frameCount}
     */
    public void setFrameCount(String frameCount) {
        this.frameCount = frameCount;
    }

    /**
     * Retrieves {@link #height}
     *
     * @return value of {@link #height}
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets {@link #height} value
     *
     * @param height new value of {@link #height}
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Retrieves {@link #samplePeriodUs}
     *
     * @return value of {@link #samplePeriodUs}
     */
    public String getSamplePeriodUs() {
        return samplePeriodUs;
    }

    /**
     * Sets {@link #samplePeriodUs} value
     *
     * @param samplePeriodUs new value of {@link #samplePeriodUs}
     */
    public void setSamplePeriodUs(String samplePeriodUs) {
        this.samplePeriodUs = samplePeriodUs;
    }

    /**
     * Retrieves {@link #width}
     *
     * @return value of {@link #width}
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets {@link #width} value
     *
     * @param width new value of {@link #width}
     */
    public void setWidth(String width) {
        this.width = width;
    }
}
