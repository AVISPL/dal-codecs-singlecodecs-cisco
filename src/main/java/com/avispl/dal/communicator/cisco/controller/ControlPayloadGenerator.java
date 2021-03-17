/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.controller;

import com.avispl.dal.communicator.cisco.controller.type.*;
import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.avispl.dal.communicator.cisco.dto.configuration.CiscoConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationInput;
import com.avispl.dal.communicator.cisco.dto.configuration.audio.AudioConfigurationUltrasound;
import com.avispl.dal.communicator.cisco.dto.configuration.cameras.*;
import com.avispl.dal.communicator.cisco.dto.configuration.conference.*;
import com.avispl.dal.communicator.cisco.dto.configuration.networkservices.*;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfigurationContentShare;
import com.avispl.dal.communicator.cisco.dto.configuration.proximity.ProximityConfigurationServices;
import com.avispl.dal.communicator.cisco.dto.configuration.roomanalytics.RoomAnalyticsConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.standby.StandbyConfiguration;
import com.avispl.dal.communicator.cisco.dto.configuration.userinterface.*;
import com.avispl.dal.communicator.cisco.dto.configuration.video.*;
import com.avispl.dal.communicator.cisco.dto.control.commands.Command;
import com.avispl.dal.communicator.cisco.dto.control.commands.audio.VolumeChangeCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.camera.CameraCommand;
import com.avispl.dal.communicator.cisco.dto.control.commands.camera.CameraPositionSetCommand;
import com.avispl.symphony.dal.util.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class generates control/configuration requests for Cisco API based on {@link CiscoConfiguration} and
 * {@link Command} classes.
 */
public class ControlPayloadGenerator {
    private static final Log logger = LogFactory.getLog(ControlPayloadGenerator.class);

