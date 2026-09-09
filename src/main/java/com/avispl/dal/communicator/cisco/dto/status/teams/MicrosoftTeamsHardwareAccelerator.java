/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MicrosoftTeamsHardwareAccelerator {
    @JacksonXmlElementWrapper(localName = "Encoder", useWrapping = false)
    @JacksonXmlProperty(localName = "Encoder")
    private MicrosoftTeamsHardwareAcceleratorEncoder[] encoders;
    @JacksonXmlElementWrapper(localName = "Decoder", useWrapping = false)
    @JacksonXmlProperty(localName = "Decoder")
    private MicrosoftTeamsHardwareAcceleratorDecoder[] decoders;

    /**
     * Retrieves {@link #encoders}
     *
     * @return value of {@link #encoders}
     */
    public MicrosoftTeamsHardwareAcceleratorEncoder[] getEncoders() {
        return encoders;
    }

    /**
     * Sets {@link #encoders} value
     *
     * @param encoders new value of {@link #encoders}
     */
    public void setEncoders(MicrosoftTeamsHardwareAcceleratorEncoder[] encoders) {
        this.encoders = encoders;
    }

    /**
     * Retrieves {@link #decoders}
     *
     * @return value of {@link #decoders}
     */
    public MicrosoftTeamsHardwareAcceleratorDecoder[] getDecoders() {
        return decoders;
    }

    /**
     * Sets {@link #decoders} value
     *
     * @param decoders new value of {@link #decoders}
     */
    public void setDecoders(MicrosoftTeamsHardwareAcceleratorDecoder[] decoders) {
        this.decoders = decoders;
    }
}
