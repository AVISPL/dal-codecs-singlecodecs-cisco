/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Configuration Server class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetworkConfigurationServer {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="MinimumTLSVersion")
    private ValueSpaceRefHolder minimumTLSVersion;
    @JacksonXmlProperty(localName="Address")
    private ValueSpaceRefHolder address;

    /**
     * Retrieves {@link #item}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@link #minimumTLSVersion}
     *
     * @return value of {@link #minimumTLSVersion}
     */
    public ValueSpaceRefHolder getMinimumTLSVersion() {
        return minimumTLSVersion;
    }

    /**
     * Sets {@code minimumTLSVersion}
     *
     * @param minimumTLSVersion the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMinimumTLSVersion(ValueSpaceRefHolder minimumTLSVersion) {
        this.minimumTLSVersion = minimumTLSVersion;
    }

    /**
     * Retrieves {@link #address}
     *
     * @return value of {@link #address}
     */
    public ValueSpaceRefHolder getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setAddress(ValueSpaceRefHolder address) {
        this.address = address;
    }
}
