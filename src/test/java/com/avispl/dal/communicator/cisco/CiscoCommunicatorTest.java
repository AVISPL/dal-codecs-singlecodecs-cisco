package com.avispl.dal.communicator.cisco;

import com.avispl.symphony.api.dal.dto.control.ControllableProperty;
import com.avispl.symphony.api.dal.dto.control.Protocol;
import com.avispl.symphony.api.dal.dto.control.call.CallStatus;
import com.avispl.symphony.api.dal.dto.control.call.DialDevice;
import com.avispl.symphony.api.dal.dto.control.call.MuteStatus;
import com.avispl.symphony.api.dal.dto.control.call.PopupMessage;
import com.avispl.symphony.api.dal.dto.monitor.EndpointStatistics;
import com.avispl.symphony.api.dal.dto.monitor.ExtendedStatistics;
import com.avispl.symphony.api.dal.dto.monitor.Statistics;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.common.io.Resources;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.google.common.io.Resources.getResource;
import static java.nio.charset.StandardCharsets.UTF_8;

public class CiscoCommunicatorTest {
    CiscoCommunicator ciscoCommunicator;

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(WireMockConfiguration.DYNAMIC_PORT);

    @BeforeEach
    public void setUp() throws Exception {
//        wireMockRule.start();
        ciscoCommunicator = new CiscoCommunicator();
        ciscoCommunicator.setHost("172.31.254.110");
        ciscoCommunicator.setPort(80);
        ciscoCommunicator.setProtocol("http");
        ciscoCommunicator.setPassword("1234");
        ciscoCommunicator.setLogin("admin");
        ciscoCommunicator.init();
    }

    private static String resource(String s) throws IOException {
        return Resources.toString(getResource(s), UTF_8);
    }

    @Test
    public void testSendMessage() throws Exception {
        PopupMessage popupMessage = new PopupMessage();
        popupMessage.setMessage("Test message");
        popupMessage.setDuration(20);
        ciscoCommunicator.sendMessage(popupMessage);
    }

    @Test
    public void testStandbyMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Standby#State");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testRestart() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("SystemUnit#Restart");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testSerializeProperties() throws Exception {
        ciscoCommunicator.setHistoricalProperties("CurrentPeopleCount");
        ciscoCommunicator.setDisplayPropertyGroups("Audio,SystemUnit,Standby,Peripherals,Camera,Conference,NetworkServices,Video,UserInterface,ConferenceCapabilities,ActiveCall,H323,SIP,Security,Network,USB,RoomAnalytics,Proximity");
        ciscoCommunicator.setDisplayPropertyGroups("All");
        List<Statistics> statistics = ciscoCommunicator.getMultipleStatistics();
        Assert.assertEquals(2, statistics.size());

