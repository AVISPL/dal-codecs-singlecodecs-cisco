/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.valuespace;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/***
 * This class represents final values that contain specific attributes, needed for the proper data processing.
 * This is used for processing configuration parameters with multiple values potentially available. Such
 * data is dynamic so we can't rely on static values set in the code, nor we can rely on anything manually
 * configured. So, every time a specific node it processed, like:
 *      {@code <Protocol valueSpaceRef="/Valuespace/TTPAR_CallProtocol">Auto</Protocol>}
 *
 * In order to receive proper range of values for the controllable property, /valuespace.xml is fetched, and
 * possible values are retrieved from there, so this class represents the format:
 *      {@code <TTPAR_CallProtocol type="Literal">
 *              <Value item="1">Auto</Value>
 *              <Value item="2">H320</Value>
 *              <Value item="3">H323</Value>
 *              <Value item="4">Sip</Value>
 *              <Value item="5">Spark</Value>
 *          </TTPAR_CallProtocol>}
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JacksonXmlRootElement(localName = "ValueSpace")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueSpace {

    /***
     * This class represents a single item of the following structure:
     *      <TTPAR_CallProtocol type="Literal">
     *          <Value item="1">Auto</Value>
     *          <Value item="2">H320</Value>
     *          <Value item="3">H323</Value>
     *          <Value item="4">Sip</Value>
     *          <Value item="5">Spark</Value>
     *      </TTPAR_CallProtocol>
     *
     * @author Maksym.Rossiitsev / Symphony Dev Team<br>
     * Created on Apr 26, 2021
     * @since 1.0
     */

    public static class TTPARValue {
        @JacksonXmlProperty(isAttribute = true, localName="item")
        private String item;
        @JacksonXmlText
        private String value;

        /**
         * Retrieves {@code {@link #item}}
         *
         * @return value of {@link #item}
         */
        public String getItem() {
            return item;
        }

        /**
         * Sets {@code item}
         *
         * @param item the {@code java.lang.String} field
         */
        public void setItem(String item) {
            this.item = item;
        }

        /**
         * Retrieves {@code {@link #value}}
         *
         * @return value of {@link #value}
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets {@code value}
         *
         * @param value the {@code java.lang.String} field
         */
        public void setValue(String value) {
            this.value = value;
        }
    }

    @JacksonXmlProperty(isAttribute = true, localName="type")
    private String type;;

    @JacksonXmlProperty(localName="Value")
    @JacksonXmlElementWrapper(useWrapping = false)
    private TTPARValue[] values;

    /**
     * Retrieves {@code {@link #type}}
     *
     * @return value of {@link #type}
     */
    public String getType() {
        return type;
    }

    /**
     * Sets {@code type}
     *
     * @param type the {@code java.lang.String} field
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retrieves {@code {@link #values}}
     *
     * @return value of {@link #values}
     */
    public TTPARValue[] getValues() {
        return values;
    }

    /**
     * Sets {@code values}
     *
     * @param values the {@code com.avispl.dal.communicator.cisco.dto.valuespace.ValueSpace.TTPARValue[]} field
     */
    public void setValues(TTPARValue[] values) {
        this.values = values;
    }
}
