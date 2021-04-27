/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.time;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Time Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class TimeConfiguration {
    @XmlElement(name = "DateFormat")
    private ValueSpaceRefHolder dateFormat;
    @XmlElement(name = "TimeFormat")
    private ValueSpaceRefHolder timeFormat;
    @XmlElement(name = "Zone")
    private ValueSpaceRefHolder zone;

    /**
     * Retrieves {@code {@link #dateFormat}}
     *
     * @return value of {@link #dateFormat}
     */
    public ValueSpaceRefHolder getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets {@code dateFormat}
     *
     * @param dateFormat the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDateFormat(ValueSpaceRefHolder dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * Retrieves {@code {@link #timeFormat}}
     *
     * @return value of {@link #timeFormat}
     */
    public ValueSpaceRefHolder getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets {@code timeFormat}
     *
     * @param timeFormat the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setTimeFormat(ValueSpaceRefHolder timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * Retrieves {@code {@link #zone}}
     *
     * @return value of {@link #zone}
     */
    public ValueSpaceRefHolder getZone() {
        return zone;
    }

    /**
     * Sets {@code zone}
     *
     * @param zone the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setZone(ValueSpaceRefHolder zone) {
        this.zone = zone;
    }
}
