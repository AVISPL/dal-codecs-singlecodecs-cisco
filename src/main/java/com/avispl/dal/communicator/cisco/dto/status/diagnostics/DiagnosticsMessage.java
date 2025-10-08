package com.avispl.dal.communicator.cisco.dto.status.diagnostics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DiagnosticsMessage {
    @JacksonXmlProperty(localName="Description")
    private String description;
    @JacksonXmlProperty(localName="Level")
    private String level;
    @JacksonXmlProperty(localName="References")
    private String references;
    @JacksonXmlProperty(localName="Type")
    private String type;

    /**
     * Retrieves {@link #description}
     *
     * @return value of {@link #description}
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets {@link #description} value
     *
     * @param description new value of {@link #description}
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves {@link #level}
     *
     * @return value of {@link #level}
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets {@link #level} value
     *
     * @param level new value of {@link #level}
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Retrieves {@link #references}
     *
     * @return value of {@link #references}
     */
    public String getReferences() {
        return references;
    }

    /**
     * Sets {@link #references} value
     *
     * @param references new value of {@link #references}
     */
    public void setReferences(String references) {
        this.references = references;
    }

    /**
     * Retrieves {@link #type}
     *
     * @return value of {@link #type}
     */
    public String getType() {
        return type;
    }

    /**
     * Sets {@link #type} value
     *
     * @param type new value of {@link #type}
     */
    public void setType(String type) {
        this.type = type;
    }
}
