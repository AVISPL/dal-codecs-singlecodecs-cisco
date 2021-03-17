/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({MicrophonesMuteCommand.class, VolumeChangeCommand.class})
public abstract class AudioCommand {
}
