/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device User Interface Configuration class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInterfaceConfiguration {
    @JacksonXmlProperty(localName="ContactInfo")
    private UserInterfaceConfigurationContactInfo contactInfo;
    @JacksonXmlProperty(localName="KeyTones")
    private UserInterfaceConfigurationKeyTones keyTones;
    @JacksonXmlProperty(localName="Language")
    private ValueSpaceRefHolder language;
    @JacksonXmlProperty(localName="WelcomeText")
    private ValueSpaceRefHolder welcomeText;
    @JacksonXmlProperty(localName="OSD")
    private UserInterfaceConfigurationOSD osd;
    @JacksonXmlProperty(localName="Features")
    private UserInterfaceConfigurationFeatures features;
    @JacksonXmlProperty(localName="Branding")
    private UserInterfaceConfigurationBranding branding;
    @JacksonXmlProperty(localName="Accessibility")
    private UserInterfaceConfigurationAccessibility accessibility;

    /**
     * Retrieves {@code {@link #contactInfo}}
     *
     * @return value of {@link #contactInfo}
     */
    public UserInterfaceConfigurationContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets {@code contactInfo}
     *
     * @param contactInfo the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationContactInfo} field
     */
    public void setContactInfo(UserInterfaceConfigurationContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * Retrieves {@code {@link #keyTones}}
     *
     * @return value of {@link #keyTones}
     */
    public UserInterfaceConfigurationKeyTones getKeyTones() {
        return keyTones;
    }

    /**
     * Sets {@code keyTones}
     *
     * @param keyTones the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationKeyTones} field
     */
    public void setKeyTones(UserInterfaceConfigurationKeyTones keyTones) {
        this.keyTones = keyTones;
    }

    /**
     * Retrieves {@code {@link #language}}
     *
     * @return value of {@link #language}
     */
    public ValueSpaceRefHolder getLanguage() {
        return language;
    }

    /**
     * Sets {@code language}
     *
     * @param language the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setLanguage(ValueSpaceRefHolder language) {
        this.language = language;
    }

    /**
     * Retrieves {@code {@link #welcomeText}}
     *
     * @return value of {@link #welcomeText}
     */
    public ValueSpaceRefHolder getWelcomeText() {
        return welcomeText;
    }

    /**
     * Sets {@code welcomeText}
     *
     * @param welcomeText the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setWelcomeText(ValueSpaceRefHolder welcomeText) {
        this.welcomeText = welcomeText;
    }

    /**
     * Retrieves {@code {@link #osd}}
     *
     * @return value of {@link #osd}
     */
    public UserInterfaceConfigurationOSD getOsd() {
        return osd;
    }

    /**
     * Sets {@code osd}
     *
     * @param osd the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationOSD} field
     */
    public void setOsd(UserInterfaceConfigurationOSD osd) {
        this.osd = osd;
    }

    /**
     * Retrieves {@code {@link #features}}
     *
     * @return value of {@link #features}
     */
    public UserInterfaceConfigurationFeatures getFeatures() {
        return features;
    }

    /**
     * Sets {@code features}
     *
     * @param features the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationFeatures} field
     */
    public void setFeatures(UserInterfaceConfigurationFeatures features) {
        this.features = features;
    }

    /**
     * Retrieves {@code {@link #branding}}
     *
     * @return value of {@link #branding}
     */
    public UserInterfaceConfigurationBranding getBranding() {
        return branding;
    }

    /**
     * Sets {@code branding}
     *
     * @param branding the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationBranding} field
     */
    public void setBranding(UserInterfaceConfigurationBranding branding) {
        this.branding = branding;
    }

    /**
     * Retrieves {@code {@link #accessibility}}
     *
     * @return value of {@link #accessibility}
     */
    public UserInterfaceConfigurationAccessibility getAccessibility() {
        return accessibility;
    }

    /**
     * Sets {@code accessibility}
     *
     * @param accessibility the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfigurationAccessibility} field
     */
    public void setAccessibility(UserInterfaceConfigurationAccessibility accessibility) {
        this.accessibility = accessibility;
    }
}
