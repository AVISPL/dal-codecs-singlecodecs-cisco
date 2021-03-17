/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.audio;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class AudioConfigurationMute {
    @XmlElement(name = "Enabled")
    private ValueSpaceRefHolder enabled;

    public ValueSpaceRefHolder getEnabled() {
        return enabled;
    }

    public void setEnabled(ValueSpaceRefHolder enabled) {
        this.enabled = enabled;
    }
}
