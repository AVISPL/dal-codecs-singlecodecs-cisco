/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call.response;

import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/***
 * Call disconnect command response template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CallDisconnectResult {
    @XmlAttribute(name = "status")
    private String status;

    /**
     * Retrieves {@code {@link #status}}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
