/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * User interface configuration command type class.
 * Serves the purpose of distinguishing between the user interface config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum UserInterfaceConfigurationCommandType {
    /**WelcomeText for welcome text change commands*/
    WelcomeText,
    /**Language for language change commands*/
    Language,
    /**KeyTones for key tones mode change commands*/
    KeyTones,
    /**ContactInfoType for contact info type change commands*/
    ContactInfoType,
    /**FeaturesCallEnd for call end features change commands*/
    FeaturesCallEnd,
    /**FeaturesMidCallControls for mid call controls features commands*/
    FeaturesMidCallControls,
    /**FeaturesCallStart for call start features commands*/
    FeaturesCallStart,
    /**ShareStart for share start mode change commands*/
    ShareStart,
    /**WhiteboardStart for whiteboard start mode change commands*/
    WhiteboardStart,
    /**HideAllFeatures for hide all features commands*/
    HideAllFeatures,
    /**AwakeBrandingColors for awake branding colors change commands*/
    AwakeBrandingColors,
    /**IncomingCallNotification for incoming call notification mode change commands*/
    IncomingCallNotification,
    /**OSDOutput for osd output mode change commands*/
    OSDOutput
}
