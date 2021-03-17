/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.audio;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Audio")
public class MicrophonesMuteCommand extends AudioCommand {
    private static class Microphones {
        @XmlElement(name = "Mute")
        private MicrophonesMute mute;
        @XmlElement(name = "Unmute")
        private MicrophonesUnmute unmute;

        public Microphones(Boolean mute) {
            if (mute) {
                this.mute = new MicrophonesMute();
            } else {
                this.unmute = new MicrophonesUnmute();
            }
        }
    }

    private static class MuteCommand {
        @XmlAttribute(name = "command")
        protected String command = "True";

        public String getCommand() {
            return command;
        }

    }
    public static class MicrophonesMute extends MuteCommand { }
    public static class MicrophonesUnmute extends MuteCommand { }

    @XmlElement(name = "Microphones")
    private Microphones microphones;

    public MicrophonesMuteCommand() { }
    public MicrophonesMuteCommand(boolean mute) {
        this.microphones = new Microphones(mute);
    }

    public Microphones getMicrophones() {
        return microphones;
    }
    public void setMicrophones(Microphones microphones) { this.microphones = microphones; }
}
