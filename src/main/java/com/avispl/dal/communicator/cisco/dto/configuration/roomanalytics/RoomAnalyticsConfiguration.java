/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.roomanalytics;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Room Analytics Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RoomAnalyticsConfiguration {
    @JacksonXmlProperty(localName="PeoplePresenceDetector")
    private ValueSpaceRefHolder peoplePresenceDetector;

    /**
     * Retrieves {@code {@link #peoplePresenceDetector}}
     *
     * @return value of {@link #peoplePresenceDetector}
     */
    public ValueSpaceRefHolder getPeoplePresenceDetector() {
        return peoplePresenceDetector;
    }

    /**
     * Sets {@code peoplePresenceDetector}
     *
     * @param peoplePresenceDetector the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setPeoplePresenceDetector(ValueSpaceRefHolder peoplePresenceDetector) {
        this.peoplePresenceDetector = peoplePresenceDetector;
    }
}
