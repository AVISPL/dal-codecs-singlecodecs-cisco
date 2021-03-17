/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class SoftwareOptionKeys {
    @XmlElement(name = "Encryption")
    private String encryption;
    @XmlElement(name = "MultiSite")
    private String multiSite;
    @XmlElement(name = "RemoteMonitoring")
    private String remoteMonitoring;

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public String getMultiSite() {
        return multiSite;
    }

    public void setMultiSite(String multiSite) {
        this.multiSite = multiSite;
    }

    public String getRemoteMonitoring() {
        return remoteMonitoring;
    }

    public void setRemoteMonitoring(String remoteMonitoring) {
        this.remoteMonitoring = remoteMonitoring;
    }
}
