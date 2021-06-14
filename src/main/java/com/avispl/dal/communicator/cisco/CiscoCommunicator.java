/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco;

import com.avispl.dal.communicator.cisco.controller.type.*;
import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolderType;
import com.avispl.dal.communicator.cisco.dto.configuration.CiscoConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationInput;
import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationUltrasound;
import com.avispl.dal.communicator.cisco.dto.configuration.cameras.*;
import com.avispl.dal.communicator.cisco.dto.configuration.conference.*;
import com.avispl.dal.communicator.cisco.dto.configuration.network.NetworkConfigurationServer;
import com.avispl.dal.communicator.cisco.dto.configuration.networkservices.*;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfigurationContentShare;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfigurationServices;
import com.avispl.dal.communicator.cisco.dto.configuration.roomanalytics.RoomAnalyticsConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.standby.StandbyConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.time.TimeConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.userinterface.*;
import com.avispl.dal.communicator.cisco.dto.configuration.video.*;
import com.avispl.dal.communicator.cisco.dto.control.commands.Command;
import com.avispl.dal.communicator.cisco.dto.control.commands.audio.MicrophonesMuteCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.call.CallDisconnectCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.call.DialCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.camera.CameraPositionSetCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.userinterface.UserInterfaceCommand;
import com.avispl.dal.communicator.cisco.dto.status.CiscoStatus;
import com.avispl.dal.communicator.cisco.dto.status.audio.*;
import com.avispl.dal.communicator.cisco.dto.status.call.Call;
import com.avispl.dal.communicator.cisco.dto.status.cameras.Camera;
import com.avispl.dal.communicator.cisco.dto.status.cameras.CameraPosition;
import com.avispl.dal.communicator.cisco.dto.status.cameras.Cameras;
import com.avispl.dal.communicator.cisco.dto.status.conference.*;
import com.avispl.dal.communicator.cisco.dto.status.h323.H323;
import com.avispl.dal.communicator.cisco.dto.status.h323.H323Gatekeeper;
import com.avispl.dal.communicator.cisco.dto.status.h323.H323Mode;
import com.avispl.dal.communicator.cisco.dto.status.media.*;
import com.avispl.dal.communicator.cisco.dto.status.network.*;
import com.avispl.dal.communicator.cisco.dto.status.network.dns.DNS;
import com.avispl.dal.communicator.cisco.dto.status.network.dns.DNSDomain;
import com.avispl.dal.communicator.cisco.dto.status.network.dns.DNSServer;
import com.avispl.dal.communicator.cisco.dto.status.networkservices.NTP;
import com.avispl.dal.communicator.cisco.dto.status.networkservices.NTPServer;
import com.avispl.dal.communicator.cisco.dto.status.networkservices.NetworkServices;
import com.avispl.dal.communicator.cisco.dto.status.roomanalytics.*;
import com.avispl.dal.communicator.cisco.dto.status.root.Capabilities;
import com.avispl.dal.communicator.cisco.dto.status.root.ConferenceCapabilities;
import com.avispl.dal.communicator.cisco.dto.status.root.Standby;
import com.avispl.dal.communicator.cisco.dto.status.security.FIPS;
import com.avispl.dal.communicator.cisco.dto.status.security.Persistency;
import com.avispl.dal.communicator.cisco.dto.status.security.Security;
import com.avispl.dal.communicator.cisco.dto.status.sip.*;
import com.avispl.dal.communicator.cisco.dto.status.systemunit.*;
import com.avispl.dal.communicator.cisco.dto.status.usb.Device;
import com.avispl.dal.communicator.cisco.dto.status.usb.USB;
import com.avispl.dal.communicator.cisco.dto.status.video.*;
import com.avispl.dal.communicator.cisco.dto.valuespace.ValueSpace;
import com.avispl.symphony.api.dal.control.Controller;
import com.avispl.symphony.api.dal.control.call.CallController;
import com.avispl.symphony.api.dal.dto.control.AdvancedControllableProperty;
import com.avispl.symphony.api.dal.dto.control.ControllableProperty;
import com.avispl.symphony.api.dal.dto.control.Protocol;
import com.avispl.symphony.api.dal.dto.control.call.CallStatus;
import com.avispl.symphony.api.dal.dto.control.call.DialDevice;
import com.avispl.symphony.api.dal.dto.control.call.MuteStatus;
import com.avispl.symphony.api.dal.dto.control.call.PopupMessage;
import com.avispl.symphony.api.dal.dto.monitor.*;
import com.avispl.symphony.api.dal.error.CommandFailureException;
import com.avispl.symphony.api.dal.monitor.Monitorable;
import com.avispl.symphony.dal.communicator.RestCommunicator;
import com.avispl.symphony.dal.util.StringUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static com.avispl.dal.communicator.cisco.CiscoCommunicatorProperties.*;
import static com.avispl.dal.communicator.cisco.controller.ControlPayloadGenerator.*;

/**
 * Communicator based on Cisco XML API
 * {@link com.avispl.dal.communicator.cisco.controller.ControlPayloadGenerator} is used for generating
 * configuration/command request payloads based on a command type
 * <p>
 * Properties are divided into groups:
 * Audio,SystemUnit,Standby,Camera,Conference,NetworkServices,Video,UserInterface,ConferenceCapabilities,
 * ActiveCall,H323,SIP,Security,Network,USB,RoomAnalytics,Proximity,SystemTime
 * <p>
 * By default, 2 groups are only exposed: SystemUnit,Audio
 * <p>
 * Adding more groups in a csv format will increase amount of information populated to Symphony.
 * <p>
 * Adapter keeps track of the set of device properties. There are 3 categories of properties: Monitored, Controlled via
 * Commands and Controlled via Configuration.
 * <p>
 * System Time
 * System TimeZone
 * Audio: Microphone EC Reference Delay
 * Audio: Microphone status
 * Audio: Microphones mute
 * Audio: Output Line Delay(MS)
 * Audio: Ultrasound MAX Volume
 * Audio: Volume
 * Audio: Volume Mute
 * <p>
 * Cameras: Camera Backlight
 * Cameras: Camera Brightness Level
 * Cameras: Camera Brightness Mode
 * Cameras: Camera Connected
 * Cameras: Camera Flip
 * Cameras: Camera Focus Mode
 * Cameras: Camera Gamma Level
 * Cameras: Camera Gamma Mode
 * Cameras: Camera Hardware Id
 * Cameras: Camera MAC Address
 * Cameras: Camera Manufacturer
 * Cameras: Camera Mirror
 * Cameras: Camera Model
 * Cameras: Camera Pan
 * Cameras: Camera Serial Number
 * Cameras: Camera Software Id
 * Cameras: Camera Tilt
 * Cameras: Camera Whitebalance Level
 * Cameras: Camera Whitebalance Mode
 * Cameras: Camera Zoom
 * <p>
 * Conference: Auto Answer Delay
 * Conference: Auto Answer Mode
 * Conference: Auto Answer Mute
 * Conference: Default Call Protocol
 * Conference: Default Call Rate
 * Conference: Do Not Disturb
 * Conference: Do Not Disturb Timeout
 * Conference: Far End Control
 * Conference: Multipoint Mode
 * Conference: Presentation Call Id
 * Conference: Presentation Mode
 * Conference: Speaker Lock Call Id
 * Conference: Speaker Lock Mode
 * <p>
 * Conference Capabilities: Max Active Calls
 * Conference Capabilities: Max Audio Calls
 * Conference Capabilities: Max Calls
 * Conference Capabilities: Max Video Calls
 * <p>
 * Networks: Network CDP Address
 * Networks: Network CDP Device Id
 * Networks: Network CDP Duplex
 * Networks: Network CDP Platform
 * Networks: Network CDP Port Id
 * Networks: Network CDP Primary Mgmt Address
 * Networks: Network CDP Sys Name
 * Networks: Network CDP Sys Object Id
 * Networks: Network CDP Version
 * Networks: Network CDP Vtp Mgmt Domain
 * Networks: Network CDP Capabilities
 * Networks: Network CDP Address
 * Networks: Network CDP Domain Name
 * Networks: Network Ethernet MAC Address
 * Networks: Network IPv4 Address
 * Networks: Network IPv4 Gateway
 * Networks: Network IPv4 Subnet Mask
 * Networks: Network IPv6 Address
 * Networks: Network IPv6 Gateway
 * <p>
 * Network Services: CDP Mode
 * Network Services: HTTP Mode
 * Network Services: HTTP Minimum TLS Version
 * Network Services: HTTP Strict Transport Security
 * Network Services: HTTP Verify Client Certificate
 * Network Services: SIP Mode
 * Network Services: SNMP Community Name
 * Network Services: SNMP Mode
 * Network Services: SSH Mode
 * Network Services: UPnP Mode
 * Network Services: Telnet Mode
 * Network Services: Welcome Text
 * <p>
 * Proximity Services: Call Control
 * Proximity Services: Content Share From Clients
 * Proximity Services: Content Share To Clients
 * Proximity Services: Proximity Services Mode
 * <p>
 * Room Analytics: Ambient Noise Level A
 * Room Analytics: Current People Count
 * Room Analytics: People Presence
 * Room Analytics: People Presence Detection
 * Room Analytics: Sound Level A
 * <p>
 * Standby: Boot Action
 * Standby: Control
 * Standby: Delay
 * Standby: Standby Action
 * Standby: Wakeup Action
 * Standby: State
 * <p>
 * System Unit: Active Calls Number
 * System Unit: Compatibility Level
 * System Unit: Display Name
 * System Unit: In Progress Calls Number
 * System Unit: Name
 * System Unit: Product Id
 * System Unit: Product Platform
 * System Unit: Product Type
 * System Unit: Release Date
 * System Unit: Serial Number
 * System Unit: Suspended Calls Number
 * System Unit: Version
 * <p>
 * User Interface: Awake Branding Colors
 * User Interface: Contact Info Type
 * User Interface: Features Call End
 * User Interface: Features Call Start
 * User Interface: Features Mid Call Controls
 * User Interface: Hide All Features
 * User Interface: Incoming Call Notification
 * User Interface: Key Tones
 * User Interface: Language
 * User Interface: OSD Output
 * User Interface: Share Start
 * <p>
 * Video: Active Speaker PIP Position
 * Video: Connector Connected
 * Video: Connector Connected Device Name
 * Video: Connector Connected Device Preferred Format
 * Video: Connector Type
 * Video: Default Main Source
 * Video: Default Presentation Source
 * Video: Input Source Name
 * Video: Input Source Presentation Selection
 * Video: Input Source Quality
 * Video: Input Source Type
 * Video: Input Source Visibility
 * Video: Layout Family
 * Video: Main Video Source
 * Video: Monitors
 * Video: Output Source CEC Mode
 * Video: Output Source Monitor Role
 * Video: Output Source Resolution
 * <p>
 * Video Selfview: Default Fullscreen Mode
 * Video Selfview: Default Mode
 * Video Selfview: Default On Monitor Role
 * Video Selfview: Default PIP Position
 * Video Selfview: Fullscreen Mode
 * Video Selfview: Mode
 * Video Selfview: On Call Duration
 * Video Selfview: On Call Mode
 * Video Selfview: On Monitor Role
 * Video Selfview: PIP Position
 * <p>
 * Supported device models: SX80, SX20, SX10, MX800, MX700, MX300 G2, MX200 G2, DX80, DX70, Room Kit, Room Kit Mini,
 * Codec Plus, Codec Pro, Room 70, Room 55 Dual, Room 70 G2, Room 55, Board 55, 55S, 70, 70s, 85s
 */
public class CiscoCommunicator extends RestCommunicator implements CallController, Monitorable, Controller {

    private final String callStatusUri = "/Status/Call";
    private final String cameraCommandUri = "/Command/Camera";
    private final String microphonesStatusUri = "/Status/Audio/Microphones";
    private final String getXmlPath = "getxml/?location=%s";

    private final String configurationPath = "configuration.xml";
    private final String statusPath = "status.xml";
    private final String valuespacePath = "valuespace.xml";

    /**
     * Exposing 2 property groups by default - SystemUnit and Audio
     */
    private String displayPropertyGroups = "SystemUnit,RoomAnalytics";

    /**
     * Grace period for restart operation, 120s by default
     */
    private long restartGracePeriod = 120000;

    /**
     * Timestamp of the last control operation, used to determine whether we need to wait
     * for {@link #CONTROL_OPERATION_COOLDOWN_MS} before collecting new statistics
     */
    private long latestControlTimestamp;

    /**
     * Cooldown period for control operation. Most control operations (toggle/slider based in this case) may be
     * requested multiple times in a row. Normally, a control operation would trigger an emergency delivery action,
     * which is not wanted in this case - such control operations will stack multiple statistics retrieval calls,
     * while instead we can define a cooldown period, so multiple controls operations will be stacked within this
     * period and the control states are modified within the {@link #localStatistics} variable.
     */
    private static final int CONTROL_OPERATION_COOLDOWN_MS = 5000;

    /**
     * A number of attempts to perform for getting the conference (call) status while performing
     * {@link #dial(DialDevice)} operation
     */
    private int maxStatusPollAttempt = 10;

    private final ReentrantLock controlOperationsLock = new ReentrantLock();
    private ExtendedStatistics localStatistics;
    private EndpointStatistics localEndpointStatistics;

    Unmarshaller xmlUnmarshaller;

    /**
     * Instantiate {@link CiscoCommunicator}
     */
    public CiscoCommunicator() {
        setTrustAllCertificates(true);
    }

    /**
     * {@inheritDoc}
     * Configure xmlUnmarshaller for valuespace.xml values parsing. There are a lot of stuff that is irrelevant,
     * so by default - it's fetched as string value and then only relevant parts are parsed.
     */
    @Override
    protected void internalInit() throws Exception {
        super.internalInit();
        JAXBContext jc = JAXBContext.newInstance(ValueSpace.class);
        xmlUnmarshaller = jc.createUnmarshaller();
    }

    /**
     * Getting a custom adapter parameter value
     *
     * @return {@link String} with csv value, containing property groups
     */
    public String getDisplayPropertyGroups() {
        return displayPropertyGroups;
    }

    /***
     * Setting custom adapter parameter
     *
     * @param displayPropertyGroups parameter value (csv of groups to display in statistics)
     */
    public void setDisplayPropertyGroups(String displayPropertyGroups) {
        this.displayPropertyGroups = displayPropertyGroups;
    }

    /**
     * Retrieves {@code {@link #maxStatusPollAttempt}}
     *
     * @return value of {@link #maxStatusPollAttempt}
     */
    public int getMaxStatusPollAttempt() {
        return maxStatusPollAttempt;
    }

    /**
     * Sets {@code maxStatusPollAttempt}
     *
     * @param maxStatusPollAttempt the {@code int} field
     */
    public void setMaxStatusPollAttempt(int maxStatusPollAttempt) {
        this.maxStatusPollAttempt = maxStatusPollAttempt;
    }

    /**
     * Retrieve a time duration of a pause period after the device restart.
     *
     * @return long value in ms
     */
    public long getRestartGracePeriod() {
        return restartGracePeriod;
    }

