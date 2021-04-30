/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device mailbox sip status class
 * Represents mailbox sip node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Mailbox {
    @XmlElement(name = "MessagesWaiting")
    private String messagesWaiting;
    @XmlElement(name = "URI")
    private String uri;

    /**
     * Retrieves {@code {@link #messagesWaiting}}
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
     * Retrieves {@code {@link #uri}}
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
