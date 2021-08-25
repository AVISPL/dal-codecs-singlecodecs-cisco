/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device people count status class
 * Represents people count node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class PeopleCount {
    @XmlElement(name = "Current")
    private String current;

    /**
     * Retrieves {@code {@link #current}}
     *
     * @return value of {@link #current}
     */
    public String getCurrent() {
        return current;
    }

    /**
     * Sets {@code current}
     *
     * @param current the {@code java.lang.String} field
     */
    public void setCurrent(String current) {
        this.current = current;
    }
}
