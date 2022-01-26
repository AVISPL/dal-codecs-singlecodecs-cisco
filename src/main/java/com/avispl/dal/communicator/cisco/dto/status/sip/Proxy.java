/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.sip;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device sip proxy status class
 * Represents sip proxy node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class Proxy {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(localName="Address")
    private String address;
    @JacksonXmlProperty(localName="Status")
    private String status;

    /**
     * Retrieves {@link #item}
     *
     * @return value of {@link #item}
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets {@code item}
     *
     * @param item the {@code java.lang.String} field
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Retrieves {@link #address}
     *
     * @return value of {@link #address}
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets {@code address}
     *
     * @param address the {@code java.lang.String} field
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves {@link #status}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
