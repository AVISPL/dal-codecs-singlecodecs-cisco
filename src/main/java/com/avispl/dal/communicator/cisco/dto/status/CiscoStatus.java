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

    public Call[] getCalls() {
        return calls;
    }

    public void setCalls(Call[] calls) {
        this.calls = calls;
    }

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

    public AudioStatus getAudio() {
        return audio;
    }

    public void setAudio(AudioStatus audio) {
        this.audio = audio;
    }

    public Cameras getCameras() {
        return cameras;
    }

    public void setCameras(Cameras cameras) {
        this.cameras = cameras;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public ConferenceStatus getConference() {
        return conference;
    }

    public void setConference(ConferenceStatus conference) {
        this.conference = conference;
    }

    public H323 getH323() {
        return h323;
    }

    public void setH323(H323 h323) {
        this.h323 = h323;
    }

    public SIP getSip() {
        return sip;
    }

    public void setSip(SIP sip) {
        this.sip = sip;
    }

    public Network[] getNetworks() {
        return networks;
    }

    public void setNetworks(Network[] networks) {
        this.networks = networks;
    }

    public NetworkServices getNetworkServices() {
        return networkServices;
    }

    public void setNetworkServices(NetworkServices networkServices) {
        this.networkServices = networkServices;
    }

    public Proximity getProximity() {
        return proximity;
    }

    public void setProximity(Proximity proximity) {
        this.proximity = proximity;
    }

    public RoomAnalytics getRoomAnalytics() {
        return roomAnalytics;
    }

    public void setRoomAnalytics(RoomAnalytics roomAnalytics) {
        this.roomAnalytics = roomAnalytics;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Standby getStandby() {
        return standby;
    }

    public void setStandby(Standby standby) {
        this.standby = standby;
    }

    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public VideoStatus getVideo() {
        return video;
    }

    public void setVideo(VideoStatus video) {
        this.video = video;
    }

    public MediaChannels getMediaChannels() {
        return mediaChannels;
    }

    public void setMediaChannels(MediaChannels mediaChannels) {
        this.mediaChannels = mediaChannels;
    }
}
