/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device camera capabilities status class.
 * Represents camera capabilities structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CameraCapabilities {
    @XmlElement(name = "Options")
    private String options;

    /**
     * Retrieves {@code {@link #options}}
     *
     * @return value of {@link #options}
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets {@code options}
     *
     * @param options the {@code java.lang.String} field
     */
    public void setOptions(String options) {
        this.options = options;
    }
}
