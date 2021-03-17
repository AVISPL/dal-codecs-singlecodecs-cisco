/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.phonebook;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class PhonebookConfigurationServer {
    @XmlElement(name = "ID")
    private ValueSpaceRefHolder id;
    @XmlElement(name = "Type")
    private ValueSpaceRefHolder type;
    @XmlElement(name = "URL")
    private ValueSpaceRefHolder url;

    public ValueSpaceRefHolder getId() {
        return id;
    }

    public void setId(ValueSpaceRefHolder id) {
        this.id = id;
    }

    public ValueSpaceRefHolder getType() {
        return type;
    }

    public void setType(ValueSpaceRefHolder type) {
        this.type = type;
    }

    public ValueSpaceRefHolder getUrl() {
        return url;
    }

    public void setUrl(ValueSpaceRefHolder url) {
        this.url = url;
    }
}