        ExtendedStatistics extendedStatistics = (ExtendedStatistics) statistics.get(0);
        EndpointStatistics endpointStatistics = (EndpointStatistics) statistics.get(1);
        Assert.assertNotNull(extendedStatistics);
        Assert.assertEquals(1, extendedStatistics.getDynamicStatistics().size());
        Assert.assertNotNull(endpointStatistics);
        Assert.assertNotNull(extendedStatistics.getStatistics());
        Assert.assertTrue(extendedStatistics.getStatistics().size() > 100);
        Assert.assertTrue(extendedStatistics.getControllableProperties().size() > 50);
    }

    @Test
    public void testPeoplePresenceDetectorSwitch() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("RoomAnalytics#PeoplePresenceDetection");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraFocus() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Focus");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testTriggerAutofocusPreset() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#TriggerAutofocusPreset");
        controllableProperty.setValue("Auto");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraTilt() throws Exception {
       // ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Tilt");
        controllableProperty.setValue(10);
        ciscoCommunicator.controlProperty(controllableProperty);
    }


    @Test
    public void testInputSourceVisibility() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Video#InputSource2Visibility");
        controllableProperty.setValue("Always");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testWelcomeText() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("NetworkServices#WelcomeText");
        controllableProperty.setValue("Off");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testAutoAnswerDelay() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#AutoAnswerDelay");
        controllableProperty.setValue("1");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testAutoAnswerMode() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#AutoAnswerMode");// 1 | 0
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testAutoAnswerMute() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#AutoAnswerMute"); // 1 | 0
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testDefaultCallProtocol() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#DefaultCallProtocol");
        controllableProperty.setValue("Sip");
        controllableProperty.setValue("Auto");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testDefaultCallRate() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#DefaultCallRate"); //64...6000
        controllableProperty.setValue(5900);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testDoNotDisturbTimeout() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#DoNotDisturbTimeout"); //1...1440
        controllableProperty.setValue(20);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testEncryptionMode() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#EncryptionMode"); //BestEffort | On | Off
        controllableProperty.setValue("BestEffort");
        controllableProperty.setValue("On");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testFarEndControl() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Conference#FarEndControl"); // | 1 | 0
        controllableProperty.setValue(1);
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testH323Mode() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("NetworkServices#H323Mode"); // | 1 | 0
        controllableProperty.setValue(1);
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testStandbyControl() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Standby#Control"); // | 1 | 0
        controllableProperty.setValue(1);
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testUserInterfaceLanguage() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("UserInterface#Language"); // | English | EnglishUK
        controllableProperty.setValue("English");
        controllableProperty.setValue("EnglishUK");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testDefaultMainSource() throws Exception {
        ciscoCommunicator.getMultipleStatistics();
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Video#DefaultMainSource"); //
        controllableProperty.setValue(2);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraPanFloatValue() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Pan");
        controllableProperty.setValue(11.0f);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testMaxUltrasoundVolume() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Audio#UltrasoundMaxVolume");
        controllableProperty.setValue(25.0f);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraPanIntValue() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Pan");
        controllableProperty.setValue(-17000);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraTiltIntValue() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Tilt");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraZoom() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Zoom");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraFlip() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Flip");
        controllableProperty.setValue("Auto");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraBacklight() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Backlight");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraBrightnessLevel() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1BrightnessLevel");
        controllableProperty.setValue(15); //1..31
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraBrightnessMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1BrightnessMode");
        controllableProperty.setValue("Manual");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraFocusMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1FocusMode");
        controllableProperty.setValue("Manual");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraGammaLevel() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1GammaLevel");
        controllableProperty.setValue(3); // 0..7
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraGammaMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1GammaMode");
        controllableProperty.setValue("Manual");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraIrSensorMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1IrSensor");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraMirrorMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1Mirror");
        controllableProperty.setValue("Auto");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraWhitebalanceLevel() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1WhitebalanceLevel");
        controllableProperty.setValue(8); // 1..16
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCameraWhitebalanceMode() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Cameras#Camera1WhitebalanceMode");
        //controllableProperty.setValue("Auto");
        controllableProperty.setValue("Manual");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testMicrophoneModeSwitch() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Audio#MicrophoneMode");
        controllableProperty.setValue("Focused");
       // controllableProperty.setValue("Wide");
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testProximityModeSwitch() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("ProximityServices#ProximityServicesMode");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testCallControlSwitch() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("ProximityServices#CallControl");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testContentShareFromClientSwitch() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("ProximityServices#ContentShareFromClients");
        controllableProperty.setValue(0);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testContentShareToClientSwitch() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("ProximityServices#ContentShareToClients");
        controllableProperty.setValue(1);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testMute() throws Exception {
        ciscoCommunicator.mute();
    }

    @Test
    public void testUnmute() throws Exception {
        ciscoCommunicator.unmute();
    }

    @Test
    public void testVolumeChange() throws Exception {
        ControllableProperty controllableProperty = new ControllableProperty();
        controllableProperty.setProperty("Audio#Volume");
        controllableProperty.setValue(30);
        ciscoCommunicator.controlProperty(controllableProperty);
    }

    @Test
    public void testHangup() throws Exception {
        ciscoCommunicator.hangup("");
    }

    @Test
    public void testDial() throws Exception {
        DialDevice dialDevice = new DialDevice();
        dialDevice.setDialString("639955171.1167084978@t.plcm.vc");
        dialDevice.setProtocol(Protocol.SIP);
        String response = ciscoCommunicator.dial(dialDevice);
        Assert.assertNotNull(response, "CallId should not be null");
    }

    @Test
    public void testRetrieveMuteStatus() throws Exception {
        MuteStatus muteStatus = ciscoCommunicator.retrieveMuteStatus();
        Assert.assertNotNull(muteStatus.name(), "Call id should not be null");
    }

    @Test
    public void testRetrieveCallStatus() throws Exception {
        CallStatus callStatus = ciscoCommunicator.retrieveCallStatus("");
        Assert.assertNotNull(callStatus.getCallId(), "Mute status should not be null");
    }

    @Test
    public void testRetrieveStatusInfo() throws Exception {
        wireMockRule.stubFor(get(urlEqualTo("/configuration.xml")))
                .setResponse(okXml(resource("configuration.xml")).build());
        wireMockRule.stubFor(get(urlEqualTo("/status.xml")))
                .setResponse(okXml(resource("status.xml")).build());

        ciscoCommunicator.getMultipleStatistics();
    }
}
