/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Audio configuration command type class.
 * Serves the purpose of distinguishing between the audio config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum AudioConfigurationCommandType {
    /**MicrophoneMode for microphome mode commands*/
    MicrophoneMode,
    /**MaxUltrasoundVolume for maximum ultrasound volume for people presence detector*/
    MaxUltrasoundVolume
}
