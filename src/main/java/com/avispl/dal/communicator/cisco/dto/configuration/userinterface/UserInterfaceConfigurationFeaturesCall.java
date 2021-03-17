/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationFeaturesCall {
    @XmlElement(name = "End")
    private ValueSpaceRefHolder end;
    @XmlElement(name = "MidCallControls")
    private ValueSpaceRefHolder midCallControls;
    @XmlElement(name = "Start")
    private ValueSpaceRefHolder start;

    public ValueSpaceRefHolder getEnd() {
        return end;
    }

    public void setEnd(ValueSpaceRefHolder end) {
        this.end = end;
    }

    public ValueSpaceRefHolder getMidCallControls() {
        return midCallControls;
    }

    public void setMidCallControls(ValueSpaceRefHolder midCallControls) {
        this.midCallControls = midCallControls;
    }

    public ValueSpaceRefHolder getStart() {
        return start;
    }

    public void setStart(ValueSpaceRefHolder start) {
        this.start = start;
    }
}
