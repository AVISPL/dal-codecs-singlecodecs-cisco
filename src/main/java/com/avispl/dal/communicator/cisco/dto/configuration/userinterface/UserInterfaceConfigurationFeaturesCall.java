/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;



/**
 * Device User Interface Configuration Features - Call class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInterfaceConfigurationFeaturesCall {
    @JacksonXmlProperty(localName="End")
    private ValueSpaceRefHolder end;
    @JacksonXmlProperty(localName="MidCallControls")
    private ValueSpaceRefHolder midCallControls;
    @JacksonXmlProperty(localName="Start")
    private ValueSpaceRefHolder start;

    /**
     * Retrieves {@code {@link #end}}
     *
     * @return value of {@link #end}
     */
    public ValueSpaceRefHolder getEnd() {
        return end;
    }

    /**
     * Sets {@code end}
     *
     * @param end the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setEnd(ValueSpaceRefHolder end) {
        this.end = end;
    }

    /**
     * Retrieves {@code {@link #midCallControls}}
     *
     * @return value of {@link #midCallControls}
     */
    public ValueSpaceRefHolder getMidCallControls() {
        return midCallControls;
    }

    /**
     * Sets {@code midCallControls}
     *
     * @param midCallControls the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMidCallControls(ValueSpaceRefHolder midCallControls) {
        this.midCallControls = midCallControls;
    }

    /**
     * Retrieves {@code {@link #start}}
     *
     * @return value of {@link #start}
     */
    public ValueSpaceRefHolder getStart() {
        return start;
    }

    /**
     * Sets {@code start}
     *
     * @param start the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setStart(ValueSpaceRefHolder start) {
        this.start = start;
    }
}
