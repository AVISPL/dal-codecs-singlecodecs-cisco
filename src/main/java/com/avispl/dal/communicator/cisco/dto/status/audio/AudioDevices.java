/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Audio devices status class.
 * Represents an audio devices status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class AudioDevices {
    @XmlElement(name = "Bluetooth")
    private AudioDevicesBluetooth bluetooth;
    @XmlElement(name = "HandsetUSB")
    private AudioDevicesHandsetUSB handsetUSB;
    @XmlElement(name = "HeadsetUSB")
    private AudioDevicesHeadsetUSB headsetUSB;

    /**
     * Retrieves {@code {@link #bluetooth}}
     *
     * @return value of {@link #bluetooth}
     */
    public AudioDevicesBluetooth getBluetooth() {
        return bluetooth;
    }

    /**
     * Sets {@code bluetooth}
     *
     * @param bluetooth the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioDevicesBluetooth} field
     */
    public void setBluetooth(AudioDevicesBluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    /**
     * Retrieves {@code {@link #handsetUSB}}
     *
     * @return value of {@link #handsetUSB}
     */
    public AudioDevicesHandsetUSB getHandsetUSB() {
        return handsetUSB;
    }

    /**
     * Sets {@code handsetUSB}
     *
     * @param handsetUSB the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioDevicesHandsetUSB} field
     */
    public void setHandsetUSB(AudioDevicesHandsetUSB handsetUSB) {
        this.handsetUSB = handsetUSB;
    }

    /**
     * Retrieves {@code {@link #headsetUSB}}
     *
     * @return value of {@link #headsetUSB}
     */
    public AudioDevicesHeadsetUSB getHeadsetUSB() {
        return headsetUSB;
    }

    /**
     * Sets {@code headsetUSB}
     *
     * @param headsetUSB the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioDevicesHeadsetUSB} field
     */
    public void setHeadsetUSB(AudioDevicesHeadsetUSB headsetUSB) {
        this.headsetUSB = headsetUSB;
    }
}
