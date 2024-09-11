/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions.microsoft;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Provides MS Extensions version details
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class ExtensionVersion extends ExtensionVersionCode {
    @JacksonXmlProperty(localName = "Android")
    private String android;

    /**
     * Retrieves {@link #android}
     *
     * @return value of {@link #android}
     */
    public String getAndroid() {
        return android;
    }

    /**
     * Sets {@link #android} value
     *
     * @param android new value of {@link #android}
     */
    public void setAndroid(String android) {
        this.android = android;
    }
}