    /**
     * Set a time duration of a pause period after the device restart.
     *
     * @param restartGracePeriod value in ms
     */
    public void setRestartGracePeriod(long restartGracePeriod) {
        this.restartGracePeriod = restartGracePeriod;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected RestTemplate obtainRestTemplate() throws Exception {
        RestTemplate restTemplate = super.obtainRestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();

        // For control/config operations request/response
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
        Jaxb2RootElementHttpMessageConverter jaxb2RootElementHttpMessageConverter = new Jaxb2RootElementHttpMessageConverter();
        jaxb2RootElementHttpMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(jaxb2RootElementHttpMessageConverter);
        messageConverters.add((stringHttpMessageConverter));

        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected HttpHeaders putExtraRequestHeaders(HttpMethod httpMethod, String uri, HttpHeaders headers) throws Exception {
        headers.set("Content-Type", "text/xml");
        return super.putExtraRequestHeaders(httpMethod, uri, headers);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String dial(DialDevice dialDevice) throws Exception {
        List<Call> connectedCalls = getConnectedCalls();
        if (connectedCalls.size() > 0) {
            Call call = connectedCalls.get(0);
            if (logger.isInfoEnabled()) {
                logger.info("There is an active call in progress: " + call.getDisplayName());
            }
            return call.getItem();
        }

        Command dialCommand = new Command();
        String dialString = dialDevice.getDialString();
        if (dialString == null) {
            throw new IllegalArgumentException("Cannot dial the remote endpoint: DialString is empty");
        }
        Protocol callProtocol = dialDevice.getProtocol();
        if (callProtocol == null) {
            dialCommand.setDialCommand(new DialCommand(dialString, "SIP"));
        } else {
            dialCommand.setDialCommand(new DialCommand(dialString, callProtocol.name()));
        }

        Command response = doPost("putxml", dialCommand, Command.class);
        String callId = response.getDialResult().getCallId();

        for (int i = 0; i < maxStatusPollAttempt; i++) {
            List<Call> calls = getConnectedCalls();

            for (Call call : calls) {
                if (call.getItem().equals(callId) && !StringUtils.isNullOrEmpty(call.getCallbackNumber())
                        && call.getCallbackNumber().contains(dialString)) {
                    return callId;
                }
            }
            Thread.sleep(1000);
        }
        // Some devices (like SX20) appear slower than the other ones, so if we throw an exception here - it would
        // be populate to UI, but call status will still be updated afterwards.
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void hangup(String s) throws Exception {
        controlOperationsLock.lock();
        try {
            if (getConnectedCalls().size() > 0) {
                Command callDisconnectCommand = new Command();
                callDisconnectCommand.setCallDisconnectCommand(new CallDisconnectCommand());
                doPost("putxml", callDisconnectCommand);
            }
        } finally {
            controlOperationsLock.unlock();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CallStatus retrieveCallStatus(String callId) throws Exception {
        controlOperationsLock.lock();
        try {
            List<Call> calls = getConnectedCalls();
            CallStatus callStatus = new CallStatus();
            long callsCount = calls.size();
            if (callsCount > 1) {
                throw new IllegalStateException(String.format("Ambiguous active calls found: %s, 1 expected. Unable to proceed.",
                        callsCount));
            }
            Call connectedCall = calls.get(0);
            if (callsCount > 0 && "Connected".equals(connectedCall.getStatus())) {
                callStatus.setCallId(connectedCall.getItem());
                callStatus.setCallStatusState(CallStatus.CallStatusState.Connected);
            } else {
                callStatus.setCallId(callId);
                callStatus.setCallStatusState(CallStatus.CallStatusState.Disconnected);
            }
            return callStatus;
        } finally {
            controlOperationsLock.unlock();
        }
    }

    /**
     * Retrieving all the available calls with status "Connected"
     *
     * @return {@link List} of {@link Call} instances, containing general call information
     * @throws Exception if any error occurs
     */
    private List<Call> getConnectedCalls() throws Exception {
        try {
            CiscoStatus status = doGet(String.format(getXmlPath, callStatusUri), CiscoStatus.class);
            if (status.getCalls() == null) {
                return Collections.emptyList();
            }
            return Arrays.stream(status.getCalls()).filter(call -> "Connected".equals(call.getStatus()))
                    .collect(Collectors.toList());
        } catch (RestClientException ex) {
            // Jaxb is not able to handle multiple RootNodes as well as ignoring them.
            // If there are no calls - <EmptyResult\> node will be populated instead of <Status>,
            // so Jaxb expects that to be in place at all times (as opposed to Jackson, which will just handle that as
            // blank value for the CiscoStatus root)
            // So, if EmptyResult substring was found - it is due to the <EmptyResult/> root node, which means there
            // are no Calls registered on the device.
            String message = ex.getMessage();
            if (!StringUtils.isNullOrEmpty(message) && message.contains("EmptyResult")) {
                return Collections.emptyList();
            }
            throw ex;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MuteStatus retrieveMuteStatus() throws Exception {
        CiscoStatus status = doGet(String.format(getXmlPath, microphonesStatusUri), CiscoStatus.class);
        return "On".equals(status.getAudio().getMicrophones().getMute()) ? MuteStatus.Muted : MuteStatus.Unmuted;
    }

    /**
     * {@inheritDoc}
     *
     * <Command>
     * <UserInterface>
     * <Message>
     * <Display command="True">
     * <Duration>10</Duration>
     * <Text>test message</Text>
     * </Display>
     * </Message>
     * </UserInterface>
     * </Command>
     */
    @Override
    public void sendMessage(PopupMessage popupMessage) throws Exception {
        if (popupMessage == null || StringUtils.isNullOrEmpty(popupMessage.getMessage()) || popupMessage.getDuration() == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to send message: message data is not valid.");
            }
            return;
        }

        Command command = new Command();
        UserInterfaceCommand userInterfaceCommand = new UserInterfaceCommand();
        userInterfaceCommand.setMessage(new UserInterfaceCommand.Message(popupMessage.getMessage(), popupMessage.getDuration()));
        command.setUserInterface(userInterfaceCommand);

        doPost("putxml", command);
    }

    /**
     * {@inheritDoc}
     *
     * <Command>
     * <Audio>
     * <Microphones>
     * <Mute command="True"/>
     * </Microphones>
     * </Audio>
     * </Command>
     */
    @Override
    public void mute() throws Exception {
        Command muteCommand = new Command();
        muteCommand.setAudioCommand(new MicrophonesMuteCommand(true));
        doPost("putxml", muteCommand);
    }

    /**
     * {@inheritDoc}
     *
     * <Command>
     * <Audio>
     * <Microphones>
     * <Unmute command="True"/>
     * </Microphones>
     * </Audio>
     * </Command>
     */
    @Override
    public void unmute() throws Exception {
        Command muteCommand = new Command();
        muteCommand.setAudioCommand(new MicrophonesMuteCommand(false));
        doPost("putxml", muteCommand);
    }

    /**
     * Populate media channels data, retrieved from the device, and set it into the {@link EndpointStatistics} instance
     *
     * @param ciscoStatus        data retrieved from {@link #statusPath}, containing all necessary status information of the device
     * @param endpointStatistics an instance of {@link EndpointStatistics} to set data to
     * @throws RuntimeException if more than 1 connected calls is found
     */
    private void populateMediaChannelsData(CiscoStatus ciscoStatus, EndpointStatistics endpointStatistics) {
        MediaChannels mediaChannels = ciscoStatus.getMediaChannels();
        if (mediaChannels == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate media channels data: media channels data is empty");
            }
            return;
        }
        MediaStatsCall[] calls = mediaChannels.getCalls();
        if (calls == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate media channels data: no calls information is available");
            }
            return;
        }

        List<Call> connectedCalls = Arrays.stream(ciscoStatus.getCalls()).filter(call -> "Connected".equals(call.getStatus()))
                .collect(Collectors.toList());
        long callsCount = connectedCalls.size();
        if (callsCount > 1) {
            throw new IllegalStateException(String.format("Ambiguous active calls found: %s, 1 expected. Unable to proceed.",
                    callsCount));
        }
        if (callsCount == 0) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate media channels data: no active calls is available");
            }
            return;
        }

        Call activeCall = connectedCalls.get(0);
        Arrays.stream(calls).filter(mediaStatsCall -> mediaStatsCall.getItem().equals(activeCall.getItem())).findFirst().ifPresent(mediaStatsCall -> {
            endpointStatistics.setInCall(true);
            MediaStatsCall call = calls[0];
            AudioChannelStats audioChannelStats = new AudioChannelStats();
            VideoChannelStats videoChannelStats = new VideoChannelStats();
            ContentChannelStats contentChannelStats = new ContentChannelStats();
            CallStats callStats = new CallStats();
            Arrays.stream(ciscoStatus.getCalls()).filter(fcall -> fcall.getStatus().equals("Connected")).findFirst().ifPresent(callInfo -> {
                for (Channel channel : call.getChannels()) {
                    switch (channel.getType()) {
                        case "Audio":
                            enrichAudioChannelStatsData(audioChannelStats, callStats, channel, callInfo);
                            break;
                        case "Video":
                            enrichVideoChannelStatsData(videoChannelStats, callStats, contentChannelStats, channel, callInfo);
                            break;
                        default:
                            logger.info("Not supported channel type: " + channel.getType());
                            break;
                    }
                }
                callStats.setCallId(callInfo.getItem());
                callStats.setProtocol(callInfo.getProtocol());
                callStats.setCallRateRx(Integer.valueOf(callInfo.getReceiveCallRate()));
                callStats.setCallRateTx(Integer.valueOf(callInfo.getTransmitCallRate()));
                callStats.setRequestedCallRate(Integer.valueOf(callInfo.getTransmitCallRate()));
                endpointStatistics.setCallStats(callStats);
                endpointStatistics.setAudioChannelStats(audioChannelStats);
                endpointStatistics.setVideoChannelStats(videoChannelStats);
                endpointStatistics.setContentChannelStats(contentChannelStats);
            });
        });
    }

    /**
     * Create instance of {@link RegistrationStatus} with data received from {@link CiscoStatus} parameter
     *
     * @param ciscoStatus device response
     * @return {@link RegistrationStatus} containing all the registration details
     */
    private RegistrationStatus createRegistrationStatus(CiscoStatus ciscoStatus) {
        RegistrationStatus registrationStatus = new RegistrationStatus();

        H323 h323 = ciscoStatus.getH323();
        if (h323 != null) {
            H323Gatekeeper gatekeeper = h323.getGatekeeper();
            if (gatekeeper != null) {
                registrationStatus.setH323Details(String.format("Port: %s", gatekeeper.getPort()));
                registrationStatus.setH323Registered("Registered".equals(gatekeeper.getStatus()));
                registrationStatus.setH323Gatekeeper(gatekeeper.getAddress());
            }
        }

        SIP sip = ciscoStatus.getSip();
        if (sip != null) {
            Registration[] registrations = sip.getRegistrations();
            if (registrations != null && registrations.length > 0) {
                registrationStatus.setSipDetails(String.format("URI: %s", registrations[0].getUri()));
                registrationStatus.setSipRegistered("Registered".equals(registrations[0].getStatus()));
            }
            Proxy[] proxies = sip.getProxies();
            if (proxies != null && proxies.length > 0) {
                registrationStatus.setSipRegistrar(proxies[0].getAddress());
            }
        }

        return registrationStatus;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Statistics> getMultipleStatistics() throws Exception {
        ExtendedStatistics extendedStatistics = new ExtendedStatistics();
        EndpointStatistics endpointStatistics = new EndpointStatistics();

        controlOperationsLock.lock();
        try {
            if (isValidControlCoolDown() && localStatistics != null && localEndpointStatistics != null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Device is occupied. Skipping statistics refresh call.");
                }
                extendedStatistics.setStatistics(localStatistics.getStatistics());
                extendedStatistics.setControllableProperties(localStatistics.getControllableProperties());

                endpointStatistics.setInCall(localEndpointStatistics.isInCall());
                endpointStatistics.setCallStats(localEndpointStatistics.getCallStats());
                endpointStatistics.setVideoChannelStats(localEndpointStatistics.getVideoChannelStats());
                endpointStatistics.setAudioChannelStats(localEndpointStatistics.getAudioChannelStats());

                return Arrays.asList(extendedStatistics, endpointStatistics);
            }

            List<AdvancedControllableProperty> advancedControllableProperties = new ArrayList<>();
            Map<String, String> statisticsMap = new HashMap<>();

            String valuespace = retrieveValuespace();
            CiscoConfiguration ciscoConfiguration = retrieveConfiguration();
            CiscoStatus ciscoStatus = retrieveStatus();

            populateMediaChannelsData(ciscoStatus, endpointStatistics);
            endpointStatistics.setRegistrationStatus(createRegistrationStatus(ciscoStatus));

            List<String> propertyGroups = Arrays.stream(displayPropertyGroups.split(",")).map(String::trim).collect(Collectors.toList());

            if (propertyGroupQualifiedForDisplay(propertyGroups, "Audio")) {
                populateAudioData(statisticsMap, advancedControllableProperties, ciscoStatus, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "Cameras")) {
                populateCameraData(statisticsMap, advancedControllableProperties, ciscoStatus, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "Conference")) {
                populateConferenceData(statisticsMap, advancedControllableProperties, ciscoStatus, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "Standby")) {
                populateStandbyData(statisticsMap, advancedControllableProperties, ciscoStatus, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "NetworkServices")) {
                populateNetworkServicesData(statisticsMap, advancedControllableProperties, ciscoStatus, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "Video")) {
                populateVideoData(statisticsMap, advancedControllableProperties, ciscoStatus, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "UserInterface")) {
                populateUserInterfaceData(statisticsMap, advancedControllableProperties, ciscoConfiguration, valuespace);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "SystemUnit")) {
                populateSystemUnitData(statisticsMap, advancedControllableProperties, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "ConferenceCapabilities")) {
                populateConferenceCapabilitiesData(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "ActiveCall")) {
                populateCallData(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "H323")) {
                populateH323Data(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "SIP")) {
                populateSIPData(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "Security")) {
                populateSecurityData(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "Networks")) {
                populateNetworkData(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "USB")) {
                populateUSBData(statisticsMap, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "RoomAnalytics")) {
                populateRoomAnalyticsData(statisticsMap, advancedControllableProperties, ciscoConfiguration, ciscoStatus);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "ProximityServices")) {
                populateProximityData(statisticsMap, advancedControllableProperties, ciscoConfiguration);
            }
            if (propertyGroupQualifiedForDisplay(propertyGroups, "SystemTime")) {
                statisticsMap.put("SystemTime#Time", ciscoStatus.getTime().getSystemTime());
                TimeConfiguration timeConfiguration = ciscoConfiguration.getTime();
                if (timeConfiguration != null) {
                    addStatisticsParameterWithDropdown(statisticsMap, advancedControllableProperties, SYSTEM_TIME_ZONE, timeConfiguration.getZone(), valuespace);
                }
            }

            extendedStatistics.setControllableProperties(advancedControllableProperties);
            extendedStatistics.setStatistics(statisticsMap);

            localStatistics = extendedStatistics;
            localEndpointStatistics = endpointStatistics;
        } finally {
            controlOperationsLock.unlock();
        }
        return Arrays.asList(extendedStatistics, endpointStatistics);
    }

    /**
     * Property groups are not exposed by default. The state of property groups population is based on {@link #displayPropertyGroups}
     * variable, so in order to have an external control over the set of groups to display - this variable should
     * contain either CSV list of Group names, or an "All" entry, which will qualify all the available groups for display.
     *
     * @param groupsList        list of groups, currently set for the display, without spaces.
     * @param propertyGroupName name of a group to qualify for
     * @return boolean value, indicating whether the group is qualified for the display or not
     */
    private boolean propertyGroupQualifiedForDisplay(List<String> groupsList, String propertyGroupName) {
        return groupsList.contains(propertyGroupName) || groupsList.contains("All");
    }

    /**
     * Populate SystemUnit section parameters.
     *
     * @param ciscoStatus device response data
     * @param statistics  map to set data to
     */
    private void populateSystemUnitData(Map<String, String> statistics, List<AdvancedControllableProperty> controls, CiscoStatus ciscoStatus) {
        SystemUnit systemUnit = ciscoStatus.getSystemUnit();
        if (systemUnit == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate system unit data: no system unit information available");
            }
            return;
        }

        statistics.put(SYSTEM_UNIT_RESTART, "");
        controls.add(createButton(SYSTEM_UNIT_RESTART, "Restart", "Restarting...", restartGracePeriod));

        String uptime = systemUnit.getUptime();
        if (!StringUtils.isNullOrEmpty(uptime)) {
            addStatisticsParameter(statistics, "SystemUnit#Uptime", normalizeUptime(uptime));
        }

        addStatisticsParameter(statistics, "SystemUnit#ProductId", systemUnit.getProductId());
        addStatisticsParameter(statistics, "SystemUnit#ProductPlatform", systemUnit.getProductPlatform());
        addStatisticsParameter(statistics, "SystemUnit#ProductType", systemUnit.getProductType());

        State state = systemUnit.getState();
        if (state != null) {
            addStatisticsParameter(statistics, "SystemUnit#ActiveCallsNumber", state.getNumberOfActiveCalls());
            addStatisticsParameter(statistics, "SystemUnit#InProgressCallsNumber", state.getNumberOfInProgressCalls());
            addStatisticsParameter(statistics, "SystemUnit#SuspendedCallsNumber", state.getNumberOfSuspendedCalls());
        }


        Hardware hardware = systemUnit.getHardware();
        if (hardware != null) {
            addStatisticsParameter(statistics, "SystemUnit#HardwareTemperature(C)", hardware.getTemperature());

            HardwareModule module = hardware.getModule();
            if (module != null) {
                addStatisticsParameter(statistics, "SystemUnit#SerialNumber", module.getSerialNumber());
                addStatisticsParameter(statistics, "SystemUnit#CompatibilityLevel", module.getCompatibilityLevel());
            }
        }

        Software software = systemUnit.getSoftware();
        if (software != null) {
            addStatisticsParameter(statistics, "SystemUnit#DisplayName", software.getDisplayName());
            addStatisticsParameter(statistics, "SystemUnit#Name", software.getName());
            addStatisticsParameter(statistics, "SystemUnit#ReleaseDate", software.getReleaseDate());
            addStatisticsParameter(statistics, "SystemUnit#Version", software.getVersion());
        }
    }

