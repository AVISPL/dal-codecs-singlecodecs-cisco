/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class PeripheralsConfiguration {
    @XmlElement(name = "Profile")
    private PeripheralsConfigurationProfile profile;

    public PeripheralsConfigurationProfile getProfile() {
        return profile;
    }

    public void setProfile(PeripheralsConfigurationProfile profile) {
        this.profile = profile;
    }
}
