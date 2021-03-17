/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.camera;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "Camera")
@XmlAccessorType(XmlAccessType.NONE)
public class CameraCommand {
    @XmlElement(name = "PositionSet")
    private CameraPositionSetCommand positionSetCommand;

    public CameraPositionSetCommand getPositionSetCommand() {
        return positionSetCommand;
    }

    public void setPositionSetCommand(CameraPositionSetCommand positionSetCommand) {
        this.positionSetCommand = positionSetCommand;
    }

}
