/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device video layout family status class
 * Represents video layout family node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoLayoutFamily {
    @XmlElement(name = "Local")
    private String local;

    /**
     * Retrieves {@code {@link #local}}
     *
     * @return value of {@link #local}
     */
    public String getLocal() {
        return local;
    }

    /**
     * Sets {@code local}
     *
     * @param local the {@code java.lang.String} field
     */
    public void setLocal(String local) {
        this.local = local;
    }
}
