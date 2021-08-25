/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Video configuration command type class.
 * Serves the purpose of distinguishing between the video config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum VideoConfigurationCommandType {
    /**DefaultMainSource for video default main source change commands*/
    DefaultMainSource,
    /**DefaultPresentationSource for video default presentation source change commands*/
    DefaultPresentationSource,
    /**Monitors for monitors selection commands*/
    Monitors,
    /**Type for video configuration type change commands*/
    Type,
    /**Visibility for video configuration visibility commands*/
    Visibility,
    /**PresentationSelection for video configuration presentation selection commands*/
    PresentationSelection,
    /**Quality for video quality change commands*/
    Quality,
    /**CECMode for cec mode change commands*/
    CECMode,
    /**MonitorRole for monitor role change commands*/
    MonitorRole,
    /**OverscanLevel for overscan level change commands*/
    OverscanLevel,
    /**Resolution for resolution change commands*/
    Resolution
}
