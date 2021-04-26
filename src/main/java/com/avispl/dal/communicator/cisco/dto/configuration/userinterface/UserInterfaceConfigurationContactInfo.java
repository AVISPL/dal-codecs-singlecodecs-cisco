/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device User Interface Configuration Contact Info class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationContactInfo {
    @XmlElement(name = "Type")
    private ValueSpaceRefHolder type;

    /**
     * Retrieves {@code {@link #type}}
     *
     * @return value of {@link #type}
     */
    public ValueSpaceRefHolder getType() {
        return type;
    }

    /**
     * Sets {@code type}
     *
     * @param type the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setType(ValueSpaceRefHolder type) {
        this.type = type;
    }
}