    /**
     * Retrieve Audio statistics/controls values
     *
     * @param statistics             map to set statistics data to
     * @param controllableProperties list of controls to add controllable properties to
     * @param status                 device status data fetched from {@link #statusPath}
     * @param configuration          device configuration data fetched from {@link #configurationPath}
     * @param valuespace             device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateAudioData(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                   CiscoStatus status, CiscoConfiguration configuration, String valuespace) {
        AudioStatus audioStatus = status.getAudio();
        AudioConfiguration audioConfiguration = configuration.getAudio();
        if (audioConfiguration != null) {
            AudioConfigurationUltrasound ultrasound = audioConfiguration.getUltrasound();
            if (ultrasound != null) {
                addStatisticsParameterWithSlider(statistics, controllableProperties, AUDIO_ULTRASOUND_MAX_VOLUME, ultrasound.getMaxVolume());
            }

            AudioConfigurationInput input = audioConfiguration.getInput();
            if (input != null) {
                addStatisticsParameterWithDropdown(statistics, controllableProperties, AUDIO_MICROPHONE_MODE, input.getMicrophoneMode(), valuespace);
            }
        }

        if (audioStatus != null) {
            addStatisticsParameterWithSlider(statistics, controllableProperties, AUDIO_VOLUME, audioStatus.getVolume(), 0.0f, 100.0f);
            addStatisticsParameter(statistics, "Audio#VolumeHandsetUsb", audioStatus.getVolumeHandsetUsb());
            addStatisticsParameter(statistics, "Audio#VolumeHeadsetUsb", audioStatus.getVolumeHeadsetUsb());
            addStatisticsParameter(statistics, "Audio#VolumeHeadsetBluetooth", audioStatus.getVolumeHeadsetBluetooth());

            addStatisticsParameter(statistics, "Audio#SelectedDevice", audioStatus.getSelectedDevice());

            addStatisticsParameter(statistics, "Audio#VolumeMute", audioStatus.getVolumeMute());

            Microphones microphonesStatus = audioStatus.getMicrophones();
            if (microphonesStatus != null) {
                addStatisticsParameterWithSwitch(statistics, controllableProperties, AUDIO_MICROPHONES_MUTE, microphonesStatus.getMute());
            }

            AudioDevices audioDevices = audioStatus.getDevices();
            if (audioDevices != null) {
                AudioDevicesBluetooth bluetoothDevices = audioDevices.getBluetooth();
                if (bluetoothDevices != null) {
                    addStatisticsParameter(statistics, "AudioDevices#BluetoothActiveProfile", bluetoothDevices.getActiveProfile());
                }
                AudioDevicesHeadsetUSB headsetUSB = audioDevices.getHeadsetUSB();
                if (headsetUSB != null) {
                    addStatisticsParameter(statistics, "AudioDevices#HeadsetUSBConnectionStatus", headsetUSB.getConnectionStatus());
                    addStatisticsParameter(statistics, "AudioDevices#HeadsetUSBDescription", headsetUSB.getDescription());
                    addStatisticsParameter(statistics, "AudioDevices#HeadsetUSBManufacturer", headsetUSB.getManufacturer());
                }
                AudioDevicesHandsetUSB handsetUSB = audioDevices.getHandsetUSB();
                if (handsetUSB != null) {
                    addStatisticsParameter(statistics, "AudioDevices#HandsetUSBConnectionStatus", handsetUSB.getConnectionStatus());
                    addStatisticsParameter(statistics, "AudioDevices#HandsetUSBCradle", handsetUSB.getCradle());
                }
            }

            AudioInput audioInput = audioStatus.getInput();
            if (audioInput != null) {
                AudioInputConnectors audioInputConnectors = audioInput.getConnectors();
                if (audioInputConnectors != null) {
                    Microphone[] microphones = audioInputConnectors.getMicrophones();
                    if (microphones != null) {
                        Arrays.stream(microphones).forEach(microphone -> {
                            String itemCounter = microphone.getItem();
                            addStatisticsParameter(statistics, String.format(N_MICROPHONE_STATUS, itemCounter), microphone.getConnectionStatus());
                            addStatisticsParameter(statistics, String.format(N_MICROPHONE_EC_REFERENCE_DELAY, itemCounter), microphone.getEcReferenceDelay());
                        });
                    }
                }
            }

            AudioOutput audioOutput = audioStatus.getOutput();
            if (audioOutput != null) {
                AudioOutputConnectors outputConnectors = audioOutput.getConnectors();
                if (outputConnectors != null) {
                    AudioOutputLine[] audioOutputLines = outputConnectors.getLines();
                    if (audioOutputLines != null) {
                        Arrays.stream(audioOutputLines).forEach(audioOutputLine -> {
                            addStatisticsParameter(statistics, String.format(N_INPUT_LINE_DELAY, audioOutputLine.getItem()), audioOutputLine.getDelayMs());
                        });
                    }
                }
            }
        }
    }

    /**
     * Retrieve Video statistics/controls values
     *
     * @param statistics             map to set statistics data to
     * @param controllableProperties list of controls to add controllable properties to
     * @param ciscoStatus            device status data fetched from {@link #statusPath}
     * @param configuration          device configuration data fetched from {@link #configurationPath}
     * @param valuespace             device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateVideoData(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                   CiscoStatus ciscoStatus, CiscoConfiguration configuration, String valuespace) {
        VideoStatus videoStatus = ciscoStatus.getVideo();
        if (videoStatus != null) {
            addStatisticsParameter(statistics, VIDEO_MONITORS, videoStatus.getMonitors());

            ActiveSpeaker activeSpeaker = videoStatus.getActiveSpeaker();
            if (activeSpeaker != null) {
                addStatisticsParameter(statistics, "Video#ActiveSpeakerPIPPosition", activeSpeaker.getPipPosition());
            }

            VideoInput videoInput = videoStatus.getInput();
            if (videoInput != null) {
                addStatisticsParameter(statistics, "Video#MainVideoSource", videoInput.getMainVideoSource());
            }

            VideoOutput videoOutput = videoStatus.getOutput();
            if (videoOutput != null) {
                VideoOutputConnector[] videoOutputConnectors = videoOutput.getConnectors();
                if (videoOutputConnectors != null) {
                    Arrays.stream(videoOutputConnectors).forEach(videoOutputConnector -> {
                        String propertyCounter = videoOutputConnector.getItem();
                        addStatisticsParameter(statistics, String.format(N_VIDEO_CONNECTOR_TYPE, propertyCounter), videoOutputConnector.getType());
                        addStatisticsParameter(statistics, String.format(N_VIDEO_CONNECTOR_CONNECTED, propertyCounter), videoOutputConnector.getConnected());
                        VideoOutputDevice videoOutputDevice = videoOutputConnector.getConnectedDevice();
                        if (videoOutputDevice != null) {
                            addStatisticsParameter(statistics, String.format(N_VIDEO_CONNECTOR_CONNECTED_DEVICE_NAME, propertyCounter), videoOutputDevice.getName());
                            addStatisticsParameter(statistics, String.format(N_VIDEO_CONNECTOR_CONNECTED_DEVICE_PREFERRED_FORMAT, propertyCounter), videoOutputDevice.getPreferredFormat());
                        }
                    });
                }
            }

            VideoLayout videoLayout = videoStatus.getLayout();
            if (videoLayout != null) {
                VideoLayoutFamily videoLayoutFamily = videoLayout.getLayoutFamily();
                if(videoLayoutFamily != null) {
                    addStatisticsParameter(statistics, "Video#LayoutFamily", videoLayoutFamily.getLocal());
                }
            }

            VideoSelfview videoSelfview = videoStatus.getSelfView();
            if (videoSelfview != null) {
                addStatisticsParameter(statistics, "VideoSelfView#FullscreenMode", videoSelfview.getFullscreenMode());
                addStatisticsParameter(statistics, "VideoSelfView#Mode", videoSelfview.getMode());
                addStatisticsParameter(statistics, "VideoSelfView#OnMonitorRole", videoSelfview.getOnMonitorRole());
                addStatisticsParameter(statistics, "VideoSelfView#PIPPosition", videoSelfview.getPipPosition());
            }
        }

        VideoConfiguration videoConfiguration = configuration.getVideo();
        if (videoConfiguration != null) {
            addStatisticsParameterWithDropdown(statistics, controllableProperties, USER_INTERFACE_DEFAULT_MAIN_SOURCE, videoConfiguration.getDefaultMainSource(), valuespace);
            addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_DEFAULT_PRESENTATION_SOURCE, videoConfiguration.getPresentation().getDefaultSource(), valuespace);
            addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_MONITORS, videoConfiguration.getMonitors(), valuespace);

            VideoConfigurationInput inputConfiguration = videoConfiguration.getInput();
            if (inputConfiguration != null) {
                VideoConfigurationConnector[] connectors = inputConfiguration.getConnectors();
                if (connectors != null) {
                    Arrays.stream(connectors).forEach(videoConfigurationConnector -> {
                        String itemCounter = videoConfigurationConnector.getItem();
                        addStatisticsParameterWithDropdown(statistics, controllableProperties,
                                String.format(N_INPUT_SOURCE_TYPE, itemCounter), videoConfigurationConnector.getInputSourceType(), valuespace);
                        addStatisticsParameterWithDropdown(statistics, controllableProperties,
                                String.format(N_INPUT_SOURCE_VISIBILITY, itemCounter), videoConfigurationConnector.getVisibility(), valuespace);
                        addStatisticsParameterWithDropdown(statistics, controllableProperties,
                                String.format(N_INPUT_SOURCE_PRESENTATION_SELECTION, itemCounter), videoConfigurationConnector.getPresentationSelection(), valuespace);
                        addStatisticsParameterWithDropdown(statistics, controllableProperties,
                                String.format(N_INPUT_SOURCE_QUALITY, itemCounter), videoConfigurationConnector.getQuality(), valuespace);
                        addStatisticsParameter(statistics, String.format(N_INPUT_SOURCE_NAME, itemCounter), videoConfigurationConnector.getName());
                    });
                }
            }

            VideoConfigurationOutput outputConfiguration = videoConfiguration.getOutput();
            if (outputConfiguration != null) {
                VideoConfigurationConnector[] connectors = outputConfiguration.getConnectors();
                if (connectors != null) {
                    Arrays.stream(connectors).forEach(videoConfigurationConnector -> {
                        String itemCounter = videoConfigurationConnector.getItem();
                        VideoConfigurationCEC cecConfiguration = videoConfigurationConnector.getCec();
                        if (cecConfiguration != null) {
                            addStatisticsParameterWithSwitch(statistics, controllableProperties, String.format(N_OUTPUT_SOURCE_CEC_MODE, itemCounter), cecConfiguration.getMode().getValue());
                        }
                        addStatisticsParameterWithDropdown(statistics, controllableProperties, String.format(N_OUTPUT_SOURCE_MONITOR_ROLE, itemCounter), videoConfigurationConnector.getMonitorRole(), valuespace);
                        addStatisticsParameterWithDropdown(statistics, controllableProperties, String.format(N_OUTPUT_SOURCE_OVERSCAN_LEVEL, itemCounter), videoConfigurationConnector.getOverscanLevel(), valuespace);
                        addStatisticsParameterWithDropdown(statistics, controllableProperties, String.format(N_OUTPUT_SOURCE_RESOLUTION, itemCounter), videoConfigurationConnector.getResolution(), valuespace);
                    });
                }
            }

            VideoConfigurationSelfview selfviewConfiguration = videoConfiguration.getSelfview();
            if (selfviewConfiguration != null) {
                VideoConfigurationSelfviewDefault defaultSelfview = selfviewConfiguration.getSelfviewDefault();
                if (defaultSelfview != null) {
                    addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_SELFVIEW_DEFAULT_FULLSCREEN_MODE, defaultSelfview.getFullscreenMode(), valuespace);
                    addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_SELFVIEW_DEFAULT_MODE, defaultSelfview.getMode(), valuespace);
                    addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_SELFVIEW_DEFAULT_ON_MONITOR_ROLE, defaultSelfview.getOnMonitorRole(), valuespace);
                    addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_SELFVIEW_DEFAULT_PIP_POSITION, defaultSelfview.getPipPosition(), valuespace);
                }

                VideoConfigurationSelfviewOnCall onCall = selfviewConfiguration.getOnCall();
                if (onCall != null) {
                    addStatisticsParameterWithSlider(statistics, controllableProperties, VIDEO_SELFVIEW_ON_CALL_DURATION, onCall.getDuration());
                    addStatisticsParameterWithDropdown(statistics, controllableProperties, VIDEO_SELFVIEW_ON_CALL_MODE, onCall.getMode(), valuespace);
                }
            }
        }
    }

    /**
     * Retrieve Call statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateCallData(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        Call[] calls = ciscoStatus.getCalls();
        if (calls == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate call data: no active calls available");
            }
            return;
        }
        Arrays.stream(calls).forEach(call -> {
            String itemCounter = call.getItem();
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_ANSWER_STATE, itemCounter), call.getAnswerState());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_TYPE, itemCounter), call.getCallType());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_CALLBACK_NUMBER, itemCounter), call.getCallbackNumber());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_DEVICE_TYPE, itemCounter), call.getDeviceType());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_DIRECTION, itemCounter), call.getDirection());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_DISPLAY_NAME, itemCounter), call.getDisplayName());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_DURATION, itemCounter), call.getDuration());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_FACILITY_SERVICE_ID, itemCounter), call.getFacilityServiceId());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_HOLD_REASON, itemCounter), call.getHoldReason());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_ON_HOLD, itemCounter), call.getPlacedOnHold());
            addStatisticsParameter(statistics, String.format(N_ACTIVE_CALL_PROTOCOL, itemCounter), call.getProtocol());
        });
    }

    /**
     * Retrieve Conference statistics/controls values
     *
     * @param statistics    map to set statistics data to
     * @param controls      list of controls to add controllable properties to
     * @param ciscoStatus   device status data fetched from {@link #statusPath}
     * @param configuration device configuration data fetched from {@link #configurationPath}
     * @param valuespace    device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateConferenceData(Map<String, String> statistics, List<AdvancedControllableProperty> controls,
                                        CiscoStatus ciscoStatus, CiscoConfiguration configuration, String valuespace) {
        ConferenceStatus conferenceStatus = ciscoStatus.getConference();
        if (conferenceStatus != null) {
            addStatisticsParameter(statistics, "Conference#DoNotDisturb", conferenceStatus.getDoNotDisturb());

            ActiveConferenceSpeaker activeConferenceSpeaker = conferenceStatus.getActiveSpeaker();
            if (activeConferenceSpeaker != null) {
                addStatisticsParameter(statistics, "Conference#ActiveSpeakerCallId", activeConferenceSpeaker.getCallId());
            }

            Multipoint multipoint = conferenceStatus.getMultipoint();
            if (multipoint != null) {
                addStatisticsParameter(statistics, "Conference#MultipointMode", multipoint.getMode());
            }

            Presentation presentation = conferenceStatus.getPresentation();
            if (presentation != null) {
                addStatisticsParameter(statistics, "Conference#PresentationMode", presentation.getMode());
                addStatisticsParameter(statistics, "Conference#PresentationCallId", presentation.getCallId());

                Whiteboard whiteboard = presentation.getWhiteboard();
                if (whiteboard != null) {
                    addStatisticsParameter(statistics, "Conference#WhiteboardMode", whiteboard.getMode());
                    addStatisticsParameter(statistics, "Conference#WhiteboardReleaseFloorAvailability", whiteboard.getReleaseFloorAvailability());
                    addStatisticsParameter(statistics, "Conference#WhiteboardRequestFloorAvailability", whiteboard.getRequestFloorAvailability());
                }
            }

            SpeakerLock speakerLock = conferenceStatus.getSpeakerLock();
            if (speakerLock != null) {
                addStatisticsParameter(statistics, "Conference#SpeakerLockMode", speakerLock.getMode());
                addStatisticsParameter(statistics, "Conference#SpeakerLockCallId", speakerLock.getCallId());
            }
        }

        ConferenceConfiguration conferenceConfiguration = configuration.getConference();
        if (conferenceConfiguration != null) {
            ConferenceConfigurationAutoAnswer autoAnswerConfiguration = conferenceConfiguration.getAutoAnswer();
            if (autoAnswerConfiguration != null) {
                addStatisticsParameterWithSlider(statistics, controls, CONFERENCE_AUTO_ANSWER_DELAY, autoAnswerConfiguration.getDelay());
                addStatisticsParameterWithSwitch(statistics, controls, CONFERENCE_AUTO_ANSWER_MODE, autoAnswerConfiguration.getMode().getValue());
                addStatisticsParameterWithSwitch(statistics, controls, CONFERENCE_AUTO_ANSWER_MUTE, autoAnswerConfiguration.getMute().getValue());
            }

            ConferenceConfigurationDefaultCall defaultCallConfiguration = conferenceConfiguration.getDefaultCall();
            if (defaultCallConfiguration != null) {
                addStatisticsParameterWithDropdown(statistics, controls, CONFERENCE_DEFAULT_CALL_PROTOCOL, defaultCallConfiguration.getProtocol(), valuespace);
                addStatisticsParameterWithSlider(statistics, controls, CONFERENCE_DEFAULT_CALL_RATE, defaultCallConfiguration.getRate());
            }

            ConferenceConfigurationDoNotDisturb doNotDisturbConfiguration = conferenceConfiguration.getDoNotDisturb();
            if (doNotDisturbConfiguration != null) {
                addStatisticsParameterWithSlider(statistics, controls, CONFERENCE_DO_NOT_DISTURB_TIMEOUT, doNotDisturbConfiguration.getDefaultTimeout());
            }

            ConferenceConfigurationEncryption encryptionConfiguration = conferenceConfiguration.getEncryption();
            if (encryptionConfiguration != null) {
                addStatisticsParameterWithDropdown(statistics, controls, CONFERENCE_ENCRYPTION_MODE, encryptionConfiguration.getMode(), valuespace);
            }

            ConferenceConfigurationFarEndControl farEndControlConfiguration = conferenceConfiguration.getFarEndControl();
            if (farEndControlConfiguration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, CONFERENCE_FAR_END_CONTROL, farEndControlConfiguration.getMode().getValue());
            }
        }
    }

    /**
     * Retrieve Conference capabilities statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateConferenceCapabilitiesData(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        Capabilities capabilities = ciscoStatus.getCapabilities();
        if (capabilities == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate confenrence capabilities data: no capabilities status available");
            }
            return;
        }
        ConferenceCapabilities conferenceCapabilities = capabilities.getConferenceCapabilities();
        if (conferenceCapabilities == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate confenrence capabilities data: no conference capabilities available");
            }
            return;
        }
        addStatisticsParameter(statistics, "ConferenceCapabilities#MaxActiveCalls", conferenceCapabilities.getMaxActiveCalls());
        addStatisticsParameter(statistics, "ConferenceCapabilities#MaxAudioCalls", conferenceCapabilities.getMaxAudioCalls());
        addStatisticsParameter(statistics, "ConferenceCapabilities#MaxCalls", conferenceCapabilities.getMaxCalls());
        addStatisticsParameter(statistics, "ConferenceCapabilities#MaxVideoCalls", conferenceCapabilities.getMaxVideoCalls());
    }

    /**
     * Retrieve H323 statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateH323Data(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        H323 h323 = ciscoStatus.getH323();
        if (h323 != null) {
            H323Gatekeeper gatekeeper = h323.getGatekeeper();
            if (gatekeeper != null) {
                addStatisticsParameter(statistics, "H323#GatekeeperAddress", gatekeeper.getAddress());
                addStatisticsParameter(statistics, "H323#GatekeeperPort", gatekeeper.getPort());
                addStatisticsParameter(statistics, "H323#GatekeeperRejectedReason", gatekeeper.getReason());
                addStatisticsParameter(statistics, "H323#GatekeeperStatus", gatekeeper.getStatus());
            }
            H323Mode mode = h323.getMode();
            if (mode != null) {
                addStatisticsParameter(statistics, "H323#Status", mode.getStatus());
                addStatisticsParameter(statistics, "H323#RejectedReason", mode.getReason());
            }
        }
    }

    /**
     * Retrieve SIP statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateSIPData(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        SIP sip = ciscoStatus.getSip();
        if (sip != null) {
            addStatisticsParameter(statistics, "SIP#Authentication", sip.getAuthentication());
            addStatisticsParameter(statistics, "SIP#Secure", sip.getSecure());
            addStatisticsParameter(statistics, "SIP#Verified", sip.getVerified());

            CallForward callForward = sip.getCallForward();
            if (callForward != null) {
                addStatisticsParameter(statistics, "SIP#DisplayName", callForward.getDisplayName());
                addStatisticsParameter(statistics, "SIP#CallForwardMode", callForward.getMode());
                addStatisticsParameter(statistics, "SIP#CallForwardUri", callForward.getUri());
            }

            Mailbox mailbox = sip.getMailbox();
            if (mailbox != null) {
                addStatisticsParameter(statistics, "SIP#MailboxMessagesWaiting", mailbox.getMessagesWaiting());
                addStatisticsParameter(statistics, "SIP#MailboxURI", mailbox.getUri());
            }

            Registration[] sipRegistrations = sip.getRegistrations();
            Proxy[] sipProxies = sip.getProxies();

            if (sipProxies != null) {
                Arrays.stream(sipProxies).forEach(proxy -> {
                    String itemCounter = proxy.getItem();
                    addStatisticsParameter(statistics, String.format(N_SIP_PROXY_ADDRESS, itemCounter), proxy.getAddress());
                    addStatisticsParameter(statistics, String.format(N_SIP_PROXY_STATUS, itemCounter), proxy.getStatus());
                });
            }
            if (sipRegistrations != null) {
                Arrays.stream(sipRegistrations).forEach(registration -> {
                    String itemCounter = registration.getItem();
                    addStatisticsParameter(statistics, String.format(N_SIP_REGISTRATION_STATUS, itemCounter), registration.getStatus());
                    addStatisticsParameter(statistics, String.format(N_SIP_REGISTRATION_URI, itemCounter), registration.getUri());
                    addStatisticsParameter(statistics, String.format(N_SIP_REGISTRATION_REJECTED_REASON, itemCounter), registration.getReason());
                });
            }
        }
    }

    /**
     * Retrieve Security statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateSecurityData(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        Security security = ciscoStatus.getSecurity();
        if (security != null) {
            FIPS fips = security.getFips();
            if (fips != null) {
                addStatisticsParameter(statistics, "Security#FIPSMode", fips.getMode());
            }

            Persistency persistency = security.getPersistency();
            if (persistency != null) {
                addStatisticsParameter(statistics, "Security#CallHistoryPersistency", persistency.getCallHistory());
                addStatisticsParameter(statistics, "Security#ConfigurationsPersistency", persistency.getConfigurations());
                addStatisticsParameter(statistics, "Security#DHCPPersistency", persistency.getDhcp());
                addStatisticsParameter(statistics, "Security#LocalPhonebookPersistency", persistency.getLocalPhonebook());
            }
        }
    }

    /**
     * Retrieve Network statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateNetworkData(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        Network[] networks = ciscoStatus.getNetworks();
        if (networks == null || networks.length == 0) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate network data: no networks information available");
            }
            return;
        }

        Arrays.stream(networks).forEach(network -> {
            String id = network.getItem();
            CDP cdp = network.getCdp();
            if (cdp != null) {
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_ADDRESS, id), cdp.getAddress());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_CAPABILITIES, id), cdp.getCapabilities());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_DEVICE_ID, id), cdp.getDeviceId());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_DUPLEX, id), cdp.getDuplex());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_PLATFORM, id), cdp.getPlatform());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_PORT_ID, id), cdp.getPortId());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_PRIMARY_MGMT_ADDRESS, id), cdp.getPrimaryMgmtAddress());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_SYSNAME, id), cdp.getSysName());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_SYS_OBJECT_ID, id), cdp.getSysObjectId());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_VERSION, id), cdp.getVersion());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_VOIP_APPLIANCE_VLAN_ID, id), cdp.getVoipApplianceVlanId());
                addStatisticsParameter(statistics, String.format(N_NETWORK_CDP_VTP_MGMT_DOMAIN, id), cdp.getVtpMgmtDomain());
            }

            DNS dns = network.getDns();
            if (dns != null) {
                DNSDomain dnsDomain = dns.getDnsDomain();
                if (dnsDomain != null) {
                    addStatisticsParameter(statistics, String.format(N_NETWORK_DNS_DOMAIN_NAME, id), dnsDomain.getName());
                }
                DNSServer[] dnsServers = dns.getDnsServers();
                if (dnsServers != null) {
                    Arrays.stream(dnsServers).forEach(dnsServer ->
                            addStatisticsParameter(statistics, String.format(N_NETWORK_DNS_ADDRESS, id, dnsServer.getItem()), dnsServer.getAddress()));
                }
            }

            Ethernet ethernet = network.getEthernet();
            if (ethernet != null) {
                addStatisticsParameter(statistics, String.format(N_NETWORK_ETHERNET_MAC_ADDRESS, id), ethernet.getMacAddress());
                addStatisticsParameter(statistics, String.format(N_NETWORK_ETHERNET_SPEED, id), ethernet.getSpeed());
            }

            IPv4 iPv4 = network.getiPv4();
            if (iPv4 != null) {
                addStatisticsParameter(statistics, String.format(N_NETWORK_IPV4_ADDRESS, id), iPv4.getAddress());
                addStatisticsParameter(statistics, String.format(N_NETWORK_IPV4_GATEWAY, id), iPv4.getGateway());
                addStatisticsParameter(statistics, String.format(N_NETWORK_IPV4_SUBNET_MASK, id), iPv4.getSubnetMask());
            }

            IPv6 iPv6 = network.getiPv6();
            if (iPv6 != null) {
                addStatisticsParameter(statistics, String.format(N_NETWORK_IPV6_ADDRESS, id), iPv6.getAddress());
                addStatisticsParameter(statistics, String.format(N_NETWORK_IPV6_GATEWAY, id), iPv6.getGateway());
            }
        });
    }

    /**
     * Retrieve Network Services statistics/controls values
     *
     * @param statistics         map to set statistics data to
     * @param controls           list of controls to add controllable properties to
     * @param ciscoStatus        device status data fetched from {@link #statusPath}
     * @param ciscoConfiguration device configuration data fetched from {@link #configurationPath}
     * @param valuespace         device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateNetworkServicesData(Map<String, String> statistics, List<AdvancedControllableProperty> controls,
                                             CiscoStatus ciscoStatus, CiscoConfiguration ciscoConfiguration, String valuespace) {
        NetworkServices networkServices = ciscoStatus.getNetworkServices();
        if (networkServices != null) {
            NTP ntp = networkServices.getNtp();
            if (ntp != null) {
                addStatisticsParameter(statistics, "NetworkServices#NTPAddress", ntp.getCurrentAddress());
                addStatisticsParameter(statistics, "NetworkServices#NTPDiscarded", ntp.getDiscarded());
                NTPServer[] ntpServers = ntp.getServers();
                if (ntpServers != null) {
                    Arrays.stream(ntpServers).forEach(ntpServer -> {
                        addStatisticsParameter(statistics, String.format(N_NETWORK_SERVICES_NTP_SERVER_ADDRESS, ntpServer.getItem()), ntpServer.getAddress());
                    });
                }
            }
        }

        NetworkServicesConfiguration networkServicesConfiguration = ciscoConfiguration.getNetworkServices();
        if (networkServicesConfiguration != null) {
            NetworkServicesConfigurationH323 h323Configuration = networkServicesConfiguration.getH323();
            if (h323Configuration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, NETWORK_SERVICES_H323_MODE, h323Configuration.getMode());
            }

            NetworkServicesConfigurationSIP sipConfiguration = networkServicesConfiguration.getSip();
            if (sipConfiguration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, NETWORK_SERVICES_SIP_MODE, sipConfiguration.getMode());
            }

            NetworkServicesConfigurationTelnet telnetConfiguration = networkServicesConfiguration.getTelnet();
            if (telnetConfiguration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, NETWORK_SERVICES_TELNET_MODE, telnetConfiguration.getMode());
            }

            NetworkServicesConfigurationSSH sshConfiguration = networkServicesConfiguration.getSsh();
            if (sshConfiguration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, NETWORK_SERVICES_SSH_MODE, sshConfiguration.getMode());
            }

            NetworkServicesConfigurationCDP cdpConfiguration = networkServicesConfiguration.getCdp();
            if (cdpConfiguration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, NETWORK_SERVICES_CDP_MODE, cdpConfiguration.getMode());
            }

            NetworkServicesConfigurationUPnP upNpConfiguration = networkServicesConfiguration.getuPnP();
            if (upNpConfiguration != null) {
                addStatisticsParameterWithSwitch(statistics, controls, NETWORK_SERVICES_UPNP_MODE, upNpConfiguration.getMode());
            }

            NetworkServicesConfigurationNTP ntpConfiguration = networkServicesConfiguration.getNtp();
            if (ntpConfiguration != null) {
                addStatisticsParameterWithDropdown(statistics, controls, NETWORK_SERVICES_NTP_MODE, ntpConfiguration.getMode(), valuespace);
            }

            NetworkServicesConfigurationHTTP httpConfiguration = networkServicesConfiguration.getHttp();
            if (httpConfiguration != null) {
                addStatisticsParameter(statistics, "NetworkServices#HTTPMode", httpConfiguration.getMode());
            }

            NetworkServicesConfigurationHTTPS httpsConfiguration = networkServicesConfiguration.getHttps();
            if (httpsConfiguration != null) {
                NetworkConfigurationServer networkConfigurationServer = httpsConfiguration.getServer();
                if (networkConfigurationServer != null) {
                    addStatisticsParameter(statistics, "NetworkServices#HTTPSMinimumTLSVersion", networkConfigurationServer.getMinimumTLSVersion());
                }
                addStatisticsParameter(statistics, "NetworkServices#HTTPSStrictTransportSecurity", httpsConfiguration.getStrictTransportSecurity());
                addStatisticsParameter(statistics, "NetworkServices#HTTPSVerifyClientCertificate", httpsConfiguration.getVerifyClientCertificate());
                addStatisticsParameter(statistics, "NetworkServices#HTTPSVerifyServerCertificate", httpsConfiguration.getVerifyServerCertificate());
            }

            NetworkServicesConfigurationSNMP snmpConfiguration = networkServicesConfiguration.getSnmp();
            if (snmpConfiguration != null) {
                addStatisticsParameter(statistics, "NetworkServices#SNMPCommunityName", snmpConfiguration.getCommunityName());
                addStatisticsParameter(statistics, "NetworkServices#SNMPMode", snmpConfiguration.getMode());
                addStatisticsParameter(statistics, "NetworkServices#SNMPSystemContact", snmpConfiguration.getSystemContact());
                addStatisticsParameter(statistics, "NetworkServices#SNMPSystemLocation", snmpConfiguration.getSystemLocation());

                NetworkConfigurationServer[] servers = snmpConfiguration.getHosts();
                if (servers != null) {
                    Arrays.stream(servers).forEach(networkConfigurationServer -> {
                        addStatisticsParameter(statistics, String.format(N_NETWORK_SERVICES_SNMP_HOST_ADDRESS, networkConfigurationServer.getItem()), networkConfigurationServer.getAddress());
                    });
                }
            }

            addStatisticsParameterWithDropdown(statistics, controls, NETWORK_SERVICES_WELCOME_TEXT, networkServicesConfiguration.getWelcomeText(), valuespace);
        }
    }

    /**
     * Retrieve USB statistics data
     *
     * @param statistics  map to set statistics data to
     * @param ciscoStatus device status data fetched from {@link #statusPath}
     */
    private void populateUSBData(Map<String, String> statistics, CiscoStatus ciscoStatus) {
        USB usb = ciscoStatus.getUsb();
        if (usb != null) {
            Device[] devices = usb.getDevices();
            if (devices != null) {
                Arrays.stream(devices).forEach(device -> {
                    String itemCounter = device.getItem();
                    addStatisticsParameter(statistics, String.format(N_USB_DEVICE_STATE, itemCounter), device.getState());
                    addStatisticsParameter(statistics, String.format(N_USB_DEVICE_TYPE, itemCounter), device.getType());
                });
            }
        }
    }

