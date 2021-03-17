/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Mailbox {
    @XmlElement(name = "MessagesWaiting")
    private String messagesWaiting;
    @XmlElement(name = "URI")
    private String uri;

    public String getMessagesWaiting() {
        return messagesWaiting;
    }

    public void setMessagesWaiting(String messagesWaiting) {
        this.messagesWaiting = messagesWaiting;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
