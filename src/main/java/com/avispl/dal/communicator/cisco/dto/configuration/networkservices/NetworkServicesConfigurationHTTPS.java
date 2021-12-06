/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.networkservices;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Network Services Configuration HTTPS class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class NetworkServicesConfigurationHTTPS {
    @JacksonXmlProperty(localName="Server")
    private NetworkConfigurationServer server;
    @JacksonXmlProperty(localName="StrictTransportSecurity")
    private ValueSpaceRefHolder strictTransportSecurity;
    @JacksonXmlProperty(localName="VerifyClientCertificate")
    private ValueSpaceRefHolder verifyClientCertificate;
    @JacksonXmlProperty(localName="VerifyServerCertificate")
    private ValueSpaceRefHolder verifyServerCertificate;

    /**
     * Retrieves {@code {@link #server}}
     *
     * @return value of {@link #server}
     */
    public NetworkConfigurationServer getServer() {
        return server;
    }

    /**
     * Sets {@code server}
     *
     * @param server the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer} field
     */
    public void setServer(NetworkConfigurationServer server) {
        this.server = server;
    }

    /**
     * Retrieves {@code {@link #strictTransportSecurity}}
     *
     * @return value of {@link #strictTransportSecurity}
     */
    public ValueSpaceRefHolder getStrictTransportSecurity() {
        return strictTransportSecurity;
    }

    /**
     * Sets {@code strictTransportSecurity}
     *
     * @param strictTransportSecurity the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setStrictTransportSecurity(ValueSpaceRefHolder strictTransportSecurity) {
        this.strictTransportSecurity = strictTransportSecurity;
    }

    /**
     * Retrieves {@code {@link #verifyClientCertificate}}
     *
     * @return value of {@link #verifyClientCertificate}
     */
    public ValueSpaceRefHolder getVerifyClientCertificate() {
        return verifyClientCertificate;
    }

    /**
     * Sets {@code verifyClientCertificate}
     *
     * @param verifyClientCertificate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setVerifyClientCertificate(ValueSpaceRefHolder verifyClientCertificate) {
        this.verifyClientCertificate = verifyClientCertificate;
    }

    /**
     * Retrieves {@code {@link #verifyServerCertificate}}
     *
     * @return value of {@link #verifyServerCertificate}
     */
    public ValueSpaceRefHolder getVerifyServerCertificate() {
        return verifyServerCertificate;
    }

    /**
     * Sets {@code verifyServerCertificate}
     *
     * @param verifyServerCertificate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setVerifyServerCertificate(ValueSpaceRefHolder verifyServerCertificate) {
        this.verifyServerCertificate = verifyServerCertificate;
    }
}
