/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device conference capabilities status class
 * Represents conference capabilities node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceCapabilities {
    @XmlElement(name = "MaxActiveCalls")
    private String maxActiveCalls;
    @XmlElement(name = "MaxAudioCalls")
    private String maxAudioCalls;
    @XmlElement(name = "MaxCalls")
    private String maxCalls;
    @XmlElement(name = "MaxVideoCalls")
    private String maxVideoCalls;

    /**
     * Retrieves {@code {@link #maxActiveCalls}}
     *
     * @return value of {@link #maxActiveCalls}
     */
    public String getMaxActiveCalls() {
        return maxActiveCalls;
    }

    /**
     * Sets {@code maxActiveCalls}
     *
     * @param maxActiveCalls the {@code java.lang.String} field
     */
    public void setMaxActiveCalls(String maxActiveCalls) {
        this.maxActiveCalls = maxActiveCalls;
    }

    /**
     * Retrieves {@code {@link #maxAudioCalls}}
     *
     * @return value of {@link #maxAudioCalls}
     */
    public String getMaxAudioCalls() {
        return maxAudioCalls;
    }

    /**
     * Sets {@code maxAudioCalls}
     *
     * @param maxAudioCalls the {@code java.lang.String} field
     */
    public void setMaxAudioCalls(String maxAudioCalls) {
        this.maxAudioCalls = maxAudioCalls;
    }

    /**
     * Retrieves {@code {@link #maxCalls}}
     *
     * @return value of {@link #maxCalls}
     */
    public String getMaxCalls() {
        return maxCalls;
    }

    /**
     * Sets {@code maxCalls}
     *
     * @param maxCalls the {@code java.lang.String} field
     */
    public void setMaxCalls(String maxCalls) {
        this.maxCalls = maxCalls;
    }

    /**
     * Retrieves {@code {@link #maxVideoCalls}}
     *
     * @return value of {@link #maxVideoCalls}
     */
    public String getMaxVideoCalls() {
        return maxVideoCalls;
    }

    /**
     * Sets {@code maxVideoCalls}
     *
     * @param maxVideoCalls the {@code java.lang.String} field
     */
    public void setMaxVideoCalls(String maxVideoCalls) {
        this.maxVideoCalls = maxVideoCalls;
    }
}
