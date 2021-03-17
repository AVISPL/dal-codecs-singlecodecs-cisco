/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfigurationPresentation {
    @XmlElement(name = "DefaultSource")
    private ValueSpaceRefHolder defaultSource;

    public ValueSpaceRefHolder getDefaultSource() {
        return defaultSource;
    }

    public void setDefaultSource(ValueSpaceRefHolder defaultSource) {
        this.defaultSource = defaultSource;
    }
}
