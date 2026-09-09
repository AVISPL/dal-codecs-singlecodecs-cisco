/*
 * Copyright (c) 2023 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.systemunit.extensions.microsoft;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Provides MS Extensions version code details
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on July 27, 2023
 * @since 1.1.4
 */
public class ExtensionVersionCode {
    @JacksonXmlProperty(localName = "CompanyPortalApp")
    private String companyPortalApp;
    @JacksonXmlProperty(localName = "OEMAgent")
    private String oemAgent;
    @JacksonXmlProperty(localName = "TeamsAdminAgent")
    private String teamsAdminAgent;
    @JacksonXmlProperty(localName = "TeamsApp")
    private String teamsApp;

    /**
     * Retrieves {@link #companyPortalApp}
     *
     * @return value of {@link #companyPortalApp}
     */
    public String getCompanyPortalApp() {
        return companyPortalApp;
    }

    /**
     * Sets {@link #companyPortalApp} value
     *
     * @param companyPortalApp new value of {@link #companyPortalApp}
     */
    public void setCompanyPortalApp(String companyPortalApp) {
        this.companyPortalApp = companyPortalApp;
    }

    /**
     * Retrieves {@link #oemAgent}
     *
     * @return value of {@link #oemAgent}
     */
    public String getOemAgent() {
        return oemAgent;
    }

    /**
     * Sets {@link #oemAgent} value
     *
     * @param oemAgent new value of {@link #oemAgent}
     */
    public void setOemAgent(String oemAgent) {
        this.oemAgent = oemAgent;
    }

    /**
     * Retrieves {@link #teamsAdminAgent}
     *
     * @return value of {@link #teamsAdminAgent}
     */
    public String getTeamsAdminAgent() {
        return teamsAdminAgent;
    }

    /**
     * Sets {@link #teamsAdminAgent} value
     *
     * @param teamsAdminAgent new value of {@link #teamsAdminAgent}
     */
    public void setTeamsAdminAgent(String teamsAdminAgent) {
        this.teamsAdminAgent = teamsAdminAgent;
    }

    /**
     * Retrieves {@link #teamsApp}
     *
     * @return value of {@link #teamsApp}
     */
    public String getTeamsApp() {
        return teamsApp;
    }

    /**
     * Sets {@link #teamsApp} value
     *
     * @param teamsApp new value of {@link #teamsApp}
     */
    public void setTeamsApp(String teamsApp) {
        this.teamsApp = teamsApp;
    }
}
