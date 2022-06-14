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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AudioStatus {
    @JacksonXmlProperty(localName="Devices")
    private AudioDevices devices;
    @JacksonXmlProperty(localName="Input")
    private AudioInput input;
    @JacksonXmlProperty(localName="Microphones")
    private Microphones microphones;
    @JacksonXmlProperty(localName="Output")
    private AudioOutput output;
    @JacksonXmlProperty(localName="Volume")
    private String volume;
    @JacksonXmlProperty(localName="SelectedDevice")
    private String selectedDevice;
    @JacksonXmlProperty(localName="VolumeHeadsetUsb")
    private String volumeHeadsetUsb;
    @JacksonXmlProperty(localName="VolumeHeadsetBluetooth")
    private String volumeHeadsetBluetooth;
    @JacksonXmlProperty(localName="VolumeHandsetUsb")
    private String volumeHandsetUsb;
    @JacksonXmlProperty(localName="VolumeMute")
    private String volumeMute;

    /**
     * Retrieves {@link #devices}
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
     * Retrieves {@link #input}
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
     * Retrieves {@link #microphones}
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
     * Retrieves {@link #output}
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
     * Retrieves {@link #volume}
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
     * Retrieves {@link #selectedDevice}
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
     * Retrieves {@link #volumeHeadsetUsb}
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
     * Retrieves {@link #volumeHeadsetBluetooth}
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
     * Retrieves {@link #volumeHandsetUsb}
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
     * Retrieves {@link #volumeMute}
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
