/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;




import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class HardwareMonitoring {
    @XmlElement(name = "Fan")

    private Fan[] fans;

    public Fan[] getFans() {
        return fans;
    }

    public void setFans(Fan[] fans) {
        this.fans = fans;
    }
}
