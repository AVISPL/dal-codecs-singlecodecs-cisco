/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device engagement status class
 * Represents engagement node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Engagement {
    @JacksonXmlProperty(localName="CloseProximity")
    private String closeProximity;

    /**
     * Retrieves {@link #closeProximity}
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
