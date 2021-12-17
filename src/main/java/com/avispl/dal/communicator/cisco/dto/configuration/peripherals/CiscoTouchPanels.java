package com.avispl.dal.communicator.cisco.dto.configuration.peripherals;

import com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device Peripherals Configuration Touch Panels settings class.
 * Serves both for collecting data and changing device's config.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Dec 17, 2021
 * @since 1.1
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CiscoTouchPanels {

    public CiscoTouchPanels() {
    }

    public CiscoTouchPanels(ValueSpaceRefHolder remotePairing) {
        this.remotePairing = remotePairing;
    }

    @JacksonXmlProperty(localName = "RemotePairing")
    private ValueSpaceRefHolder remotePairing;

    /**
     * Retrieves {@code {@link #remotePairing}}
     *
     * @return value of {@link #remotePairing}
     */
    public ValueSpaceRefHolder getRemotePairing() {
        return remotePairing;
    }

    /**
     * Sets {@code remotePairing}
     *
     * @param remotePairing the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolder} field
     */
    public void setRemotePairing(ValueSpaceRefHolder remotePairing) {
        this.remotePairing = remotePairing;
    }
}
