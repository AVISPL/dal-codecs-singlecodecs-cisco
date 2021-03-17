/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Engagement {
    @XmlElement(name = "CloseProximity")
    private String closeProximity;

    public String getCloseProximity() {
        return closeProximity;
    }

    public void setCloseProximity(String closeProximity) {
        this.closeProximity = closeProximity;
    }
}
