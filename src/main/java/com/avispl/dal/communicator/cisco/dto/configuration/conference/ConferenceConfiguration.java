/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.conference;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Device Conference Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #autoAnswer}}
     *
     * @return value of {@link #autoAnswer}
     */
    public ConferenceConfigurationAutoAnswer getAutoAnswer() {
        return autoAnswer;
    }

    /**
     * Sets {@code autoAnswer}
     *
     * @param autoAnswer the {@code com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfigurationAutoAnswer} field
     */
    public void setAutoAnswer(ConferenceConfigurationAutoAnswer autoAnswer) {
        this.autoAnswer = autoAnswer;
    }

    /**
     * Retrieves {@code {@link #defaultCall}}
     *
     * @return value of {@link #defaultCall}
     */
    public ConferenceConfigurationDefaultCall getDefaultCall() {
        return defaultCall;
    }

    /**
     * Sets {@code defaultCall}
     *
     * @param defaultCall the {@code com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfigurationDefaultCall} field
     */
    public void setDefaultCall(ConferenceConfigurationDefaultCall defaultCall) {
        this.defaultCall = defaultCall;
    }

    /**
     * Retrieves {@code {@link #doNotDisturb}}
     *
     * @return value of {@link #doNotDisturb}
     */
    public ConferenceConfigurationDoNotDisturb getDoNotDisturb() {
        return doNotDisturb;
    }

    /**
     * Sets {@code doNotDisturb}
     *
     * @param doNotDisturb the {@code com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfigurationDoNotDisturb} field
     */
    public void setDoNotDisturb(ConferenceConfigurationDoNotDisturb doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
    }

    /**
     * Retrieves {@code {@link #encryption}}
     *
     * @return value of {@link #encryption}
     */
    public ConferenceConfigurationEncryption getEncryption() {
        return encryption;
    }

    /**
     * Sets {@code encryption}
     *
     * @param encryption the {@code com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfigurationEncryption} field
     */
    public void setEncryption(ConferenceConfigurationEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * Retrieves {@code {@link #farEndControl}}
     *
     * @return value of {@link #farEndControl}
     */
    public ConferenceConfigurationFarEndControl getFarEndControl() {
        return farEndControl;
    }

    /**
     * Sets {@code farEndControl}
     *
     * @param farEndControl the {@code com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfigurationFarEndControl} field
     */
    public void setFarEndControl(ConferenceConfigurationFarEndControl farEndControl) {
        this.farEndControl = farEndControl;
    }

    /**
     * Retrieves {@code {@link #maxReceiveCallRate}}
     *
     * @return value of {@link #maxReceiveCallRate}
     */
    public ValueSpaceRefHolder getMaxReceiveCallRate() {
        return maxReceiveCallRate;
    }

    /**
     * Sets {@code maxReceiveCallRate}
     *
     * @param maxReceiveCallRate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMaxReceiveCallRate(ValueSpaceRefHolder maxReceiveCallRate) {
        this.maxReceiveCallRate = maxReceiveCallRate;
    }

    /**
     * Retrieves {@code {@link #maxTotalReceiveCallRate}}
     *
     * @return value of {@link #maxTotalReceiveCallRate}
     */
    public ValueSpaceRefHolder getMaxTotalReceiveCallRate() {
        return maxTotalReceiveCallRate;
    }

    /**
     * Sets {@code maxTotalReceiveCallRate}
     *
     * @param maxTotalReceiveCallRate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMaxTotalReceiveCallRate(ValueSpaceRefHolder maxTotalReceiveCallRate) {
        this.maxTotalReceiveCallRate = maxTotalReceiveCallRate;
    }

    /**
     * Retrieves {@code {@link #maxTotalTransmitCallRate}}
     *
     * @return value of {@link #maxTotalTransmitCallRate}
     */
    public ValueSpaceRefHolder getMaxTotalTransmitCallRate() {
        return maxTotalTransmitCallRate;
    }

    /**
     * Sets {@code maxTotalTransmitCallRate}
     *
     * @param maxTotalTransmitCallRate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMaxTotalTransmitCallRate(ValueSpaceRefHolder maxTotalTransmitCallRate) {
        this.maxTotalTransmitCallRate = maxTotalTransmitCallRate;
    }

    /**
     * Retrieves {@code {@link #maxTransmitCallRate}}
     *
     * @return value of {@link #maxTransmitCallRate}
     */
    public ValueSpaceRefHolder getMaxTransmitCallRate() {
        return maxTransmitCallRate;
    }

    /**
     * Sets {@code maxTransmitCallRate}
     *
     * @param maxTransmitCallRate the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMaxTransmitCallRate(ValueSpaceRefHolder maxTransmitCallRate) {
        this.maxTransmitCallRate = maxTransmitCallRate;
    }
}
