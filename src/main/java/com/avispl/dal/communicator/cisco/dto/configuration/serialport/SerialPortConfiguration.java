/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.serialport;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class SerialPortConfiguration {
    @XmlElement(name = "BaudRate")
    private ValueSpaceRefHolder baudRate;
    @XmlElement(name = "LoginRequired")
    private ValueSpaceRefHolder loginRequired;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    public ValueSpaceRefHolder getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(ValueSpaceRefHolder baudRate) {
        this.baudRate = baudRate;
    }

    public ValueSpaceRefHolder getLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(ValueSpaceRefHolder loginRequired) {
        this.loginRequired = loginRequired;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
