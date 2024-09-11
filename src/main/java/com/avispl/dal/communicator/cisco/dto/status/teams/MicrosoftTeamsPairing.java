/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MicrosoftTeamsPairing {
    @JacksonXmlProperty(localName = "Active")
    private String active;

    /**
     * Retrieves {@link #active}
     *
     * @return value of {@link #active}
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets {@link #active} value
     *
     * @param active new value of {@link #active}
     */
    public void setActive(String active) {
        this.active = active;
    }
}
