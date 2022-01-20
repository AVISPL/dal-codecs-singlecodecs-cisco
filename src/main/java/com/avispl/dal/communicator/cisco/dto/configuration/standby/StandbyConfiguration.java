/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.standby;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Standby Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StandbyConfiguration {
    @JacksonXmlProperty(localName="BootAction")
    private ValueSpaceRefHolder bootAction;
    @JacksonXmlProperty(localName="Control")
    private ValueSpaceRefHolder control;
    @JacksonXmlProperty(localName="Delay")
    private ValueSpaceRefHolder delay;
    @JacksonXmlProperty(localName="StandbyAction")
    private ValueSpaceRefHolder standbyAction;
    @JacksonXmlProperty(localName="WakeupAction")
    private ValueSpaceRefHolder wakeupAction;

    /**
     * Retrieves {@code {@link #bootAction}}
     *
     * @return value of {@link #bootAction}
     */
    public ValueSpaceRefHolder getBootAction() {
        return bootAction;
    }

    /**
     * Sets {@code bootAction}
     *
     * @param bootAction the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setBootAction(ValueSpaceRefHolder bootAction) {
        this.bootAction = bootAction;
    }

    /**
     * Retrieves {@code {@link #control}}
     *
     * @return value of {@link #control}
     */
    public ValueSpaceRefHolder getControl() {
        return control;
    }

    /**
     * Sets {@code control}
     *
     * @param control the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setControl(ValueSpaceRefHolder control) {
        this.control = control;
    }

    /**
     * Retrieves {@code {@link #delay}}
     *
     * @return value of {@link #delay}
     */
    public ValueSpaceRefHolder getDelay() {
        return delay;
    }

    /**
     * Sets {@code delay}
     *
     * @param delay the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDelay(ValueSpaceRefHolder delay) {
        this.delay = delay;
    }

    /**
     * Retrieves {@code {@link #standbyAction}}
     *
     * @return value of {@link #standbyAction}
     */
    public ValueSpaceRefHolder getStandbyAction() {
        return standbyAction;
    }

    /**
     * Sets {@code standbyAction}
     *
     * @param standbyAction the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setStandbyAction(ValueSpaceRefHolder standbyAction) {
        this.standbyAction = standbyAction;
    }

    /**
     * Retrieves {@code {@link #wakeupAction}}
     *
     * @return value of {@link #wakeupAction}
     */
    public ValueSpaceRefHolder getWakeupAction() {
        return wakeupAction;
    }

    /**
     * Sets {@code wakeupAction}
     *
     * @param wakeupAction the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setWakeupAction(ValueSpaceRefHolder wakeupAction) {
        this.wakeupAction = wakeupAction;
    }
}
