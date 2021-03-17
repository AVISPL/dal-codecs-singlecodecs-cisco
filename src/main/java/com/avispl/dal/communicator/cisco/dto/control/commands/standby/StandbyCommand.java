/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.standby;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class StandbyCommand {
    public static class Activate {
        @XmlAttribute
        private final String command = "True";

        public String getCommand() {
            return command;
        }
    }
    public static class Deactivate {
        @XmlAttribute
        private final String command = "True";

        public String getCommand() {
            return command;
        }
    }
    @XmlElement(name = "Activate")
    private Activate activate;
    @XmlElement(name = "Deactivate")
    private Deactivate deactivate;

    public StandbyCommand(Activate activate) {
        this.activate = activate;
    }

    public StandbyCommand(Deactivate deactivate) {
        this.deactivate = deactivate;
    }

    public Activate getActivate() {
        return activate;
    }

    public void setActivate(Activate activate) {
        this.activate = activate;
    }

    public Deactivate getDeactivate() {
        return deactivate;
    }

    public void setDeactivate(Deactivate deactivate) {
        this.deactivate = deactivate;
    }
}
