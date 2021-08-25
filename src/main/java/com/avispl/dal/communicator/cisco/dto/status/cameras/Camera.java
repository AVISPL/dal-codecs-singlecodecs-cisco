/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device Camera status class.
 * Represents camera status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
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

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #capabilities}}
     *
     * @return value of {@link #capabilities}
     */
    public CameraCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets {@code capabilities}
     *
     * @param capabilities the {@code com.avispl.dal.communicator.cisco.dto.status.cameras.CameraCapabilities} field
     */
    public void setCapabilities(CameraCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Retrieves {@code {@link #connected}}
     *
     * @return value of {@link #connected}
     */
    public String getConnected() {
        return connected;
    }

    /**
     * Sets {@code connected}
     *
     * @param connected the {@code java.lang.String} field
     */
    public void setConnected(String connected) {
        this.connected = connected;
    }

    /**
     * Retrieves {@code {@link #flip}}
     *
     * @return value of {@link #flip}
     */
    public String getFlip() {
        return flip;
    }

    /**
     * Sets {@code flip}
     *
     * @param flip the {@code java.lang.String} field
     */
    public void setFlip(String flip) {
        this.flip = flip;
    }

    /**
     * Retrieves {@code {@link #hardwareId}}
     *
     * @return value of {@link #hardwareId}
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * Sets {@code hardwareId}
     *
     * @param hardwareId the {@code java.lang.String} field
     */
    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    /**
     * Retrieves {@code {@link #macAddress}}
     *
     * @return value of {@link #macAddress}
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets {@code macAddress}
     *
     * @param macAddress the {@code java.lang.String} field
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * Retrieves {@code {@link #manufacturer}}
     *
     * @return value of {@link #manufacturer}
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets {@code manufacturer}
     *
     * @param manufacturer the {@code java.lang.String} field
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Retrieves {@code {@link #model}}
     *
     * @return value of {@link #model}
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets {@code model}
     *
     * @param model the {@code java.lang.String} field
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves {@code {@link #position}}
     *
     * @return value of {@link #position}
     */
    public CameraPosition getPosition() {
        return position;
    }

    /**
     * Sets {@code position}
     *
     * @param position the {@code com.avispl.dal.communicator.cisco.dto.status.cameras.CameraPosition} field
     */
    public void setPosition(CameraPosition position) {
        this.position = position;
    }

    /**
     * Retrieves {@code {@link #serialNumber}}
     *
     * @return value of {@link #serialNumber}
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets {@code serialNumber}
     *
     * @param serialNumber the {@code java.lang.String} field
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Retrieves {@code {@link #softwareId}}
     *
     * @return value of {@link #softwareId}
     */
    public String getSoftwareId() {
        return softwareId;
    }

    /**
     * Sets {@code softwareId}
     *
     * @param softwareId the {@code java.lang.String} field
     */
    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
    }
}
