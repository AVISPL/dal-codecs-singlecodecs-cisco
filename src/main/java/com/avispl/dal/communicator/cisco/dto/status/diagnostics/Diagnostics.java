package com.avispl.dal.communicator.cisco.dto.status.diagnostics;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Diagnostics {
    @JacksonXmlProperty(localName="Message")
    @JacksonXmlElementWrapper(useWrapping = false)
    private DiagnosticsMessage[] diagnosticsMessages;

    /**
     * Retrieves {@link #diagnosticsMessages}
     *
     * @return value of {@link #diagnosticsMessages}
     */
    public DiagnosticsMessage[] getDiagnosticsMessages() {
        return diagnosticsMessages;
    }

    /**
     * Sets {@link #diagnosticsMessages} value
     *
     * @param diagnosticsMessages new value of {@link #diagnosticsMessages}
     */
    public void setDiagnosticsMessages(DiagnosticsMessage[] diagnosticsMessages) {
        this.diagnosticsMessages = diagnosticsMessages;
    }
}
