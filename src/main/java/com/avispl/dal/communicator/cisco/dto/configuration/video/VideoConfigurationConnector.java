/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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

    public VideoConfigurationCameraControl getCameraControl() {
        return cameraControl;
    }

    public void setCameraControl(VideoConfigurationCameraControl cameraControl) {
        this.cameraControl = cameraControl;
    }

    public ValueSpaceRefHolder getInputSourceType() {
        return inputSourceType;
    }

    public void setInputSourceType(ValueSpaceRefHolder inputSourceType) {
        this.inputSourceType = inputSourceType;
    }

    public ValueSpaceRefHolder getName() {
        return name;
    }

    public void setName(ValueSpaceRefHolder name) {
        this.name = name;
    }

    public ValueSpaceRefHolder getPresentationSelection() {
        return presentationSelection;
    }

    public void setPresentationSelection(ValueSpaceRefHolder presentationSelection) {
        this.presentationSelection = presentationSelection;
    }

    public ValueSpaceRefHolder getQuality() {
        return quality;
    }

    public void setQuality(ValueSpaceRefHolder quality) {
        this.quality = quality;
    }

    public ValueSpaceRefHolder getVisibility() {
        return visibility;
    }

    public void setVisibility(ValueSpaceRefHolder visibility) {
        this.visibility = visibility;
    }

    public ValueSpaceRefHolder getMonitorRole() {
        return monitorRole;
    }

    public void setMonitorRole(ValueSpaceRefHolder monitorRole) {
        this.monitorRole = monitorRole;
    }

    public ValueSpaceRefHolder getOverscanLevel() {
        return overscanLevel;
    }

    public void setOverscanLevel(ValueSpaceRefHolder overscanLevel) {
        this.overscanLevel = overscanLevel;
    }

    public ValueSpaceRefHolder getResolution() {
        return resolution;
    }

    public void setResolution(ValueSpaceRefHolder resolution) {
        this.resolution = resolution;
    }

    public VideoConfigurationCEC getCec() {
        return cec;
    }

    public void setCec(VideoConfigurationCEC cec) {
        this.cec = cec;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
