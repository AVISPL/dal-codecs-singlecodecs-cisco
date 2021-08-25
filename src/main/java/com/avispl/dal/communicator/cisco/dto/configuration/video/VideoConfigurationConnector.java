/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Video Configuration Connector class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfigurationConnector {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "CameraControl")
    private VideoConfigurationCameraControl cameraControl;
    @XmlElement(name = "InputSourceType")
    private ValueSpaceRefHolder inputSourceType;
    @XmlElement(name = "Name")
    private ValueSpaceRefHolder name;
    @XmlElement(name = "PresentationSelection")
    private ValueSpaceRefHolder presentationSelection;
    @XmlElement(name = "Quality")
    private ValueSpaceRefHolder quality;
    @XmlElement(name = "Visibility")
    private ValueSpaceRefHolder visibility;
    @XmlElement(name = "MonitorRole")
    private ValueSpaceRefHolder monitorRole;
    @XmlElement(name = "OverscanLevel")
    private ValueSpaceRefHolder overscanLevel;
    @XmlElement(name = "Resolution")
    private ValueSpaceRefHolder resolution;
    @XmlElement(name = "CEC")
    private VideoConfigurationCEC cec;

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #cameraControl}}
     *
     * @return value of {@link #cameraControl}
     */
    public VideoConfigurationCameraControl getCameraControl() {
        return cameraControl;
    }

    /**
     * Sets {@code cameraControl}
     *
     * @param cameraControl the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationCameraControl} field
     */
    public void setCameraControl(VideoConfigurationCameraControl cameraControl) {
        this.cameraControl = cameraControl;
    }

    /**
     * Retrieves {@code {@link #inputSourceType}}
     *
     * @return value of {@link #inputSourceType}
     */
    public ValueSpaceRefHolder getInputSourceType() {
        return inputSourceType;
    }

    /**
     * Sets {@code inputSourceType}
     *
     * @param inputSourceType the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setInputSourceType(ValueSpaceRefHolder inputSourceType) {
        this.inputSourceType = inputSourceType;
    }

    /**
     * Retrieves {@code {@link #name}}
     *
     * @return value of {@link #name}
     */
    public ValueSpaceRefHolder getName() {
        return name;
    }

    /**
     * Sets {@code name}
     *
     * @param name the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setName(ValueSpaceRefHolder name) {
        this.name = name;
    }

    /**
     * Retrieves {@code {@link #presentationSelection}}
     *
     * @return value of {@link #presentationSelection}
     */
    public ValueSpaceRefHolder getPresentationSelection() {
        return presentationSelection;
    }

    /**
     * Sets {@code presentationSelection}
     *
     * @param presentationSelection the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setPresentationSelection(ValueSpaceRefHolder presentationSelection) {
        this.presentationSelection = presentationSelection;
    }

    /**
     * Retrieves {@code {@link #quality}}
     *
     * @return value of {@link #quality}
     */
    public ValueSpaceRefHolder getQuality() {
        return quality;
    }

    /**
     * Sets {@code quality}
     *
     * @param quality the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setQuality(ValueSpaceRefHolder quality) {
        this.quality = quality;
    }

    /**
     * Retrieves {@code {@link #visibility}}
     *
     * @return value of {@link #visibility}
     */
    public ValueSpaceRefHolder getVisibility() {
        return visibility;
    }

    /**
     * Sets {@code visibility}
     *
     * @param visibility the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setVisibility(ValueSpaceRefHolder visibility) {
        this.visibility = visibility;
    }

    /**
     * Retrieves {@code {@link #monitorRole}}
     *
     * @return value of {@link #monitorRole}
     */
    public ValueSpaceRefHolder getMonitorRole() {
        return monitorRole;
    }

    /**
     * Sets {@code monitorRole}
     *
     * @param monitorRole the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMonitorRole(ValueSpaceRefHolder monitorRole) {
        this.monitorRole = monitorRole;
    }

    /**
     * Retrieves {@code {@link #overscanLevel}}
     *
     * @return value of {@link #overscanLevel}
     */
    public ValueSpaceRefHolder getOverscanLevel() {
        return overscanLevel;
    }

    /**
     * Sets {@code overscanLevel}
     *
     * @param overscanLevel the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setOverscanLevel(ValueSpaceRefHolder overscanLevel) {
        this.overscanLevel = overscanLevel;
    }

    /**
     * Retrieves {@code {@link #resolution}}
     *
     * @return value of {@link #resolution}
     */
    public ValueSpaceRefHolder getResolution() {
        return resolution;
    }

    /**
     * Sets {@code resolution}
     *
     * @param resolution the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setResolution(ValueSpaceRefHolder resolution) {
        this.resolution = resolution;
    }

    /**
     * Retrieves {@code {@link #cec}}
     *
     * @return value of {@link #cec}
     */
    public VideoConfigurationCEC getCec() {
        return cec;
    }

    /**
     * Sets {@code cec}
     *
     * @param cec the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationCEC} field
     */
    public void setCec(VideoConfigurationCEC cec) {
        this.cec = cec;
    }
}
