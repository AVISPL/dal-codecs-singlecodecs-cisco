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
import javax.xml.bind.annotation.*;

/**
 * Device Configuration class. This is a root class for all the device configuration.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlRootElement(name = "Configuration")
@XmlAccessorType(XmlAccessType.NONE)
public class CiscoConfiguration {
    @XmlAttribute(name = "product")
    private String product;
    @XmlAttribute(name = "version")
    private String version;
    @XmlAttribute(name = "apiVersion")
    private String apiVersion;
    @XmlElement(name = "Audio")
    private AudioConfiguration audio;
    @XmlElement(name = "Conference")
    private ConferenceConfiguration conference;
    @XmlElement(name = "Cameras")
    private CamerasConfiguration cameras;
    @XmlElement(name = "H323")
    private H323Configuration h323;
    @XmlElement(name = "Network")
    private NetworkConfiguration[] network;
    @XmlElement(name = "NetworkServices")
    private NetworkServicesConfiguration networkServices;
    @XmlElement(name = "Peripherals")
    private PeripheralsConfiguration peripherals;
    @XmlElement(name = "Phonebook")
    private PhonebookConfiguration phonebook;
    @XmlElement(name = "Provisioning")
    private ProvisioningConfiguration provisioning;
    @XmlElement(name = "Proximity")
    private ProximityConfiguration proximity;
    @XmlElement(name = "RoomAnalytics")
    private RoomAnalyticsConfiguration roomAnalytics;
    @XmlElement(name = "SIP")
    private SIPConfiguration sip;
    @XmlElement(name = "SerialPort")
    private SerialPortConfiguration serialPort;
    @XmlElement(name = "Standby")
    private StandbyConfiguration standby;
    @XmlElement(name = "SystemUnit")
    private SystemUnitConfiguration systemUnit;
    @XmlElement(name = "Time")
    private TimeConfiguration time;
    @XmlElement(name = "UserInterface")
    private UserInterfaceConfiguration userInterface;
    @XmlElement(name = "Video")
    private VideoConfiguration video;
    @XmlElement(name = "NetworkPort")
    private NetworkPortConfiguration[] networkPorts;

    /**
     * Retrieves {@code {@link #product}}
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
     * Retrieves {@code {@link #apiVersion}}
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
     * Retrieves {@code {@link #audio}}
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
     * Retrieves {@code {@link #conference}}
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
     * Retrieves {@code {@link #cameras}}
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
     * Retrieves {@code {@link #h323}}
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
     * Retrieves {@code {@link #network}}
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
     * Retrieves {@code {@link #networkServices}}
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
     * Retrieves {@code {@link #peripherals}}
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
     * Retrieves {@code {@link #phonebook}}
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
     * Retrieves {@code {@link #provisioning}}
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
     * Retrieves {@code {@link #proximity}}
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
     * Retrieves {@code {@link #roomAnalytics}}
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
     * Retrieves {@code {@link #sip}}
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
     * Retrieves {@code {@link #serialPort}}
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
     * Retrieves {@code {@link #standby}}
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
     * Retrieves {@code {@link #systemUnit}}
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
     * Retrieves {@code {@link #time}}
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
     * Retrieves {@code {@link #userInterface}}
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
     * Retrieves {@code {@link #video}}
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
     * Retrieves {@code {@link #networkPorts}}
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
