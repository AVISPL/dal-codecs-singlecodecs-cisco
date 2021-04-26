/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import javax.xml.bind.annotation.*;

/**
 * Microphone Mute command class.
 * This class is responsible for generating Mute/Unmute commands
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Audio")
public class MicrophonesMuteCommand extends AudioCommand {
    private static class Microphones {
        @XmlElement(name = "Mute")
        private MicrophonesMute mute;
        @XmlElement(name = "Unmute")
        private MicrophonesUnmute unmute;

        /**
         * If mute value is true = MicrophoneMute command is generated, otherwise - MicrophoneUnmute
         *
         * @param mute indicating the operation direction
         */
        public Microphones(Boolean mute) {
            if (mute) {
                this.mute = new MicrophonesMute();
            } else {
                this.unmute = new MicrophonesUnmute();
            }
        }
    }

    /**
     * Mute Command class. An inner command instance, indicating that the specific command should be processed
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    private static class MuteCommand {
        @XmlAttribute(name = "command")
        protected String command = "True";

        public String getCommand() {
            return command;
        }

    }

    /**
     * A blank Microphone Mute command
     * Its purpose - generating xml node with a proper name
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    public static class MicrophonesMute extends MuteCommand { }


    /**
     * A blank Microphone Unmute command
     * Its purpose - generating xml node with a proper name
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    public static class MicrophonesUnmute extends MuteCommand { }

    @XmlElement(name = "Microphones")
    private Microphones microphones;

    public MicrophonesMuteCommand() { }
    public MicrophonesMuteCommand(boolean mute) {
        this.microphones = new Microphones(mute);
    }

    /**
     * Retrieves {@code {@link #microphones}}
     *
     * @return value of {@link #microphones}
     */
    public Microphones getMicrophones() {
        return microphones;
    }

    /**
     * Sets {@code microphones}
     *
     * @param microphones the {@code com.avispl.dal.communicator.cisco.dto.control.commands.audio.MicrophonesMuteCommand.Microphones} field
     */
    public void setMicrophones(Microphones microphones) {
        this.microphones = microphones;
    }
}
