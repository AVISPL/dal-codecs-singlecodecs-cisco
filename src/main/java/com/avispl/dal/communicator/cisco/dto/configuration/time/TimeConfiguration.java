/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.time;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class TimeConfiguration {
    @XmlElement(name = "DateFormat")
    private ValueSpaceRefHolder dateFormat;
    @XmlElement(name = "TimeFormat")
    private ValueSpaceRefHolder timeFormat;
    @XmlElement(name = "Zone")
    private ValueSpaceRefHolder zone;

    public ValueSpaceRefHolder getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(ValueSpaceRefHolder dateFormat) {
        this.dateFormat = dateFormat;
    }

    public ValueSpaceRefHolder getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(ValueSpaceRefHolder timeFormat) {
        this.timeFormat = timeFormat;
    }

    public ValueSpaceRefHolder getZone() {
        return zone;
    }

    public void setZone(ValueSpaceRefHolder zone) {
        this.zone = zone;
    }
}
