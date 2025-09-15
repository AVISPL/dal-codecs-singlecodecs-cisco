/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco;

/**
 * Properties and property group names variables
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.0
 */
final class CiscoCommunicatorProperties {
     static final String N_MICROPHONE_STATUS = "Audio#Microphone%sStatus";
     static final String N_MICROPHONE_EC_REFERENCE_DELAY = "Audio#Microphone%sEcReferenceDelay";
     static final String N_INPUT_LINE_DELAY = "Audio#OutputLine%sDelay(MS)";
     static final String N_VIDEO_CONNECTOR_TYPE = "Video#OutputConnector%sType";
     static final String N_VIDEO_CONNECTOR_CONNECTED = "Video#OutputConnector%sConnected";
     static final String N_VIDEO_CONNECTOR_CONNECTED_DEVICE_NAME = "Video#OutputConnector%sConnectedDeviceName";
     static final String N_VIDEO_CONNECTOR_CONNECTED_DEVICE_PREFERRED_FORMAT = "Video#OutputConnector%sConnectedDevicePreferredFormat";
     static final String N_INPUT_SOURCE_TYPE = "Video#InputSource%sType";
     static final String N_INPUT_SOURCE_VISIBILITY = "Video#InputSource%sVisibility";
     static final String N_INPUT_SOURCE_PRESENTATION_SELECTION = "Video#InputSource%sPresentationSelection";
     static final String N_INPUT_SOURCE_QUALITY = "Video#InputSource%sQuality";
     static final String N_INPUT_SOURCE_NAME = "Video#InputSource%sName";
     static final String N_OUTPUT_SOURCE_CEC_MODE = "Video#OutputSource%sCECMode";
     static final String N_OUTPUT_SOURCE_MONITOR_ROLE = "Video#OutputSource%sMonitorRole";
     static final String N_OUTPUT_SOURCE_OVERSCAN_LEVEL = "Video#OutputSource%sOverscanLevel";
     static final String N_OUTPUT_SOURCE_RESOLUTION = "Video#OutputSource%sResolution";
     static final String N_ACTIVE_CALL_ANSWER_STATE = "ActiveCall#Call%sAnswerState";
     static final String N_ACTIVE_CALL_TYPE = "ActiveCall#Call%sCallType";
     static final String N_ACTIVE_CALL_CALLBACK_NUMBER = "ActiveCall#Call%sCallbackNumber";
     static final String N_ACTIVE_CALL_DEVICE_TYPE = "ActiveCall#Call%sDeviceType";
     static final String N_ACTIVE_CALL_DIRECTION = "ActiveCall#Call%sDirection";
     static final String N_ACTIVE_CALL_DISPLAY_NAME = "ActiveCall#Call%sDisplayName";
     static final String N_ACTIVE_CALL_DURATION = "ActiveCall#Call%sDuration(s)";
     static final String N_ACTIVE_CALL_FACILITY_SERVICE_ID = "ActiveCall#Call%sFacilityServiceId";
     static final String N_ACTIVE_CALL_HOLD_REASON = "ActiveCall#Call%sHoldReason";
     static final String N_ACTIVE_CALL_ON_HOLD = "ActiveCall#Call%sOnHold";
     static final String N_ACTIVE_CALL_PROTOCOL = "ActiveCall#Call%sProtocol";
     static final String N_SIP_PROXY_ADDRESS = "SIP#Proxy%sAddress";
     static final String N_SIP_PROXY_STATUS = "SIP#Proxy%sStatus";
     static final String N_SIP_REGISTRATION_STATUS = "SIP#Registration%sStatus";
     static final String N_SIP_REGISTRATION_URI = "SIP#Registration%sURI";
     static final String N_SIP_REGISTRATION_REJECTED_REASON = "SIP#Registration%sRejectedReason";
     static final String N_NETWORK_CDP_ADDRESS = "Networks#Network%sCDPAddress";
     static final String N_NETWORK_CDP_CAPABILITIES = "Networks#Network%sCPDCapabilities";
     static final String N_NETWORK_CDP_DEVICE_ID = "Networks#Network%sCDPDeviceId";
     static final String N_NETWORK_CDP_DUPLEX = "Networks#Network%sCDPDuplex";
     static final String N_NETWORK_CDP_PLATFORM = "Networks#Network%sCDPPlatform";
     static final String N_NETWORK_CDP_PORT_ID = "Networks#Network%sCDPPortId";
     static final String N_NETWORK_CDP_PRIMARY_MGMT_ADDRESS = "Networks#Network%sCDPPrimaryMgmtAddress";
     static final String N_NETWORK_CDP_SYSNAME = "Networks#Network%sCDPSysName";
     static final String N_NETWORK_CDP_SYS_OBJECT_ID = "Networks#Network%sCDPSysObjectId";
     static final String N_NETWORK_CDP_VERSION = "Networks#Network%sCDPVersion";
     static final String N_NETWORK_CDP_VOIP_APPLIANCE_VLAN_ID = "Networks#Network%sCDPVoipApplianceVlanId";
     static final String N_NETWORK_CDP_VTP_MGMT_DOMAIN = "Networks#Network%sCDPVtpMgmtDomain";
     static final String N_NETWORK_DNS_DOMAIN_NAME = "Networks#Network%sDNSDomainName";
     static final String N_NETWORK_DNS_ADDRESS = "Networks#Network%sDNSServerAddress%s";
     static final String N_NETWORK_ETHERNET_MAC_ADDRESS = "Networks#Network%sEthernetMacAddress";
     static final String N_NETWORK_ETHERNET_SPEED = "Networks#Network%sEthernetSpeed";
     static final String N_NETWORK_IPV4_ADDRESS = "Networks#Network%sIPv4Address";
     static final String N_NETWORK_IPV4_GATEWAY = "Networks#Network%sIPv4Gateway";
     static final String N_NETWORK_IPV4_SUBNET_MASK = "Networks#Network%sIPv4SubnetMask";
     static final String N_NETWORK_IPV6_ADDRESS = "Networks#Network%sIPv6Address";
     static final String N_NETWORK_IPV6_GATEWAY = "Networks#Network%sIPv6Gateway";
     static final String N_NETWORK_SERVICES_NTP_SERVER_ADDRESS = "NetworkServices#NTPServer%sAddress";
     static final String N_NETWORK_SERVICES_SNMP_HOST_ADDRESS = "NetworkServices#SNMPHost%sAddress";
     static final String N_USB_DEVICE_STATE = "USB#Device%sState";
     static final String N_USB_DEVICE_TYPE = "USB#Device%sType";
     static final String N_CAMERA_CONNECTED = "Cameras#Camera%sConnected";
     static final String N_CAMERA_HARDWARE_ID = "Cameras#Camera%sHardwareId";
     static final String N_CAMERA_MAC_ADDRESS = "Cameras#Camera%sMacAddress";
     static final String N_CAMERA_MANUFACTURER = "Cameras#Camera%sManufacturer";
     static final String N_CAMERA_MODEL = "Cameras#Camera%sModel";
     static final String N_CAMERA_SERIAL_NUMBER = "Cameras#Camera%sSerialNumber";
     static final String N_CAMERA_SERIAL_SOFTWARE_ID = "Cameras#Camera%sSoftwareId";
     static final String N_CAMERA_FOCUS = "Cameras#Camera%sFocus";
     static final String N_CAMERA_PAN = "Cameras#Camera%sPan";
     static final String N_CAMERA_TILT = "Cameras#Camera%sTilt";
     static final String N_CAMERA_ZOOM = "Cameras#Camera%sZoom";
     static final String N_CAMERA_BACKLIGHT = "Cameras#Camera%sBacklight";
     static final String N_CAMERA_BRIGHTNESS_LEVEL = "Cameras#Camera%sBrightnessLevel";
     static final String N_CAMERA_BRIGHTNESS_MODE = "Cameras#Camera%sBrightnessMode";
     static final String N_CAMERA_FLIP = "Cameras#Camera%sFlip";
     static final String N_CAMERA_FOCUS_MODE = "Cameras#Camera%sFocusMode";
     static final String N_CAMERA_GAMMA_LEVEL = "Cameras#Camera%sGammaLevel";
     static final String N_CAMERA_GAMMA_MODE = "Cameras#Camera%sGammaMode";
     static final String N_CAMERA_IR_SENSOR = "Cameras#Camera%sIrSensor";
     static final String N_CAMERA_MIRROR = "Cameras#Camera%sMirror";
     static final String N_CAMERA_WHITEBALANCE_LEVEL = "Cameras#Camera%sWhitebalanceLevel";
     static final String N_CAMERA_WHITEBALANCE_MODE = "Cameras#Camera%sWhitebalanceMode";
     static final String CAMERAS_TRIGGER_AUTOFOCUS_PRESET = "Cameras#TriggerAutofocusPreset";
     static final String ROOM_ANALYTICS_PEOPLE_PRESENCE_DETECTION = "RoomAnalytics#PeoplePresenceDetection";
     static final String PROXIMITY_SERVICES_MODE = "ProximityServices#ProximityServicesMode";
     static final String PROXIMITY_SERVICES_CALL_CONTROL = "ProximityServices#CallControl";
     static final String PROXIMITY_SERVICES_CONTENT_SHARE_TO_CLIENTS = "ProximityServices#ContentShareToClients";
     static final String PROXIMITY_SERVICES_CONTENT_SHARE_FROM_CLIENTS = "ProximityServices#ContentShareFromClients";
     static final String CONFERENCE_AUTO_ANSWER_DELAY = "Conference#AutoAnswerDelay";
     static final String CONFERENCE_AUTO_ANSWER_MODE = "Conference#AutoAnswerMode";
     static final String CONFERENCE_AUTO_ANSWER_MUTE = "Conference#AutoAnswerMute";
     static final String CONFERENCE_DEFAULT_CALL_PROTOCOL = "Conference#DefaultCallProtocol";
     static final String CONFERENCE_DEFAULT_CALL_RATE = "Conference#DefaultCallRate";
     static final String CONFERENCE_DO_NOT_DISTURB_TIMEOUT = "Conference#DoNotDisturbTimeout";
     static final String CONFERENCE_ENCRYPTION_MODE = "Conference#EncryptionMode";
     static final String CONFERENCE_FAR_END_CONTROL = "Conference#FarEndControl";
     static final String STANDBY_BOOT_ACTION = "Standby#BootAction";
     static final String STANDBY_CONTROL = "Standby#Control";
     static final String STANDBY_DELAY = "Standby#Delay";
     static final String STANDBY_STATE = "Standby#State";
     static final String STANDBY_ACTION = "Standby#StandbyAction";
     static final String STANDBY_WAKEUP_ACTION = "Standby#WakeupAction";
     static final String NETWORK_SERVICES_H323_MODE = "NetworkServices#H323Mode";
     static final String NETWORK_SERVICES_SIP_MODE = "NetworkServices#SIPMode";
     static final String NETWORK_SERVICES_TELNET_MODE = "NetworkServices#TelnetMode";
     static final String NETWORK_SERVICES_SSH_MODE = "NetworkServices#SSHMode";
     static final String NETWORK_SERVICES_CDP_MODE = "NetworkServices#CDPMode";
     static final String NETWORK_SERVICES_UPNP_MODE = "NetworkServices#UPnPMode";
     static final String NETWORK_SERVICES_NTP_MODE = "NetworkServices#NTPMode";
     static final String NETWORK_SERVICES_WELCOME_TEXT = "NetworkServices#WelcomeText";
     /** @since 1.2.1 */
     static final String CONFERENCE_PRESENTATION_MODE = "Conference#PresentationMode";
     /** @since 1.2.1 */
     static final String CONFERENCE_DO_NOT_DISTURB = "Conference#DoNotDisturb";
     /** @since 1.2.1 */
     static final String CONFERENCE_ACTIVE_SPEAKER_CALL_ID = "Conference#ActiveSpeakerCallId";
     /** @since 1.2.1 */
     static final String CONFERENCE_MULTIPOINT_MODE = "Conference#MultipointMode";
     /** @since 1.2.1 */
     static final String CONFERENCE_PRESENTATION_CALL_ID = "Conference#PresentationCallId";
     /** @since 1.2.1 */
     static final String CONFERENCE_WHITEBOARD_MODE = "Conference#WhiteboardMode";
     /** @since 1.2.1 */
     static final String CONFERENCE_WHITEBOARD_RELEASE_FLOOR_AVAILABILITY = "Conference#WhiteboardReleaseFloorAvailability";
     /** @since 1.2.1 */
     static final String CONFERENCE_WHITEBOARD_REQUEST_FLOOR_AVAILABILITY = "Conference#WhiteboardRequestFloorAvailability";
     /** @since 1.2.1 */
     static final String CONFERENCE_SPEAKER_LOCK_MODE = "Conference#SpeakerLockMode";
     /** @since 1.2.1 */
     static final String CONFERENCE_SPEAKER_LOCK_CALL_ID = "Conference#SpeakerLockCallId";
     /** @since 1.1.0 */
     static final String PERIPHERALS_CAMERA_PROFILE_CONTROL = "PeripheralsConfiguration#CamerasProfile";
     /** @since 1.1.0 */
     static final String PERIPHERALS_CONTROL_SYSTEM_PROFILE_CONTROL = "PeripheralsConfiguration#ControlSystemsProfile";
     /** @since 1.1.0 */
     static final String PERIPHERALS_TOUCH_PANEL_PROFILE_CONTROL = "PeripheralsConfiguration#TouchPanelsProfile";
     /** @since 1.1.0 */
     static final String PERIPHERALS_TOUCH_PANEL_REMOTE_PAIRING = "PeripheralsConfiguration#TouchPanelsRemotePairing";
     static final String USER_INTERFACE_LANGUAGE = "UserInterface#Language";
     static final String USER_INTERFACE_KEY_TONES = "UserInterface#KeyTones";
     static final String USER_INTERFACE_CONTACT_INFO_TYPE = "UserInterface#ContactInfoType";
     static final String USER_INTERFACE_FEATURES_CALL_END = "UserInterface#FeaturesCallEnd";
     static final String USER_INTERFACE_FEATURES_CALL_START = "UserInterface#FeaturesCallStart";
     static final String USER_INTERFACE_FEATURES_MID_CALL = "UserInterface#FeaturesMidCallControls";
     static final String USER_INTERFACE_SHARE_START = "UserInterface#ShareStart";
     static final String USER_INTERFACE_WHITEBOARD_START = "UserInterface#WhiteboardStart";
     static final String USER_INTERFACE_HIDE_ALL_FEATURES = "UserInterface#HideAllFeatures";
     static final String USER_INTERFACE_AWAKE_BRANDING_COLORS = "UserInterface#AwakeBrandingColors";
     static final String USER_INTERFACE_INCOMING_CALL_NOTIFICATION = "UserInterface#IncomingCallNotification";
     static final String USER_INTERFACE_OSD_OUTPUT = "UserInterface#OSDOutput";
     static final String USER_INTERFACE_DEFAULT_MAIN_SOURCE = "Video#DefaultMainSource";
     static final String VIDEO_DEFAULT_PRESENTATION_SOURCE = "Video#DefaultPresentationSource";
     static final String VIDEO_MONITORS = "Video#Monitors";
     static final String VIDEO_SELFVIEW_DEFAULT_FULLSCREEN_MODE = "VideoSelfView#DefaultFullscreenMode";
     static final String VIDEO_SELFVIEW_DEFAULT_MODE = "VideoSelfView#DefaultMode";
     static final String VIDEO_SELFVIEW_DEFAULT_ON_MONITOR_ROLE = "VideoSelfView#DefaultOnMonitorRole";
     static final String VIDEO_SELFVIEW_DEFAULT_PIP_POSITION = "VideoSelfView#DefaultPIPPosition";
     static final String VIDEO_SELFVIEW_ON_CALL_DURATION = "VideoSelfView#OnCallDuration";
     static final String VIDEO_SELFVIEW_ON_CALL_MODE = "VideoSelfView#OnCallMode";
     static final String SYSTEM_TIME_ZONE = "SystemTime#TimeZone";
     static final String SYSTEM_UNIT_RESTART = "SystemUnit#Restart";
     static final String AUDIO_VOLUME = "Audio#Volume";
     static final String AUDIO_ULTRASOUND_MAX_VOLUME = "Audio#UltrasoundMaxVolume";
     static final String AUDIO_MICROPHONES_MUTE = "Audio#MicrophonesMute";
     static final String AUDIO_MICROPHONE_MODE = "Audio#MicrophoneMode";