    /**
     * Retrieve Room Analytics statistics/controls values
     *
     * @param statistics    map to set statistics data to
     * @param controls      list of controls to add controllable properties to
     * @param status        device status data fetched from {@link #statusPath}
     * @param configuration device configuration data fetched from {@link #configurationPath}
     */
    private void populateRoomAnalyticsData(Map<String, String> statistics, List<AdvancedControllableProperty> controls, CiscoConfiguration configuration, CiscoStatus status) {
        RoomAnalytics roomAnalytics = status.getRoomAnalytics();
        if (roomAnalytics != null) {
            addStatisticsParameter(statistics, "RoomAnalytics#PeoplePresence", roomAnalytics.getPeoplePresence());
            RoomAnalyticsConfiguration roomAnalyticsConfiguration = configuration.getRoomAnalytics();
            if (roomAnalyticsConfiguration != null) {
                ValueSpaceRefHolder peoplePresenceDetectorState = roomAnalyticsConfiguration.getPeoplePresenceDetector();
                if (peoplePresenceDetectorState != null) {
                    addStatisticsParameterWithSwitch(statistics, controls, ROOM_ANALYTICS_PEOPLE_PRESENCE_DETECTION, peoplePresenceDetectorState);
                }
            }

            AmbientNoise ambientNoise = roomAnalytics.getAmbientNoise();
            if (ambientNoise != null) {
                Level ambientNoiseLevel = ambientNoise.getLevel();
                if (ambientNoiseLevel != null) {
                    addStatisticsParameter(statistics, "RoomAnalytics#AmbientNoiseLevelA", ambientNoiseLevel.getA());
                }
            }

            Sound sound = roomAnalytics.getSound();
            if (sound != null) {
                Level soundLevel = sound.getLevel();
                if (soundLevel != null) {
                    addStatisticsParameter(statistics, "RoomAnalytics#SoundLevelA", soundLevel.getA());
                }
            }

            Engagement engagement = roomAnalytics.getEngagement();
            if (engagement != null) {
                addStatisticsParameter(statistics, "RoomAnalytics#CloseProximity", engagement.getCloseProximity());
            }

            PeopleCount peopleCount = roomAnalytics.getPeopleCount();
            if (peopleCount != null) {
                addStatisticsParameter(statistics, "RoomAnalytics#CurrentPeopleCount", peopleCount.getCurrent());
            }
        }
    }

