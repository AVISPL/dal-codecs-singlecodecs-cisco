/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device engagement status class
 * Represents engagement node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Engagement {
    @XmlElement(name = "CloseProximity")
    private String closeProximity;

    /**
     * Retrieves {@code {@link #closeProximity}}
     *
     * @return value of {@link #closeProximity}
     */
    public String getCloseProximity() {
        return closeProximity;
    }

    /**
     * Sets {@code closeProximity}
     *
     * @param closeProximity the {@code java.lang.String} field
     */
    public void setCloseProximity(String closeProximity) {
        this.closeProximity = closeProximity;
    }
}
