/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.security;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Security {
    @XmlElement(name = "FIPS")
    private FIPS fips;
    @XmlElement(name = "Persistency")
    private Persistency persistency;

    public FIPS getFips() {
        return fips;
    }

    public void setFips(FIPS fips) {
        this.fips = fips;
    }

    public Persistency getPersistency() {
        return persistency;
    }

    public void setPersistency(Persistency persistency) {
        this.persistency = persistency;
    }
}
