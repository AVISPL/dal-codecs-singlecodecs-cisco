/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.cameras;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Camera status class.
 * Represents camera status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Camera {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="Capabilities")
    private CameraCapabilities capabilities;
    @JacksonXmlProperty(localName="Connected")
    private String connected;
    @JacksonXmlProperty(localName="Flip")
    private String flip;
    @JacksonXmlProperty(localName="HardwareID")
    private String hardwareId;
    @JacksonXmlProperty(localName="MacAddress")
    private String macAddress;
    @JacksonXmlProperty(localName="Manufacturer")
    private String manufacturer;
    @JacksonXmlProperty(localName="Model")
    private String model;
    @JacksonXmlProperty(localName="Position")
    private CameraPosition position;
    @JacksonXmlProperty(localName="SerialNumber")
    private String serialNumber;
    @JacksonXmlProperty(localName="SoftwareID")
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
