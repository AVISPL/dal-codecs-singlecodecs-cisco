/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device video status class
 * Represents video status node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #activeSpeaker}}
     *
     * @return value of {@link #activeSpeaker}
     */
    public ActiveSpeaker getActiveSpeaker() {
        return activeSpeaker;
    }

    /**
     * Sets {@code activeSpeaker}
     *
     * @param activeSpeaker the {@code com.avispl.dal.communicator.cisco.dto.status.video.ActiveSpeaker} field
     */
    public void setActiveSpeaker(ActiveSpeaker activeSpeaker) {
        this.activeSpeaker = activeSpeaker;
    }

    /**
     * Retrieves {@code {@link #input}}
     *
     * @return value of {@link #input}
     */
    public VideoInput getInput() {
        return input;
    }

    /**
     * Sets {@code input}
     *
     * @param input the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoInput} field
     */
    public void setInput(VideoInput input) {
        this.input = input;
    }

    /**
     * Retrieves {@code {@link #output}}
     *
     * @return value of {@link #output}
     */
    public VideoOutput getOutput() {
        return output;
    }

    /**
     * Sets {@code output}
     *
     * @param output the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoOutput} field
     */
    public void setOutput(VideoOutput output) {
        this.output = output;
    }

    /**
     * Retrieves {@code {@link #layout}}
     *
     * @return value of {@link #layout}
     */
    public VideoLayout getLayout() {
        return layout;
    }

    /**
     * Sets {@code layout}
     *
     * @param layout the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoLayout} field
     */
    public void setLayout(VideoLayout layout) {
        this.layout = layout;
    }

    /**
     * Retrieves {@code {@link #monitors}}
     *
     * @return value of {@link #monitors}
     */
    public String getMonitors() {
        return monitors;
    }

    /**
     * Sets {@code monitors}
     *
     * @param monitors the {@code java.lang.String} field
     */
    public void setMonitors(String monitors) {
        this.monitors = monitors;
    }

    /**
     * Retrieves {@code {@link #presentation}}
     *
     * @return value of {@link #presentation}
     */
    public VideoPresentation getPresentation() {
        return presentation;
    }

    /**
     * Sets {@code presentation}
     *
     * @param presentation the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoPresentation} field
     */
    public void setPresentation(VideoPresentation presentation) {
        this.presentation = presentation;
    }

    /**
     * Retrieves {@code {@link #selfView}}
     *
     * @return value of {@link #selfView}
     */
    public VideoSelfview getSelfView() {
        return selfView;
    }

    /**
     * Sets {@code selfView}
     *
     * @param selfView the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoSelfview} field
     */
    public void setSelfView(VideoSelfview selfView) {
        this.selfView = selfView;
    }
}
