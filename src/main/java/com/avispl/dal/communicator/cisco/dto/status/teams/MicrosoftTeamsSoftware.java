/*
 * Copyright (c) 2024 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.teams;

import com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions.microsoft.ExtensionVersion;
import com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions.microsoft.ExtensionVersionCode;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 *
 * */
public class MicrosoftTeamsSoftware {
    @JacksonXmlProperty(localName = "Version")
    private ExtensionVersion version;
    @JacksonXmlProperty(localName = "VersionCode")
    private ExtensionVersionCode versionCode;

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
