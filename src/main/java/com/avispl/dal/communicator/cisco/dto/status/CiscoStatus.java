/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status;

import com.avispl.dal.communicator.cisco.dto.status.audio.AudioStatus;
import com.avispl.dal.communicator.cisco.dto.status.call.Call;
import com.avispl.dal.communicator.cisco.dto.status.cameras.Cameras;
import com.avispl.dal.communicator.cisco.dto.status.conference.ConferenceStatus;
import com.avispl.dal.communicator.cisco.dto.status.h323.H323;
import com.avispl.dal.communicator.cisco.dto.status.media.MediaChannels;
import com.avispl.dal.communicator.cisco.dto.status.network.Network;
import com.avispl.dal.communicator.cisco.dto.status.networkservices.NetworkServices;
import com.avispl.dal.communicator.cisco.dto.status.roomanalytics.RoomAnalytics;
import com.avispl.dal.communicator.cisco.dto.status.root.Capabilities;
import com.avispl.dal.communicator.cisco.dto.status.root.Proximity;
import com.avispl.dal.communicator.cisco.dto.status.root.Standby;
import com.avispl.dal.communicator.cisco.dto.status.root.Time;
import com.avispl.dal.communicator.cisco.dto.status.security.Security;
import com.avispl.dal.communicator.cisco.dto.status.sip.SIP;
import com.avispl.dal.communicator.cisco.dto.status.systemunit.SystemUnit;
import com.avispl.dal.communicator.cisco.dto.status.usb.USB;
import com.avispl.dal.communicator.cisco.dto.status.video.VideoStatus;

import javax.xml.bind.annotation.*;

