/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device video output device status class
 * Represents video output device node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoOutputDevice {
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "PreferredFormat")
    private String preferredFormat;

    /**
     * Retrieves {@code {@link #name}}
     *
     * @return value of {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets {@code name}
     *
     * @param name the {@code java.lang.String} field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves {@code {@link #preferredFormat}}
     *
     * @return value of {@link #preferredFormat}
     */
    public String getPreferredFormat() {
        return preferredFormat;
    }

    /**
     * Sets {@code preferredFormat}
     *
     * @param preferredFormat the {@code java.lang.String} field
     */
    public void setPreferredFormat(String preferredFormat) {
        this.preferredFormat = preferredFormat;
    }
}
