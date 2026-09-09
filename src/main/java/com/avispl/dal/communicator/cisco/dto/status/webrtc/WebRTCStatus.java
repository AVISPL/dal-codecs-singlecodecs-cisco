/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webrtc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides WebRTC Status provider details
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class WebRTCStatus {
    @JsonProperty("Provider")
    private WebRTCProvider provider;

    /**
     * Retrieves {@link #provider}
     *
     * @return value of {@link #provider}
     */
    public WebRTCProvider getProvider() {
        return provider;
    }

    /**
     * Sets {@link #provider} value
     *
     * @param provider new value of {@link #provider}
     */
    public void setProvider(WebRTCProvider provider) {
        this.provider = provider;
    }
}
