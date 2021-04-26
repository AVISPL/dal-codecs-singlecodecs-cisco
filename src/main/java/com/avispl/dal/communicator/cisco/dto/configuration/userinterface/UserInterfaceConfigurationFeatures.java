/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device User Interface Configuration Features class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #hideAll}}
     *
     * @return value of {@link #hideAll}
     */
    public ValueSpaceRefHolder getHideAll() {
        return hideAll;
    }

    /**
     * Sets {@code hideAll}
     *
     * @param hideAll the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setHideAll(ValueSpaceRefHolder hideAll) {
        this.hideAll = hideAll;
    }

    /**
     * Retrieves {@code {@link #call}}
     *
     * @return value of {@link #call}
     */
    public UserInterfaceConfigurationFeaturesCall getCall() {
        return call;
    }

    /**
     * Sets {@code call}
     *
     * @param call the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationFeaturesCall} field
     */
    public void setCall(UserInterfaceConfigurationFeaturesCall call) {
        this.call = call;
    }

    /**
     * Retrieves {@code {@link #share}}
     *
     * @return value of {@link #share}
     */
    public UserInterfaceConfigurationFeaturesShare getShare() {
        return share;
    }

    /**
     * Sets {@code share}
     *
     * @param share the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationFeaturesShare} field
     */
    public void setShare(UserInterfaceConfigurationFeaturesShare share) {
        this.share = share;
    }

    /**
     * Retrieves {@code {@link #whiteboard}}
     *
     * @return value of {@link #whiteboard}
     */
    public UserInterfaceConfigurationFeaturesWhiteboard getWhiteboard() {
        return whiteboard;
    }

    /**
     * Sets {@code whiteboard}
     *
     * @param whiteboard the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationFeaturesWhiteboard} field
     */
    public void setWhiteboard(UserInterfaceConfigurationFeaturesWhiteboard whiteboard) {
        this.whiteboard = whiteboard;
    }
}
