/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.userinterface;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class UserInterfaceConfiguration {
    @XmlElement(name = "ContactInfo")
    private UserInterfaceConfigurationContactInfo contactInfo;
    @XmlElement(name = "KeyTones")
    private UserInterfaceConfigurationKeyTones keyTones;
    @XmlElement(name = "Language")
    private ValueSpaceRefHolder language;
    @XmlElement(name = "WelcomeText")
    private ValueSpaceRefHolder welcomeText;
    @XmlElement(name = "OSD")
    private UserInterfaceConfigurationOSD osd;
    @XmlElement(name = "Features")
    private UserInterfaceConfigurationFeatures features;
    @XmlElement(name = "Branding")
    private UserInterfaceConfigurationBranding branding;
    @XmlElement(name = "Accessibility")
    private UserInterfaceConfigurationAccessibility accessibility;

    public UserInterfaceConfigurationContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(UserInterfaceConfigurationContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public UserInterfaceConfigurationKeyTones getKeyTones() {
        return keyTones;
    }

    public void setKeyTones(UserInterfaceConfigurationKeyTones keyTones) {
        this.keyTones = keyTones;
    }

    public ValueSpaceRefHolder getLanguage() {
        return language;
    }

    public void setLanguage(ValueSpaceRefHolder language) {
        this.language = language;
    }

    public UserInterfaceConfigurationOSD getOsd() {
        return osd;
    }

    public void setOsd(UserInterfaceConfigurationOSD osd) {
        this.osd = osd;
    }

    public ValueSpaceRefHolder getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(ValueSpaceRefHolder welcomeText) {
        this.welcomeText = welcomeText;
    }

    public UserInterfaceConfigurationFeatures getFeatures() {
        return features;
    }

    public void setFeatures(UserInterfaceConfigurationFeatures features) {
        this.features = features;
    }

    public UserInterfaceConfigurationBranding getBranding() {
        return branding;
    }

    public void setBranding(UserInterfaceConfigurationBranding branding) {
        this.branding = branding;
    }

    public UserInterfaceConfigurationAccessibility getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(UserInterfaceConfigurationAccessibility accessibility) {
        this.accessibility = accessibility;
    }
}
