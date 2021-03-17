/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfiguration {
    @XmlElement(name = "DefaultMainSource")
    private ValueSpaceRefHolder defaultMainSource;
    @XmlElement(name = "Input")
    private VideoConfigurationInput input;
    @XmlElement(name = "Output")
    private VideoConfigurationOutput output;
    @XmlElement(name = "Presentation")
    private VideoConfigurationPresentation presentation;
    @XmlElement(name = "Selfview")
    private VideoConfigurationSelfview selfview;
    @XmlElement(name = "Monitors")
    private ValueSpaceRefHolder monitors;

    public ValueSpaceRefHolder getDefaultMainSource() {
        return defaultMainSource;
    }

    public void setDefaultMainSource(ValueSpaceRefHolder defaultMainSource) {
        this.defaultMainSource = defaultMainSource;
    }

    public VideoConfigurationInput getInput() {
        return input;
    }

    public void setInput(VideoConfigurationInput input) {
        this.input = input;
    }

    public VideoConfigurationOutput getOutput() {
        return output;
    }

    public void setOutput(VideoConfigurationOutput output) {
        this.output = output;
    }

    public VideoConfigurationPresentation getPresentation() {
        return presentation;
    }

    public void setPresentation(VideoConfigurationPresentation presentation) {
        this.presentation = presentation;
    }

    public VideoConfigurationSelfview getSelfview() {
        return selfview;
    }

    public void setSelfview(VideoConfigurationSelfview selfview) {
        this.selfview = selfview;
    }

    public ValueSpaceRefHolder getMonitors() {
        return monitors;
    }

    public void setMonitors(ValueSpaceRefHolder monitors) {
        this.monitors = monitors;
    }
}
