/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.roomanalytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device sound level status class
 * Represents sound level node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Level {
    @XmlElement(name = "A")
    private String a;

    /**
     * Retrieves {@code {@link #a}}
     *
     * @return value of {@link #a}
     */
    public String getA() {
        return a;
    }

    /**
     * Sets {@code a}
     *
     * @param a the {@code java.lang.String} field
     */
    public void setA(String a) {
        this.a = a;
    }
}
