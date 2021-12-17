package com.avispl.dal.communicator.cisco.dto.control.commands.peripherals.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Peripherals device info, retrieved by list control
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PeripheralsDevice {
    @JacksonXmlProperty(isAttribute = true)
    private int item;
    @JacksonXmlProperty(localName = "ConnectionMethod")
    private String connectionMethod;
    @JacksonXmlProperty(localName = "HardwareInfo")
    private String hardwareInfo;
    @JacksonXmlProperty(localName = "ID")
    private String ID;
    @JacksonXmlProperty(localName = "LastSeen")
    private String lastSeen;
    @JacksonXmlProperty(localName = "Name")
    private String name;
    @JacksonXmlProperty(localName = "NetworkAddress")
    private String networkAddress;
    @JacksonXmlProperty(localName = "SerialNumber")
    private String serialNumber;
    @JacksonXmlProperty(localName = "SoftwareInfo")
    private String softwareInfo;
    @JacksonXmlProperty(localName = "Type")
    private String type;

    /**
     * Retrieves {@code {@link #item}}
     *
     * @return value of {@link #item}
     */
    public int getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code int} field
     */
    public void setItem(int item) {
        this.item = item;
    }

    /**
     * Retrieves {@code {@link #connectionMethod}}
     *
     * @return value of {@link #connectionMethod}
     */
    public String getConnectionMethod() {
        return connectionMethod;
    }

    /**
     * Sets {@code connectionMethod}
     *
     * @param connectionMethod the {@code java.lang.String} field
     */
    public void setConnectionMethod(String connectionMethod) {
        this.connectionMethod = connectionMethod;
    }

    /**
     * Retrieves {@code {@link #hardwareInfo}}
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
     * Retrieves {@code {@link #ID}}
     *
     * @return value of {@link #ID}
     */
    public String getID() {
        return ID;
    }

    /**
     * Sets {@code ID}
     *
     * @param ID the {@code java.lang.String} field
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Retrieves {@code {@link #lastSeen}}
     *
     * @return value of {@link #lastSeen}
     */
    public String getLastSeen() {
        return lastSeen;
    }

    /**
     * Sets {@code lastSeen}
     *
     * @param lastSeen the {@code java.lang.String} field
     */
    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * Retrieves {@code {@link #name}}
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
     * Retrieves {@code {@link #networkAddress }}
     *
     * @return value of {@link #networkAddress}
     */
    public String getNetworkAddress() {
        return networkAddress;
    }

    /**
     * Sets {@code networkAccess}
     *
     * @param networkAddress the {@code java.lang.String} field
     */
    public void setNetworkAddress(String networkAddress) {
        this.networkAddress = networkAddress;
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
     * Retrieves {@code {@link #softwareInfo}}
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
     * Retrieves {@code {@link #type}}
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
}
