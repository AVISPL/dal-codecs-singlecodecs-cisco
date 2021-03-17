/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationBranding {
    @XmlElement(name = "AwakeBranding")
    private UserInterfaceConfigurationAwakeBranding awakeBranding;

    public UserInterfaceConfigurationAwakeBranding getAwakeBranding() {
        return awakeBranding;
    }

    public void setAwakeBranding(UserInterfaceConfigurationAwakeBranding awakeBranding) {
        this.awakeBranding = awakeBranding;
    }
}
