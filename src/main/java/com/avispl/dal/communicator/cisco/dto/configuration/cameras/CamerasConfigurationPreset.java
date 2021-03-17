/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.cameras;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class CamerasConfigurationPreset {
    @XmlElement(name = "TriggerAutofocus")
    private ValueSpaceRefHolder triggerAutofocus;

    public ValueSpaceRefHolder getTriggerAutofocus() {
        return triggerAutofocus;
    }

    public void setTriggerAutofocus(ValueSpaceRefHolder triggerAutofocus) {
        this.triggerAutofocus = triggerAutofocus;
    }
}
