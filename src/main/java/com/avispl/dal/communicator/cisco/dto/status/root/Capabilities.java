/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.root;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Capabilities {
    @XmlElement(name = "Conference")
    private ConferenceCapabilities conferenceCapabilities;

    public ConferenceCapabilities getConferenceCapabilities() {
        return conferenceCapabilities;
    }

    public void setConferenceCapabilities(ConferenceCapabilities conferenceCapabilities) {
        this.conferenceCapabilities = conferenceCapabilities;
    }
}
