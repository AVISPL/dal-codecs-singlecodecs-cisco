/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.camera;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/***
 * Camera command a root template for the camera commands
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlRootElement(name = "Camera")
@XmlAccessorType(XmlAccessType.NONE)
public class CameraCommand {
    @XmlElement(name = "PositionSet")
    private CameraPositionSetCommand positionSetCommand;

    /**
     * Retrieves {@code {@link #positionSetCommand}}
     *
     * @return value of {@link #positionSetCommand}
     */
    public CameraPositionSetCommand getPositionSetCommand() {
        return positionSetCommand;
    }

    /**
     * Sets {@code positionSetCommand}
     *
     * @param positionSetCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.camera.CameraPositionSetCommand} field
     */
    public void setPositionSetCommand(CameraPositionSetCommand positionSetCommand) {
        this.positionSetCommand = positionSetCommand;
    }
}
