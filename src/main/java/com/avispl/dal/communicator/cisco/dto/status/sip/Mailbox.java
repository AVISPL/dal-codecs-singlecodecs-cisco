/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device mailbox sip status class
 * Represents mailbox sip node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Mailbox {
    @JacksonXmlProperty(localName="MessagesWaiting")
    private String messagesWaiting;
    @JacksonXmlProperty(localName="URI")
    private String uri;

    /**
     * Retrieves {@link #messagesWaiting}
     *
     * @return value of {@link #messagesWaiting}
     */
    public String getMessagesWaiting() {
        return messagesWaiting;
    }

    /**
     * Sets {@code messagesWaiting}
     *
     * @param messagesWaiting the {@code java.lang.String} field
     */
    public void setMessagesWaiting(String messagesWaiting) {
        this.messagesWaiting = messagesWaiting;
    }

    /**
     * Retrieves {@link #uri}
     *
     * @return value of {@link #uri}
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets {@code uri}
     *
     * @param uri the {@code java.lang.String} field
     */
    public void setUri(String uri) {
        this.uri = uri;
    }
}
