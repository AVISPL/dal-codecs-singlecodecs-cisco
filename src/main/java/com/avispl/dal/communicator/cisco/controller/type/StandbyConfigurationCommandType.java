/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Standby configuration command type class.
 * Serves the purpose of distinguishing between the standby config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum StandbyConfigurationCommandType {
    /**BootAction for boot action change commands*/
    BootAction,
    /**Control for standby control mode change commands*/
    Control,
    /**Delay for standby delay change commands*/
    Delay,
    /**StandbyAction for standby action change commands*/
    StandbyAction,
    /**WakeupAction for wakeup action change commands*/
    WakeupAction
}