    /**
     * Generate camera control command.
     * This method is specific per-camera, so it requires cameraId. CameraId value is parsed from the property name,
     * e.g "Cameras#Camera1Pan" where 1 is a local cameraId to use.
     *
     * @param value       control operation value
     * @param cameraId    id of camera
     * @param type type of the camera control command, to use as a reference for command payload creation
     * @return {@link Command} instance with correct values set
     */
    public static Command generateCameraControlCommandPayload(String value, String cameraId, CameraControlCommandType type) {
        Command command = new Command();
        CameraCommand cameraCommand = new CameraCommand();
        CameraPositionSetCommand cameraPositionSetCommand = new CameraPositionSetCommand();
        cameraPositionSetCommand.setCameraId(new ValueSpaceRefHolder[]{new ValueSpaceRefHolder(cameraId)});
        cameraCommand.setPositionSetCommand(cameraPositionSetCommand);
        command.setCameraCommand(cameraCommand);
        String cameraPropertyValue = removeDecimalPoint(value);

        switch (type) {
            case CameraPan:
                cameraPositionSetCommand.setPan(new ValueSpaceRefHolder[]{new ValueSpaceRefHolder(cameraPropertyValue)});
                break;
            case CameraTilt:
                cameraPositionSetCommand.setTilt(new ValueSpaceRefHolder[]{new ValueSpaceRefHolder(cameraPropertyValue)});
                break;
            case CameraZoom:
                cameraPositionSetCommand.setZoom(new ValueSpaceRefHolder[]{new ValueSpaceRefHolder(cameraPropertyValue)});
                break;
            case CameraFocus:
                cameraPositionSetCommand.setFocus(new ValueSpaceRefHolder[]{new ValueSpaceRefHolder(cameraPropertyValue)});
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return command;
    }

    /**
     * Generate camera configuration command.
     * This method is specific per-camera, so it requires cameraId. CameraId value is parsed from the property name,
     * e.g "Cameras#Camera1Flip" where 1 is a local cameraId to use.
     *
     * @param value    configuration operation value
     * @param cameraId id of camera
     * @param type     type of the camera configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateCameraConfigurationPayload(String value, String cameraId, CameraConfigurationCommandType type) {
        CiscoConfiguration configurationCommand = new CiscoConfiguration();
        CamerasConfiguration camerasConfiguration = new CamerasConfiguration();
        CamerasConfigurationCamera camera = new CamerasConfigurationCamera();
        camera.setItem(cameraId);
        camerasConfiguration.setCameras(new CamerasConfigurationCamera[]{camera});
        configurationCommand.setCameras(camerasConfiguration);

        CamerasConfigurationBrightness cameraBrightness;
        CamerasConfigurationGamma cameraGamma;
        CamerasConfigurationWhitebalance cameraWhitebalance;

        switch (type) {
            case CameraFlip:
                camera.setFlip(new ValueSpaceRefHolder(value));
                break;
            case CameraBacklightDefaultMode:
                CamerasConfigurationBacklight cameraBacklight = new CamerasConfigurationBacklight();
                cameraBacklight.setDefaultMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                camera.setBacklight(cameraBacklight);
                break;
            case CameraBrightnessDefaultLevel:
                cameraBrightness = new CamerasConfigurationBrightness();
                cameraBrightness.setDefaultLevel(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                camera.setBrightness(cameraBrightness);
                break;
            case CameraBrightnessMode:
                cameraBrightness = new CamerasConfigurationBrightness();
                cameraBrightness.setMode(new ValueSpaceRefHolder(value));
                camera.setBrightness(cameraBrightness);
                break;
            case CameraFocusMode:
                CamerasConfigurationFocus cameraFocus = new CamerasConfigurationFocus();
                cameraFocus.setMode(new ValueSpaceRefHolder(value));
                camera.setFocus(cameraFocus);
                break;
            case CameraGammaLevel:
                cameraGamma = new CamerasConfigurationGamma();
                cameraGamma.setLevel(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                camera.setGamma(cameraGamma);
                break;
            case CameraGammaMode:
                cameraGamma = new CamerasConfigurationGamma();
                cameraGamma.setMode(new ValueSpaceRefHolder(value));
                camera.setGamma(cameraGamma);
                break;
            case CameraIrSensor:
                camera.setIrSensor(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                break;
            case CameraMirror:
                camera.setMirror(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                break;
            case CameraWhitebalanceLevel:
                cameraWhitebalance = new CamerasConfigurationWhitebalance();
                cameraWhitebalance.setLevel(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                camera.setWhitebalance(cameraWhitebalance);
                break;
            case CameraWhitebalanceMode:
                cameraWhitebalance = new CamerasConfigurationWhitebalance();
                cameraWhitebalance.setMode(new ValueSpaceRefHolder(value));
                camera.setWhitebalance(cameraWhitebalance);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return configurationCommand;
    }

    /**
     * Generate camera configuration command.
     * This method is not specific per-camera, so it does not require cameraId value.
     *
     * @param value control operation value
     * @param type  type of the camera configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateCameraConfigurationPayload(String value, CameraConfigurationCommandType type) {
        CiscoConfiguration configurationCommand = new CiscoConfiguration();
        CamerasConfiguration camerasConfiguration = new CamerasConfiguration();
        configurationCommand.setCameras(camerasConfiguration);

        switch (type) {
            case TriggerAutofocusPreset:
                CamerasConfigurationPreset camerasConfigurationPreset = new CamerasConfigurationPreset();
                camerasConfigurationPreset.setTriggerAutofocus(new ValueSpaceRefHolder(value));
                camerasConfiguration.setPreset(camerasConfigurationPreset);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }

        return configurationCommand;
    }

    /**
     * Generate conference configuration command.
     *
     * @param value control operation value
     * @param type  type of the conference configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateConferenceConfigurationPayload(String value, ConferenceConfigurationCommandType type) {
        CiscoConfiguration ciscoConfiguration = new CiscoConfiguration();
        ConferenceConfiguration conferenceConfiguration = new ConferenceConfiguration();
        ciscoConfiguration.setConference(conferenceConfiguration);

        ConferenceConfigurationAutoAnswer autoAnswer;
        ConferenceConfigurationDefaultCall defaultCall;
        switch (type) {
            case FarEndControl:
                ConferenceConfigurationFarEndControl farEndControl = new ConferenceConfigurationFarEndControl();
                farEndControl.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                conferenceConfiguration.setFarEndControl(farEndControl);
                break;
            case AutoAnswerMode:
                autoAnswer = new ConferenceConfigurationAutoAnswer();
                autoAnswer.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                conferenceConfiguration.setAutoAnswer(autoAnswer);
                break;
            case AutoAnswerDelay:
                autoAnswer = new ConferenceConfigurationAutoAnswer();
                autoAnswer.setDelay(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                conferenceConfiguration.setAutoAnswer(autoAnswer);
                break;
            case AutoAnswerMute:
                autoAnswer = new ConferenceConfigurationAutoAnswer();
                autoAnswer.setMute(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                conferenceConfiguration.setAutoAnswer(autoAnswer);
                break;
            case EncryptionMode:
                ConferenceConfigurationEncryption encryption = new ConferenceConfigurationEncryption();
                encryption.setMode(new ValueSpaceRefHolder(value));
                conferenceConfiguration.setEncryption(encryption);
                break;
            case DefaultCallRate:
                defaultCall = new ConferenceConfigurationDefaultCall();
                defaultCall.setRate(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                conferenceConfiguration.setDefaultCall(defaultCall);
                break;
            case DefaultCallProtocol:
                defaultCall = new ConferenceConfigurationDefaultCall();
                defaultCall.setProtocol(new ValueSpaceRefHolder(value));
                conferenceConfiguration.setDefaultCall(defaultCall);
                break;
            case DoNotDisturbTimeout:
                ConferenceConfigurationDoNotDisturb doNotDisturb = new ConferenceConfigurationDoNotDisturb();
                doNotDisturb.setDefaultTimeout(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                conferenceConfiguration.setDoNotDisturb(doNotDisturb);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }

        return ciscoConfiguration;
    }

    /**
     * Generate network services configuration command.
     *
     * @param value control operation value
     * @param type  type of the network service configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateNetworkServicesConfigurationPayload(String value, NetworkServicesConfigurationCommandType type) {
        CiscoConfiguration ciscoConfiguration = new CiscoConfiguration();
        NetworkServicesConfiguration networkServicesConfiguration = new NetworkServicesConfiguration();
        ciscoConfiguration.setNetworkServices(networkServicesConfiguration);

        switch (type) {
            case CDPMode:
                NetworkServicesConfigurationCDP cdp = new NetworkServicesConfigurationCDP();
                cdp.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                networkServicesConfiguration.setCdp(cdp);
                break;
            case NTPMode:
                NetworkServicesConfigurationNTP ntp = new NetworkServicesConfigurationNTP();
                ntp.setMode(new ValueSpaceRefHolder(value));
                networkServicesConfiguration.setNtp(ntp);
                break;
            case SIPMode:
                NetworkServicesConfigurationSIP sip = new NetworkServicesConfigurationSIP();
                sip.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                networkServicesConfiguration.setSip(sip);
                break;
            case SSHMode:
                NetworkServicesConfigurationSSH ssh = new NetworkServicesConfigurationSSH();
                ssh.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                networkServicesConfiguration.setSsh(ssh);
                break;
            case H323Mode:
                NetworkServicesConfigurationH323 h323 = new NetworkServicesConfigurationH323();
                h323.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                networkServicesConfiguration.setH323(h323);
                break;
            case UPnPMode:
                NetworkServicesConfigurationUPnP uPnP = new NetworkServicesConfigurationUPnP();
                uPnP.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                networkServicesConfiguration.setuPnP(uPnP);
                break;
            case TelnetMode:
                NetworkServicesConfigurationTelnet telnet = new NetworkServicesConfigurationTelnet();
                telnet.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                networkServicesConfiguration.setTelnet(telnet);
                break;
            case WelcomeText:
                networkServicesConfiguration.setWelcomeText(new ValueSpaceRefHolder(value));
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return ciscoConfiguration;
    }


    /**
     * Generate room analytics configuration command.
     *
     * @param value control operation value
     * @param type  type of the room analytics configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateRoomAnalyticsConfigurationPayload(String value, RoomAnalyticsConfigurationCommandType type) {
        CiscoConfiguration configuration = new CiscoConfiguration();
        RoomAnalyticsConfiguration roomAnalyticsConfiguration = new RoomAnalyticsConfiguration();
        configuration.setRoomAnalytics(roomAnalyticsConfiguration);

        switch (type) {
            case PeoplePresenseMode:
                roomAnalyticsConfiguration.setPeoplePresenceDetector(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return configuration;
    }

    /**
     * Generate proximity configuration command.
     *
     * @param value control operation value
     * @param type  type of the proximity configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateProximityConfigurationPayload(String value, ProximityConfigurationCommandType type) {
        CiscoConfiguration configuration = new CiscoConfiguration();
        ProximityConfiguration proximityConfiguration = new ProximityConfiguration();
        ProximityConfigurationServices proximityConfigurationServices = new ProximityConfigurationServices();
        configuration.setProximity(proximityConfiguration);

        ProximityConfigurationContentShare contentShare;
        switch (type) {
            case ProximityMode:
                proximityConfiguration.setMode(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                break;
            case CallControl:
                proximityConfigurationServices.setCallControl(new ValueSpaceRefHolder(normalizeSwitchValue(value, "Enabled", "Disabled")));
                proximityConfiguration.setServices(proximityConfigurationServices);
                break;
            case ContentShareToClients:
                contentShare = new ProximityConfigurationContentShare();
                contentShare.setToClients(new ValueSpaceRefHolder(normalizeSwitchValue(value, "Enabled", "Disabled")));
                proximityConfigurationServices.setContentShare(contentShare);
                proximityConfiguration.setServices(proximityConfigurationServices);
                break;
            case ContentShareFromClients:
                contentShare = new ProximityConfigurationContentShare();
                contentShare.setFromClients(new ValueSpaceRefHolder(normalizeSwitchValue(value, "Enabled", "Disabled")));
                proximityConfigurationServices.setContentShare(contentShare);
                proximityConfiguration.setServices(proximityConfigurationServices);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }

        return configuration;
    }

    /**
     * Generate standby configuration command.
     *
     * @param value control operation value
     * @param type  type of the standby configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateStandbyConfigurationPayload(String value, StandbyConfigurationCommandType type) {
        CiscoConfiguration ciscoConfiguration = new CiscoConfiguration();
        StandbyConfiguration standbyConfiguration = new StandbyConfiguration();
        ciscoConfiguration.setStandby(standbyConfiguration);

        switch (type) {
            case Delay:
                standbyConfiguration.setDelay(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                break;
            case Control:
                standbyConfiguration.setControl(new ValueSpaceRefHolder(normalizeSwitchValue(value, "On", "Off")));
                break;
            case BootAction:
                standbyConfiguration.setBootAction(new ValueSpaceRefHolder(value));
                break;
            case WakeupAction:
                standbyConfiguration.setWakeupAction(new ValueSpaceRefHolder(value));
                break;
            case StandbyAction:
                standbyConfiguration.setStandbyAction(new ValueSpaceRefHolder(value));
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return ciscoConfiguration;
    }

    /**
     * Generate user interface configuration command.
     *
     * @param value control operation value
     * @param type  type of the user interface configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateUserInterfaceConfigurationPayload(String value, UserInterfaceConfigurationCommandType type) {
        CiscoConfiguration ciscoConfiguration = new CiscoConfiguration();
        UserInterfaceConfiguration userInterfaceConfiguration = new UserInterfaceConfiguration();
        ciscoConfiguration.setUserInterface(userInterfaceConfiguration);

        UserInterfaceConfigurationFeatures features;
        UserInterfaceConfigurationFeaturesCall featuresCall;
        switch (type) {
            case AwakeBrandingColors:
                UserInterfaceConfigurationBranding branding = new UserInterfaceConfigurationBranding();
                UserInterfaceConfigurationAwakeBranding awakeBranding = new UserInterfaceConfigurationAwakeBranding();
                awakeBranding.setColors(new ValueSpaceRefHolder(value));
                branding.setAwakeBranding(awakeBranding);
                userInterfaceConfiguration.setBranding(branding);
                break;
            case KeyTones:
                UserInterfaceConfigurationKeyTones keyTones = new UserInterfaceConfigurationKeyTones();
                keyTones.setMode(new ValueSpaceRefHolder("0".equals(value) ? "Off" : "On"));
                userInterfaceConfiguration.setKeyTones(keyTones);
                break;
            case Language:
                userInterfaceConfiguration.setLanguage(new ValueSpaceRefHolder(value));
                break;
            case ContactInfoType:
                UserInterfaceConfigurationContactInfo contactInfo = new UserInterfaceConfigurationContactInfo();
                contactInfo.setType(new ValueSpaceRefHolder(value));
                userInterfaceConfiguration.setContactInfo(contactInfo);
                break;
            case OSDOutput:
                UserInterfaceConfigurationOSD osd = new UserInterfaceConfigurationOSD();
                osd.setOutput(new ValueSpaceRefHolder(value));
                userInterfaceConfiguration.setOsd(osd);
                break;
            case ShareStart:
                features = new UserInterfaceConfigurationFeatures();
                UserInterfaceConfigurationFeaturesShare featuresShare = new UserInterfaceConfigurationFeaturesShare();
                featuresShare.setStart(new ValueSpaceRefHolder(value));
                features.setShare(featuresShare);
                userInterfaceConfiguration.setFeatures(features);
                break;
            case FeaturesCallEnd:
                features = new UserInterfaceConfigurationFeatures();
                featuresCall = new UserInterfaceConfigurationFeaturesCall();
                featuresCall.setEnd(new ValueSpaceRefHolder(value));
                features.setCall(featuresCall);
                userInterfaceConfiguration.setFeatures(features);
                break;
            case FeaturesCallStart:
                features = new UserInterfaceConfigurationFeatures();
                featuresCall = new UserInterfaceConfigurationFeaturesCall();
                featuresCall.setStart(new ValueSpaceRefHolder(value));
                features.setCall(featuresCall);
                userInterfaceConfiguration.setFeatures(features);
                break;
            case FeaturesMidCallControls:
                features = new UserInterfaceConfigurationFeatures();
                featuresCall = new UserInterfaceConfigurationFeaturesCall();
                featuresCall.setMidCallControls(new ValueSpaceRefHolder(value));
                features.setCall(featuresCall);
                userInterfaceConfiguration.setFeatures(features);
            case HideAllFeatures:
                features = new UserInterfaceConfigurationFeatures();
                features.setHideAll(new ValueSpaceRefHolder(value));
                userInterfaceConfiguration.setFeatures(features);
                break;
            case WhiteboardStart:
                features = new UserInterfaceConfigurationFeatures();
                UserInterfaceConfigurationFeaturesWhiteboard whiteboard = new UserInterfaceConfigurationFeaturesWhiteboard();
                whiteboard.setStart(new ValueSpaceRefHolder(value));
                features.setWhiteboard(whiteboard);
                userInterfaceConfiguration.setFeatures(features);
                break;
            case IncomingCallNotification:
                UserInterfaceConfigurationAccessibility accessibility = new UserInterfaceConfigurationAccessibility();
                accessibility.setIncomingCallNotification(new ValueSpaceRefHolder(value));
                userInterfaceConfiguration.setAccessibility(accessibility);
                break;
            case WelcomeText:
                userInterfaceConfiguration.setWelcomeText(new ValueSpaceRefHolder(value));
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return ciscoConfiguration;
    }

    /**
     * Generate video selfview configuration command.
     *
     * @param value control operation value
     * @param type  type of the video selfview configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateVideoSelfViewConfigurationPayload(String value, VideoSelfViewConfigurationCommandType type) {
        CiscoConfiguration configuration = new CiscoConfiguration();
        VideoConfigurationSelfview configurationSelfview = new VideoConfigurationSelfview();
        VideoConfiguration videoConfiguration = new VideoConfiguration();
        videoConfiguration.setSelfview(configurationSelfview);
        configuration.setVideo(videoConfiguration);

        VideoConfigurationSelfviewOnCall onCall;
        VideoConfigurationSelfviewDefault selfviewDefault;
        switch (type) {
            case OnCallMode:
                onCall = new VideoConfigurationSelfviewOnCall();
                onCall.setMode(new ValueSpaceRefHolder(value));
                configurationSelfview.setOnCall(onCall);
                break;
            case OnCallDuration:
                onCall = new VideoConfigurationSelfviewOnCall();
                onCall.setDuration(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                configurationSelfview.setOnCall(onCall);
                break;
            case DefaultMode:
                selfviewDefault = new VideoConfigurationSelfviewDefault();
                selfviewDefault.setMode(new ValueSpaceRefHolder(value));
                configurationSelfview.setSelfviewDefault(selfviewDefault);
                break;
            case DefaultPIPPosition:
                selfviewDefault = new VideoConfigurationSelfviewDefault();
                selfviewDefault.setPipPosition(new ValueSpaceRefHolder(value));
                configurationSelfview.setSelfviewDefault(selfviewDefault);
                break;
            case DefaultOnMonitorRole:
                selfviewDefault = new VideoConfigurationSelfviewDefault();
                selfviewDefault.setOnMonitorRole(new ValueSpaceRefHolder(value));
                configurationSelfview.setSelfviewDefault(selfviewDefault);
                break;
            case DefaultFullscreenMode:
                selfviewDefault = new VideoConfigurationSelfviewDefault();
                selfviewDefault.setFullscreenMode(new ValueSpaceRefHolder(value));
                configurationSelfview.setSelfviewDefault(selfviewDefault);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return configuration;
    }

    /**
     * Generate video configuration command.
     *
     * @param value control operation value
     * @param type  type of the video configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateVideoConfigurationPayload(String value, VideoConfigurationCommandType type) {
        CiscoConfiguration ciscoConfiguration = new CiscoConfiguration();
        VideoConfiguration videoConfiguration = new VideoConfiguration();
        ciscoConfiguration.setVideo(videoConfiguration);

        switch (type) {
            case Monitors:
                videoConfiguration.setMonitors(new ValueSpaceRefHolder(value));
                break;
            case DefaultMainSource:
                videoConfiguration.setDefaultMainSource(new ValueSpaceRefHolder(value));
                break;
            case DefaultPresentationSource:
                VideoConfigurationPresentation presentation = new VideoConfigurationPresentation();
                presentation.setDefaultSource(new ValueSpaceRefHolder(value));
                videoConfiguration.setPresentation(presentation);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return ciscoConfiguration;
    }

    /**
     * Generate network services configuration command.
     * This method is specific per video configuration, so it requires configurationId value.
     *
     * @param value           control operation value
     * @param configurationId is of a video configuration
     * @param type            type of the video configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateVideoConfigurationPayload(String value, String configurationId, VideoConfigurationCommandType type) {
        CiscoConfiguration ciscoConfiguration = new CiscoConfiguration();
        VideoConfiguration videoConfiguration = new VideoConfiguration();
        ciscoConfiguration.setVideo(videoConfiguration);

        VideoConfigurationInput videoConfigurationInput;
        VideoConfigurationOutput videoConfigurationOutput;
        VideoConfigurationConnector connector;
        switch (type) {
            case Type:
                videoConfigurationInput = new VideoConfigurationInput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setInputSourceType(new ValueSpaceRefHolder(value));
                videoConfigurationInput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setInput(videoConfigurationInput);
                break;
            case Quality:
                videoConfigurationInput = new VideoConfigurationInput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setQuality(new ValueSpaceRefHolder(value));
                videoConfigurationInput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setInput(videoConfigurationInput);
                break;
            case Visibility:
                videoConfigurationInput = new VideoConfigurationInput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setVisibility(new ValueSpaceRefHolder(value));
                videoConfigurationInput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setInput(videoConfigurationInput);
                break;
            case PresentationSelection:
                videoConfigurationInput = new VideoConfigurationInput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setPresentationSelection(new ValueSpaceRefHolder(value));
                videoConfigurationInput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setInput(videoConfigurationInput);
                break;
            case CECMode:
                videoConfigurationOutput = new VideoConfigurationOutput();
                connector = new VideoConfigurationConnector();
                VideoConfigurationCEC cec = new VideoConfigurationCEC();
                cec.setMode(new ValueSpaceRefHolder("0".equals(value) ? "Off" : "On"));
                connector.setItem(configurationId);
                connector.setCec(cec);
                videoConfigurationOutput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setOutput(videoConfigurationOutput);
                break;
            case Resolution:
                videoConfigurationOutput = new VideoConfigurationOutput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setResolution(new ValueSpaceRefHolder(value));
                videoConfigurationOutput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setOutput(videoConfigurationOutput);
                break;
            case MonitorRole:
                videoConfigurationOutput = new VideoConfigurationOutput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setMonitorRole(new ValueSpaceRefHolder(value));
                videoConfigurationOutput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setOutput(videoConfigurationOutput);
                break;
            case OverscanLevel:
                videoConfigurationOutput = new VideoConfigurationOutput();
                connector = new VideoConfigurationConnector();
                connector.setItem(configurationId);
                connector.setOverscanLevel(new ValueSpaceRefHolder(value));
                videoConfigurationOutput.setConnectors(new VideoConfigurationConnector[]{connector});
                videoConfiguration.setOutput(videoConfigurationOutput);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }
        return ciscoConfiguration;
    }

    /**
     * Generate audio configuration command.
     *
     * @param value           control operation value
     * @param type            type of the audio configuration command, to use as a reference for command payload creation
     * @return {@link CiscoConfiguration} instance with correct values set
     */
    public static CiscoConfiguration generateAudioConfigurationPayload(String value, AudioConfigurationCommandType type) {
        CiscoConfiguration configuration = new CiscoConfiguration();
        AudioConfiguration audioConfiguration = new AudioConfiguration();
        configuration.setAudio(audioConfiguration);

        switch (type) {
            case MicrophoneMode:
                AudioConfigurationInput audioConfigurationInput = new AudioConfigurationInput();
                audioConfigurationInput.setMicrophoneMode(new ValueSpaceRefHolder(value));
                audioConfiguration.setInput(audioConfigurationInput);
                break;
            case MaxUltrasoundVolume:
                AudioConfigurationUltrasound ultrasound = new AudioConfigurationUltrasound();
                ultrasound.setMaxVolume(new ValueSpaceRefHolder(removeDecimalPoint(value)));
                audioConfiguration.setUltrasound(ultrasound);
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }

        return configuration;
    }

    /**
     * Generate audio control command.
     *
     * @param value           control operation value
     * @param type            type of the audio configuration command, to use as a reference for command payload creation
     * @return {@link Command} instance with correct values set
     */
    public static Command generateAudioCommandPayload(String value, AudioControlCommandType type) {
        Command commmand = new Command();

        switch (type) {
            case Volume:
                commmand.setAudioCommand(new VolumeChangeCommand(Integer.valueOf(removeDecimalPoint(value))));
                break;
            default:
                if(logger.isWarnEnabled()) {
                    logger.warn(String.format("Command is not supported. Property: %s, value: %s", type, value));
                }
                break;
        }

        return commmand;
    }

    /**
     * Removing decimal point for slider command actions.
     * By default, Symphony handles Slider controls using values with a decimal point values.
     * Cisco API does not support such values, so for any slider control operation, values should not have a decimal
     * point
     *
     * @param value of the control operation
     * @return {@link String} value without a decimal point
     * @throws RuntimeException if original value is null or empty
     */
    private static String removeDecimalPoint(String value) {
        if (StringUtils.isNullOrEmpty(value)) {
            throw new RuntimeException("Unable to create a control operation with null or empty control value.");
        } else {
            return String.format("%.0f", Float.valueOf(value));
        }
    }

    /**
     * Normalizing switch control values.
     * Some control operations require values within [On, Off] range, others - [Enabled, Disabled]
     * This method takes initial value, On/Off string values and normalizes the value.
     *
     * @param value    initial value of the switch control [0, 1]
     * @param valueOn  control value for 1
     * @param valueOff control value for 0
     * @return valueOn or valueOff string, depending on the initial value passed
     */
    private static String normalizeSwitchValue(String value, String valueOn, String valueOff) {
        return "0".equals(value) ? valueOff : valueOn;
    }
}
