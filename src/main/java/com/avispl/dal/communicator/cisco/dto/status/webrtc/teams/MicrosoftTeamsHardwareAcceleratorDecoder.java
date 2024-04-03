/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webrtc.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MicrosoftTeamsHardwareAcceleratorDecoder extends MicrosoftTeamsHardwareAcceleratorMetrics{
    @JacksonXmlProperty(localName = "CroppedHeight")
    private String croppedHeight;
    @JacksonXmlProperty(localName = "CroppedWidth")
    private String croppedWidth;
    @JacksonXmlProperty(localName = "OutputMode")
    private String outputMode;

    /**
     * Retrieves {@link #croppedHeight}
     *
     * @return value of {@link #croppedHeight}
     */
    public String getCroppedHeight() {
        return croppedHeight;
    }

    /**
     * Sets {@link #croppedHeight} value
     *
     * @param croppedHeight new value of {@link #croppedHeight}
     */
    public void setCroppedHeight(String croppedHeight) {
        this.croppedHeight = croppedHeight;
    }

    /**
     * Retrieves {@link #croppedWidth}
     *
     * @return value of {@link #croppedWidth}
     */
    public String getCroppedWidth() {
        return croppedWidth;
    }

    /**
     * Sets {@link #croppedWidth} value
     *
     * @param croppedWidth new value of {@link #croppedWidth}
     */
    public void setCroppedWidth(String croppedWidth) {
        this.croppedWidth = croppedWidth;
    }

    /**
     * Retrieves {@link #outputMode}
     *
     * @return value of {@link #outputMode}
     */
    public String getOutputMode() {
        return outputMode;
    }

    /**
     * Sets {@link #outputMode} value
     *
     * @param outputMode new value of {@link #outputMode}
     */
    public void setOutputMode(String outputMode) {
        this.outputMode = outputMode;
    }
}
