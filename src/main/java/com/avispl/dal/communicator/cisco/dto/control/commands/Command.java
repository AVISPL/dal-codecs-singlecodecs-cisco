/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands;

import com.avispl.dal.communicator.cisco.dto.control.commands.audio.AudioCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.call.CallDisconnectCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.call.DialCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.call.response.CallDisconnectResult;
import com.avispl.dal.communicator.cisco.dto.control.commands.call.response.DialResult;
import com.avispl.dal.communicator.cisco.dto.control.commands.camera.CameraCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.standby.StandbyCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.systemunit.SystemUnitCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.userinterface.UserInterfaceCommand;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlRootElement(name = "Command")
@XmlAccessorType(XmlAccessType.NONE)
public class Command {
    @XmlElement(name = "Dial")
    private DialCommand dialCommand;
    @XmlElement(name = "Audio")
    private AudioCommand audioCommand;
    @XmlElement(name = "Call")
    private CallDisconnectCommand callDisconnectCommand;
    @XmlElement(name = "Camera")
    private CameraCommand cameraCommand;
    @XmlElement(name = "DialResult")
    private DialResult dialResult;
    @XmlElement(name = "CallDisconnectResult")
    private CallDisconnectResult disconnectResult;
    @XmlElement(name = "UserInterface")
    private UserInterfaceCommand userInterface;
    @XmlElement(name = "Standby")
    private StandbyCommand standbyCommand;
    @XmlElement(name = "SystemUnit")
    private SystemUnitCommand systemUnitCommand;

    public DialCommand getDialCommand() {
        return dialCommand;
    }

    public void setDialCommand(DialCommand dialCommand) {
        this.dialCommand = dialCommand;
    }

    public AudioCommand getAudioCommand() {
        return audioCommand;
    }

    public void setAudioCommand(AudioCommand audioCommand) {
        this.audioCommand = audioCommand;
    }

    public CallDisconnectCommand getCallDisconnectCommand() {
        return callDisconnectCommand;
    }

    public void setCallDisconnectCommand(CallDisconnectCommand callDisconnectCommand) {
        this.callDisconnectCommand = callDisconnectCommand;
    }

    public DialResult getDialResult() {
        return dialResult;
    }

    public void setDialResult(DialResult dialResult) {
        this.dialResult = dialResult;
    }

    public CallDisconnectResult getDisconnectResult() {
        return disconnectResult;
    }

    public void setDisconnectResult(CallDisconnectResult disconnectResult) {
        this.disconnectResult = disconnectResult;
    }

    public CameraCommand getCameraCommand() {
        return cameraCommand;
    }

    public void setCameraCommand(CameraCommand cameraCommand) {
        this.cameraCommand = cameraCommand;
    }

    public UserInterfaceCommand getUserInterface() {
        return userInterface;
    }

    public void setUserInterface(UserInterfaceCommand userInterface) {
        this.userInterface = userInterface;
    }

    public StandbyCommand getStandbyCommand() {
        return standbyCommand;
    }

    public void setStandbyCommand(StandbyCommand standbyCommand) {
        this.standbyCommand = standbyCommand;
    }

    public SystemUnitCommand getSystemUnitCommand() { return systemUnitCommand; }

    public void setSystemUnitCommand(SystemUnitCommand systemUnitCommand) { this.systemUnitCommand = systemUnitCommand; }
}