     static final String FIRMWARE_PACKAGE_URL = "Firmware#PackageURL";
     static final String FIRMWARE_UPGRADE = "Firmware#Upgrade";
     static final String FIRMWARE_CURRENT_URL = "Firmware#CurrentURL";
     static final String FIRMWARE_CURRENT_VERSION = "Firmware#CurrentVersion";
     static final String FIRMWARE_CURRENT_COMPLETED_AT = "Firmware#CurrentCompletedAt";
     static final String FIRMWARE_UPGRADE_STATUS_LAST_CHANGE = "Firmware#UpgradeStatusLastChange";
     static final String FIRMWARE_UPGRADE_STATUS_URL = "Firmware#UpgradeStatusURL";
     static final String FIRMWARE_UPGRADE_STATUS_URGENCY = "Firmware#UpgradeStatusUrgency";
     static final String FIRMWARE_UPGRADE_STATUS_PHASE = "Firmware#UpgradeStatusPhase";

     /** @since 1.1.0 */
     static final String PERIPHERALS_DISCONNECTED_TEMPLATE = "PeripheralsDisconnected%ss";
     /** @since 1.1.0 */
     static final String PERIPHERALS_CONNECTED_TEMPLATE = "PeripheralsConnected%ss";
     /** @since 1.1.0 */
     static final String PROPERTY_UPGRADE_STATUS = "#UpgradeStatus";
     /** @since 1.1.0 */
     static final String PROPERTY_HARDWARE_INFO = "#HardwareInfo";
     /** @since 1.1.0 */
     static final String PROPERTY_CONNECTION_METHOD = "#ConnectionMethod";
     /** @since 1.1.0 */
     static final String PROPERTY_NETWORK_ADDRESS = "#NetworkAddress";
     /** @since 1.1.0 */
     static final String PROPERTY_LAST_SEEN = "#LastSeen";
     /** @since 1.1.0 */
     static final String PROPERTY_ID = "#ID";
     /** @since 1.1.0 */
     static final String PROPERTY_NAME = "#Name";
     /** @since 1.1.0 */
     static final String PROPERTY_SERIAL_NUMBER = "#SerialNumber";
     /** @since 1.1.0 */
     static final String PROPERTY_SOFTWARE_INFO = "#SoftwareInfo";
     /** @since 1.1.0 */
     static final String PROPERTY_TYPE = "#Type";
     /** @since 1.1.0 */
     static final String PROPERTY_TOTAL_DEVICES_COUNT = "#TotalDevicesCount";
     /** @since 1.1.0 */
     static final String PROPERTY_STATUS = "#Status";
     /** @since 1.1.3 */
     static final String N_A = "N/A";
     /** @since 1.1.4 */
     static final String ENABLED = "Enabled";
     /** @since 1.1.4 */
     static final String ACTIVE = "Active";
     /** @since 1.1.4 */
     static final String OFF = "Off";
     /** @since 1.1.4 */
     static final String HASH = "#";
     /** @since 1.1.4 */
     static final String ALL = "All";
     /** @since 1.1.4 */
     static final String OK = "OK";
     /** @since 1.1.4 */
     static final String DISCONNECTED = "Disconnected";
     /** @since 1.1.4 */
     static final String PROPERTY_GROUP_CAMERAS = "Cameras#";
     /** @since 1.1.4 */
     static final String PROPERTY_GROUP_VIDEO = "Video#";
     /** @since 1.1.4 */
     static final String PROPERTY_GOOGLE_MEET = "WebRTC#GoogleMeet";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_TEAMS = "WebRTC#MicrosoftTeams";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_TEAMS_STATUS = "MicrosoftTeams#InCall";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_TEAMS_PAIRING = "MicrosoftTeams#PairingActive";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_TEAMS_USER_SIGNED_IN = "MicrosoftTeams#UserSignedIn";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_ANDROID_VERSION = "MicrosoftExtension#AndriodVersion";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_COMPANY_PORTAL_APP_VERSION = "MicrosoftExtension#CompanyPortalAppVersion";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_OEM_AGENT_VERSION = "MicrosoftExtension#OEMAgentVersion";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_TEAMS_APP_VERSION = "MicrosoftExtension#TeamsAppVersion";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_TEAMS_ADMIN_AGENT_VERSION = "MicrosoftExtension#TeamsAdminAgentVersion";
     /** @since 1.1.4 */
     static final String PROPERTY_GROUP_TEMPLATE_MICROSOFT_TEAMS_HW_ACCELERATOR_ENCODER = "MicrosoftTeamsHWAcceleratorEncoder[%d]#";
     /** @since 1.1.4 */
     static final String PROPERTY_GROUP_TEMPLATE_MICROSOFT_TEAMS_HW_ACCELERATOR_DECODER = "MicrosoftTeamsHWAcceleratorDecoder[%d]#";
     /** @since 1.1.8 */
     static final String PROPERTY_GROUP_TEMPLATE_DIAGNOSTICS = "DiagnosticEvent[%d]#";
     /** @since 1.1.8 */
     static final String PROPERTY_DIAGNOSTICS_EVENTS = "DiagnosticEvents";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_SUPPORTED = "MicrosoftExtension#Supported";
     /** @since 1.1.4 */
     static final String PROPERTY_MICROSOFT_EXTENSION_IN_CALL = "MicrosoftExtension#InCall";
     /** @since 1.1.4 */
     static final String PROPERTY_FPS = "Fps";
     /** @since 1.1.4 */
     static final String PROPERTY_INPUT_MODE = "InputMode";
     /** @since 1.1.4 */
     static final String PROPERTY_OUTPUT_MODE = "OutputMode";
     /** @since 1.1.4 */
     static final String PROPERTY_FRAME_COUNT = "FrameCount";
     /** @since 1.1.4 */
     static final String PROPERTY_HEIGHT = "Height";
     /** @since 1.1.4 */
     static final String PROPERTY_WIDTH = "Width";
     /** @since 1.1.4 */
     static final String PROPERTY_SAMPLE_PERIOD_US = "SamplePeriodUs";
     /** @since 1.1.4 */
     static final String PROPERTY_CROPPED_WIDTH = "CroppedWidth";
     /** @since 1.1.4 */
     static final String PROPERTY_CROPPED_HEIGHT = "CroppedHeight";
     /** @since 1.1.4 */
     static final String PROPERTY_WEB_EX_STATUS = "WebEx#Status";
     /** @since 1.1.4 */
     static final String PROPERTY_WEB_EX_MEETING_JOIN_PROTOCOL = "WebEx#MeetingJoinProtocol";
     /** @since 1.1.4 */
     static final String PROPERTY_WEB_EX_MEETING_INSTANT_MEETING = "WebEx#InstantMeeting";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_UPTIME = "SystemUnit#Uptime";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_PRODUCT_ID = "SystemUnit#ProductId";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_PRODUCT_PLATFORM = "SystemUnit#ProductPlatform";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_PRODUCT_TYPE = "SystemUnit#ProductType";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_ACTIVE_CALLS_NUMBER = "SystemUnit#ActiveCallsNumber";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_IN_PROGRESS_CALLS_NUMBER = "SystemUnit#InProgressCallsNumber";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_SUSPENDED_CALLS_NUMBER = "SystemUnit#SuspendedCallsNumber";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_HARDWARE_TEMPERATURE = "SystemUnit#HardwareTemperature(C)";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_SERIAL_NUMBER = "SystemUnit#SerialNumber";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_COMPATIBILITY_LEVEL = "SystemUnit#CompatibilityLevel";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_DISPLAY_NAME = "SystemUnit#DisplayName";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_RELEASE_DATE = "SystemUnit#ReleaseDate";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_VERSION = "SystemUnit#Version";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_SOFTWARE_NAME = "SystemUnit#SoftwareName";
     /** @since 1.1.4 */
     static final String PROPERTY_SYSTEM_UNIT_NAME = "SystemUnit#Name";
     /** @since 1.1.4 */
     static final String PROPERTY_VIDEO_ACTIVE_SPEAKER_PIP_POSITION = "Video#ActiveSpeakerPIPPosition";
     /** @since 1.1.4 */
     static final String PROPERTY_VIDEO_MAIN_VIDEO_SOURCE = "Video#MainVideoSource";
     /** @since 1.1.4 */
     static final String PROPERTY_VIDEO_LAYOUT_FAMILY = "Video#LayoutFamily";
     /** @since 1.1.4 */
     static final String PROPERTY_SELFVIEW_FULLSCREEN_MODE = "VideoSelfView#FullscreenMode";
     /** @since 1.1.4 */
     static final String PROPERTY_SELFVIEW_MODE = "VideoSelfView#Mode";
     /** @since 1.1.4 */
     static final String PROPERTY_SELFVIEW_ON_MONITOR_ROLE = "VideoSelfView#OnMonitorRole";
     /** @since 1.1.4 */
     static final String PROPERTY_SELFVIEW_PIP_POSITION = "VideoSelfView#PIPPosition";
     /** @since 1.1.4 */
     static final String PROPERTY_AUDIO_DEVICES_BLUETOOTH_ACTIVE_PROFILE = "AudioDevices#BluetoothActiveProfile";
     /** @since 1.1.4 */
     static final String PROPERTY_AUDIO_DEVICES_HEADSET_USB_CONNECTION_STATUS = "AudioDevices#HeadsetUSBConnectionStatus";
     /** @since 1.1.4 */
     static final String PROPERTY_AUDIO_DEVICES_HEADSET_USB_DESCRIPTION = "AudioDevices#HeadsetUSBDescription";
     /** @since 1.1.4 */
     static final String PROPERTY_AUDIO_DEVICES_HEADSET_USB_MANUFACTURER = "AudioDevices#HeadsetUSBManufacturer";
     /** @since 1.1.4 */
     static final String PROPERTY_AUDIO_DEVICES_HEADSET_USB_CRADLE = "AudioDevices#HandsetUSBCradle";
}
