/*
 * Copyright (c) 2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.peripherals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Connected peripheral device class
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
public class ConnectedDevice {
    @JacksonXmlProperty(localName="item", isAttribute = true)
    private String item;

    @JacksonXmlProperty(localName="HardwareInfo")
    private String hardwareInfo;

    @JacksonXmlProperty(localName="ID")
    private String id;

    @JacksonXmlProperty(localName="Name")
    private String name;

    @JacksonXmlProperty(localName="SerialNumber")
    private String serialNumber;

    @JacksonXmlProperty(localName="SoftwareInfo")
    private String softwareInfo;

    @JacksonXmlProperty(localName="Status")
    private String status;

    @JacksonXmlProperty(localName="Type")
    private String type;

    @JacksonXmlProperty(localName="UpgradeStatus")
    private String upgradeStatus;

    /**
     * Retrieves {@link #item}
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
     * Retrieves {@link #hardwareInfo}
     *
     * @return value of {@link #hardwareInfo}
     */
    public String getHardwareInfo() {
        return hardwareInfo;
    }

    /**
     * Sets {@code hardwareInfo}
     *
     * @param hardwareInfo the {@code java.lang.String} field
     */
    public void setHardwareInfo(String hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
    }

    /**
     * Retrieves {@link #id}
     *
     * @return value of {@link #id}
     */
    public String getId() {
        return id;
    }

    /**
     * Sets {@code id}
     *
     * @param id the {@code java.lang.String} field
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves {@link #name}
     *
     * @return value of {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets {@code name}
     *
     * @param name the {@code java.lang.String} field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves {@link #serialNumber}
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
     * Retrieves {@link #softwareInfo}
     *
     * @return value of {@link #softwareInfo}
     */
    public String getSoftwareInfo() {
        return softwareInfo;
    }

    /**
     * Sets {@code softwareInfo}
     *
     * @param softwareInfo the {@code java.lang.String} field
     */
    public void setSoftwareInfo(String softwareInfo) {
        this.softwareInfo = softwareInfo;
    }

    /**
     * Retrieves {@link #status}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@link #type}
     *
     * @return value of {@link #type}
     */
    public String getType() {
        return type;
    }

    /**
     * Sets {@code type}
     *
     * @param type the {@code java.lang.String} field
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retrieves {@link #upgradeStatus}
     *
     * @return value of {@link #upgradeStatus}
     */
    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    /**
     * Sets {@code upgradeStatus}
     *
     * @param upgradeStatus the {@code java.lang.String} field
     */
    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }
}
