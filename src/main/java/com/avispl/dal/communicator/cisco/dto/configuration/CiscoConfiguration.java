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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public AudioConfiguration getAudio() {
        return audio;
    }

    public void setAudio(AudioConfiguration audio) {
        this.audio = audio;
    }

    public ConferenceConfiguration getConference() {
        return conference;
    }

    public void setConference(ConferenceConfiguration conference) {
        this.conference = conference;
    }

    public CamerasConfiguration getCameras() {
        return cameras;
    }

    public void setCameras(CamerasConfiguration cameras) {
        this.cameras = cameras;
    }

    public H323Configuration getH323() {
        return h323;
    }

    public void setH323(H323Configuration h323) {
        this.h323 = h323;
    }

    public NetworkConfiguration[] getNetwork() {
        return network;
    }

    public void setNetwork(NetworkConfiguration[] network) {
        this.network = network;
    }

    public NetworkServicesConfiguration getNetworkServices() {
        return networkServices;
    }

    public void setNetworkServices(NetworkServicesConfiguration networkServices) {
        this.networkServices = networkServices;
    }

    public PeripheralsConfiguration getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(PeripheralsConfiguration peripherals) {
        this.peripherals = peripherals;
    }

    public PhonebookConfiguration getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(PhonebookConfiguration phonebook) {
        this.phonebook = phonebook;
    }

    public ProvisioningConfiguration getProvisioning() {
        return provisioning;
    }

    public void setProvisioning(ProvisioningConfiguration provisioning) {
        this.provisioning = provisioning;
    }

    public ProximityConfiguration getProximity() {
        return proximity;
    }

    public void setProximity(ProximityConfiguration proximity) {
        this.proximity = proximity;
    }

    public RoomAnalyticsConfiguration getRoomAnalytics() {
        return roomAnalytics;
    }

    public void setRoomAnalytics(RoomAnalyticsConfiguration roomAnalytics) {
        this.roomAnalytics = roomAnalytics;
    }

    public SIPConfiguration getSip() {
        return sip;
    }

    public void setSip(SIPConfiguration sip) {
        this.sip = sip;
    }

    public SerialPortConfiguration getSerialPort() {
        return serialPort;
    }

    public void setSerialPort(SerialPortConfiguration serialPort) {
        this.serialPort = serialPort;
    }

    public StandbyConfiguration getStandby() {
        return standby;
    }

    public void setStandby(StandbyConfiguration standby) {
        this.standby = standby;
    }

    public SystemUnitConfiguration getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(SystemUnitConfiguration systemUnit) {
        this.systemUnit = systemUnit;
    }

    public TimeConfiguration getTime() {
        return time;
    }

    public void setTime(TimeConfiguration time) {
        this.time = time;
    }

    public UserInterfaceConfiguration getUserInterface() {
        return userInterface;
    }

    public void setUserInterface(UserInterfaceConfiguration userInterface) {
        this.userInterface = userInterface;
    }

    public VideoConfiguration getVideo() {
        return video;
    }

    public void setVideo(VideoConfiguration video) {
        this.video = video;
    }

    public NetworkPortConfiguration[] getNetworkPorts() {
        return networkPorts;
    }

    public void setNetworkPorts(NetworkPortConfiguration[] networkPorts) {
        this.networkPorts = networkPorts;
    }
}
