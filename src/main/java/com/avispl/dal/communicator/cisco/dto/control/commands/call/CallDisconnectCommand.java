/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call;



import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/***
 * Call disconnect command template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class CallDisconnectCommand {
    private static class Disconnect {
        @JacksonXmlProperty(isAttribute = true)
        private final String command = "True";

        /**
         * Retrieves {@link #command}
         *
         * @return value of {@link #command}
         */
        public String getCommand() {
            return command;
        }
    }

    @JacksonXmlProperty(localName="Disconnect")
    private final Disconnect disconnectCommand;

    /**
     * Retrieves {@link #disconnectCommand}
     *
     * @return value of {@link #disconnectCommand}
     */
    public Disconnect getDisconnectCommand() {
        return disconnectCommand;
    }

    /**
     * Instantiate CallDisconnectCommand with a default Disconnect class instance
     * */
    public CallDisconnectCommand() {
        this.disconnectCommand = new Disconnect();
    }
}
