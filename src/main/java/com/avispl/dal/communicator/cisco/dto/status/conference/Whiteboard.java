/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.conference;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Whiteboard {
    @XmlElement(name = "Mode")
    private String mode;
    @XmlElement(name = "ReleaseFloorAvailability")
    private String releaseFloorAvailability;
    @XmlElement(name = "RequestFloorAvailability")
    private String requestFloorAvailability;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getReleaseFloorAvailability() {
        return releaseFloorAvailability;
    }

    public void setReleaseFloorAvailability(String releaseFloorAvailability) {
        this.releaseFloorAvailability = releaseFloorAvailability;
    }

    public String getRequestFloorAvailability() {
        return requestFloorAvailability;
    }

    public void setRequestFloorAvailability(String requestFloorAvailability) {
        this.requestFloorAvailability = requestFloorAvailability;
    }
}
