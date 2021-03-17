/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class VideoStatus {
    @XmlElement(name = "ActiveSpeaker")
    private ActiveSpeaker activeSpeaker;
    @XmlElement(name = "Input")
    private VideoInput input;
    @XmlElement(name = "Output")
    private VideoOutput output;
    @XmlElement(name = "Layout")
    private VideoLayout layout;
    @XmlElement(name = "Monitors")
    private String monitors;
    @XmlElement(name = "Presentation")
    private VideoPresentation presentation;
    @XmlElement(name = "Selfview")
    private VideoSelfview selfView;

    public ActiveSpeaker getActiveSpeaker() {
        return activeSpeaker;
    }

    public void setActiveSpeaker(ActiveSpeaker activeSpeaker) {
        this.activeSpeaker = activeSpeaker;
    }

    public VideoInput getInput() {
        return input;
    }

    public void setInput(VideoInput input) {
        this.input = input;
    }

    public VideoOutput getOutput() {
        return output;
    }

    public void setOutput(VideoOutput output) {
        this.output = output;
    }

    public VideoLayout getLayout() {
        return layout;
    }

    public void setLayout(VideoLayout layout) {
        this.layout = layout;
    }

    public String getMonitors() {
        return monitors;
    }

    public void setMonitors(String monitors) {
        this.monitors = monitors;
    }

    public VideoPresentation getPresentation() {
        return presentation;
    }

    public void setPresentation(VideoPresentation presentation) {
        this.presentation = presentation;
    }

    public VideoSelfview getSelfView() {
        return selfView;
    }

    public void setSelfView(VideoSelfview selfView) {
        this.selfView = selfView;
    }
}
