/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class AudioStatus {
    @XmlElement(name = "Devices")
    private AudioDevices devices;
    @XmlElement(name = "Input")
    private AudioInput input;
    @XmlElement(name = "Microphones")
    private Microphones microphones;
    @XmlElement(name = "Output")
    private AudioOutput output;
    @XmlElement(name = "Volume")
    private String volume;
    @XmlElement(name = "SelectedDevice")
    private String selectedDevice;
    @XmlElement(name = "VolumeHeadsetUsb")
    private String volumeHeadsetUsb;
    @XmlElement(name = "VolumeHeadsetBluetooth")
    private String volumeHeadsetBluetooth;
    @XmlElement(name = "VolumeHandsetUsb")
    private String volumeHandsetUsb;
    @XmlElement(name = "VolumeMute")
    private String volumeMute;

    public AudioInput getInput() {
        return input;
    }

    public void setInput(AudioInput input) {
        this.input = input;
    }

    public Microphones getMicrophones() {
        return microphones;
    }

    public void setMicrophones(Microphones microphones) {
        this.microphones = microphones;
    }

    public AudioOutput getOutput() {
        return output;
    }

    public void setOutput(AudioOutput output) {
        this.output = output;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolumeMute() {
        return volumeMute;
    }

    public void setVolumeMute(String volumeMute) {
        this.volumeMute = volumeMute;
    }

    public String getVolumeHeadsetUsb() {
        return volumeHeadsetUsb;
    }

    public void setVolumeHeadsetUsb(String volumeHeadsetUsb) {
        this.volumeHeadsetUsb = volumeHeadsetUsb;
    }

    public String getVolumeHeadsetBluetooth() {
        return volumeHeadsetBluetooth;
    }

    public void setVolumeHeadsetBluetooth(String volumeHeadsetBluetooth) {
        this.volumeHeadsetBluetooth = volumeHeadsetBluetooth;
    }

    public String getVolumeHandsetUsb() {
        return volumeHandsetUsb;
    }

    public void setVolumeHandsetUsb(String volumeHandsetUsb) {
        this.volumeHandsetUsb = volumeHandsetUsb;
    }

    public String getSelectedDevice() {
        return selectedDevice;
    }

    public void setSelectedDevice(String selectedDevice) {
        this.selectedDevice = selectedDevice;
    }

    public AudioDevices getDevices() {
        return devices;
    }

    public void setDevices(AudioDevices devices) {
        this.devices = devices;
    }
}
