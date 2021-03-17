/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.video;




import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class VideoConfigurationInput {
    @XmlElement(name = "Connector")

    private VideoConfigurationConnector[] connectors;

    public VideoConfigurationConnector[] getConnectors() {
        return connectors;
    }

    public void setConnectors(VideoConfigurationConnector[] connectors) {
        this.connectors = connectors;
    }
}
