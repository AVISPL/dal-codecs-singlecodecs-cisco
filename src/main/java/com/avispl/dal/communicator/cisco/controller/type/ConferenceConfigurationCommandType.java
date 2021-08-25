/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Conference configuration command type class.
 * Serves the purpose of distinguishing between the conference config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum ConferenceConfigurationCommandType {
    /**AutoAnswerDelay for auto answer delay change command*/
    AutoAnswerDelay,
    /**AutoAnswerMode for auto answer mode change commands*/
    AutoAnswerMode,
    /**AutoAnswerMute for auto answer mute mode change commands*/
    AutoAnswerMute,
    /**DefaultCallProtocol for default call protocol change commands*/
    DefaultCallProtocol,
    /**DefaultCallRate for default call rate change commands*/
    DefaultCallRate,
    /**DoNotDisturbTimeout for do not disturb timeout change commands*/
    DoNotDisturbTimeout,
    /**EncryptionMode for encryption mode change commands*/
    EncryptionMode,
    /**FarEndControl for far end control change commands*/
    FarEndControl}
