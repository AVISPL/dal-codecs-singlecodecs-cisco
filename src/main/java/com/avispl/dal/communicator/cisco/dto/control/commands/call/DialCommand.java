/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/***
 * Dial command root template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JacksonXmlRootElement(localName = "Dial")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DialCommand {
    @JacksonXmlProperty(isAttribute = true)
    private String command;

    @JacksonXmlProperty(localName="Number")
    private String number;
    @JacksonXmlProperty(localName="Protocol")
    private String protocol;

    /**
     * Instantiate DialCommand based on number and protocol
     *
     * @param number to dial
     * @param protocol to use for dial operation
     * */
    public DialCommand(String number, String protocol) {
        this.command = "True";
        this.number = number;
        this.protocol = protocol;
    }

    /**
     * Default constructor
     * */
    public DialCommand(){}

    /**
     * Retrieves {@link #command}
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

    /**
     * Retrieves {@link #number}
     *
     * @return value of {@link #number}
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets {@code number}
     *
     * @param number the {@code java.lang.String} field
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Retrieves {@link #protocol}
     *
     * @return value of {@link #protocol}
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets {@code protocol}
     *
     * @param protocol the {@code java.lang.String} field
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
