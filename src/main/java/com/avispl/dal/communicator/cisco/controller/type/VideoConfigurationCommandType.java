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
    DefaultMainSource, DefaultPresentationSource, Monitors, Type, Visibility, PresentationSelection, Quality, CECMode, MonitorRole,
    OverscanLevel, Resolution
}
