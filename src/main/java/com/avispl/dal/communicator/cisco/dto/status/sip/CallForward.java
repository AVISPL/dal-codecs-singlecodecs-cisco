/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device call forward SIP status class
 * Represents call forward SIP node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CallForward {
    @JacksonXmlProperty(localName="DisplayName")
    private String displayName;
    @JacksonXmlProperty(localName="Mode")
    private String mode;
    @JacksonXmlProperty(localName="URI")
    private String uri;

    /**
     * Retrieves {@link #displayName}
     *
     * @return value of {@link #displayName}
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets {@code displayName}
     *
     * @param displayName the {@code java.lang.String} field
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Retrieves {@link #mode}
     *
     * @return value of {@link #mode}
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code java.lang.String} field
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Retrieves {@link #uri}
     *
     * @return value of {@link #uri}
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets {@code uri}
     *
     * @param uri the {@code java.lang.String} field
     */
    public void setUri(String uri) {
        this.uri = uri;
    }
}
