/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Device H323 Configuration Encryption class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class H323ConfigurationEncryption {
    @XmlElement(name = "KeySize")
    private ValueSpaceRefHolder keySize;

    /**
     * Retrieves {@code {@link #keySize}}
     *
     * @return value of {@link #keySize}
     */
    public ValueSpaceRefHolder getKeySize() {
        return keySize;
    }

    /**
     * Sets {@code keySize}
     *
     * @param keySize the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setKeySize(ValueSpaceRefHolder keySize) {
        this.keySize = keySize;
    }
}
