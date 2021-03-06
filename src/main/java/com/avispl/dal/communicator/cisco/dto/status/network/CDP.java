/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.network;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device CDP status class
 * Represents CDP node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #address}}
     *
     * @return value of {@link #address}
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code java.lang.String} field
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves {@code {@link #capabilities}}
     *
     * @return value of {@link #capabilities}
     */
    public String getCapabilities() {
        return capabilities;
    }

    /**
     * Sets {@code capabilities}
     *
     * @param capabilities the {@code java.lang.String} field
     */
    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Retrieves {@code {@link #deviceId}}
     *
     * @return value of {@link #deviceId}
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets {@code deviceId}
     *
     * @param deviceId the {@code java.lang.String} field
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Retrieves {@code {@link #duplex}}
     *
     * @return value of {@link #duplex}
     */
    public String getDuplex() {
        return duplex;
    }

    /**
     * Sets {@code duplex}
     *
     * @param duplex the {@code java.lang.String} field
     */
    public void setDuplex(String duplex) {
        this.duplex = duplex;
    }

    /**
     * Retrieves {@code {@link #platform}}
     *
     * @return value of {@link #platform}
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets {@code platform}
     *
     * @param platform the {@code java.lang.String} field
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Retrieves {@code {@link #portId}}
     *
     * @return value of {@link #portId}
     */
    public String getPortId() {
        return portId;
    }

    /**
     * Sets {@code portId}
     *
     * @param portId the {@code java.lang.String} field
     */
    public void setPortId(String portId) {
        this.portId = portId;
    }

    /**
     * Retrieves {@code {@link #primaryMgmtAddress}}
     *
     * @return value of {@link #primaryMgmtAddress}
     */
    public String getPrimaryMgmtAddress() {
        return primaryMgmtAddress;
    }

    /**
     * Sets {@code primaryMgmtAddress}
     *
     * @param primaryMgmtAddress the {@code java.lang.String} field
     */
    public void setPrimaryMgmtAddress(String primaryMgmtAddress) {
        this.primaryMgmtAddress = primaryMgmtAddress;
    }

    /**
     * Retrieves {@code {@link #sysName}}
     *
     * @return value of {@link #sysName}
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * Sets {@code sysName}
     *
     * @param sysName the {@code java.lang.String} field
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * Retrieves {@code {@link #sysObjectId}}
     *
     * @return value of {@link #sysObjectId}
     */
    public String getSysObjectId() {
        return sysObjectId;
    }

    /**
     * Sets {@code sysObjectId}
     *
     * @param sysObjectId the {@code java.lang.String} field
     */
    public void setSysObjectId(String sysObjectId) {
        this.sysObjectId = sysObjectId;
    }

    /**
     * Retrieves {@code {@link #vtpMgmtDomain}}
     *
     * @return value of {@link #vtpMgmtDomain}
     */
    public String getVtpMgmtDomain() {
        return vtpMgmtDomain;
    }

    /**
     * Sets {@code vtpMgmtDomain}
     *
     * @param vtpMgmtDomain the {@code java.lang.String} field
     */
    public void setVtpMgmtDomain(String vtpMgmtDomain) {
        this.vtpMgmtDomain = vtpMgmtDomain;
    }

    /**
     * Retrieves {@code {@link #version}}
     *
     * @return value of {@link #version}
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets {@code version}
     *
     * @param version the {@code java.lang.String} field
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Retrieves {@code {@link #voipApplianceVlanId}}
     *
     * @return value of {@link #voipApplianceVlanId}
     */
    public String getVoipApplianceVlanId() {
        return voipApplianceVlanId;
    }

    /**
     * Sets {@code voipApplianceVlanId}
     *
     * @param voipApplianceVlanId the {@code java.lang.String} field
     */
    public void setVoipApplianceVlanId(String voipApplianceVlanId) {
        this.voipApplianceVlanId = voipApplianceVlanId;
    }
}
