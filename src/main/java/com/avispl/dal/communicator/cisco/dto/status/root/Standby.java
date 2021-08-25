/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device standby status class
 * Represents standby node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Standby {
    @XmlElement(name = "State")
    private String state;

    /**
     * Retrieves {@code {@link #state}}
     *
     * @return value of {@link #state}
     */
    public String getState() {
        return state;
    }

    /**
     * Sets {@code state}
     *
     * @param state the {@code java.lang.String} field
     */
    public void setState(String state) {
        this.state = state;
    }
}
