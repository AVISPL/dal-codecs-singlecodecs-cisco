/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device call forward SIP status class
 * Represents call forward SIP node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CallForward {
    @XmlElement(name = "DisplayName")
    private String displayName;
    @XmlElement(name = "Mode")
    private String mode;
    @XmlElement(name = "URI")
    private String uri;

    /**
     * Retrieves {@code {@link #displayName}}
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
     * Retrieves {@code {@link #mode}}
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
     * Retrieves {@code {@link #uri}}
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
