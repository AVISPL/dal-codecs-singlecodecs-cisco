/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.peripherals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * List command for Peripheral devices data retrieval
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
public class ListCommand {
    @JacksonXmlProperty(isAttribute = true)
    private String command = "True";

    /**
     * Retrieves {@code {@link #command}}
     *
     * @return value of {@link #command}
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets {@code command}
     *
     * @param command the {@code java.lang.String} field
     */
    public void setCommand(String command) {
        this.command = command;
    }
}
