/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration;

import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.h323.H323Configuration;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.networkport.NetworkPortConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.peripherals.PeripheralsConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.phonebook.PhonebookConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.provisioning.ProvisioningConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.roomanalytics.RoomAnalyticsConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.serialport.SerialPortConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.sip.SIPConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.standby.StandbyConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.systemunit.SystemUnitConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.time.TimeConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Device Configuration class. This is a root class for all the device configuration.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JacksonXmlRootElement(localName = "Configuration")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CiscoConfiguration {
    @JacksonXmlProperty(isAttribute = true, localName = "product")
    private String product;
    @JacksonXmlProperty(isAttribute = true, localName="version")
    private String version;
    @JacksonXmlProperty(isAttribute = true, localName="apiVersion")
    private String apiVersion;
    @JacksonXmlProperty(localName="Audio")
    private AudioConfiguration audio;
    @JacksonXmlProperty(localName="Conference")
    private ConferenceConfiguration conference;
    @JacksonXmlProperty(localName="Cameras")
    private CamerasConfiguration cameras;
    @JacksonXmlProperty(localName="H323")
    private H323Configuration h323;
    @JacksonXmlProperty(localName="Network")
    @JacksonXmlElementWrapper(useWrapping = false)
    private NetworkConfiguration[] network;
    @JacksonXmlProperty(localName="NetworkServices")
    private NetworkServicesConfiguration networkServices;
    @JacksonXmlProperty(localName="Peripherals")
    private PeripheralsConfiguration peripherals;
    @JacksonXmlProperty(localName="Phonebook")
    private PhonebookConfiguration phonebook;
    @JacksonXmlProperty(localName="Provisioning")
    private ProvisioningConfiguration provisioning;
    @JacksonXmlProperty(localName="Proximity")
    private ProximityConfiguration proximity;
    @JacksonXmlProperty(localName="RoomAnalytics")
    private RoomAnalyticsConfiguration roomAnalytics;
    @JacksonXmlProperty(localName="SIP")
    private SIPConfiguration sip;
    @JacksonXmlProperty(localName="SerialPort")
    private SerialPortConfiguration serialPort;
    @JacksonXmlProperty(localName="Standby")
    private StandbyConfiguration standby;
    @JacksonXmlProperty(localName="SystemUnit")
    private SystemUnitConfiguration systemUnit;
    @JacksonXmlProperty(localName="Time")
    private TimeConfiguration time;
    @JacksonXmlProperty(localName="UserInterface")
    private UserInterfaceConfiguration userInterface;
    @JacksonXmlProperty(localName="Video")
    private VideoConfiguration video;
    @JacksonXmlProperty(localName="NetworkPort")
    @JacksonXmlElementWrapper(useWrapping = false)
    private NetworkPortConfiguration[] networkPorts;

    /**
     * Retrieves {@link #product}
     *
     * @return value of {@link #product}
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets {@code product}
     *
     * @param product the {@code java.lang.String} field
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Retrieves {@link #version}
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
     * Retrieves {@link #apiVersion}
     *
     * @return value of {@link #apiVersion}
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets {@code apiVersion}
     *
     * @param apiVersion the {@code java.lang.String} field
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Retrieves {@link #audio}
     *
     * @return value of {@link #audio}
     */
    public AudioConfiguration getAudio() {
        return audio;
    }

    /**
     * Sets {@code audio}
     *
     * @param audio the {@code com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfiguration} field
     */
    public void setAudio(AudioConfiguration audio) {
        this.audio = audio;
    }

    /**
     * Retrieves {@link #conference}
     *
     * @return value of {@link #conference}
     */
    public ConferenceConfiguration getConference() {
        return conference;
    }

    /**
     * Sets {@code conference}
     *
     * @param conference the {@code com.avispl.dal.communicator.cisco.dto.configuration.conference.ConferenceConfiguration} field
     */
    public void setConference(ConferenceConfiguration conference) {
        this.conference = conference;
    }

    /**
     * Retrieves {@link #cameras}
     *
     * @return value of {@link #cameras}
     */
    public CamerasConfiguration getCameras() {
        return cameras;
    }

    /**
     * Sets {@code cameras}
     *
     * @param cameras the {@code com.avispl.dal.communicator.cisco.dto.configuration.cameras.CamerasConfiguration} field
     */
    public void setCameras(CamerasConfiguration cameras) {
        this.cameras = cameras;
    }

    /**
     * Retrieves {@link #h323}
     *
     * @return value of {@link #h323}
     */
    public H323Configuration getH323() {
        return h323;
    }

    /**
     * Sets {@code h323}
     *
     * @param h323 the {@code com.avispl.dal.communicator.cisco.dto.configuration.h323.H323Configuration} field
     */
    public void setH323(H323Configuration h323) {
        this.h323 = h323;
    }

    /**
     * Retrieves {@link #network}
     *
     * @return value of {@link #network}
     */
    public NetworkConfiguration[] getNetwork() {
        return network;
    }

    /**
     * Sets {@code network}
     *
     * @param network the {@code com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfiguration[]} field
     */
    public void setNetwork(NetworkConfiguration[] network) {
        this.network = network;
    }

    /**
     * Retrieves {@link #networkServices}
     *
     * @return value of {@link #networkServices}
     */
    public NetworkServicesConfiguration getNetworkServices() {
        return networkServices;
    }

    /**
     * Sets {@code networkServices}
     *
     * @param networkServices the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkservices.NetworkServicesConfiguration} field
     */
    public void setNetworkServices(NetworkServicesConfiguration networkServices) {
        this.networkServices = networkServices;
    }

    /**
     * Retrieves {@link #peripherals}
     *
     * @return value of {@link #peripherals}
     */
    public PeripheralsConfiguration getPeripherals() {
        return peripherals;
    }

    /**
     * Sets {@code peripherals}
     *
     * @param peripherals the {@code com.avispl.dal.communicator.cisco.dto.configuration.peripherals.PeripheralsConfiguration} field
     */
    public void setPeripherals(PeripheralsConfiguration peripherals) {
        this.peripherals = peripherals;
    }

    /**
     * Retrieves {@link #phonebook}
     *
     * @return value of {@link #phonebook}
     */
    public PhonebookConfiguration getPhonebook() {
        return phonebook;
    }

    /**
     * Sets {@code phonebook}
     *
     * @param phonebook the {@code com.avispl.dal.communicator.cisco.dto.configuration.phonebook.PhonebookConfiguration} field
     */
    public void setPhonebook(PhonebookConfiguration phonebook) {
        this.phonebook = phonebook;
    }

    /**
     * Retrieves {@link #provisioning}
     *
     * @return value of {@link #provisioning}
     */
    public ProvisioningConfiguration getProvisioning() {
        return provisioning;
    }

    /**
     * Sets {@code provisioning}
     *
     * @param provisioning the {@code com.avispl.dal.communicator.cisco.dto.configuration.provisioning.ProvisioningConfiguration} field
     */
    public void setProvisioning(ProvisioningConfiguration provisioning) {
        this.provisioning = provisioning;
    }

    /**
     * Retrieves {@link #proximity}
     *
     * @return value of {@link #proximity}
     */
    public ProximityConfiguration getProximity() {
        return proximity;
    }

    /**
     * Sets {@code proximity}
     *
     * @param proximity the {@code com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfiguration} field
     */
    public void setProximity(ProximityConfiguration proximity) {
        this.proximity = proximity;
    }

    /**
     * Retrieves {@link #roomAnalytics}
     *
     * @return value of {@link #roomAnalytics}
     */
    public RoomAnalyticsConfiguration getRoomAnalytics() {
        return roomAnalytics;
    }

    /**
     * Sets {@code roomAnalytics}
     *
     * @param roomAnalytics the {@code com.avispl.dal.communicator.cisco.dto.configuration.roomanalytics.RoomAnalyticsConfiguration} field
     */
    public void setRoomAnalytics(RoomAnalyticsConfiguration roomAnalytics) {
        this.roomAnalytics = roomAnalytics;
    }

    /**
     * Retrieves {@link #sip}
     *
     * @return value of {@link #sip}
     */
    public SIPConfiguration getSip() {
        return sip;
    }

    /**
     * Sets {@code sip}
     *
     * @param sip the {@code com.avispl.dal.communicator.cisco.dto.configuration.sip.SIPConfiguration} field
     */
    public void setSip(SIPConfiguration sip) {
        this.sip = sip;
    }

    /**
     * Retrieves {@link #serialPort}
     *
     * @return value of {@link #serialPort}
     */
    public SerialPortConfiguration getSerialPort() {
        return serialPort;
    }

    /**
     * Sets {@code serialPort}
     *
     * @param serialPort the {@code com.avispl.dal.communicator.cisco.dto.configuration.serialport.SerialPortConfiguration} field
     */
    public void setSerialPort(SerialPortConfiguration serialPort) {
        this.serialPort = serialPort;
    }

    /**
     * Retrieves {@link #standby}
     *
     * @return value of {@link #standby}
     */
    public StandbyConfiguration getStandby() {
        return standby;
    }

    /**
     * Sets {@code standby}
     *
     * @param standby the {@code com.avispl.dal.communicator.cisco.dto.configuration.standby.StandbyConfiguration} field
     */
    public void setStandby(StandbyConfiguration standby) {
        this.standby = standby;
    }

    /**
     * Retrieves {@link #systemUnit}
     *
     * @return value of {@link #systemUnit}
     */
    public SystemUnitConfiguration getSystemUnit() {
        return systemUnit;
    }

    /**
     * Sets {@code systemUnit}
     *
     * @param systemUnit the {@code com.avispl.dal.communicator.cisco.dto.configuration.systemunit.SystemUnitConfiguration} field
     */
    public void setSystemUnit(SystemUnitConfiguration systemUnit) {
        this.systemUnit = systemUnit;
    }

    /**
     * Retrieves {@link #time}
     *
     * @return value of {@link #time}
     */
    public TimeConfiguration getTime() {
        return time;
    }

    /**
     * Sets {@code time}
     *
     * @param time the {@code com.avispl.dal.communicator.cisco.dto.configuration.time.TimeConfiguration} field
     */
    public void setTime(TimeConfiguration time) {
        this.time = time;
    }

    /**
     * Retrieves {@link #userInterface}
     *
     * @return value of {@link #userInterface}
     */
    public UserInterfaceConfiguration getUserInterface() {
        return userInterface;
    }

    /**
     * Sets {@code userInterface}
     *
     * @param userInterface the {@code com.avispl.dal.communicator.cisco.dto.configuration.userinterface.UserInterfaceConfiguration} field
     */
    public void setUserInterface(UserInterfaceConfiguration userInterface) {
        this.userInterface = userInterface;
    }

    /**
     * Retrieves {@link #video}
     *
     * @return value of {@link #video}
     */
    public VideoConfiguration getVideo() {
        return video;
    }

    /**
     * Sets {@code video}
     *
     * @param video the {@code com.avispl.dal.communicator.cisco.dto.configuration.video.VideoConfiguration} field
     */
    public void setVideo(VideoConfiguration video) {
        this.video = video;
    }

    /**
     * Retrieves {@link #networkPorts}
     *
     * @return value of {@link #networkPorts}
     */
    public NetworkPortConfiguration[] getNetworkPorts() {
        return networkPorts;
    }

    /**
     * Sets {@code networkPorts}
     *
     * @param networkPorts the {@code com.avispl.dal.communicator.cisco.dto.configuration.networkport.NetworkPortConfiguration[]} field
     */
    public void setNetworkPorts(NetworkPortConfiguration[] networkPorts) {
        this.networkPorts = networkPorts;
    }
}
