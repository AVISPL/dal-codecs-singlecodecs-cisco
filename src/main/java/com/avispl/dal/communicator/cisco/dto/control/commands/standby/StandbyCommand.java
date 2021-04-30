/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.standby;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/***
 * Standby command is a root template for any standby related commands
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class StandbyCommand {
    /***
     * Standby activate command
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    public static class Activate {
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

    /***
     * Standby deactivate command
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    public static class Deactivate {
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
    @XmlElement(name = "Activate")
    private Activate activate;
    @XmlElement(name = "Deactivate")
    private Deactivate deactivate;

    /**
     * Instantiate standby command with Activate action
     *
     * @param activate instance of {@link Activate} class
     * */
    public StandbyCommand(Activate activate) {
        this.activate = activate;
    }

    /**
     * Instantiate standby command with Deactivate action
     *
     * @param deactivate instance of {@link Deactivate} class
     * */
    public StandbyCommand(Deactivate deactivate) {
        this.deactivate = deactivate;
    }

    /**
     * Retrieves {@code {@link #activate}}
     *
     * @return value of {@link #activate}
     */
    public Activate getActivate() {
        return activate;
    }

    /**
     * Sets {@code activate}
     *
     * @param activate the {@code com.avispl.dal.communicator.cisco.dto.control.commands.standby.StandbyCommand.Activate} field
     */
    public void setActivate(Activate activate) {
        this.activate = activate;
    }

    /**
     * Retrieves {@code {@link #deactivate}}
     *
     * @return value of {@link #deactivate}
     */
    public Deactivate getDeactivate() {
        return deactivate;
    }

    /**
     * Sets {@code deactivate}
     *
     * @param deactivate the {@code com.avispl.dal.communicator.cisco.dto.control.commands.standby.StandbyCommand.Deactivate} field
     */
    public void setDeactivate(Deactivate deactivate) {
        this.deactivate = deactivate;
    }
}
