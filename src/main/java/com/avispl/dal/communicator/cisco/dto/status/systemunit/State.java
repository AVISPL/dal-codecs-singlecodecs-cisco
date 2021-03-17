/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class State {
    @XmlElement(name = "NumberOfActiveCalls")
    private String numberOfActiveCalls;
    @XmlElement(name = "NumberOfInProgressCalls")
    private String numberOfInProgressCalls;
    @XmlElement(name = "NumberOfSuspendedCalls")
    private String numberOfSuspendedCalls;

    public String getNumberOfActiveCalls() {
        return numberOfActiveCalls;
    }

    public void setNumberOfActiveCalls(String numberOfActiveCalls) {
        this.numberOfActiveCalls = numberOfActiveCalls;
    }

    public String getNumberOfInProgressCalls() {
        return numberOfInProgressCalls;
    }

    public void setNumberOfInProgressCalls(String numberOfInProgressCalls) {
        this.numberOfInProgressCalls = numberOfInProgressCalls;
    }

    public String getNumberOfSuspendedCalls() {
        return numberOfSuspendedCalls;
    }

    public void setNumberOfSuspendedCalls(String numberOfSuspendedCalls) {
        this.numberOfSuspendedCalls = numberOfSuspendedCalls;
    }
}
