/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MicrosoftTeamsHardwareAcceleratorEncoder extends MicrosoftTeamsHardwareAcceleratorMetrics {
    @JacksonXmlProperty(localName = "InputMode")
    private String inputMode;

    /**
     * Retrieves {@link #inputMode}
     *
     * @return value of {@link #inputMode}
     */
    public String getInputMode() {
        return inputMode;
    }

    /**
     * Sets {@link #inputMode} value
     *
     * @param inputMode new value of {@link #inputMode}
     */
    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }
}
