/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.serialport;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Serial Port Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SerialPortConfiguration {
    @JacksonXmlProperty(localName="BaudRate")
    private ValueSpaceRefHolder baudRate;
    @JacksonXmlProperty(localName="LoginRequired")
    private ValueSpaceRefHolder loginRequired;
    @JacksonXmlProperty(localName="Mode")
    private ValueSpaceRefHolder mode;

    /**
     * Retrieves {@code {@link #baudRate}}
     *
     * @return value of {@link #baudRate}
     */
    public ValueSpaceRefHolder getBaudRate() {
        return baudRate;
    }

    /**
     * Sets {@code baudRate}
     *
     * @param baudRate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setBaudRate(ValueSpaceRefHolder baudRate) {
        this.baudRate = baudRate;
    }

    /**
     * Retrieves {@code {@link #loginRequired}}
     *
     * @return value of {@link #loginRequired}
     */
    public ValueSpaceRefHolder getLoginRequired() {
        return loginRequired;
    }

    /**
     * Sets {@code loginRequired}
     *
     * @param loginRequired the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setLoginRequired(ValueSpaceRefHolder loginRequired) {
        this.loginRequired = loginRequired;
    }

    /**
     * Retrieves {@code {@link #mode}}
     *
     * @return value of {@link #mode}
     */
    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    /**
     * Sets {@code mode}
     *
     * @param mode the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
