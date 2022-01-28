/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device system unit software status class
 * Represents system unit software node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Software {
    @JacksonXmlProperty(localName="DisplayName")
    private String displayName;
    @JacksonXmlProperty(localName="Name")
    private String name;
    @JacksonXmlProperty(localName="ReleaseDate")
    private String releaseDate;
    @JacksonXmlProperty(localName="Version")
    private String version;
    @JacksonXmlProperty(localName="OptionKeys")
    private SoftwareOptionKeys optionKeys;

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
     * Retrieves {@link #name}
     *
     * @return value of {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets {@code name}
     *
     * @param name the {@code java.lang.String} field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves {@link #releaseDate}
     *
     * @return value of {@link #releaseDate}
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets {@code releaseDate}
     *
     * @param releaseDate the {@code java.lang.String} field
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Retrieves {@link #version}
     *
     * @return value of {@link #version}
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets {@code version}
     *
     * @param version the {@code java.lang.String} field
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Retrieves {@link #optionKeys}
     *
     * @return value of {@link #optionKeys}
     */
    public SoftwareOptionKeys getOptionKeys() {
        return optionKeys;
    }

    /**
     * Sets {@code optionKeys}
     *
     * @param optionKeys the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.SoftwareOptionKeys} field
     */
    public void setOptionKeys(SoftwareOptionKeys optionKeys) {
        this.optionKeys = optionKeys;
    }
}
