/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Network Configuration Server class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationServer {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "MinimumTLSVersion")
    private ValueSpaceRefHolder minimumTLSVersion;
    @XmlElement(name = "Address")
    private ValueSpaceRefHolder address;

    /**
     * Retrieves {@code {@link #item}}
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
     * Retrieves {@code {@link #minimumTLSVersion}}
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
     * Retrieves {@code {@link #address}}
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
