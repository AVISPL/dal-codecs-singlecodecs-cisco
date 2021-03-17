/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
public class VolumeChangeCommand extends AudioCommand {

    @XmlAccessorType(XmlAccessType.NONE)
    private static class Volume {
        @XmlElement(name = "Set")
        private SetCommand setCommand;

        public Volume(Integer level) {
            setCommand = new SetCommand(level);
        }
    }

    @XmlAccessorType(XmlAccessType.NONE)
    private static class SetCommand {
        @XmlAttribute
        private final String command = "True";
        @XmlElement(name = "Level")
        private final Integer level;

        public SetCommand(Integer level) {
            this.level = level;
        }

        public String getCommand() {
            return command;
        }

        public Integer getLevel() {
            return level;
        }
    }

    @XmlElement(name = "Volume")
    private final Volume volume;

    public VolumeChangeCommand(Integer volumeLevel) {
        this.volume = new Volume(volumeLevel);
    }

    public Volume getVolume() {
        return volume;
    }
}
