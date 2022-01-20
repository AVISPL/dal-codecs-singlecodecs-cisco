/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Peripherals profile configuration command type class.
 * Serves the purpose of distinguishing between the peripherals config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
public enum PeripheralsProfileConfigurationCommandType {
    /**CAMERA for CAMERAS profile*/
    CAMERA,
    /**CONTROL_SYSTEM for CONTROL_SYSTEMS profile*/
    CONTROL_SYSTEM,
    /**TOUCH_PANEL for TOUCH_PANELS profile*/
    TOUCH_PANEL,
    /**REMOTE_PAIRING for TOUCH_PANELS pairing options*/
    TOUCH_PANEL_REMOTE_PAIRING
}
