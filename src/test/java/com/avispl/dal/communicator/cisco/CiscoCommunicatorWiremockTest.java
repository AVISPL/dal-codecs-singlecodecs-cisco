package com.avispl.dal.communicator.cisco;

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

public class CiscoCommunicatorWiremockTest {
    CiscoCommunicator ciscoCommunicator;

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(WireMockConfiguration.wireMockConfig().dynamicPort().usingFilesUnderClasspath("src/test/resources"));

    @BeforeEach
    public void setUp() throws Exception {
        wireMockRule.start();
        ciscoCommunicator = new CiscoCommunicator();
        ciscoCommunicator.setHost("localhost");
        ciscoCommunicator.setPort(wireMockRule.port());
        ciscoCommunicator.init();
    }

    private static String resource(String s) throws IOException {
        return Resources.toString(getResource(s), UTF_8);
    }

    @Test
    public void testSerializeProperties() throws Exception {
        wireMockRule.stubFor(get(urlEqualTo("/__files/status.xml"))
                .willReturn(aResponse()
                        .withBodyFile("__files/status.xml")
                        .withHeader("Content-Type", "text/xml")));
        wireMockRule.stubFor(get(urlEqualTo("/__files/valuespace.xml"))
                .willReturn(aResponse()
                        .withBodyFile("__files/valuespace.xml")
                        .withHeader("Content-Type", "text/xml")));

        ciscoCommunicator.setHistoricalProperties("CurrentPeopleCount");
        ciscoCommunicator.setDisplayPropertyGroups("Audio,SystemUnit,Standby,Peripherals,Camera,Conference,NetworkServices,Video,UserInterface,ConferenceCapabilities,ActiveCall,H323,SIP,Security,Network,USB,RoomAnalytics,Proximity");
        ciscoCommunicator.setDisplayPropertyGroups("All");
        List<Statistics> statistics = ciscoCommunicator.getMultipleStatistics();
        Thread.sleep(30000);
        statistics = ciscoCommunicator.getMultipleStatistics();
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
    public void testRetrieveStatusInfo() throws Exception {
        wireMockRule.stubFor(get(urlEqualTo("/__files/configuration.xml")))
                .setResponse(okXml(resource("__files/configuration.xml")).build());
        wireMockRule.stubFor(get(urlEqualTo("/__files/status.xml")))
                .setResponse(okXml(resource("__files/status.xml")).build());

        ciscoCommunicator.getMultipleStatistics();
    }
}
