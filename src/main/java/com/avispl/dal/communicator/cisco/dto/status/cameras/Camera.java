/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Camera {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "Capabilities")
    private CameraCapabilities capabilities;
    @XmlElement(name = "Connected")
    private String connected;
    @XmlElement(name = "Flip")
    private String flip;
    @XmlElement(name = "HardwareID")
    private String hardwareId;
    @XmlElement(name = "MacAddress")
    private String macAddress;
    @XmlElement(name = "Manufacturer")
    private String manufacturer;
    @XmlElement(name = "Model")
    private String model;
    @XmlElement(name = "Position")
    private CameraPosition position;
    @XmlElement(name = "SerialNumber")
    private String serialNumber;
    @XmlElement(name = "SoftwareID")
    private String softwareId;

    public CameraCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(CameraCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    public String getFlip() {
        return flip;
    }

    public void setFlip(String flip) {
        this.flip = flip;
    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CameraPosition getPosition() {
        return position;
    }

    public void setPosition(CameraPosition position) {
        this.position = position;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
