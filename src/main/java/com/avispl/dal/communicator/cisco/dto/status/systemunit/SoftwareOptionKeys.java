/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device software option keys status class
 * Represents software option keys node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class SoftwareOptionKeys {
    @JacksonXmlProperty(localName="Encryption")
    private String encryption;
    @JacksonXmlProperty(localName="MultiSite")
    private String multiSite;
    @JacksonXmlProperty(localName="RemoteMonitoring")
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
