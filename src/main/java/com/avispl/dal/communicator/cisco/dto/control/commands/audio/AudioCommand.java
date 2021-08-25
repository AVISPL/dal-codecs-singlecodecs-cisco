/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Audio Command class.
 * A base abstract class for mute and volume change commands
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlSeeAlso({MicrophonesMuteCommand.class, VolumeChangeCommand.class})
public abstract class AudioCommand {
}
