/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.phonebook;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Phonebook Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PhonebookConfiguration {
    @JacksonXmlProperty(localName="Server")
    @JacksonXmlElementWrapper(useWrapping = false)
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
