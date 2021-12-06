/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Video Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VideoConfiguration {
    @JacksonXmlProperty(localName="DefaultMainSource")
    private ValueSpaceRefHolder defaultMainSource;
    @JacksonXmlProperty(localName="Input")
    private VideoConfigurationInput input;
    @JacksonXmlProperty(localName="Output")
    private VideoConfigurationOutput output;
    @JacksonXmlProperty(localName="Presentation")
    private VideoConfigurationPresentation presentation;
    @JacksonXmlProperty(localName="Selfview")
    private VideoConfigurationSelfview selfview;
    @JacksonXmlProperty(localName="Monitors")
    private ValueSpaceRefHolder monitors;

    /**
     * Retrieves {@code {@link #defaultMainSource}}
     *
     * @return value of {@link #defaultMainSource}
     */
    public ValueSpaceRefHolder getDefaultMainSource() {
        return defaultMainSource;
    }

    /**
     * Sets {@code defaultMainSource}
     *
     * @param defaultMainSource the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setDefaultMainSource(ValueSpaceRefHolder defaultMainSource) {
        this.defaultMainSource = defaultMainSource;
    }

    /**
     * Retrieves {@code {@link #input}}
     *
     * @return value of {@link #input}
     */
    public VideoConfigurationInput getInput() {
        return input;
    }

    /**
     * Sets {@code input}
     *
     * @param input the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationInput} field
     */
    public void setInput(VideoConfigurationInput input) {
        this.input = input;
    }

    /**
     * Retrieves {@code {@link #output}}
     *
     * @return value of {@link #output}
     */
    public VideoConfigurationOutput getOutput() {
        return output;
    }

    /**
     * Sets {@code output}
     *
     * @param output the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationOutput} field
     */
    public void setOutput(VideoConfigurationOutput output) {
        this.output = output;
    }

    /**
     * Retrieves {@code {@link #presentation}}
     *
     * @return value of {@link #presentation}
     */
    public VideoConfigurationPresentation getPresentation() {
        return presentation;
    }

    /**
     * Sets {@code presentation}
     *
     * @param presentation the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationPresentation} field
     */
    public void setPresentation(VideoConfigurationPresentation presentation) {
        this.presentation = presentation;
    }

    /**
     * Retrieves {@code {@link #selfview}}
     *
     * @return value of {@link #selfview}
     */
    public VideoConfigurationSelfview getSelfview() {
        return selfview;
    }

    /**
     * Sets {@code selfview}
     *
     * @param selfview the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfigurationSelfview} field
     */
    public void setSelfview(VideoConfigurationSelfview selfview) {
        this.selfview = selfview;
    }

    /**
     * Retrieves {@code {@link #monitors}}
     *
     * @return value of {@link #monitors}
     */
    public ValueSpaceRefHolder getMonitors() {
        return monitors;
    }

    /**
     * Sets {@code monitors}
     *
     * @param monitors the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setMonitors(ValueSpaceRefHolder monitors) {
        this.monitors = monitors;
    }
}
