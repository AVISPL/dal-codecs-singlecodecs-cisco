/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;




import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class VideoInput {
    @XmlElement(name = "Connector")

    private VideoInputConnector[] connectors;
    @XmlElement(name = "MainVideoSource")
    private String mainVideoSource;
    @XmlElement(name = "Source")

    private VideoInputSource[] sources;

    public VideoInputConnector[] getConnectors() {
        return connectors;
    }

    public void setConnectors(VideoInputConnector[] connectors) {
        this.connectors = connectors;
    }

    public String getMainVideoSource() {
        return mainVideoSource;
    }

    public void setMainVideoSource(String mainVideoSource) {
        this.mainVideoSource = mainVideoSource;
    }

    public VideoInputSource[] getSources() {
        return sources;
    }

    public void setSources(VideoInputSource[] sources) {
        this.sources = sources;
    }
}
