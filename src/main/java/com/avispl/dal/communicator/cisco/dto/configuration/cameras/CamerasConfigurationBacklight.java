/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfigurationBacklight {
    @XmlElement(name = "DefaultMode")
    private ValueSpaceRefHolder defaultMode;

    public ValueSpaceRefHolder getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(ValueSpaceRefHolder defaultMode) {
        this.defaultMode = defaultMode;
    }
}
