/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.security;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device persistency status class
 * Represents persistency node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Persistency {
    @XmlElement(name = "CallHistory")
    private String callHistory;
    @XmlElement(name = "Configurations")
    private String configurations;
    @XmlElement(name = "DHCP")
    private String dhcp;
    @XmlElement(name = "LocalPhonebook")
    private String localPhonebook;

    /**
     * Retrieves {@code {@link #callHistory}}
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
     * Retrieves {@code {@link #configurations}}
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
     * Retrieves {@code {@link #dhcp}}
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
     * Retrieves {@code {@link #localPhonebook}}
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
