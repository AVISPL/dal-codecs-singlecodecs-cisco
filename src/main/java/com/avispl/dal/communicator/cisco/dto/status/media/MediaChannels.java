/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.media;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class MediaChannels {
    @XmlElement(name = "Call")
    private MediaStatsCall[] calls;

    public MediaStatsCall[] getCalls() {
        return calls;
    }

    public void setCalls(MediaStatsCall[] calls) {
        this.calls = calls;
    }
}
