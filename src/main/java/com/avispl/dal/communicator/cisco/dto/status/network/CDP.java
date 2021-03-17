/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class CDP {
    @XmlElement(name = "Address")
    private String address;
    @XmlElement(name = "Capabilities")
    private String capabilities;
    @XmlElement(name = "DeviceId")
    private String deviceId;
    @XmlElement(name = "Duplex")
    private String duplex;
    @XmlElement(name = "Platform")
    private String platform;
    @XmlElement(name = "PortID")
    private String portId;
    @XmlElement(name = "PrimaryMgmtAddress")
    private String primaryMgmtAddress;
    @XmlElement(name = "SysName")
    private String sysName;
    @XmlElement(name = "SysObjectID")
    private String sysObjectId;
    @XmlElement(name = "VTPMgmtDomain")
    private String vtpMgmtDomain;
    @XmlElement(name = "Version")
    private String version;
    @XmlElement(name = "VoipApplianceVlanID")
    private String voipApplianceVlanId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDuplex() {
        return duplex;
    }

    public void setDuplex(String duplex) {
        this.duplex = duplex;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getPrimaryMgmtAddress() {
        return primaryMgmtAddress;
    }

    public void setPrimaryMgmtAddress(String primaryMgmtAddress) {
        this.primaryMgmtAddress = primaryMgmtAddress;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysObjectId() {
        return sysObjectId;
    }

    public void setSysObjectId(String sysObjectId) {
        this.sysObjectId = sysObjectId;
    }

    public String getVtpMgmtDomain() {
        return vtpMgmtDomain;
    }

    public void setVtpMgmtDomain(String vtpMgmtDomain) {
        this.vtpMgmtDomain = vtpMgmtDomain;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVoipApplianceVlanId() {
        return voipApplianceVlanId;
    }

    public void setVoipApplianceVlanId(String voipApplianceVlanId) {
        this.voipApplianceVlanId = voipApplianceVlanId;
    }
}
