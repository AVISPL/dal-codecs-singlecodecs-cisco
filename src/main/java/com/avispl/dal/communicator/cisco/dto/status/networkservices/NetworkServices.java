/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.networkservices;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device network services status class
 * Represents network services node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NetworkServices {
    @JacksonXmlProperty(localName="NTP")
    private NTP ntp;

    /**
     * Retrieves {@code {@link #ntp}}
     *
     * @return value of {@link #ntp}
     */
    public NTP getNtp() {
        return ntp;
    }

    /**
     * Sets {@code ntp}
     *
     * @param ntp the {@code com.avispl.dal.communicator.cisco.dto.status.networkservices.NTP} field
     */
    public void setNtp(NTP ntp) {
        this.ntp = ntp;
    }
}
