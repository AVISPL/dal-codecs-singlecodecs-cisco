/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device software option keys status class
 * Represents software option keys node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SoftwareOptionKeys {
    @XmlElement(name = "Encryption")
    private String encryption;
    @XmlElement(name = "MultiSite")
    private String multiSite;
    @XmlElement(name = "RemoteMonitoring")
    private String remoteMonitoring;

    /**
     * Retrieves {@code {@link #encryption}}
     *
     * @return value of {@link #encryption}
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * Sets {@code encryption}
     *
     * @param encryption the {@code java.lang.String} field
     */
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    /**
     * Retrieves {@code {@link #multiSite}}
     *
     * @return value of {@link #multiSite}
     */
    public String getMultiSite() {
        return multiSite;
    }

    /**
     * Sets {@code multiSite}
     *
     * @param multiSite the {@code java.lang.String} field
     */
    public void setMultiSite(String multiSite) {
        this.multiSite = multiSite;
    }

    /**
     * Retrieves {@code {@link #remoteMonitoring}}
     *
     * @return value of {@link #remoteMonitoring}
     */
    public String getRemoteMonitoring() {
        return remoteMonitoring;
    }

    /**
     * Sets {@code remoteMonitoring}
     *
     * @param remoteMonitoring the {@code java.lang.String} field
     */
    public void setRemoteMonitoring(String remoteMonitoring) {
        this.remoteMonitoring = remoteMonitoring;
    }
}
