/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.webex;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * WebEx status details of the device
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on June 6, 2023
 * @since 1.1.4
 */
public class WebExStatus {
    @JacksonXmlProperty(localName="DeveloperId")
    private String developerId;
    @JacksonXmlProperty(localName="Status")
    private String status;
    @JacksonXmlProperty(localName="Meetings")
    private WebExMeetings meetings;
    @JacksonXmlProperty(localName="Services")
    private WebExServices services;

    /**
     * Retrieves {@link #developerId}
     *
     * @return value of {@link #developerId}
     */
    public String getDeveloperId() {
        return developerId;
    }

    /**
     * Sets {@link #developerId} value
     *
     * @param developerId new value of {@link #developerId}
     */
    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    /**
     * Retrieves {@link #status}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@link #status} value
     *
     * @param status new value of {@link #status}
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@link #meetings}
     *
     * @return value of {@link #meetings}
     */
    public WebExMeetings getWebExMeetings() {
        return meetings;
    }

    /**
     * Sets {@link #meetings} value
     *
     * @param meetings new value of {@link #meetings}
     */
    public void setWebExMeetings(WebExMeetings meetings) {
        this.meetings = meetings;
    }

    /**
     * Retrieves {@link #services}
     *
     * @return value of {@link #services}
     */
    public WebExServices getServices() {
        return services;
    }

    /**
     * Sets {@link #services} value
     *
     * @param services new value of {@link #services}
     */
    public void setServices(WebExServices services) {
        this.services = services;
    }
}
