/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class ProximityConfigurationServices {
    @XmlElement(name = "CallControl")
    private ValueSpaceRefHolder callControl;
    @XmlElement(name = "ContentShare")
    private ProximityConfigurationContentShare contentShare;

    public ValueSpaceRefHolder getCallControl() {
        return callControl;
    }

    public void setCallControl(ValueSpaceRefHolder callControl) {
        this.callControl = callControl;
    }

    public ProximityConfigurationContentShare getContentShare() {
        return contentShare;
    }

    public void setContentShare(ProximityConfigurationContentShare contentShare) {
        this.contentShare = contentShare;
    }
}
