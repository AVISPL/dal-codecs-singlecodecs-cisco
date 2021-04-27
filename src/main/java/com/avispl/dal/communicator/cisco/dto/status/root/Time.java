/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device time status class
 * Represents time node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Time {
    @XmlElement(name = "SystemTime")
    private String systemTime;

    /**
     * Retrieves {@code {@link #systemTime}}
     *
     * @return value of {@link #systemTime}
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * Sets {@code systemTime}
     *
     * @param systemTime the {@code java.lang.String} field
     */
    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }
}
