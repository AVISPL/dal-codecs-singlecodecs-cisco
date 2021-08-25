/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.provisioning;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Provisioning Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class ProvisioningConfiguration {
    @XmlElement(name = "Connectivity")
    private ValueSpaceRefHolder connectivity;
    @XmlElement(name = "ExternalManager")
    private ProvisioningConfigurationExternalManager externalManager;
    @XmlElement(name = "HttpMethod")
    private ValueSpaceRefHolder httpMethod;
    @XmlElement(name = "LoginName")
    private ValueSpaceRefHolder loginName;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@code {@link #connectivity}}
     *
     * @return value of {@link #connectivity}
     */
    public ValueSpaceRefHolder getConnectivity() {
        return connectivity;
    }

    /**
     * Sets {@code connectivity}
     *
     * @param connectivity the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setConnectivity(ValueSpaceRefHolder connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * Retrieves {@code {@link #externalManager}}
     *
     * @return value of {@link #externalManager}
     */
    public ProvisioningConfigurationExternalManager getExternalManager() {
        return externalManager;
    }

    /**
     * Sets {@code externalManager}
     *
     * @param externalManager the {@code com.avispl.dal.communicator.cisco.dto.configuration.provisioning.ProvisioningConfigurationExternalManager} field
     */
    public void setExternalManager(ProvisioningConfigurationExternalManager externalManager) {
        this.externalManager = externalManager;
    }

    /**
     * Retrieves {@code {@link #httpMethod}}
     *
     * @return value of {@link #httpMethod}
     */
    public ValueSpaceRefHolder getHttpMethod() {
        return httpMethod;
    }

    /**
     * Sets {@code httpMethod}
     *
     * @param httpMethod the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setHttpMethod(ValueSpaceRefHolder httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * Retrieves {@code {@link #loginName}}
     *
     * @return value of {@link #loginName}
     */
    public ValueSpaceRefHolder getLoginName() {
        return loginName;
    }

    /**
     * Sets {@code loginName}
     *
     * @param loginName the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setLoginName(ValueSpaceRefHolder loginName) {
        this.loginName = loginName;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
