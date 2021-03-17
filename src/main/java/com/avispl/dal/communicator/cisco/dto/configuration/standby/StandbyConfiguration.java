/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.standby;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class StandbyConfiguration {
    @XmlElement(name = "BootAction")
    private ValueSpaceRefHolder bootAction;
    @XmlElement(name = "Control")
    private ValueSpaceRefHolder control;
    @XmlElement(name = "Delay")
    private ValueSpaceRefHolder delay;
    @XmlElement(name = "StandbyAction")
    private ValueSpaceRefHolder standbyAction;
    @XmlElement(name = "WakeupAction")
    private ValueSpaceRefHolder wakeupAction;

    public ValueSpaceRefHolder getBootAction() {
        return bootAction;
    }

    public void setBootAction(ValueSpaceRefHolder bootAction) {
        this.bootAction = bootAction;
    }

    public ValueSpaceRefHolder getControl() {
        return control;
    }

    public void setControl(ValueSpaceRefHolder control) {
        this.control = control;
    }

    public ValueSpaceRefHolder getDelay() {
        return delay;
    }

    public void setDelay(ValueSpaceRefHolder delay) {
        this.delay = delay;
    }

    public ValueSpaceRefHolder getStandbyAction() {
        return standbyAction;
    }

    public void setStandbyAction(ValueSpaceRefHolder standbyAction) {
        this.standbyAction = standbyAction;
    }

    public ValueSpaceRefHolder getWakeupAction() {
        return wakeupAction;
    }

    public void setWakeupAction(ValueSpaceRefHolder wakeupAction) {
        this.wakeupAction = wakeupAction;
    }
}