    /**
     * Retrieve Proximity statistics/controls values
     *
     * @param statistics    map to set statistics data to
     * @param controls      list of controls to add controllable properties to
     * @param configuration device configuration data fetched from {@link #configurationPath}
     */
    private void populateProximityData(Map<String, String> statistics, List<AdvancedControllableProperty> controls, CiscoConfiguration configuration) {
        ProximityConfiguration proximityConfiguration = configuration.getProximity();
        if (proximityConfiguration != null) {
            ValueSpaceRefHolder proximityMode = proximityConfiguration.getMode();
            if (proximityMode != null) {
                addStatisticsParameterWithSwitch(statistics, controls, PROXIMITY_SERVICES_MODE, proximityMode);
            }

            ProximityConfigurationServices services = proximityConfiguration.getServices();
            if (services != null) {
                ValueSpaceRefHolder callControl = services.getCallControl();
                if (callControl != null) {
                    String controlValue = callControl.getValue();
                    addStatisticsParameter(statistics, PROXIMITY_SERVICES_CALL_CONTROL, controlValue);
                    controls.add(createSwitch(PROXIMITY_SERVICES_CALL_CONTROL, controlValue.equals("Enabled") ? 1 : 0));
                }
                ProximityConfigurationContentShare contentShare = services.getContentShare();
                if (contentShare != null) {
                    ValueSpaceRefHolder toClients = contentShare.getToClients();
                    if (toClients != null) {
                        String toClientsValue = toClients.getValue();
                        addStatisticsParameter(statistics, PROXIMITY_SERVICES_CONTENT_SHARE_TO_CLIENTS, toClientsValue);
                        controls.add(createSwitch(PROXIMITY_SERVICES_CONTENT_SHARE_TO_CLIENTS, toClientsValue.equals("Enabled") ? 1 : 0));
                    }
                    ValueSpaceRefHolder fromClients = contentShare.getFromClients();
                    if (fromClients != null) {
                        String fromClientsValue = fromClients.getValue();
                        addStatisticsParameter(statistics, PROXIMITY_SERVICES_CONTENT_SHARE_FROM_CLIENTS, fromClientsValue);
                        controls.add(createSwitch(PROXIMITY_SERVICES_CONTENT_SHARE_FROM_CLIENTS, fromClientsValue.equals("Enabled") ? 1 : 0));
                    }
                }
            }
        }
    }

    /**
     * Retrieve User Interface statistics/controls values
     *
     * @param statistics    map to set statistics data to
     * @param controls      list of controls to add controllable properties to
     * @param configuration device configuration data fetched from {@link #configurationPath}
     * @param valuespace    device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateUserInterfaceData(Map<String, String> statistics, List<AdvancedControllableProperty> controls, CiscoConfiguration configuration, String valuespace) {
        UserInterfaceConfiguration userInterfaceConfiguration = configuration.getUserInterface();
        if (userInterfaceConfiguration != null) {
            addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_LANGUAGE, userInterfaceConfiguration.getLanguage(), valuespace);

            UserInterfaceConfigurationKeyTones keyTones = userInterfaceConfiguration.getKeyTones();
            if (keyTones != null) {
                addStatisticsParameterWithSwitch(statistics, controls, USER_INTERFACE_KEY_TONES, keyTones.getMode().getValue());
            }

            UserInterfaceConfigurationContactInfo contactInfo = userInterfaceConfiguration.getContactInfo();
            if (contactInfo != null) {
                addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_CONTACT_INFO_TYPE, contactInfo.getType(), valuespace);
            }

            UserInterfaceConfigurationFeatures features = userInterfaceConfiguration.getFeatures();
            if (features != null) {
                UserInterfaceConfigurationFeaturesCall featuresCall = features.getCall();
                if (featuresCall != null) {
                    addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_FEATURES_CALL_END, featuresCall.getEnd(), valuespace);
                    addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_FEATURES_MID_CALL, featuresCall.getMidCallControls(), valuespace);
                    addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_FEATURES_CALL_START, featuresCall.getStart(), valuespace);
                }

                UserInterfaceConfigurationFeaturesShare featuresShare = features.getShare();
                if (featuresShare != null) {
                    addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_SHARE_START, featuresShare.getStart(), valuespace);
                }

                UserInterfaceConfigurationFeaturesWhiteboard featuresWhiteboard = features.getWhiteboard();
                if (featuresWhiteboard != null) {
                    addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_WHITEBOARD_START, featuresWhiteboard.getStart(), valuespace);
                }

                addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_HIDE_ALL_FEATURES, features.getHideAll(), valuespace);
            }

            UserInterfaceConfigurationBranding branding = userInterfaceConfiguration.getBranding();
            if (branding != null) {
                UserInterfaceConfigurationAwakeBranding awakeBranding = branding.getAwakeBranding();
                if (awakeBranding != null) {
                    addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_AWAKE_BRANDING_COLORS, awakeBranding.getColors(), valuespace);
                }
            }

            UserInterfaceConfigurationAccessibility accessibility = userInterfaceConfiguration.getAccessibility();
            if (accessibility != null) {
                addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_INCOMING_CALL_NOTIFICATION, accessibility.getIncomingCallNotification(), valuespace);
            }

            UserInterfaceConfigurationOSD osd = userInterfaceConfiguration.getOsd();
            if (osd != null) {
                addStatisticsParameterWithDropdown(statistics, controls, USER_INTERFACE_OSD_OUTPUT, osd.getOutput(), valuespace);
            }
        }
    }

    /**
     * Retrieve Standby statistics/controls values
     *
     * @param statistics    map to set statistics data to
     * @param controls      list of controls to add controllable properties to
     * @param status        device status data fetched from {@link #statusPath}
     * @param configuration device configuration data fetched from {@link #configurationPath}
     * @param valuespace    device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateStandbyData(Map<String, String> statistics, List<AdvancedControllableProperty> controls, CiscoStatus status, CiscoConfiguration configuration, String valuespace) {
        Standby standbyStatus = status.getStandby();
        if (standbyStatus != null) {
            addStatisticsParameterWithSwitch(statistics, controls, STANDBY_STATE, standbyStatus.getState());
        }

        StandbyConfiguration standbyConfiguration = configuration.getStandby();
        if (standbyConfiguration != null) {
            ValueSpaceRefHolder control = standbyConfiguration.getControl();
            if (control != null) {
                addStatisticsParameterWithSwitch(statistics, controls, STANDBY_CONTROL, control.getValue());
            }
            addStatisticsParameterWithDropdown(statistics, controls, STANDBY_BOOT_ACTION, standbyConfiguration.getBootAction(), valuespace);
            addStatisticsParameterWithSlider(statistics, controls, STANDBY_DELAY, standbyConfiguration.getDelay());
            addStatisticsParameterWithDropdown(statistics, controls, STANDBY_ACTION, standbyConfiguration.getStandbyAction(), valuespace);
            addStatisticsParameterWithDropdown(statistics, controls, STANDBY_WAKEUP_ACTION, standbyConfiguration.getWakeupAction(), valuespace);
        }
    }

    /**
     * Retrieve Camera statistics/controls values
     *
     * @param statistics    map to set statistics data to
     * @param controls      list of controls to add controllable properties to
     * @param status        device status data fetched from {@link #statusPath}
     * @param configuration device configuration data fetched from {@link #configurationPath}
     * @param valuespace    device valuespace data fetched from {@link #valuespacePath}
     */
    private void populateCameraData(Map<String, String> statistics, List<AdvancedControllableProperty> controls, CiscoStatus status, CiscoConfiguration configuration, String valuespace) throws Exception {
        Cameras camerasStatus = status.getCameras();
        if (camerasStatus != null) {
            Camera[] cameras = camerasStatus.getCameras();
            if (cameras != null) {
                Command cameraCommand = retrieveCameraCommands();
                Arrays.stream(cameras).forEach(camera -> {
                    String itemCounter = camera.getItem();
                    addStatisticsParameter(statistics, String.format(N_CAMERA_CONNECTED, itemCounter), camera.getConnected());
                    addStatisticsParameter(statistics, String.format(N_CAMERA_HARDWARE_ID, itemCounter), camera.getHardwareId());
                    addStatisticsParameter(statistics, String.format(N_CAMERA_MAC_ADDRESS, itemCounter), camera.getMacAddress());
                    addStatisticsParameter(statistics, String.format(N_CAMERA_MANUFACTURER, itemCounter), camera.getManufacturer());
                    addStatisticsParameter(statistics, String.format(N_CAMERA_MODEL, itemCounter), camera.getModel());
                    addStatisticsParameter(statistics, String.format(N_CAMERA_SERIAL_NUMBER, itemCounter), camera.getSerialNumber());
                    addStatisticsParameter(statistics, String.format(N_CAMERA_SERIAL_SOFTWARE_ID, itemCounter), camera.getSoftwareId());

                    CameraPosition cameraPosition = camera.getPosition();
                    if (cameraPosition != null && cameraCommand != null && cameraCommand.getCameraCommand() != null) {
                        CameraPositionSetCommand positionSetCommand = cameraCommand.getCameraCommand().getPositionSetCommand();

                        ValueSpaceRefHolder[] focus = positionSetCommand.getFocus();
                        if (focus != null) {
                            Arrays.stream(focus).filter(valueSpaceRefHolder -> valueSpaceRefHolder.getItem().equals(itemCounter)).findFirst().ifPresent(focusValues -> {
                                focusValues.setValue(cameraPosition.getFocus());
                                addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_FOCUS, itemCounter), focusValues);
                            });
                        }

                        ValueSpaceRefHolder[] pan = positionSetCommand.getPan();
                        if (pan != null) {
                            Arrays.stream(pan).filter(valueSpaceRefHolder -> valueSpaceRefHolder.getItem().equals(itemCounter)).findFirst().ifPresent(panValues -> {
                                panValues.setValue(cameraPosition.getPan());
                                addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_PAN, itemCounter), panValues);
                            });
                        }

                        ValueSpaceRefHolder[] tilt = positionSetCommand.getTilt();
                        if (tilt != null) {
                            Arrays.stream(tilt).filter(valueSpaceRefHolder -> valueSpaceRefHolder.getItem().equals(itemCounter)).findFirst().ifPresent(tiltValues -> {
                                tiltValues.setValue(cameraPosition.getTilt());
                                addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_TILT, itemCounter), tiltValues);
                            });
                        }

