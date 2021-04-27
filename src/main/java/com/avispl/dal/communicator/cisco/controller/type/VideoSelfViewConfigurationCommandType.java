/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Video selfview configuration command type class.
 * Serves the purpose of distinguishing between the video selfview config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum VideoSelfViewConfigurationCommandType {
    /**DefaultFullscreenMode for default selfview fullscreen mode change commands*/
    DefaultFullscreenMode,
    /**DefaultMode for default selfview mode change commands*/
    DefaultMode,
    /**DefaultOnMonitorRole for default selfview on monitor role change commands*/
    DefaultOnMonitorRole,
    /**DefaultPIPPosition for default selfview pip position change commands*/
    DefaultPIPPosition,
    /**OnCallDuration for on call duration change commands*/
    OnCallDuration,
    /**OnCallMode for on call mode change commands*/
    OnCallMode
}
