/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device room analycits sound status class
 * Represents room analytics sound node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Sound {
    @XmlElement(name = "Level")
    private Level level;

    /**
     * Retrieves {@code {@link #level}}
     *
     * @return value of {@link #level}
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets {@code level}
     *
     * @param level the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.Level} field
     */
    public void setLevel(Level level) {
        this.level = level;
    }
}
