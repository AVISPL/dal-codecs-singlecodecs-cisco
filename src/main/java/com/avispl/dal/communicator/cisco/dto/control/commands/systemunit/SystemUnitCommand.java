/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.systemunit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class SystemUnitCommand {
    public static enum BootAction {Restart}
    @XmlAccessorType(XmlAccessType.NONE)
    public static class Boot {
        @XmlAttribute
        private String command = "True";
        @XmlElement(name = "Action")
        private String action;

        public Boot(){}
        public Boot(BootAction action) {
            this.action = action.name();
        }

        public String getCommand() { return command; }

        public String getAction() { return action; }
    }
    @XmlElement(name = "Boot")
    private Boot boot;
    public SystemUnitCommand() {}
    public SystemUnitCommand(BootAction action) {
        boot = new Boot(action);
    }

    public Boot getBoot() { return boot; }
}
