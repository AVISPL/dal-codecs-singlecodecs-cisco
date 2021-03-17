/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class H323ConfigurationAlias {
    @XmlElement(name = "E164")
    private ValueSpaceRefHolder e164;
    @XmlElement(name = "ID")
    private ValueSpaceRefHolder id;

    public ValueSpaceRefHolder getE164() {
        return e164;
    }

    public void setE164(ValueSpaceRefHolder e164) {
        this.e164 = e164;
    }

    public ValueSpaceRefHolder getId() {
        return id;
    }

    public void setId(ValueSpaceRefHolder id) {
        this.id = id;
    }
}
