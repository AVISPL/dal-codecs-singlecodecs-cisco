/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit;



import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@XmlAccessorType(XmlAccessType.NONE)
public class Software {
    @XmlElement(name = "DisplayName")
    private String displayName;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "ReleaseDate")
    private String releaseDate;
    @XmlElement(name = "Version")
    private String version;
    @XmlElement(name = "OptionKeys")
    private SoftwareOptionKeys optionKeys;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SoftwareOptionKeys getOptionKeys() {
        return optionKeys;
    }

    public void setOptionKeys(SoftwareOptionKeys optionKeys) {
        this.optionKeys = optionKeys;
    }
}
