/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class ActiveSpeaker {
    @XmlElement(name = "PIPPosition")
    private String pipPosition;

    public String getPipPosition() {
        return pipPosition;
    }

    public void setPipPosition(String pipPosition) {
        this.pipPosition = pipPosition;
    }
}
