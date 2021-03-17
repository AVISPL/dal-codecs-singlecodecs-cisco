/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;




import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class VideoOutput {
    @XmlElement(name = "Connector")

    private VideoOutputConnector[] connectors;

    public VideoOutputConnector[] getConnectors() {
        return connectors;
    }

    public void setConnectors(VideoOutputConnector[] connectors) {
        this.connectors = connectors;
    }
}
