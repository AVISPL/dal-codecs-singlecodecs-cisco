/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller.type;

/**
 * Network services configuration command type class.
 * Serves the purpose of distinguishing between the network services config command types, to have the right
 * instance of the payload built for a specific control command.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum NetworkServicesConfigurationCommandType {
    /**H323Mode for h323 mode change commands*/
    H323Mode,
    /**SIPMode for sip mode change commands*/
    SIPMode,
    /**TelnetMode for telnet mode change commands*/
    TelnetMode,
    /**SSHMode for ssh mode change commands*/
    SSHMode,
    /**CDPMode for cdp mode change commands*/
    CDPMode,
    /**UPnPMode for upnp mode change commands*/
    UPnPMode,
    /**NTPMode for ntp mode change commands*/
    NTPMode,
    /**WelcomeText for welcome text change commands*/
    WelcomeText
}
