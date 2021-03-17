/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.call;

import javax.xml.bind.annotation.*;

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

    public String getCommand() {
        return command;
    }

    public String getNumber() {
        return number;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setCommand(String command) { this.command = command; }

    public void setNumber(String number) { this.number = number; }

    public void setProtocol(String protocol) { this.protocol = protocol; }
}
