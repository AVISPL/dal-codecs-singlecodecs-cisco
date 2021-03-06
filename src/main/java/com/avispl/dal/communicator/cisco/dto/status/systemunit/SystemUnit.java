/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device system unit status class
 * Represents system unit node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SystemUnit {
    @XmlElement(name = "Hardware")
    private Hardware hardware;
    @XmlElement(name = "Software")
    private Software software;
    @XmlElement(name = "State")
    private State state;
    @XmlElement(name = "ProductId")
    private String productId;
    @XmlElement(name = "ProductPlatform")
    private String productPlatform;
    @XmlElement(name = "ProductType")
    private String productType;
    @XmlElement(name = "Uptime")
    private String uptime;

    /**
     * Retrieves {@code {@link #hardware}}
     *
     * @return value of {@link #hardware}
     */
    public Hardware getHardware() {
        return hardware;
    }

    /**
     * Sets {@code hardware}
     *
     * @param hardware the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.Hardware} field
     */
    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    /**
     * Retrieves {@code {@link #software}}
     *
     * @return value of {@link #software}
     */
    public Software getSoftware() {
        return software;
    }

    /**
     * Sets {@code software}
     *
     * @param software the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.Software} field
     */
    public void setSoftware(Software software) {
        this.software = software;
    }

    /**
     * Retrieves {@code {@link #state}}
     *
     * @return value of {@link #state}
     */
    public State getState() {
        return state;
    }

    /**
     * Sets {@code state}
     *
     * @param state the {@code com.avispl.dal.communicator.cisco.dto.status.systemunit.State} field
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Retrieves {@code {@link #productId}}
     *
     * @return value of {@link #productId}
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets {@code productId}
     *
     * @param productId the {@code java.lang.String} field
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Retrieves {@code {@link #productPlatform}}
     *
     * @return value of {@link #productPlatform}
     */
    public String getProductPlatform() {
        return productPlatform;
    }

    /**
     * Sets {@code productPlatform}
     *
     * @param productPlatform the {@code java.lang.String} field
     */
    public void setProductPlatform(String productPlatform) {
        this.productPlatform = productPlatform;
    }

    /**
     * Retrieves {@code {@link #productType}}
     *
     * @return value of {@link #productType}
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets {@code productType}
     *
     * @param productType the {@code java.lang.String} field
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Retrieves {@code {@link #uptime}}
     *
     * @return value of {@link #uptime}
     */
    public String getUptime() {
        return uptime;
    }

    /**
     * Sets {@code uptime}
     *
     * @param uptime the {@code java.lang.String} field
     */
    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
}
