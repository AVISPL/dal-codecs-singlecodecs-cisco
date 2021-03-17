/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.roomanalytics;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class RoomAnalyticsConfiguration {
    @XmlElement(name = "PeoplePresenceDetector")
    private ValueSpaceRefHolder peoplePresenceDetector;

    public ValueSpaceRefHolder getPeoplePresenceDetector() {
        return peoplePresenceDetector;
    }

    public void setPeoplePresenceDetector(ValueSpaceRefHolder peoplePresenceDetector) {
        this.peoplePresenceDetector = peoplePresenceDetector;
    }
}
