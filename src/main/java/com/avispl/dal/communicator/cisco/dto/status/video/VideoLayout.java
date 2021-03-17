/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.video;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class VideoLayout {
    @XmlElement(name = "LayoutFamily")
    private VideoLayoutFamily layoutFamily;

    public VideoLayoutFamily getLayoutFamily() {
        return layoutFamily;
    }

    public void setLayoutFamily(VideoLayoutFamily layoutFamily) {
        this.layoutFamily = layoutFamily;
    }
}
