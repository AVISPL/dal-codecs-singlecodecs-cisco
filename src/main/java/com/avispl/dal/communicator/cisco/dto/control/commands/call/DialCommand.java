/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call;

import javax.xml.bind.annotation.*;

/***
 * Dial command root template
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlRootElement(name = "Dial")
@XmlAccessorType(XmlAccessType.NONE)
public class DialCommand {
    @XmlAttribute
    private String command;

    @XmlElement(name = "Number")
    private String number;
    @XmlElement(name = "Protocol")
    private String protocol;

    public DialCommand(String number, String protocol) {
        this.command = "True";
        this.number = number;
        this.protocol = protocol;
    }
    public DialCommand(){}

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

    /**
     * Retrieves {@code {@link #number}}
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
     * Retrieves {@code {@link #protocol}}
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
