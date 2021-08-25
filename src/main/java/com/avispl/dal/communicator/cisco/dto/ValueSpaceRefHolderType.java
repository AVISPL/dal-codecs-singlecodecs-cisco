/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto;

/**
 * Possible values for a valuespace node types
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
public enum ValueSpaceRefHolderType {
    /**VS INT for int range valuespace type with known min/max values*/
    VS_INT,
    /**INT for int range valuespace type with known min/max values*/
    INT,
    /**STR for str valuespace values*/
    STR,
    /**TTPAR for valuespace ranges that should be fetched from the valuespace.xml payload*/
    TTPAR,
    /**DEFAULT for irrelevant types that could be ignored, value can be used as is*/
    DEFAULT
}
