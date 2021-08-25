/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Camera configuration command type class.
 * Serves the purpose of distinguishing between the camera config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum CameraConfigurationCommandType {
    /**CameraFlip for on/off camera flip commands*/
    CameraFlip,
    /**CameraIrSensor for on/off ir sensor commands*/
    CameraIrSensor,
    /**CameraMirror for on/off camera mirroring commands*/
    CameraMirror,
    /**CameraWhitebalanceLevel for camera whitebalance level change commands*/
    CameraWhitebalanceLevel,
    /**CameraWhitebalanceMode for camera whitebalance mode change commands*/
    CameraWhitebalanceMode,
    /**CameraGammaLevel for camera gamma level change commands*/
    CameraGammaLevel,
    /**CameraGammaMode for camera gamma mode change commands*/
    CameraGammaMode,
    /**CameraFocusMode for camera focus mode change commands*/
    CameraFocusMode,
    /**CameraBrightnessDefaultLevel for camera default brightness level change commands*/
    CameraBrightnessDefaultLevel,
    /**CameraBrightnessMode for camera brightness mode change*/
    CameraBrightnessMode,
    /**CameraBacklightDefaultMode for on/off camera backlide commands*/
    CameraBacklightDefaultMode,
    /**TriggerAutofocusPreset for autofocus preset change commands*/
    TriggerAutofocusPreset
}
