/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/***
 * Volume change command template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VolumeChangeCommand extends AudioCommand {

    /***
     * Volume set action template
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */

    private static class Volume {
        @JacksonXmlProperty(localName="Set")
        private SetCommand setCommand;

        /**
         * Instantiate Volume command based on a given volume level value
         *
         * @param level indicating volume level 0-100
         * */
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

    private static class SetCommand {
        @JacksonXmlProperty(isAttribute = true)
        private final String command = "True";
        @JacksonXmlProperty(localName="Level")
        private final Integer level;

        /**
         * Instantiate SetCommand with a level value
         *
         * @param level to set as a value for a command (may be something else, but currently it's only volume level)
         * */
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

    @JacksonXmlProperty(localName="Volume")
    private final Volume volume;

    /**
     * Instantiate VolumeChangeCommand based on given volume value
     *
     * @param volumeLevel volume to set 0-100
     * */
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
