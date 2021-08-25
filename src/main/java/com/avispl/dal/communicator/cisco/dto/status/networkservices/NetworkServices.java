/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.networkservices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device network services status class
 * Represents network services node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkServices {
    @XmlElement(name = "NTP")
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
