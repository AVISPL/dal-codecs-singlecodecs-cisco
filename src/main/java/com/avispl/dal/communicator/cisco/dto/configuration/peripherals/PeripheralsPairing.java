package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Peripherals Configuration pairing class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PeripheralsPairing {
    @JacksonXmlProperty(localName = "CiscoTouchPanels")
    private CiscoTouchPanels ciscoTouchPanels;

    /**
     * Retrieves {@code {@link #ciscoTouchPanels}}
     *
     * @return value of {@link #ciscoTouchPanels}
     */
    public CiscoTouchPanels getCiscoTouchPanels() {
        return ciscoTouchPanels;
    }

    /**
     * Sets {@code ciscoTouchPanels}
     *
     * @param ciscoTouchPanels the {@code com.avispl.dal.communicator.cisco.dto.configuration.peripherals.CiscoTouchPanels} field
     */
    public void setCiscoTouchPanels(CiscoTouchPanels ciscoTouchPanels) {
        this.ciscoTouchPanels = ciscoTouchPanels;
    }
}
