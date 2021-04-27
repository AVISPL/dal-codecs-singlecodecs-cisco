/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import javax.xml.bind.annotation.*;

/***
 * Volume change command template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VolumeChangeCommand extends AudioCommand {

    /***
     * Volume set action template
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    @XmlAccessorType(XmlAccessType.NONE)
    private static class Volume {
        @XmlElement(name = "Set")
        private SetCommand setCommand;

        public Volume(Integer level) {
            setCommand = new SetCommand(level);
        }
    }

    /***
     * Set command template, contains command-specific values
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    @XmlAccessorType(XmlAccessType.NONE)
    private static class SetCommand {
        @XmlAttribute
        private final String command = "True";
        @XmlElement(name = "Level")
        private final Integer level;

        public SetCommand(Integer level) {
            this.level = level;
        }

        /**
         * Retrieves {@code {@link #command}}
         *
         * @return value of {@link #command}
         */
        public String getCommand() {
            return command;
        }

        /**
         * Retrieves {@code {@link #level}}
         *
         * @return value of {@link #level}
         */
        public Integer getLevel() {
            return level;
        }
    }

    @XmlElement(name = "Volume")
    private final Volume volume;

    public VolumeChangeCommand(Integer volumeLevel) {
        this.volume = new Volume(volumeLevel);
    }

    /**
     * Retrieves {@code {@link #volume}}
     *
     * @return value of {@link #volume}
     */
    public Volume getVolume() {
        return volume;
    }
}
