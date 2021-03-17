/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.network;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class NetworkConfigurationQoS {
    @XmlElement(name = "Diffserv")
    private NetworkConfigurationDiffserv diffserv;
    @XmlElement(name = "Mode")
    private ValueSpaceRefHolder mode;

    public NetworkConfigurationDiffserv getDiffserv() {
        return diffserv;
    }

    public void setDiffserv(NetworkConfigurationDiffserv diffserv) {
        this.diffserv = diffserv;
    }

    public ValueSpaceRefHolder getMode() {
        return mode;
    }

    public void setMode(ValueSpaceRefHolder mode) {
        this.mode = mode;
    }
}
