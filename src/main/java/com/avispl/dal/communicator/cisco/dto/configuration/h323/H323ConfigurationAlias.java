/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device H323 Configuration Alias class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class H323ConfigurationAlias {
    @XmlElement(name = "E164")
    private ValueSpaceRefHolder e164;
    @XmlElement(name = "ID")
    private ValueSpaceRefHolder id;

    /**
     * Retrieves {@code {@link #e164}}
     *
     * @return value of {@link #e164}
     */
    public ValueSpaceRefHolder getE164() {
        return e164;
    }

    /**
     * Sets {@code e164}
     *
     * @param e164 the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setE164(ValueSpaceRefHolder e164) {
        this.e164 = e164;
    }

    /**
     * Retrieves {@code {@link #id}}
     *
     * @return value of {@link #id}
     */
    public ValueSpaceRefHolder getId() {
        return id;
    }

    /**
     * Sets {@code id}
     *
     * @param id the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setId(ValueSpaceRefHolder id) {
        this.id = id;
    }
}
