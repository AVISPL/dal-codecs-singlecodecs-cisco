/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class ConferenceConfiguration {
    @XmlElement(name = "AutoAnswer")
    private ConferenceConfigurationAutoAnswer autoAnswer;
    @XmlElement(name = "DefaultCall")
    private ConferenceConfigurationDefaultCall defaultCall;
    @XmlElement(name = "DoNotDisturb")
    private ConferenceConfigurationDoNotDisturb doNotDisturb;
    @XmlElement(name = "Encryption")
    private ConferenceConfigurationEncryption encryption;
    @XmlElement(name = "FarEndControl")
    private ConferenceConfigurationFarEndControl farEndControl;
    @XmlElement(name = "MaxReceiveCallRate")
    private ValueSpaceRefHolder maxReceiveCallRate;
    @XmlElement(name = "MaxTotalReceiveCallRate")
    private ValueSpaceRefHolder maxTotalReceiveCallRate;
    @XmlElement(name = "MaxTotalTransmitCallRate")
    private ValueSpaceRefHolder maxTotalTransmitCallRate;
    @XmlElement(name = "MaxTransmitCallRate")
    private ValueSpaceRefHolder maxTransmitCallRate;

    public ConferenceConfigurationAutoAnswer getAutoAnswer() {
        return autoAnswer;
    }

    public void setAutoAnswer(ConferenceConfigurationAutoAnswer autoAnswer) {
        this.autoAnswer = autoAnswer;
    }

    public ConferenceConfigurationDefaultCall getDefaultCall() {
        return defaultCall;
    }

    public void setDefaultCall(ConferenceConfigurationDefaultCall defaultCall) {
        this.defaultCall = defaultCall;
    }

    public ConferenceConfigurationDoNotDisturb getDoNotDisturb() {
        return doNotDisturb;
    }

    public void setDoNotDisturb(ConferenceConfigurationDoNotDisturb doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
    }

    public ConferenceConfigurationEncryption getEncryption() {
        return encryption;
    }

    public void setEncryption(ConferenceConfigurationEncryption encryption) {
        this.encryption = encryption;
    }

    public ConferenceConfigurationFarEndControl getFarEndControl() {
        return farEndControl;
    }

    public void setFarEndControl(ConferenceConfigurationFarEndControl farEndControl) {
        this.farEndControl = farEndControl;
    }

    public ValueSpaceRefHolder getMaxReceiveCallRate() {
        return maxReceiveCallRate;
    }

    public void setMaxReceiveCallRate(ValueSpaceRefHolder maxReceiveCallRate) {
        this.maxReceiveCallRate = maxReceiveCallRate;
    }

    public ValueSpaceRefHolder getMaxTotalReceiveCallRate() {
        return maxTotalReceiveCallRate;
    }

    public void setMaxTotalReceiveCallRate(ValueSpaceRefHolder maxTotalReceiveCallRate) {
        this.maxTotalReceiveCallRate = maxTotalReceiveCallRate;
    }

    public ValueSpaceRefHolder getMaxTotalTransmitCallRate() {
        return maxTotalTransmitCallRate;
    }

    public void setMaxTotalTransmitCallRate(ValueSpaceRefHolder maxTotalTransmitCallRate) {
        this.maxTotalTransmitCallRate = maxTotalTransmitCallRate;
    }

    public ValueSpaceRefHolder getMaxTransmitCallRate() {
        return maxTransmitCallRate;
    }

    public void setMaxTransmitCallRate(ValueSpaceRefHolder maxTransmitCallRate) {
        this.maxTransmitCallRate = maxTransmitCallRate;
    }
}
