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
/***
 * A holder for a Command templates. Being transformed to an xml command afterwards.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #dialCommand}}
     *
     * @return value of {@link #dialCommand}
     */
    public DialCommand getDialCommand() {
        return dialCommand;
    }

    /**
     * Sets {@code dialCommand}
     *
     * @param dialCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.call.DialCommand} field
     */
    public void setDialCommand(DialCommand dialCommand) {
        this.dialCommand = dialCommand;
    }

    /**
     * Retrieves {@code {@link #audioCommand}}
     *
     * @return value of {@link #audioCommand}
     */
    public AudioCommand getAudioCommand() {
        return audioCommand;
    }

    /**
     * Sets {@code audioCommand}
     *
     * @param audioCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.audio.AudioCommand} field
     */
    public void setAudioCommand(AudioCommand audioCommand) {
        this.audioCommand = audioCommand;
    }

    /**
     * Retrieves {@code {@link #callDisconnectCommand}}
     *
     * @return value of {@link #callDisconnectCommand}
     */
    public CallDisconnectCommand getCallDisconnectCommand() {
        return callDisconnectCommand;
    }

    /**
     * Sets {@code callDisconnectCommand}
     *
     * @param callDisconnectCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.call.CallDisconnectCommand} field
     */
    public void setCallDisconnectCommand(CallDisconnectCommand callDisconnectCommand) {
        this.callDisconnectCommand = callDisconnectCommand;
    }

    /**
     * Retrieves {@code {@link #cameraCommand}}
     *
     * @return value of {@link #cameraCommand}
     */
    public CameraCommand getCameraCommand() {
        return cameraCommand;
    }

    /**
     * Sets {@code cameraCommand}
     *
     * @param cameraCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.camera.CameraCommand} field
     */
    public void setCameraCommand(CameraCommand cameraCommand) {
        this.cameraCommand = cameraCommand;
    }

    /**
     * Retrieves {@code {@link #dialResult}}
     *
     * @return value of {@link #dialResult}
     */
    public DialResult getDialResult() {
        return dialResult;
    }

    /**
     * Sets {@code dialResult}
     *
     * @param dialResult the {@code com.avispl.dal.communicator.cisco.dto.control.commands.call.response.DialResult} field
     */
    public void setDialResult(DialResult dialResult) {
        this.dialResult = dialResult;
    }

    /**
     * Retrieves {@code {@link #disconnectResult}}
     *
     * @return value of {@link #disconnectResult}
     */
    public CallDisconnectResult getDisconnectResult() {
        return disconnectResult;
    }

    /**
     * Sets {@code disconnectResult}
     *
     * @param disconnectResult the {@code com.avispl.dal.communicator.cisco.dto.control.commands.call.response.CallDisconnectResult} field
     */
    public void setDisconnectResult(CallDisconnectResult disconnectResult) {
        this.disconnectResult = disconnectResult;
    }

    /**
     * Retrieves {@code {@link #userInterface}}
     *
     * @return value of {@link #userInterface}
     */
    public UserInterfaceCommand getUserInterface() {
        return userInterface;
    }

    /**
     * Sets {@code userInterface}
     *
     * @param userInterface the {@code com.avispl.dal.communicator.cisco.dto.control.commands.userinterface.UserInterfaceCommand} field
     */
    public void setUserInterface(UserInterfaceCommand userInterface) {
        this.userInterface = userInterface;
    }

    /**
     * Retrieves {@code {@link #standbyCommand}}
     *
     * @return value of {@link #standbyCommand}
     */
    public StandbyCommand getStandbyCommand() {
        return standbyCommand;
    }

    /**
     * Sets {@code standbyCommand}
     *
     * @param standbyCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.standby.StandbyCommand} field
     */
    public void setStandbyCommand(StandbyCommand standbyCommand) {
        this.standbyCommand = standbyCommand;
    }

    /**
     * Retrieves {@code {@link #systemUnitCommand}}
     *
     * @return value of {@link #systemUnitCommand}
     */
    public SystemUnitCommand getSystemUnitCommand() {
        return systemUnitCommand;
    }

    /**
     * Sets {@code systemUnitCommand}
     *
     * @param systemUnitCommand the {@code com.avispl.dal.communicator.cisco.dto.control.commands.systemunit.SystemUnitCommand} field
     */
    public void setSystemUnitCommand(SystemUnitCommand systemUnitCommand) {
        this.systemUnitCommand = systemUnitCommand;
    }
}
