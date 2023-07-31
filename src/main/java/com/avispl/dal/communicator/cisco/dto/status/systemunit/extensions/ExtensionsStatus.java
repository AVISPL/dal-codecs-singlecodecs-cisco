/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions;

import com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions.microsoft.MicrosoftExtension;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Provides Extensions details of the device, currenly only includes MS extensions
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class ExtensionsStatus {
    @JacksonXmlProperty(localName = "Microsoft")
    private MicrosoftExtension microsoftExtension;

    /**
     * Retrieves {@link #microsoftExtension}
     *
     * @return value of {@link #microsoftExtension}
     */
    public MicrosoftExtension getMicrosoftExtension() {
        return microsoftExtension;
    }

    /**
     * Sets {@link #microsoftExtension} value
     *
     * @param microsoftExtension new value of {@link #microsoftExtension}
     */
    public void setMicrosoftExtension(MicrosoftExtension microsoftExtension) {
        this.microsoftExtension = microsoftExtension;
    }
}
