/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

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

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPlatform() {
        return productPlatform;
    }

    public void setProductPlatform(String productPlatform) {
        this.productPlatform = productPlatform;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getUptime() { return uptime; }

    public void setUptime(String uptime) { this.uptime = uptime; }
}
