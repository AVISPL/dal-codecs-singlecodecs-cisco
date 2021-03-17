/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class VideoInputConnector {
    @XmlElement(name = "Connected")
    private String connected;
    @XmlElement(name = "SignalState")
    private String signalState;
    @XmlElement(name = "SourceId")
    private String sourceId;
    @XmlElement(name = "Type")
    private String type;

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    public String getSignalState() {
        return signalState;
    }

    public void setSignalState(String signalState) {
        this.signalState = signalState;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