/**
 * Represents root status node of /status.xml payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlRootElement(name = "Status")
@XmlAccessorType(XmlAccessType.NONE)
public class CiscoStatus {
    @XmlAttribute(name = "product")
    private String product;
    @XmlAttribute(name = "version")
    private String version;
    @XmlAttribute(name = "apiVersion")
    private String apiVersion;
    @XmlElement(name = "Call")
    private Call[] calls;
    @XmlElement(name = "Audio")
    private AudioStatus audio;
    @XmlElement(name = "Cameras")
    private Cameras cameras;
    @XmlElement(name = "Capabilities")
    private Capabilities capabilities;
    @XmlElement(name = "Conference")
    private ConferenceStatus conference;
    @XmlElement(name = "H323")
    private H323 h323;
    @XmlElement(name = "SIP")
    private SIP sip;
    @XmlElement(name = "Network")
    private Network[] networks;
    @XmlElement(name = "NetworkServices")
    private NetworkServices networkServices;
    @XmlElement(name = "Proximity")
    private Proximity proximity;
    @XmlElement(name = "RoomAnalytics")
    private RoomAnalytics roomAnalytics;
    @XmlElement(name = "Security")
    private Security security;
    @XmlElement(name = "Standby")
    private Standby standby;
    @XmlElement(name = "SystemUnit")
    private SystemUnit systemUnit;
    @XmlElement(name = "Time")
    private Time time;
    @XmlElement(name = "USB")
    private USB usb;
    @XmlElement(name = "Video")
    private VideoStatus video;
    @XmlElement(name = "MediaChannels")
    private MediaChannels mediaChannels;

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
     * Retrieves {@code {@link #calls}}
     *
     * @return value of {@link #calls}
     */
    public Call[] getCalls() {
        return calls;
    }

    /**
     * Sets {@code calls}
     *
     * @param calls the {@code com.avispl.dal.communicator.cisco.dto.status.call.Call[]} field
     */
    public void setCalls(Call[] calls) {
        this.calls = calls;
    }

    /**
     * Retrieves {@code {@link #audio}}
     *
     * @return value of {@link #audio}
     */
    public AudioStatus getAudio() {
        return audio;
    }

    /**
     * Sets {@code audio}
     *
     * @param audio the {@code com.avispl.dal.communicator.cisco.dto.status.audio.AudioStatus} field
     */
    public void setAudio(AudioStatus audio) {
        this.audio = audio;
    }

    /**
     * Retrieves {@code {@link #cameras}}
     *
     * @return value of {@link #cameras}
     */
    public Cameras getCameras() {
        return cameras;
    }

    /**
     * Sets {@code cameras}
     *
     * @param cameras the {@code com.avispl.dal.communicator.cisco.dto.status.cameras.Cameras} field
     */
    public void setCameras(Cameras cameras) {
        this.cameras = cameras;
    }

    /**
     * Retrieves {@code {@link #capabilities}}
     *
     * @return value of {@link #capabilities}
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets {@code capabilities}
     *
     * @param capabilities the {@code com.avispl.dal.communicator.cisco.dto.status.root.Capabilities} field
     */
    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Retrieves {@code {@link #conference}}
     *
     * @return value of {@link #conference}
     */
    public ConferenceStatus getConference() {
        return conference;
    }

    /**
     * Sets {@code conference}
     *
     * @param conference the {@code com.avispl.dal.communicator.cisco.dto.status.conference.ConferenceStatus} field
     */
    public void setConference(ConferenceStatus conference) {
        this.conference = conference;
    }

    /**
     * Retrieves {@code {@link #h323}}
     *
     * @return value of {@link #h323}
     */
    public H323 getH323() {
        return h323;
    }

    /**
     * Sets {@code h323}
     *
     * @param h323 the {@code com.avispl.dal.communicator.cisco.dto.status.h323.H323} field
     */
    public void setH323(H323 h323) {
        this.h323 = h323;
    }

    /**
     * Retrieves {@code {@link #sip}}
     *
     * @return value of {@link #sip}
     */
    public SIP getSip() {
        return sip;
    }

    /**
     * Sets {@code sip}
     *
     * @param sip the {@code com.avispl.dal.communicator.cisco.dto.status.sip.SIP} field
     */
    public void setSip(SIP sip) {
        this.sip = sip;
    }

    /**
     * Retrieves {@code {@link #networks}}
     *
     * @return value of {@link #networks}
     */
    public Network[] getNetworks() {
        return networks;
    }

    /**
     * Sets {@code networks}
     *
     * @param networks the {@code com.avispl.dal.communicator.cisco.dto.status.network.Network[]} field
     */
    public void setNetworks(Network[] networks) {
        this.networks = networks;
    }

    /**
     * Retrieves {@code {@link #networkServices}}
     *
     * @return value of {@link #networkServices}
     */
    public NetworkServices getNetworkServices() {
        return networkServices;
    }

    /**
     * Sets {@code networkServices}
     *
     * @param networkServices the {@code com.avispl.dal.communicator.cisco.dto.status.networkservices.NetworkServices} field
     */
    public void setNetworkServices(NetworkServices networkServices) {
        this.networkServices = networkServices;
    }

    /**
     * Retrieves {@code {@link #proximity}}
     *
     * @return value of {@link #proximity}
     */
    public Proximity getProximity() {
        return proximity;
    }

    /**
     * Sets {@code proximity}
     *
     * @param proximity the {@code com.avispl.dal.communicator.cisco.dto.status.root.Proximity} field
     */
    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }

    /**
     * Retrieves {@code {@link #roomAnalytics}}
     *
     * @return value of {@link #roomAnalytics}
     */
    public RoomAnalytics getRoomAnalytics() {
        return roomAnalytics;
    }

    /**
     * Sets {@code roomAnalytics}
     *
     * @param roomAnalytics the {@code com.avispl.dal.communicator.cisco.dto.status.roomanalytics.RoomAnalytics} field
     */
    public void setRoomAnalytics(RoomAnalytics roomAnalytics) {
        this.roomAnalytics = roomAnalytics;
    }

    /**
     * Retrieves {@code {@link #security}}
     *
     * @return value of {@link #security}
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets {@code security}
     *
     * @param security the {@code com.avispl.dal.communicator.cisco.dto.status.security.Security} field
     */
    public void setSecurity(Security security) {
        this.security = security;
    }

    /**
     * Retrieves {@code {@link #standby}}
     *
     * @return value of {@link #standby}
     */
    public Standby getStandby() {
        return standby;
    }

    /**
     * Sets {@code standby}
     *
     * @param standby the {@code com.avispl.dal.communicator.cisco.dto.status.root.Standby} field
     */
    public void setStandby(Standby standby) {
        this.standby = standby;
    }

    /**
     * Retrieves {@code {@link #systemUnit}}
     *
     * @return value of {@link #systemUnit}
     */
    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    /**
     * Sets {@code systemUnit}
     *
     * @param systemUnit the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.SystemUnit} field
     */
    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }

    /**
     * Retrieves {@code {@link #time}}
     *
     * @return value of {@link #time}
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets {@code time}
     *
     * @param time the {@code com.avispl.dal.communicator.cisco.dto.status.root.Time} field
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Retrieves {@code {@link #usb}}
     *
     * @return value of {@link #usb}
     */
    public USB getUsb() {
        return usb;
    }

    /**
     * Sets {@code usb}
     *
     * @param usb the {@code com.avispl.dal.communicator.cisco.dto.status.usb.USB} field
     */
    public void setUsb(USB usb) {
        this.usb = usb;
    }

    /**
     * Retrieves {@code {@link #video}}
     *
     * @return value of {@link #video}
     */
    public VideoStatus getVideo() {
        return video;
    }

    /**
     * Sets {@code video}
     *
     * @param video the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoStatus} field
     */
    public void setVideo(VideoStatus video) {
        this.video = video;
    }

    /**
     * Retrieves {@code {@link #mediaChannels}}
     *
     * @return value of {@link #mediaChannels}
     */
    public MediaChannels getMediaChannels() {
        return mediaChannels;
    }

    /**
     * Sets {@code mediaChannels}
     *
     * @param mediaChannels the {@code com.avispl.dal.communicator.cisco.dto.status.media.MediaChannels} field
     */
    public void setMediaChannels(MediaChannels mediaChannels) {
        this.mediaChannels = mediaChannels;
    }
}
