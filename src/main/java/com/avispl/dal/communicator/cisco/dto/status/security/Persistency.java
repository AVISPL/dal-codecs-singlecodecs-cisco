/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.security;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device persistency status class
 * Represents persistency node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Persistency {
    @JacksonXmlProperty(localName="CallHistory")
    private String callHistory;
    @JacksonXmlProperty(localName="Configurations")
    private String configurations;
    @JacksonXmlProperty(localName="DHCP")
    private String dhcp;
    @JacksonXmlProperty(localName="LocalPhonebook")
    private String localPhonebook;

    /**
     * Retrieves {@link #callHistory}
     *
     * @return value of {@link #callHistory}
     */
    public String getCallHistory() {
        return callHistory;
    }

    /**
     * Sets {@code callHistory}
     *
     * @param callHistory the {@code java.lang.String} field
     */
    public void setCallHistory(String callHistory) {
        this.callHistory = callHistory;
    }

    /**
     * Retrieves {@link #configurations}
     *
     * @return value of {@link #configurations}
     */
    public String getConfigurations() {
        return configurations;
    }

    /**
     * Sets {@code configurations}
     *
     * @param configurations the {@code java.lang.String} field
     */
    public void setConfigurations(String configurations) {
        this.configurations = configurations;
    }

    /**
     * Retrieves {@link #dhcp}
     *
     * @return value of {@link #dhcp}
     */
    public String getDhcp() {
        return dhcp;
    }

    /**
     * Sets {@code dhcp}
     *
     * @param dhcp the {@code java.lang.String} field
     */
    public void setDhcp(String dhcp) {
        this.dhcp = dhcp;
    }

    /**
     * Retrieves {@link #localPhonebook}
     *
     * @return value of {@link #localPhonebook}
     */
    public String getLocalPhonebook() {
        return localPhonebook;
    }

    /**
     * Sets {@code localPhonebook}
     *
     * @param localPhonebook the {@code java.lang.String} field
     */
    public void setLocalPhonebook(String localPhonebook) {
        this.localPhonebook = localPhonebook;
    }
}
