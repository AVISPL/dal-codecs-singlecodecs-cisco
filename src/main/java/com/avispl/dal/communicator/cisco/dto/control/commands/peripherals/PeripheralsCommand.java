/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.peripherals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Peripherals Command class.
 * A base abstract class for mute and volume change commands
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PeripheralsCommand {
    @JacksonXmlProperty(localName = "List")
    private ListCommand list;

    /**
     * Retrieves {@code {@link #list}}
     *
     * @return value of {@link #list}
     */
    public ListCommand getList() {
        return list;
    }

    /**
     * Sets {@code list}
     *
     * @param list the {@code com.avispl.dal.communicator.cisco.dto.control.commands.peripherals.ListCommand} field
     */
    public void setList(ListCommand list) {
        this.list = list;
    }
}
