/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class H323ConfigurationEncryption {
    @XmlElement(name = "KeySize")
    private ValueSpaceRefHolder keySize;

    public ValueSpaceRefHolder getKeySize() {
        return keySize;
    }

    public void setKeySize(ValueSpaceRefHolder keySize) {
        this.keySize = keySize;
    }
}
