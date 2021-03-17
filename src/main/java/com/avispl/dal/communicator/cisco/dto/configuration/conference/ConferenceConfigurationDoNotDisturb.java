/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceConfigurationDoNotDisturb {
    @XmlElement(name = "DefaultTimeout")
    private ValueSpaceRefHolder defaultTimeout;

    public ValueSpaceRefHolder getDefaultTimeout() {
        return defaultTimeout;
    }

    public void setDefaultTimeout(ValueSpaceRefHolder defaultTimeout) {
        this.defaultTimeout = defaultTimeout;
    }
}
