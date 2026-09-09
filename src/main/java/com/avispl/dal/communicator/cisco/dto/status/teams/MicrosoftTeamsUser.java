/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 *
 * */
public class MicrosoftTeamsUser {
    @JacksonXmlProperty(localName = "SignedIn")
    private String signedIn;

    /**
     * Retrieves {@link #signedIn}
     *
     * @return value of {@link #signedIn}
     */
    public String getSignedIn() {
        return signedIn;
    }

    /**
     * Sets {@link #signedIn} value
     *
     * @param signedIn new value of {@link #signedIn}
     */
    public void setSignedIn(String signedIn) {
        this.signedIn = signedIn;
    }
}
