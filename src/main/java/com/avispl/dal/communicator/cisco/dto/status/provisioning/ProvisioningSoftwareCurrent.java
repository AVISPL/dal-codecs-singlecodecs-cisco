package com.avispl.dal.communicator.cisco.dto.status.provisioning;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningSoftwareCurrent {
    @JacksonXmlProperty(localName="CompletedAt")
    private String completedAt;
    @JacksonXmlProperty(localName="URL")
    private String URL;
    @JacksonXmlProperty(localName="VersionId")
    private String versionId;

    /**
     * Retrieves {@link #completedAt}
     *
     * @return value of {@link #completedAt}
     */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * Sets {@link #completedAt} value
     *
     * @param completedAt new value of {@link #completedAt}
     */
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Retrieves {@link #URL}
     *
     * @return value of {@link #URL}
     */
    public String getURL() {
        return URL;
    }

    /**
     * Sets {@link #URL} value
     *
     * @param URL new value of {@link #URL}
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Retrieves {@link #versionId}
     *
     * @return value of {@link #versionId}
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets {@link #versionId} value
     *
     * @param versionId new value of {@link #versionId}
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }
}
