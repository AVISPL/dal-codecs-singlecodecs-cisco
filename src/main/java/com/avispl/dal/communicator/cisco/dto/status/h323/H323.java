/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.h323;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class H323 {
    @XmlElement(name = "Gatekeeper")
    private H323Gatekeeper gatekeeper;
    @XmlElement(name = "Mode")
    private H323Mode mode;

    public H323Gatekeeper getGatekeeper() {
        return gatekeeper;
    }

    public void setGatekeeper(H323Gatekeeper gatekeeper) {
        this.gatekeeper = gatekeeper;
    }

    public H323Mode getMode() {
        return mode;
    }

    public void setMode(H323Mode mode) {
        this.mode = mode;
    }
}
