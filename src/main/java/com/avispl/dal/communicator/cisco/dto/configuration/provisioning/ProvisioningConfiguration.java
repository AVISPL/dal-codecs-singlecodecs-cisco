/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.provisioning;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

    public ValueSpaceRefHolder getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(ValueSpaceRefHolder connectivity) {
        this.connectivity = connectivity;
    }

    public ProvisioningConfigurationExternalManager getExternalManager() {
        return externalManager;
    }

    public void setExternalManager(ProvisioningConfigurationExternalManager externalManager) {
        this.externalManager = externalManager;
    }

    public ValueSpaceRefHolder getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(ValueSpaceRefHolder httpMethod) {
        this.httpMethod = httpMethod;
    }

    public ValueSpaceRefHolder getLoginName() {
        return loginName;
    }

    public void setLoginName(ValueSpaceRefHolder loginName) {
        this.loginName = loginName;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
