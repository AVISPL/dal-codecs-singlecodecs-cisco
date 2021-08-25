/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.systemunit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/***
 * Class for SystemUnit command representation
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SystemUnitCommand {

    /***
     * Boot action represents specific action, that can be performed for the system unit.
     * There's one option at the moment, but may be more
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    public enum BootAction {
        /**Restart for restart boot action*/
        Restart
    }

    /***
     * Boot class that represents system unit action that may be performed
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */
    @XmlAccessorType(XmlAccessType.NONE)
    public static class Boot {
        @XmlAttribute
        private String command = "True";
        @XmlElement(name = "Action")
        private String action;

        /**
         * Default constructor
         * */
        public Boot(){}

        /**
         * Instantiate {@link Boot} with given {@link BootAction}
         *
         * @param action to get action name from and set it to {@link #action}
         * */
        public Boot(BootAction action) {
            this.action = action.name();
        }

        /**
         * Retrieves {@code {@link #command}}
         *
         * @return value of {@link #command}
         */
        public String getCommand() {
            return command;
        }

        /**
         * Retrieves {@code {@link #action}}
         *
         * @return value of {@link #action}
         */
        public String getAction() {
            return action;
        }
    }
    @XmlElement(name = "Boot")
    private Boot boot;
    /**
     * Default constructor
     * */
    public SystemUnitCommand() {}
    /***
     * Instantiate SystemUnitCommand with a BootAction passed
     *
     * @param action instance of {@link BootAction} to use for {@link Boot} instantiation
     */
    public SystemUnitCommand(BootAction action) {
        boot = new Boot(action);
    }

    /**
     * Retrieves {@code {@link #boot}}
     *
     * @return value of {@link #boot}
     */
    public Boot getBoot() {
        return boot;
    }
}
