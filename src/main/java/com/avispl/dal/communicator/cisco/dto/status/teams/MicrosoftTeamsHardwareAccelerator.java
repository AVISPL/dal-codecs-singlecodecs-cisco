/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class MicrosoftTeamsHardwareAccelerator {
    @JacksonXmlProperty(localName = "Encoder")
    private List<MicrosoftTeamsHardwareAcceleratorEncoder> encoders;
    @JacksonXmlProperty(localName = "Decoder")
    private List<MicrosoftTeamsHardwareAcceleratorDecoder> decoders;

    /**
     * Retrieves {@link #encoders}
     *
     * @return value of {@link #encoders}
     */
    public List<MicrosoftTeamsHardwareAcceleratorEncoder> getEncoders() {
        return encoders;
    }

    /**
     * Sets {@link #encoders} value
     *
     * @param encoders new value of {@link #encoders}
     */
    public void setEncoders(List<MicrosoftTeamsHardwareAcceleratorEncoder> encoders) {
        this.encoders = encoders;
    }

    /**
     * Retrieves {@link #decoders}
     *
     * @return value of {@link #decoders}
     */
    public List<MicrosoftTeamsHardwareAcceleratorDecoder> getDecoders() {
        return decoders;
    }

    /**
     * Sets {@link #decoders} value
     *
     * @param decoders new value of {@link #decoders}
     */
    public void setDecoders(List<MicrosoftTeamsHardwareAcceleratorDecoder> decoders) {
        this.decoders = decoders;
    }
}