                        ValueSpaceRefHolder[] zoom = positionSetCommand.getZoom();
                        if (zoom != null) {
                            Arrays.stream(zoom).filter(valueSpaceRefHolder -> valueSpaceRefHolder.getItem().equals(itemCounter)).findFirst().ifPresent(zoomValues -> {
                                zoomValues.setValue(cameraPosition.getZoom());
                                addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_ZOOM, itemCounter), zoomValues);
                            });
                        }
                    }
                });
            }
        }

        CamerasConfiguration camerasConfiguration = configuration.getCameras();
        if (camerasConfiguration == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate cameras configuration data: no cameras configuration available");
            }
            return;
        }
        CamerasConfigurationPreset camerasPreset = camerasConfiguration.getPreset();
        if (camerasPreset != null) {
            ValueSpaceRefHolder triggerAutofocus = camerasPreset.getTriggerAutofocus();
            if (triggerAutofocus != null) {
                addStatisticsParameterWithDropdown(statistics, controls, CAMERAS_TRIGGER_AUTOFOCUS_PRESET,
                        Arrays.stream(extractTTPARValuespace(valuespace, triggerAutofocus.getValueSpaceRef()).getValues())
                                .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), triggerAutofocus.getValue());
            }
        }

        CamerasConfigurationCamera[] cameras = camerasConfiguration.getCameras();
        if (cameras == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate cameras configuration data: no cameras configuration available");
            }
            return;
        }
        Arrays.stream(cameras).forEach(cameraConfiguration -> {
            CamerasConfigurationBacklight backlight = cameraConfiguration.getBacklight();
            String itemCounter = cameraConfiguration.getItem();
            if (backlight != null) {
                addStatisticsParameterWithSwitch(statistics, controls, String.format(N_CAMERA_BACKLIGHT, itemCounter), backlight.getDefaultMode().getValue());
            }

            CamerasConfigurationBrightness brightness = cameraConfiguration.getBrightness();
            if (brightness != null) {
                addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_BRIGHTNESS_LEVEL, itemCounter), brightness.getDefaultLevel());
                addStatisticsParameterWithDropdown(statistics, controls, String.format(N_CAMERA_BRIGHTNESS_MODE, itemCounter),
                        Arrays.stream(extractTTPARValuespace(valuespace, brightness.getMode().getValueSpaceRef()).getValues())
                                .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), brightness.getMode().getValue());
            }

            ValueSpaceRefHolder flip = cameraConfiguration.getFlip();
            if (flip != null) {
                addStatisticsParameterWithDropdown(statistics, controls, String.format(N_CAMERA_FLIP, itemCounter),
                        Arrays.stream(extractTTPARValuespace(valuespace, flip.getValueSpaceRef()).getValues())
                                .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), flip.getValue());
            }

            CamerasConfigurationFocus focus = cameraConfiguration.getFocus();
            if (focus != null) {
                addStatisticsParameterWithDropdown(statistics, controls, String.format(N_CAMERA_FOCUS_MODE, itemCounter),
                        Arrays.stream(extractTTPARValuespace(valuespace, focus.getMode().getValueSpaceRef()).getValues())
                                .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), focus.getMode().getValue());
            }

            CamerasConfigurationGamma gamma = cameraConfiguration.getGamma();
            if (gamma != null) {
                addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_GAMMA_LEVEL, itemCounter), gamma.getLevel());
                addStatisticsParameterWithDropdown(statistics, controls, String.format(N_CAMERA_GAMMA_MODE, itemCounter),
                        Arrays.stream(extractTTPARValuespace(valuespace, gamma.getMode().getValueSpaceRef()).getValues())
                                .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), gamma.getMode().getValue());
            }

            ValueSpaceRefHolder irSensor = cameraConfiguration.getIrSensor();
            if (irSensor != null) {
                addStatisticsParameterWithSwitch(statistics, controls, String.format(N_CAMERA_IR_SENSOR, itemCounter), irSensor.getValue());
            }

            ValueSpaceRefHolder mirror = cameraConfiguration.getMirror();
            if (mirror != null) {
                addStatisticsParameterWithDropdown(statistics, controls, String.format(N_CAMERA_MIRROR, itemCounter),
                        Arrays.stream(extractTTPARValuespace(valuespace, mirror.getValueSpaceRef()).getValues())
                                .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), mirror.getValue());
            }

            CamerasConfigurationWhitebalance whitebalance = cameraConfiguration.getWhitebalance();
            if (whitebalance != null) {
                ValueSpaceRefHolder whitebalanceMode = whitebalance.getMode();
                if (whitebalanceMode != null) {
                    addStatisticsParameterWithSlider(statistics, controls, String.format(N_CAMERA_WHITEBALANCE_LEVEL, itemCounter), whitebalance.getLevel());
                    addStatisticsParameterWithDropdown(statistics, controls, String.format(N_CAMERA_WHITEBALANCE_MODE, itemCounter),
                            Arrays.stream(extractTTPARValuespace(valuespace, whitebalanceMode.getValueSpaceRef()).getValues())
                                    .map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), whitebalanceMode.getValue());
                }
            }
        });
    }

    /**
     * Instantiate Text controllable property
     *
     * @param name         name of the property
     * @param label        default button label
     * @param labelPressed button label when is pressed
     * @param gracePeriod  period to pause monitoring statistics for
     * @return instance of AdvancedControllableProperty with AdvancedControllableProperty.Button as type
     */
    private AdvancedControllableProperty createButton(String name, String label, String labelPressed, long gracePeriod) {
        AdvancedControllableProperty.Button button = new AdvancedControllableProperty.Button();
        button.setLabel(label);
        button.setLabelPressed(labelPressed);
        button.setGracePeriod(gracePeriod);

        return new AdvancedControllableProperty(name, new Date(), button, "");
    }

    /**
     * Create a switch controllable property
     *
     * @param name   name of the switch
     * @param status initial switch state (0|1)
     * @return AdvancedControllableProperty button instance
     */
    private AdvancedControllableProperty createSwitch(String name, int status) {
        AdvancedControllableProperty.Switch toggle = new AdvancedControllableProperty.Switch();
        toggle.setLabelOff("Off");
        toggle.setLabelOn("On");

        AdvancedControllableProperty advancedControllableProperty = new AdvancedControllableProperty();
        advancedControllableProperty.setName(name);
        advancedControllableProperty.setValue(status);
        advancedControllableProperty.setType(toggle);
        advancedControllableProperty.setTimestamp(new Date());

        return advancedControllableProperty;
    }

    /***
     * Create AdvancedControllableProperty slider instance
     *
     * @param name name of the control
     * @param initialValue initial value of the control
     * @param rangeStart start value for the slider
     * @param rangeEnd end value for the slider
     *
     * @return AdvancedControllableProperty slider instance
     */
    private AdvancedControllableProperty createSlider(String name, Float rangeStart, Float rangeEnd, Float initialValue) {
        AdvancedControllableProperty.Slider slider = new AdvancedControllableProperty.Slider();
        slider.setLabelStart(String.valueOf(rangeStart));
        slider.setLabelEnd(String.valueOf(rangeEnd));
        slider.setRangeStart(rangeStart);
        slider.setRangeEnd(rangeEnd);

        return new AdvancedControllableProperty(name, new Date(), slider, initialValue);
    }

    /***
     * Create AdvancedControllableProperty preset instance
     * @param name name of the control
     * @param initialValue initial value of the control
     * @return AdvancedControllableProperty preset instance
     */
    private AdvancedControllableProperty createDropdown(String name, List<String> values, String initialValue) {
        AdvancedControllableProperty.DropDown dropDown = new AdvancedControllableProperty.DropDown();
        dropDown.setOptions(values.toArray(new String[0]));
        dropDown.setLabels(values.toArray(new String[0]));

        return new AdvancedControllableProperty(name, new Date(), dropDown, initialValue);
    }

    /***
     * Set audio channel statistics for EndpointStatistics
     *
     * @param audioChannelStats instance to set data to
     * @param callStats instance to add general stats to
     * @param channel data, retrieved from the device
     * @param callInfo call information, retrieved from the device
     */
    private void enrichAudioChannelStatsData(AudioChannelStats audioChannelStats, CallStats callStats, Channel channel, Call callInfo) {
        Audio audio = channel.getAudio();
        if (audio == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate audio channel data: no audio status available");
            }
            return;
        }
        String audioChannelProtocol = audio.getProtocol();
        if (StringUtils.isNullOrEmpty(audioChannelProtocol) || audioChannelProtocol.equals("Off")) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate audio channel data: no audio protocol available");
            }
            return;
        }
        Netstat netstat = channel.getNetstat();
        if (netstat == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate audio channel data: no netstat data available");
            }
            return;
        }
        audioChannelStats.setCodec(audioChannelProtocol);
        String netstatChannelRate = netstat.getChannelRate();
        switch (channel.getDirection()) {
            case "Incoming":
                audioChannelStats.setPacketLossRx(extractValueInt(netstat.getLoss()));
                audioChannelStats.setJitterRx(extractValueFloat(netstat.getJitter()));
                audioChannelStats.setBitRateRx(extractAndReduceValueInt(netstatChannelRate, 1000));
                if ("Audio".equals(callInfo.getCallType())) {
                    callStats.setCallRateRx(extractAndReduceValueInt(netstatChannelRate, 1000));
                }
                break;
            case "Outgoing":
                audioChannelStats.setPacketLossTx(extractValueInt(netstat.getLoss()));
                audioChannelStats.setJitterTx(extractValueFloat(netstat.getJitter()));
                audioChannelStats.setBitRateTx(extractAndReduceValueInt(netstatChannelRate, 1000));
                audioChannelStats.setMuteTx(Boolean.valueOf(audio.getMute()));
                if ("Audio".equals(callInfo.getCallType())) {
                    callStats.setCallRateTx(extractAndReduceValueInt(netstatChannelRate, 1000));
                }
                break;
            default:
                logger.info("Channel direction not supported: " + channel.getDirection());
                break;
        }
    }

    /***
     * Set video channel statistics for EndpointStatistics
     *
     * @param videoChannelStats instance to set data to
     * @param callStats instance to add general stats to
     * @param contentChannelStats instance to add content data to
     * @param channel data, retrieved from the device
     * @param callInfo call information, retrieved from the device
     */
    private void enrichVideoChannelStatsData(VideoChannelStats videoChannelStats, CallStats callStats, ContentChannelStats contentChannelStats, Channel channel, Call callInfo) {
        Video video = channel.getVideo();
        if (video == null) {
            return;
        }
        String channelRole = video.getChannelRole();
        if ("Presentation".equals(channelRole) || "Data".equals(channelRole)) {
            enrichContentChannelStatsData(contentChannelStats, channel);
            // skip on "Data" (i.e. Cisco SX) or "Presentation" (i.e. Cisco WebEx) type channels
            return;
        }
        String videoChannelProtocol = video.getProtocol();
        if (videoChannelProtocol == null || videoChannelProtocol.equals("Off")) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate video channel data: no video channel protocol information available");
            }
            return;
        }
        Netstat netstat = channel.getNetstat();
        if (netstat == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate video channel data: no netstat information available");
            }
            return;
        }
        String netstatChannelRate = netstat.getChannelRate();
        videoChannelStats.setCodec(videoChannelProtocol);
        switch (channel.getDirection()) {
            case "Incoming":
                videoChannelStats.setFrameSizeRx(extractValueInt(video.getResolutionX()), extractValueInt(video.getResolutionY()));
                videoChannelStats.setFrameRateRx(extractValueFloat(video.getFrameRate()));
                videoChannelStats.setJitterRx(extractValueFloat(netstat.getJitter()));
                videoChannelStats.setBitRateRx(extractAndReduceValueInt(netstatChannelRate, 1000));
                videoChannelStats.setPacketLossRx(extractValueInt(netstat.getLoss()));
                if ("Video".equals(callInfo.getCallType())) {
                    callStats.setCallRateRx(extractAndReduceValueInt(netstatChannelRate, 1000));
                }
                break;
            case "Outgoing":
                videoChannelStats.setFrameSizeTx(extractValueInt(video.getResolutionX()), extractValueInt(video.getResolutionY()));
                videoChannelStats.setFrameRateTx(extractValueFloat(video.getFrameRate()));
                videoChannelStats.setJitterTx(extractValueFloat(netstat.getJitter()));
                videoChannelStats.setBitRateTx(extractAndReduceValueInt(netstatChannelRate, 1000));
                videoChannelStats.setPacketLossTx(extractValueInt(netstat.getLoss()));
                if ("Audio".equals(callInfo.getCallType())) {
                    callStats.setCallRateTx(extractAndReduceValueInt(netstatChannelRate, 1000));
                }
                break;
            default:
                logger.info("Channel direction not supported: " + channel.getDirection());
                break;
        }
    }

    /***
     * Set content channel statistics for EndpointStatistics
     *
     * @param contentChannelStats instance to add content data to
     * @param channel data, retrieved from the device
     */
    private void enrichContentChannelStatsData(ContentChannelStats contentChannelStats, Channel channel) {
        Video video = channel.getVideo();
        if (video == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate content channel data: no video information available");
            }
            return;
        }

        Netstat netstat = channel.getNetstat();
        if (netstat == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("Unable to populate content channel data: no netstat information available");
            }
            return;
        }

        contentChannelStats.setCodec(video.getProtocol());

        switch (channel.getDirection()) {
            case "Incoming":
                contentChannelStats.setJitterRx(Float.valueOf(netstat.getJitter()));
                contentChannelStats.setBitRateRx(Integer.valueOf(netstat.getChannelRate()));
                contentChannelStats.setFrameRateRx(Float.valueOf(video.getFrameRate()));
                contentChannelStats.setFrameSizeRx(Integer.valueOf(video.getResolutionX()), Integer.valueOf(video.getResolutionY()));
                contentChannelStats.setPacketLossRx(Integer.valueOf(netstat.getLoss()));
                break;
            case "Outgoing":
                contentChannelStats.setJitterTx(Float.valueOf(netstat.getJitter()));
                contentChannelStats.setBitRateTx(Integer.valueOf(netstat.getChannelRate()));
                contentChannelStats.setFrameRateTx(Float.valueOf(video.getFrameRate()));
                contentChannelStats.setFrameSizeTx(Integer.valueOf(video.getResolutionX()), Integer.valueOf(video.getResolutionY()));
                contentChannelStats.setPacketLossTx(Integer.valueOf(netstat.getLoss()));
                break;
            default:
                logger.info("Channel direction not supported: " + channel.getDirection());
                break;
        }
    }

    private Integer extractValueInt(String value) {
        if (!isNumeric(value)) {
            if (logger.isDebugEnabled()) {
                logger.debug("Value is missing or has incorrect format. Skipping.");
            }
            return null;
        }
        return Integer.parseInt(value);
    }

    private Integer extractAndReduceValueInt(String value, int reducer) {
        if (!isNumeric(value)) {
            if (logger.isDebugEnabled()) {
                logger.debug("Value is missing or has incorrect format. Skipping.");
            }
            return null;
        }
        return Integer.parseInt(value) / reducer;
    }

    private Float extractValueFloat(String value) {
        if (!isNumeric(value)) {
            if (logger.isDebugEnabled()) {
                logger.debug("Value is missing or has incorrect format. Skipping.");
            }
            return null;
        }
        return Float.parseFloat(value);
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

    /***
     *  Retrieve string value of /valuespace.xml response to fetch data limits for control operations based on this.
     *  Since the format is quite vast - to limit number of models created for it, model is extracted from the
     *  string response and then is mapped to an {@link ValueSpace} type
     *
     * @return String value of "valuespace.xml" response
     * @throws Exception if any error occurs
     */
    private String retrieveValuespace() throws Exception {
        return doGet(valuespacePath, String.class);
    }

    /**
     * Retrieve all the status information with valuespace(schema) values
     *
     * @return {@link CiscoStatus} instance with all the data needed
     * @throws Exception if any error occurs
     */
    private CiscoStatus retrieveStatus() throws Exception {
        return doGet(statusPath, CiscoStatus.class);
    }

    /**
     * Retrieve all the configuration information with valuespace(schema) values
     *
     * @return {@link CiscoConfiguration} instance with all the data needed
     * @throws Exception if any error occurs
     */
    private CiscoConfiguration retrieveConfiguration() throws Exception {
        return doGet(configurationPath, CiscoConfiguration.class);
    }

    /***
     * Retrieve templates for camera controls (zoom, pan, tilt, focus).
     * If no controls are available - EmptyResult node is returned.
     *
     * By default, values are limited as follows:
     * Pan: <-65535..65535>
     * Tilt: <-65535..65535>
     * Zoom: <0..65535>
     * Focus: <0..65535>
     * However, for different camera models this values differ and are based on the valueSpaceRef schema value
     * extracted from {@link #cameraCommandUri} url.
     *
     * @return {@link Command} instance, containing information for camera controls
     * @throws Exception if any error occurs
     */
    private Command retrieveCameraCommands() throws Exception {
        try {
            return doGet(String.format(getXmlPath, cameraCommandUri), Command.class);
        } catch (RestClientException ex) {
            // Jaxb is not able to handle multiple RootNodes as well as ignoring them.
            // If there are no description for camera commands - <EmptyResult\> node will be populated instead of <Command>,
            // so Jaxb expects that to be in place at all times (as opposed to Jackson, which will just handle that as
            // blank value for the Command root)
            // So, if EmptyResult substring was found - it is due to the <EmptyResult/> root node, which means there
            // are no available Camera commands available on the device.
            String message = ex.getMessage();
            if (!StringUtils.isNullOrEmpty(message) && message.contains("EmptyResult")) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Camera controls are not available on the device. Skipping.");
                }
                return null;
            }
            throw ex;
        }
    }

    /***
     * Extract data for a specific schema from valuespace.xml response.
     * Certain configuration values have a specific schema defined - e.g TTPAR_OnOffAuto.
     * In order to fetch relevant possible values for future control operations - this schema details (i.e all the
     * possible values) are available in valuespace.xml data.
     * This method gets string value for this schema only and then maps it to the {@link ValueSpace} object.
     *
     * @param valuespaceResponse value of /valuespace.xml url response
     * @param valuespaceName schema name to extract
     * @return {@link ValueSpace} instance of the target schema
     */
    private ValueSpace extractTTPARValuespace(String valuespaceResponse, String valuespaceName) {
        if (xmlUnmarshaller == null) {
            throw new RuntimeException("XML Unmarshaller is not initialized.");
        }
        int firstIndex = valuespaceResponse.indexOf("<" + valuespaceName) - 1;
        int lastIndex = valuespaceResponse.lastIndexOf(valuespaceName + ">") + valuespaceName.length() + 1;
        try {
            String response = valuespaceResponse.substring(firstIndex, lastIndex).replaceAll(valuespaceName, "ValueSpace");
            return (ValueSpace) xmlUnmarshaller.unmarshal(new StringReader(response));
        } catch (JAXBException e) {
            throw new RuntimeException(String.format("An error occurred during valuespace information extraction for %s", valuespaceName), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void authenticate() throws Exception {
    }

    /**
     * Perform camera controlling/configuration command
     * Camera property names contain cameraId that control/config actions should be addressed to,
     * so this method is checking property names endings to check which control operation is requested.
     *
     * @param property property name
     * @param value    value to address in control operation
     * @throws Exception if any error occurs
     */
    private void processCameraCommand(String property, String value) throws Exception {
        Matcher cameraIdMatcher = Pattern.compile("\\d").matcher(property);
        if (!cameraIdMatcher.find()) {
            logger.error("Unable to find cameraId for camera control operation");
            return;
        }
        if (property.endsWith("Focus")) {
            postCommandRequest(generateCameraControlCommandPayload(value, cameraIdMatcher.group(), CameraControlCommandType.CameraFocus), property, value);
        } else if (property.endsWith("Pan")) {
            postCommandRequest(generateCameraControlCommandPayload(value, cameraIdMatcher.group(), CameraControlCommandType.CameraPan), property, value);
        } else if (property.endsWith("Tilt")) {
            postCommandRequest(generateCameraControlCommandPayload(value, cameraIdMatcher.group(), CameraControlCommandType.CameraTilt), property, value);
        } else if (property.endsWith("Zoom")) {
            postCommandRequest(generateCameraControlCommandPayload(value, cameraIdMatcher.group(), CameraControlCommandType.CameraZoom), property, value);
        } else if (property.endsWith("Flip")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraFlip), property, value);
        } else if (property.endsWith("Backlight")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraBacklightDefaultMode), property, value);
        } else if (property.endsWith("BrightnessLevel")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraBrightnessDefaultLevel), property, value);
        } else if (property.endsWith("BrightnessMode")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraBrightnessMode), property, value);
        } else if (property.endsWith("FocusMode")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraFocusMode), property, value);
        } else if (property.endsWith("GammaLevel")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraGammaLevel), property, value);
        } else if (property.endsWith("GammaMode")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraGammaMode), property, value);
        } else if (property.endsWith("IrSensor")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraIrSensor), property, value);
        } else if (property.endsWith("Mirror")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraMirror), property, value);
        } else if (property.endsWith("WhitebalanceLevel")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraWhitebalanceLevel), property, value);
        } else if (property.endsWith("WhitebalanceMode")) {
            postConfigurationRequest(generateCameraConfigurationPayload(value, cameraIdMatcher.group(), CameraConfigurationCommandType.CameraWhitebalanceMode), property, value);
        } else {
            if (logger.isWarnEnabled()) {
                logger.warn(String.format("Command is not supported. Property: %s, value: %s", property, value));
            }
        }
    }

    /**
     * Perform video controlling/configuration command
     * Camera property names contain cameraId that control/config actions should be addressed to,
     * so this method is checking property names endings to check which control operation is requested.
     *
     * @param property property name
     * @param value    value to address in control operation
     * @throws Exception if any error occurs
     */
    private void processVideoCommand(String property, String value) throws Exception {
        Matcher sourceMatcher = Pattern.compile("\\d").matcher(property);
        if (!sourceMatcher.find()) {
            logger.error("Unable to find sourceId for video configuration control operation");
            return;
        }
        if (property.endsWith("Type")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.Type), property, value);
        } else if (property.endsWith("Visibility")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.Visibility), property, value);
        } else if (property.endsWith("PresentationSelection")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.PresentationSelection), property, value);
        } else if (property.endsWith("Quality")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.Quality), property, value);
        } else if (property.endsWith("CECMode")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.CECMode), property, value);
        } else if (property.endsWith("MonitorRole")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.MonitorRole), property, value);
        } else if (property.endsWith("OverscanLevel")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.OverscanLevel), property, value);
        } else if (property.endsWith("Resolution")) {
            postConfigurationRequest(generateVideoConfigurationPayload(value, sourceMatcher.group(), VideoConfigurationCommandType.Resolution), property, value);
        } else {
            if (logger.isWarnEnabled()) {
                logger.warn(String.format("Command is not supported. Property: %s, value: %s", property, value));
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void controlProperty(ControllableProperty controllableProperty) throws Exception {
        String property = controllableProperty.getProperty();
        String value = String.valueOf(controllableProperty.getValue());

        controlOperationsLock.lock();
        try {
            if (property.startsWith("Cameras#") && property.matches(".*\\d.*")) {
                processCameraCommand(property, value);
                return;
            }

            if (property.startsWith("Video#") && property.matches(".*\\d.*")) {
                processVideoCommand(property, value);
                return;
            }

            switch (property) {
                case CAMERAS_TRIGGER_AUTOFOCUS_PRESET:
                    postConfigurationRequest(generateCameraConfigurationPayload(value, CameraConfigurationCommandType.TriggerAutofocusPreset), property, value);
                    break;
                case ROOM_ANALYTICS_PEOPLE_PRESENCE_DETECTION:
                    postConfigurationRequest(generateRoomAnalyticsConfigurationPayload(value, RoomAnalyticsConfigurationCommandType.PeoplePresenseMode), property, value);
                    break;
                case PROXIMITY_SERVICES_MODE:
                    postConfigurationRequest(generateProximityConfigurationPayload(value, ProximityConfigurationCommandType.ProximityMode), property, value);
                    break;
                case PROXIMITY_SERVICES_CALL_CONTROL:
                    postConfigurationRequest(generateProximityConfigurationPayload(value, ProximityConfigurationCommandType.CallControl), property, value);
                    break;
                case PROXIMITY_SERVICES_CONTENT_SHARE_TO_CLIENTS:
                    postConfigurationRequest(generateProximityConfigurationPayload(value, ProximityConfigurationCommandType.ContentShareToClients), property, value);
                    break;
                case PROXIMITY_SERVICES_CONTENT_SHARE_FROM_CLIENTS:
                    postConfigurationRequest(generateProximityConfigurationPayload(value, ProximityConfigurationCommandType.ContentShareFromClients), property, value);
                    break;
                case CONFERENCE_AUTO_ANSWER_DELAY:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.AutoAnswerDelay), property, value);
                    break;
                case CONFERENCE_AUTO_ANSWER_MODE:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.AutoAnswerMode), property, value);
                    break;
                case CONFERENCE_AUTO_ANSWER_MUTE:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.AutoAnswerMute), property, value);
                    break;
                case CONFERENCE_DEFAULT_CALL_PROTOCOL:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.DefaultCallProtocol), property, value);
                    break;
                case CONFERENCE_DEFAULT_CALL_RATE:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.DefaultCallRate), property, value);
                    break;
                case CONFERENCE_DO_NOT_DISTURB_TIMEOUT:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.DoNotDisturbTimeout), property, value);
                    break;
                case CONFERENCE_ENCRYPTION_MODE:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.EncryptionMode), property, value);
                    break;
                case CONFERENCE_FAR_END_CONTROL:
                    postConfigurationRequest(generateConferenceConfigurationPayload(value, ConferenceConfigurationCommandType.FarEndControl), property, value);
                    break;
                case STANDBY_BOOT_ACTION:
                    postConfigurationRequest(generateStandbyConfigurationPayload(value, StandbyConfigurationCommandType.BootAction), property, value);
                    break;
                case STANDBY_CONTROL:
                    postConfigurationRequest(generateStandbyConfigurationPayload(value, StandbyConfigurationCommandType.Control), property, value);
                    break;
                case STANDBY_DELAY:
                    postConfigurationRequest(generateStandbyConfigurationPayload(value, StandbyConfigurationCommandType.Delay), property, value);
                    break;
                case STANDBY_ACTION:
                    postConfigurationRequest(generateStandbyConfigurationPayload(value, StandbyConfigurationCommandType.StandbyAction), property, value);
                    break;
                case STANDBY_WAKEUP_ACTION:
                    postConfigurationRequest(generateStandbyConfigurationPayload(value, StandbyConfigurationCommandType.WakeupAction), property, value);
                    break;
                case STANDBY_STATE:
                    postCommandRequest(generateStandbyCommandPayload(value), property, value);
                    break;
                case NETWORK_SERVICES_H323_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.H323Mode), property, value);
                    break;
                case NETWORK_SERVICES_SIP_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.SIPMode), property, value);
                    break;
                case NETWORK_SERVICES_TELNET_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.TelnetMode), property, value);
                    break;
                case NETWORK_SERVICES_SSH_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.SSHMode), property, value);
                    break;
                case NETWORK_SERVICES_CDP_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.CDPMode), property, value);
                    break;
                case NETWORK_SERVICES_UPNP_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.UPnPMode), property, value);
                    break;
                case NETWORK_SERVICES_NTP_MODE:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.NTPMode), property, value);
                    break;
                case NETWORK_SERVICES_WELCOME_TEXT:
                    postConfigurationRequest(generateNetworkServicesConfigurationPayload(value, NetworkServicesConfigurationCommandType.WelcomeText), property, value);
                    break;
                case USER_INTERFACE_LANGUAGE:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.Language), property, value);
                    break;
                case USER_INTERFACE_KEY_TONES:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.KeyTones), property, value);
                    break;
                case USER_INTERFACE_CONTACT_INFO_TYPE:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.ContactInfoType), property, value);
                    break;
                case USER_INTERFACE_FEATURES_CALL_END:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.FeaturesCallEnd), property, value);
                    break;
                case USER_INTERFACE_FEATURES_MID_CALL:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.FeaturesMidCallControls), property, value);
                    break;
                case USER_INTERFACE_FEATURES_CALL_START:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.FeaturesCallStart), property, value);
                    break;
                case USER_INTERFACE_SHARE_START:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.ShareStart), property, value);
                    break;
                case USER_INTERFACE_WHITEBOARD_START:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.WhiteboardStart), property, value);
                    break;
                case USER_INTERFACE_HIDE_ALL_FEATURES:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.HideAllFeatures), property, value);
                    break;
                case USER_INTERFACE_AWAKE_BRANDING_COLORS:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.AwakeBrandingColors), property, value);
                    break;
                case USER_INTERFACE_INCOMING_CALL_NOTIFICATION:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.IncomingCallNotification), property, value);
                    break;
                case USER_INTERFACE_OSD_OUTPUT:
                    postConfigurationRequest(generateUserInterfaceConfigurationPayload(value, UserInterfaceConfigurationCommandType.OSDOutput), property, value);
                    break;
                case USER_INTERFACE_DEFAULT_MAIN_SOURCE:
                    postConfigurationRequest(generateVideoConfigurationPayload(value, VideoConfigurationCommandType.DefaultMainSource), property, value);
                    break;
                case VIDEO_DEFAULT_PRESENTATION_SOURCE:
                    postConfigurationRequest(generateVideoConfigurationPayload(value, VideoConfigurationCommandType.DefaultPresentationSource), property, value);
                    break;
                case VIDEO_MONITORS:
                    postConfigurationRequest(generateVideoConfigurationPayload(value, VideoConfigurationCommandType.Monitors), property, value);
                    break;
                case VIDEO_SELFVIEW_DEFAULT_FULLSCREEN_MODE:
                    postConfigurationRequest(generateVideoSelfViewConfigurationPayload(value, VideoSelfViewConfigurationCommandType.DefaultFullscreenMode), property, value);
                    break;
                case VIDEO_SELFVIEW_DEFAULT_MODE:
                    postConfigurationRequest(generateVideoSelfViewConfigurationPayload(value, VideoSelfViewConfigurationCommandType.DefaultMode), property, value);
                    break;
                case VIDEO_SELFVIEW_DEFAULT_ON_MONITOR_ROLE:
                    postConfigurationRequest(generateVideoSelfViewConfigurationPayload(value, VideoSelfViewConfigurationCommandType.DefaultOnMonitorRole), property, value);
                    break;
                case VIDEO_SELFVIEW_DEFAULT_PIP_POSITION:
                    postConfigurationRequest(generateVideoSelfViewConfigurationPayload(value, VideoSelfViewConfigurationCommandType.DefaultPIPPosition), property, value);
                    break;
                case VIDEO_SELFVIEW_ON_CALL_DURATION:
                    postConfigurationRequest(generateVideoSelfViewConfigurationPayload(value, VideoSelfViewConfigurationCommandType.OnCallDuration), property, value);
                    break;
                case VIDEO_SELFVIEW_ON_CALL_MODE:
                    postConfigurationRequest(generateVideoSelfViewConfigurationPayload(value, VideoSelfViewConfigurationCommandType.OnCallMode), property, value);
                    break;
                case SYSTEM_TIME_ZONE:
                    postConfigurationRequest(generateSystemTimeZoneConfigurationPayload(value), property, value);
                    break;
                case SYSTEM_UNIT_RESTART:
                    doPost("putxml", generateRestartPayload());
                    break;
                case AUDIO_VOLUME:
                    postCommandRequest(generateAudioCommandPayload(value, AudioControlCommandType.Volume), property, value);
                    break;
                case AUDIO_MICROPHONES_MUTE:
                    if ("0".equals(value)) {
                        unmute();
                    } else {
                        mute();
                    }
                    break;
                case AUDIO_MICROPHONE_MODE:
                    postConfigurationRequest(generateAudioConfigurationPayload(value, AudioConfigurationCommandType.MicrophoneMode), property, value);
                    break;
                case AUDIO_ULTRASOUND_MAX_VOLUME:
                    postConfigurationRequest(generateAudioConfigurationPayload(value, AudioConfigurationCommandType.MaxUltrasoundVolume), property, value);
                    break;
                default:
                    if (logger.isWarnEnabled()) {
                        logger.warn(String.format("Command is not supported. Property: %s, value: %s", property, value));
                    }
                    break;
            }
        } finally {
            controlOperationsLock.unlock();
        }
    }

    /**
     * Perform post request with a {@link CiscoConfiguration} payload for control operation
     * Need to check for the response text, since invalid payload may end up with an empty response with 200 code.
     * For all the response codes outside of 2xx range - {@link RestTemplate} is gonna take care of.
     * Generally, the request payload itself may be valid, but some parameter may be missing or have incorrect format
     * (if command="True" attribute is missing, expected INT value has Decimal places etc.)
     *
     * @param configuration payload to post to the device API
     * @param property      control property to update after the control operation success
     * @param value         of the control property to update after the control operation success
     * @throws CommandFailureException if the request payload is not valid, but 200 code is still received
     */
    private void postConfigurationRequest(CiscoConfiguration configuration, String property, String value) throws Exception {
        String response = doPost("putxml", configuration, String.class);
        if (response.contains("status=\"OK\"") || response.contains("Success")) {
            updateLatestControlTimestamp();
            updateLocalControllableProperty(property, value);
        } else {
            throw new CommandFailureException("putxml", new ObjectMapper().writeValueAsString(configuration), response);
        }
    }

    /**
     * Perform post request with a {@link Command} payload for control operation
     * Need to check for the response text, since invalid payload may end up with an empty response with 200 code.
     * For all the response codes outside of 2xx range - {@link RestTemplate} is gonna take care of
     * Generally, the request payload itself may be valid, but some parameter may be missing or have incorrect format
     * (if command="True" attribute is missing, expected INT value has Decimal places etc.)
     *
     * @param command  payload to post to the device API
     * @param property control property to update after the control operation success
     * @param value    of the control property to update after the control operation success
     */
    private void postCommandRequest(Command command, String property, String value) throws Exception {
        String response = doPost("putxml", command, String.class);
        if (response.contains("status=\"OK\"")) {
            updateLatestControlTimestamp();
            updateLocalControllableProperty(property, value);
        } else {
            throw new CommandFailureException("putxml", new ObjectMapper().writeValueAsString(command), response);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void controlProperties(List<ControllableProperty> list) throws Exception {
        if (CollectionUtils.isEmpty(list)) {
            throw new IllegalArgumentException("Controllable properties cannot be null or empty");
        }

        for (ControllableProperty controllableProperty : list) {
            controlProperty(controllableProperty);
        }
    }

    /**
     * For better usability, emergency delivery operations, triggered by control actions, end up with receiving latest
     * statistics values (saved in {@link #localStatistics}) that are updated with updated controllable properties values
     * before being returned. It is done in order to eliminate timeout errors and reduce waiting time between control
     * operations (so all the controls that happen during certain period of time are not interrupted by the emergency
     * delivery operations)
     *
     * @param property control property to update
     * @param value    to set
     */
    private void updateLocalControllableProperty(String property, String value) {
        if (localStatistics == null) {
            return;
        }
        localStatistics.getControllableProperties().stream().filter(cp -> cp.getName().equals(property)).findFirst().ifPresent(cp -> {
            cp.setValue(value);
            cp.setTimestamp(new Date());
        });
    }

    /**
     * Add statistics parameter to the target map, if the value is not null
     *
     * @param statistics    map to add data to
     * @param parameterName name of the parameter to set
     * @param value         value of the parameter
     */
    private void addStatisticsParameter(Map<String, String> statistics, String parameterName, String value) {
        if (value != null) {
            statistics.put(parameterName, value);
        }
    }

    /**
     * Add statistics parameter to the target map, if the {@link ValueSpaceRefHolder} is not null and it's value is not null or empty
     *
     * @param statistics    map to add data to
     * @param parameterName name of the parameter to set
     * @param value         value of the parameter
     */
    private void addStatisticsParameter(Map<String, String> statistics, String parameterName, ValueSpaceRefHolder value) {
        if (value != null) {
            String parameterValue = value.getValue();
            if (!StringUtils.isNullOrEmpty(parameterValue)) {
                statistics.put(parameterName, parameterValue);
            }
        }
    }

    /**
     * Add statistics parameter and slider controllable property for it, based on its {@link ValueSpaceRefHolder} value
     *
     * @param statistics             map to add data to
     * @param controllableProperties to add slider controllable property to
     * @param parameterName          name of the parameter to set
     * @param value                  value of the parameter to fetch value and min/max thresholds from as well as the current param value
     */
    private void addStatisticsParameterWithSlider(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                                  String parameterName, ValueSpaceRefHolder value) {
        if (value != null) {
            String parameterValue = value.getValue();
            List<Object> minMaxValues = value.getValues();
            ValueSpaceRefHolderType type = value.getType();
            if (isNumeric(parameterValue) && !minMaxValues.isEmpty()
                    && (type.equals(ValueSpaceRefHolderType.INT) || type.equals(ValueSpaceRefHolderType.VS_INT))) {
                statistics.put(parameterName, "");
                controllableProperties.add(createSlider(parameterName, Float.valueOf(String.valueOf(minMaxValues.get(0))),
                        Float.valueOf(String.valueOf(minMaxValues.get(1))), Float.valueOf(parameterValue)));
            }
        }
    }


    /**
     * Add statistics parameter and slider controllable property for it
     *
     * @param statistics             map to add data to
     * @param controllableProperties to add slider controllable property to
     * @param parameterName          name of the parameter to set
     * @param value                  current value of the parameter
     * @param rangeStart             min threshold for slider
     * @param rangeEnd               max threshold for slider
     */
    private void addStatisticsParameterWithSlider(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                                  String parameterName, String value, float rangeStart, float rangeEnd) {
        if (isNumeric(value)) {
            statistics.put(parameterName, "");
            controllableProperties.add(createSlider(parameterName, rangeStart, rangeEnd, Float.valueOf(value)));
        }
    }

    /**
     * Add statistics parameter and switch controllable property
     *
     * @param statistics             map to add data to
     * @param controllableProperties to add slider controllable property to
     * @param parameterName          name of the parameter to set
     * @param value                  current value of the parameter
     */
    private void addStatisticsParameterWithSwitch(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                                  String parameterName, String value) {
        if (!StringUtils.isNullOrEmpty(value)) {
            statistics.put(parameterName, "");
            controllableProperties.add(createSwitch(parameterName, "Off".equals(value) ? 0 : 1));
        }
    }

    /**
     * Add statistics parameter and switch controllable property based on {@link ValueSpaceRefHolder} value
     *
     * @param statistics             map to add data to
     * @param controllableProperties to add slider controllable property to
     * @param parameterName          name of the parameter to set
     * @param value                  current value of the parameter
     */
    private void addStatisticsParameterWithSwitch(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                                  String parameterName, ValueSpaceRefHolder value) {
        if (value != null) {
            String parameterValue = value.getValue();
            if (!StringUtils.isNullOrEmpty(parameterValue)) {
                statistics.put(parameterName, "");
                controllableProperties.add(createSwitch(parameterName, "Off".equals(parameterValue) ? 0 : 1));
            }
        }
    }

    /**
     * Add statistics parameter and dropdown controllable property
     *
     * @param statistics             map to add data to
     * @param controllableProperties to add slider controllable property to
     * @param parameterName          name of the parameter to set
     * @param value                  current value of the parameter
     * @param values                 list of values for dropdown
     */
    private void addStatisticsParameterWithDropdown(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                                    String parameterName, List<String> values, String value) {
        if (!StringUtils.isNullOrEmpty(value) && !values.isEmpty()) {
            statistics.put(parameterName, "");
            controllableProperties.add(createDropdown(parameterName, values, value));
        }
    }

    /**
     * Add statistics parameter and dropdown controllable property
     *
     * @param statistics             map to add data to
     * @param controllableProperties to add slider controllable property to
     * @param parameterName          name of the parameter to set
     * @param value                  current value of the parameter
     * @param valueSpace             valuespace parameter to fetch all the possible dropdown values from (valuespace.xml)
     */
    private void addStatisticsParameterWithDropdown(Map<String, String> statistics, List<AdvancedControllableProperty> controllableProperties,
                                                    String parameterName, ValueSpaceRefHolder value, String valueSpace) {
        if (value != null) {
            String parameterValue = value.getValue();
            if (!StringUtils.isNullOrEmpty(parameterValue)) {
                statistics.put(parameterName, "");
                controllableProperties.add(createDropdown(parameterName, Arrays.stream(extractTTPARValuespace(valueSpace,
                        value.getValueSpaceRef()).getValues()).map(ValueSpace.TTPARValue::getValue).collect(Collectors.toList()), parameterValue));
            }
        }
    }


    /**
     * Uptime is received in seconds, need to normalize it and make it human readable, like
     * 1 day(s) 5 hour(s) 12 minute(s) 55 minute(s)
     * Incoming parameter is may have a decimal point, so in order to safely process this - it's rounded first.
     * We don't need to add a segment of time if it's 0.
     *
     * @param uptime value, with a decimal point
     * @return string value of format 'x day(s) x hour(s) x minute(s) x minute(s)'
     */
    private String normalizeUptime(String uptime) {
        long uptimeSeconds = Math.round(Float.parseFloat(uptime));
        StringBuilder normalizedUptime = new StringBuilder();

        long seconds = uptimeSeconds % 60;
        long minutes = uptimeSeconds % 3600 / 60;
        long hours = uptimeSeconds % 86400 / 3600;
        long days = uptimeSeconds / 86400;

        if (days > 0) {
            normalizedUptime.append(days).append(" day(s) ");
        }
        if (hours > 0) {
            normalizedUptime.append(hours).append(" hour(s) ");
        }
        if (minutes > 0) {
            normalizedUptime.append(minutes).append(" minute(s) ");
        }
        if (seconds > 0) {
            normalizedUptime.append(seconds).append(" second(s)");
        }
        return normalizedUptime.toString().trim();
    }

    /**
     * Update timestamp of the latest control operation
     */
    private void updateLatestControlTimestamp() {
        latestControlTimestamp = System.currentTimeMillis();
    }

    /***
     * Check whether the control operations cooldown has ended
     *
     * @return boolean value indicating whether the cooldown has ended or not
     */
    private boolean isValidControlCoolDown() {
        return (System.currentTimeMillis() - latestControlTimestamp) < CONTROL_OPERATION_COOLDOWN_MS;
    }
}
