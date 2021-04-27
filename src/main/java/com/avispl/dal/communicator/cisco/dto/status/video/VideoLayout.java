/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Device video layout status class
 * Represents video layout node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VideoLayout {
    @XmlElement(name = "LayoutFamily")
    private VideoLayoutFamily layoutFamily;

    /**
     * Retrieves {@code {@link #layoutFamily}}
     *
     * @return value of {@link #layoutFamily}
     */
    public VideoLayoutFamily getLayoutFamily() {
        return layoutFamily;
    }

    /**
     * Sets {@code layoutFamily}
     *
     * @param layoutFamily the {@code com.avispl.dal.communicator.cisco.dto.status.video.VideoLayoutFamily} field
     */
    public void setLayoutFamily(VideoLayoutFamily layoutFamily) {
        this.layoutFamily = layoutFamily;
    }
}
