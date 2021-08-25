/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.audio;

/**
 * Device Audio status class.
 * Represents an audio status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #devices}}
     *
     * @return value of {@link #devices}
     */
    public AudioDevices getDevices() {
        return devices;
    }

    /**
     * Sets {@code devices}
     *
     * @param devices the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioDevices} field
     */
    public void setDevices(AudioDevices devices) {
        this.devices = devices;
    }

    /**
     * Retrieves {@code {@link #input}}
     *
     * @return value of {@link #input}
     */
    public AudioInput getInput() {
        return input;
    }

    /**
     * Sets {@code input}
     *
     * @param input the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioInput} field
     */
    public void setInput(AudioInput input) {
        this.input = input;
    }

    /**
     * Retrieves {@code {@link #microphones}}
     *
     * @return value of {@link #microphones}
     */
    public Microphones getMicrophones() {
        return microphones;
    }

    /**
     * Sets {@code microphones}
     *
     * @param microphones the {@code com.avispl.dal.communicator.cisco.dto.status.audio.Microphones} field
     */
    public void setMicrophones(Microphones microphones) {
        this.microphones = microphones;
    }

    /**
     * Retrieves {@code {@link #output}}
     *
     * @return value of {@link #output}
     */
    public AudioOutput getOutput() {
        return output;
    }

    /**
     * Sets {@code output}
     *
     * @param output the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioOutput} field
     */
    public void setOutput(AudioOutput output) {
        this.output = output;
    }

    /**
     * Retrieves {@code {@link #volume}}
     *
     * @return value of {@link #volume}
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets {@code volume}
     *
     * @param volume the {@code java.lang.String} field
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Retrieves {@code {@link #selectedDevice}}
     *
     * @return value of {@link #selectedDevice}
     */
    public String getSelectedDevice() {
        return selectedDevice;
    }

    /**
     * Sets {@code selectedDevice}
     *
     * @param selectedDevice the {@code java.lang.String} field
     */
    public void setSelectedDevice(String selectedDevice) {
        this.selectedDevice = selectedDevice;
    }

    /**
     * Retrieves {@code {@link #volumeHeadsetUsb}}
     *
     * @return value of {@link #volumeHeadsetUsb}
     */
    public String getVolumeHeadsetUsb() {
        return volumeHeadsetUsb;
    }

    /**
     * Sets {@code volumeHeadsetUsb}
     *
     * @param volumeHeadsetUsb the {@code java.lang.String} field
     */
    public void setVolumeHeadsetUsb(String volumeHeadsetUsb) {
        this.volumeHeadsetUsb = volumeHeadsetUsb;
    }

    /**
     * Retrieves {@code {@link #volumeHeadsetBluetooth}}
     *
     * @return value of {@link #volumeHeadsetBluetooth}
     */
    public String getVolumeHeadsetBluetooth() {
        return volumeHeadsetBluetooth;
    }

    /**
     * Sets {@code volumeHeadsetBluetooth}
     *
     * @param volumeHeadsetBluetooth the {@code java.lang.String} field
     */
    public void setVolumeHeadsetBluetooth(String volumeHeadsetBluetooth) {
        this.volumeHeadsetBluetooth = volumeHeadsetBluetooth;
    }

    /**
     * Retrieves {@code {@link #volumeHandsetUsb}}
     *
     * @return value of {@link #volumeHandsetUsb}
     */
    public String getVolumeHandsetUsb() {
        return volumeHandsetUsb;
    }

    /**
     * Sets {@code volumeHandsetUsb}
     *
     * @param volumeHandsetUsb the {@code java.lang.String} field
     */
    public void setVolumeHandsetUsb(String volumeHandsetUsb) {
        this.volumeHandsetUsb = volumeHandsetUsb;
    }

    /**
     * Retrieves {@code {@link #volumeMute}}
     *
     * @return value of {@link #volumeMute}
     */
    public String getVolumeMute() {
        return volumeMute;
    }

    /**
     * Sets {@code volumeMute}
     *
     * @param volumeMute the {@code java.lang.String} field
     */
    public void setVolumeMute(String volumeMute) {
        this.volumeMute = volumeMute;
    }
}
