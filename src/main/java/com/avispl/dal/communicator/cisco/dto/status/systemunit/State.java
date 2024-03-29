/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device system unit state class
 * Represents system unit state node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class State {
    @JacksonXmlProperty(localName="NumberOfActiveCalls")
    private String numberOfActiveCalls;
    @JacksonXmlProperty(localName="NumberOfInProgressCalls")
    private String numberOfInProgressCalls;
    @JacksonXmlProperty(localName="NumberOfSuspendedCalls")
    private String numberOfSuspendedCalls;

    /**
     * Retrieves {@link #numberOfActiveCalls}
     *
     * @return value of {@link #numberOfActiveCalls}
     */
    public String getNumberOfActiveCalls() {
        return numberOfActiveCalls;
    }

    /**
     * Sets {@code numberOfActiveCalls}
     *
     * @param numberOfActiveCalls the {@code java.lang.String} field
     */
    public void setNumberOfActiveCalls(String numberOfActiveCalls) {
        this.numberOfActiveCalls = numberOfActiveCalls;
    }

    /**
     * Retrieves {@link #numberOfInProgressCalls}
     *
     * @return value of {@link #numberOfInProgressCalls}
     */
    public String getNumberOfInProgressCalls() {
        return numberOfInProgressCalls;
    }

    /**
     * Sets {@code numberOfInProgressCalls}
     *
     * @param numberOfInProgressCalls the {@code java.lang.String} field
     */
    public void setNumberOfInProgressCalls(String numberOfInProgressCalls) {
        this.numberOfInProgressCalls = numberOfInProgressCalls;
    }

    /**
     * Retrieves {@link #numberOfSuspendedCalls}
     *
     * @return value of {@link #numberOfSuspendedCalls}
     */
    public String getNumberOfSuspendedCalls() {
        return numberOfSuspendedCalls;
    }

    /**
     * Sets {@code numberOfSuspendedCalls}
     *
     * @param numberOfSuspendedCalls the {@code java.lang.String} field
     */
    public void setNumberOfSuspendedCalls(String numberOfSuspendedCalls) {
        this.numberOfSuspendedCalls = numberOfSuspendedCalls;
    }
}
