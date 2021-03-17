/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.networkservices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkServices {
    @XmlElement(name = "NTP")
    private NTP ntp;

    public NTP getNtp() {
        return ntp;
    }

    public void setNtp(NTP ntp) {
        this.ntp = ntp;
    }
}
