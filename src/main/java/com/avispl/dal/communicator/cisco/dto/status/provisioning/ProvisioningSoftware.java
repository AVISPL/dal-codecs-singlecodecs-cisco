package com.avispl.dal.communicator.cisco.dto.status.provisioning;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningSoftware {
    @JacksonXmlProperty(localName="Current")
    private ProvisioningSoftwareCurrent current;
    @JacksonXmlProperty(localName="UpgradeStatus")
    private ProvisioningSoftwareUpgradeStatus upgradeStatus;

    /**
     * Retrieves {@link #current}
     *
     * @return value of {@link #current}
     */
    public ProvisioningSoftwareCurrent getCurrent() {
        return current;
    }

    /**
     * Sets {@link #current} value
     *
     * @param current new value of {@link #current}
     */
    public void setCurrent(ProvisioningSoftwareCurrent current) {
        this.current = current;
    }

    /**
     * Retrieves {@link #upgradeStatus}
     *
     * @return value of {@link #upgradeStatus}
     */
    public ProvisioningSoftwareUpgradeStatus getUpgradeStatus() {
        return upgradeStatus;
    }

    /**
     * Sets {@link #upgradeStatus} value
     *
     * @param upgradeStatus new value of {@link #upgradeStatus}
     */
    public void setUpgradeStatus(ProvisioningSoftwareUpgradeStatus upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }
}
