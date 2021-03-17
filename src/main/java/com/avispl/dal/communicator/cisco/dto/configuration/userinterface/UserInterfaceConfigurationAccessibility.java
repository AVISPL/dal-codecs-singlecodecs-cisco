/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationAccessibility {
    @XmlElement(name = "IncomingCallNotification")
    private ValueSpaceRefHolder incomingCallNotification;

    public ValueSpaceRefHolder getIncomingCallNotification() {
        return incomingCallNotification;
    }

    public void setIncomingCallNotification(ValueSpaceRefHolder incomingCallNotification) {
        this.incomingCallNotification = incomingCallNotification;
    }
}
