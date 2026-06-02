package com.avispl.dal.communicator.cisco.dto.status.provisioning;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ProvisioningSoftwareUpgradeStatus {
    @JacksonXmlProperty(localName="LastChange")
    private String lastChange;
    @JacksonXmlProperty(localName="Phase")
    private String phase;
    @JacksonXmlProperty(localName="Message")
    private String message;
    @JacksonXmlProperty(localName="Status")
    private String status;
    @JacksonXmlProperty(localName="URL")
    private String url;
    @JacksonXmlProperty(localName="Urgency")
    private String urgency;
    @JacksonXmlProperty(localName="VersionId")
    private String versionId;

    /**
     * Retrieves {@link #phase}
     *
     * @return value of {@link #phase}
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets {@link #phase} value
     *
     * @param phase new value of {@link #phase}
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Retrieves {@link #lastChange}
     *
     * @return value of {@link #lastChange}
     */
    public String getLastChange() {
        return lastChange;
    }

    /**
     * Sets {@link #lastChange} value
     *
     * @param lastChange new value of {@link #lastChange}
     */
    public void setLastChange(String lastChange) {
        this.lastChange = lastChange;
    }

    /**
     * Retrieves {@link #message}
     *
     * @return value of {@link #message}
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets {@link #message} value
     *
     * @param message new value of {@link #message}
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Retrieves {@link #status}
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets {@link #status} value
     *
     * @param status new value of {@link #status}
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@link #url}
     *
     * @return value of {@link #url}
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets {@link #url} value
     *
     * @param url new value of {@link #url}
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Retrieves {@link #urgency}
     *
     * @return value of {@link #urgency}
     */
    public String getUrgency() {
        return urgency;
    }

    /**
     * Sets {@link #urgency} value
     *
     * @param urgency new value of {@link #urgency}
     */
    public void setUrgency(String urgency) {
        this.urgency = urgency;
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
