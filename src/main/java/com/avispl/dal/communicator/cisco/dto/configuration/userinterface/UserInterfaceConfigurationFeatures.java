/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfigurationFeatures {
    @XmlElement(name = "HideAll")
    private ValueSpaceRefHolder hideAll;
    @XmlElement(name = "Call")
    private UserInterfaceConfigurationFeaturesCall call;
    @XmlElement(name = "Share")
    private UserInterfaceConfigurationFeaturesShare share;
    @XmlElement(name = "Whiteboard")
    private UserInterfaceConfigurationFeaturesWhiteboard whiteboard;

    public ValueSpaceRefHolder getHideAll() {
        return hideAll;
    }

    public void setHideAll(ValueSpaceRefHolder hideAll) {
        this.hideAll = hideAll;
    }

    public UserInterfaceConfigurationFeaturesCall getCall() {
        return call;
    }

    public void setCall(UserInterfaceConfigurationFeaturesCall call) {
        this.call = call;
    }

    public UserInterfaceConfigurationFeaturesShare getShare() {
        return share;
    }

    public void setShare(UserInterfaceConfigurationFeaturesShare share) {
        this.share = share;
    }

    public UserInterfaceConfigurationFeaturesWhiteboard getWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(UserInterfaceConfigurationFeaturesWhiteboard whiteboard) {
        this.whiteboard = whiteboard;
    }
}
