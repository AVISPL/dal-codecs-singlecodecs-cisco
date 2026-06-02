/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.control.commands.systemunit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/***
 * Class for SystemUnit command representation
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    public static class Boot {
        @JacksonXmlProperty(isAttribute = true)
        private String command = "True";
        @JacksonXmlProperty(localName="Action")
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
         * Retrieves {@link #command}
         *
         * @return value of {@link #command}
         */
        public String getCommand() {
            return command;
        }

        /**
         * Retrieves {@link #action}
         *
         * @return value of {@link #action}
         */
        public String getAction() {
            return action;
        }
    }

    public static class SoftwareUpgrade {
        @JacksonXmlProperty(isAttribute = true)
        private String command = "True";
        @JacksonXmlProperty(localName="URL")
        private String url;

        public SoftwareUpgrade(){}
        public SoftwareUpgrade(String url) {
            this.url = url;
        }
        public String getCommand() {
            return command;
        }
        public String getURL() {
            return url;
        }
    }
    @JacksonXmlProperty(localName="SoftwareUpgrade")
    private SoftwareUpgrade softwareUpgrade;

    @JacksonXmlProperty(localName="Boot")
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

    public SystemUnitCommand(String url) {
        softwareUpgrade = new SoftwareUpgrade(url);
    }

    /**
     * Retrieves {@link #boot}
     *
     * @return value of {@link #boot}
     */
    public Boot getBoot() {
        return boot;
    }

    /**
     * Retrieves {@link #softwareUpgrade}
     *
     * @return value of {@link #softwareUpgrade}
     */
    public SoftwareUpgrade getSoftwareUpgrade() {
        return softwareUpgrade;
    }
}
