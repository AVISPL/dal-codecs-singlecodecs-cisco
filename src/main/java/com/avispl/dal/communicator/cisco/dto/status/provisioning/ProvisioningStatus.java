package com.avispl.dal.communicator.cisco.dto.status.provisioning;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningStatus {
    @JacksonXmlProperty(localName="Software")
    private ProvisioningSoftware software;

    /**
     * Retrieves {@link #software}
     *
     * @return value of {@link #software}
     */
    public ProvisioningSoftware getSoftware() {
        return software;
    }

    /**
     * Sets {@link #software} value
     *
     * @param software new value of {@link #software}
     */
    public void setSoftware(ProvisioningSoftware software) {
        this.software = software;
    }
}
