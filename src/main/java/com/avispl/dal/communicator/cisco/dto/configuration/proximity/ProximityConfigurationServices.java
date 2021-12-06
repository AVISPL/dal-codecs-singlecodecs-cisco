/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.proximity;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;



/**
 * Device Proximity Configuration Services class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class ProximityConfigurationServices {
    @JacksonXmlProperty(localName="CallControl")
    private ValueSpaceRefHolder callControl;
    @JacksonXmlProperty(localName="ContentShare")
    private ProximityConfigurationContentShare contentShare;

    /**
     * Retrieves {@code {@link #callControl}}
     *
     * @return value of {@link #callControl}
     */
    public ValueSpaceRefHolder getCallControl() {
        return callControl;
    }

    /**
     * Sets {@code callControl}
     *
     * @param callControl the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setCallControl(ValueSpaceRefHolder callControl) {
        this.callControl = callControl;
    }

    /**
     * Retrieves {@code {@link #contentShare}}
     *
     * @return value of {@link #contentShare}
     */
    public ProximityConfigurationContentShare getContentShare() {
        return contentShare;
    }

    /**
     * Sets {@code contentShare}
     *
     * @param contentShare the {@code com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfigurationContentShare} field
     */
    public void setContentShare(ProximityConfigurationContentShare contentShare) {
        this.contentShare = contentShare;
    }
}
