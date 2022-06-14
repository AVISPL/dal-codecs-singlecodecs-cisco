/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.configuration.h323;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device H323 Configuration Encryption class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class H323ConfigurationEncryption {
    @JacksonXmlProperty(localName="KeySize")
    private ValueSpaceRefHolder keySize;

    /**
     * Retrieves {@link #keySize}
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
