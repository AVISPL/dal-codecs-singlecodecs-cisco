/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.phonebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Phonebook Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class PhonebookConfiguration {
    @XmlElement(name = "Server")
    private PhonebookConfigurationServer[] servers;

    /**
     * Retrieves {@code {@link #servers}}
     *
     * @return value of {@link #servers}
     */
    public PhonebookConfigurationServer[] getServers() {
        return servers;
    }

    /**
     * Sets {@code servers}
     *
     * @param servers the {@code com.avispl.dal.communicator.cisco.dto.configuration.phonebook.PhonebookConfigurationServer[]} field
     */
    public void setServers(PhonebookConfigurationServer[] servers) {
        this.servers = servers;
    }
}
