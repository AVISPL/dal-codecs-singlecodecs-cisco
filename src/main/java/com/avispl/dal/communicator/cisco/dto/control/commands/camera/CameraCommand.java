/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.camera;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/***
 * Camera command a root template for the camera commands
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JacksonXmlRootElement(localName = "Camera")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CameraCommand {
    @JacksonXmlProperty(localName="PositionSet")
    private CameraPositionSetCommand positionSetCommand;

    /**
     * Retrieves {@link #positionSetCommand}
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
