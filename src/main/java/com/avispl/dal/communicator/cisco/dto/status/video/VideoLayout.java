/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device video layout status class
 * Represents video layout node from /status.xml information payload
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

public class VideoLayout {
    @JacksonXmlProperty(localName="LayoutFamily")
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
