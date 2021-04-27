/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call;



import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/***
 * Call disconnect command template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CallDisconnectCommand {
    private static class Disconnect {
        @XmlAttribute
        private final String command = "True";

        /**
         * Retrieves {@code {@link #command}}
         *
         * @return value of {@link #command}
         */
        public String getCommand() {
            return command;
        }
    }

    @XmlElement(name = "Disconnect")
    private final Disconnect disconnectCommand;

    /**
     * Retrieves {@code {@link #disconnectCommand}}
     *
     * @return value of {@link #disconnectCommand}
     */
    public Disconnect getDisconnectCommand() {
        return disconnectCommand;
    }

    public CallDisconnectCommand() {
        this.disconnectCommand = new Disconnect();
    }
}
