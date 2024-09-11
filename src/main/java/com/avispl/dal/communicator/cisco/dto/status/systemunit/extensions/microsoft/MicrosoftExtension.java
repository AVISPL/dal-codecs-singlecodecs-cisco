/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions.microsoft;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Provides MS Extensions details of the device
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class MicrosoftExtension {
    @JacksonXmlProperty(localName = "InCall")
    private String inCall;
    @JacksonXmlProperty(localName = "Supported")
    private String supported;
    @JacksonXmlProperty(localName = "Version")
    private ExtensionVersion version;
    @JacksonXmlProperty(localName = "VersionCode")
    private ExtensionVersionCode versionCode;

    /**
     * Retrieves {@link #inCall}
     *
     * @return value of {@link #inCall}
     */
    public String getInCall() {
        return inCall;
    }

    /**
     * Sets {@link #inCall} value
     *
     * @param inCall new value of {@link #inCall}
     */
    public void setInCall(String inCall) {
        this.inCall = inCall;
    }

    /**
     * Retrieves {@link #supported}
     *
     * @return value of {@link #supported}
     */
    public String getSupported() {
        return supported;
    }

    /**
     * Sets {@link #supported} value
     *
     * @param supported new value of {@link #supported}
     */
    public void setSupported(String supported) {
        this.supported = supported;
    }

    /**
     * Retrieves {@link #version}
     *
     * @return value of {@link #version}
     */
    public ExtensionVersion getVersion() {
        return version;
    }

    /**
     * Sets {@link #version} value
     *
     * @param version new value of {@link #version}
     */
    public void setVersion(ExtensionVersion version) {
        this.version = version;
    }

    /**
     * Retrieves {@link #versionCode}
     *
     * @return value of {@link #versionCode}
     */
    public ExtensionVersionCode getVersionCode() {
        return versionCode;
    }

    /**
     * Sets {@link #versionCode} value
     *
     * @param versionCode new value of {@link #versionCode}
     */
    public void setVersionCode(ExtensionVersionCode versionCode) {
        this.versionCode = versionCode;
    }
}
