/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.phonebook;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Phonebook Configuration Server class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class PhonebookConfigurationServer {
    @XmlElement(name = "ID")
    private ValueSpaceRefHolder id;
    @XmlElement(name = "Type")
    private ValueSpaceRefHolder type;
    @XmlElement(name = "URL")
    private ValueSpaceRefHolder url;

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

    /**
     * Retrieves {@code {@link #type}}
     *
     * @return value of {@link #type}
     */
    public ValueSpaceRefHolder getType() {
        return type;
    }

    /**
     * Sets {@code type}
     *
     * @param type the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setType(ValueSpaceRefHolder type) {
        this.type = type;
    }

    /**
     * Retrieves {@code {@link #url}}
     *
     * @return value of {@link #url}
     */
    public ValueSpaceRefHolder getUrl() {
        return url;
    }

    /**
     * Sets {@code url}
     *
     * @param url the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setUrl(ValueSpaceRefHolder url) {
        this.url = url;
    }
}
