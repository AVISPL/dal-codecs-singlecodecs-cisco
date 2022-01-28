/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration VLAN class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NetworkConfigurationVLAN {
    @JacksonXmlProperty(localName="Voice")
    private NetworkConfigurationVoice voice;

    /**
     * Retrieves {@link #voice}
     *
     * @return value of {@link #voice}
     */
    public NetworkConfigurationVoice getVoice() {
        return voice;
    }

    /**
     * Sets {@code voice}
     *
     * @param voice the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationVoice} field
     */
    public void setVoice(NetworkConfigurationVoice voice) {
        this.voice = voice;
    }
}
