/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioDevices {
    @XmlElement(name = "Bluetooth")
    private AudioDevicesBluetooth bluetooth;
    @XmlElement(name = "HandsetUSB")
    private AudioDevicesHandsetUSB handsetUSB;
    @XmlElement(name = "HeadsetUSB")
    private AudioDevicesHeadsetUSB headsetUSB;

    public AudioDevicesBluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(AudioDevicesBluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public AudioDevicesHandsetUSB getHandsetUSB() {
        return handsetUSB;
    }

    public void setHandsetUSB(AudioDevicesHandsetUSB handsetUSB) {
        this.handsetUSB = handsetUSB;
    }

    public AudioDevicesHeadsetUSB getHeadsetUSB() {
        return headsetUSB;
    }

    public void setHeadsetUSB(AudioDevicesHeadsetUSB headsetUSB) {
        this.headsetUSB = headsetUSB;
    }
}
