/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.ArrayList;
import java.util.List;

/***
 * Representation of nodes, that contain values, item and valueSpaceRef attrubutes, example
 * {@code <DviType valueSpaceRef="/Valuespace/TTPAR_DviType">AutoDetect</DviType>}
 * or
 * {@code <Connector item="2" maxOccurrence="2"></Connector>}
 *
 * valueSpaceRef is later used for fetching additional value details from /valuespace.xml, to define control limits,
 * controllable property type etc.
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ValueSpaceRefHolder {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;

    protected String valueSpaceRef;

    @JacksonXmlText
    private String value;

    @JsonIgnore
    private ValueSpaceRefHolderType type;

    private List<Object> values = new ArrayList<>();

    /**
     * Default constructor
     * */
    public ValueSpaceRefHolder() {
    }

    /**
     * Instantiate ValueSpaceRefHolder based on a string value
     */
    public ValueSpaceRefHolder(String value) {
        this.value = value;
    }

    /**
     * Instantiate ValueSpaceRefHolder based on an object value
     */
    public ValueSpaceRefHolder(Object value) {
        this.value = String.valueOf(value);
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
     * Retrieves {@code {@link #valueSpaceRef}}
     *
     * @return value of {@link #valueSpaceRef}
     */
    public String getValueSpaceRef() {
        return valueSpaceRef;
    }

    /**
     * Sets {@code value}
     *
     * @param value the {@code java.lang.String} field
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Defining the ValueSpaceRefHolder type to address it for a future use (Different types have different applications
     *  - INT/Vs_integer have Min/Max Values, for TTPAR entries - details are fetched from valuespace.xml, STR contains
     *  min/max string length etc.)
     *
     * @param valueSpaceRef schema name value
     */
    @JacksonXmlProperty(isAttribute = true, localName="valueSpaceRef")
    public void setValueSpaceRef(String valueSpaceRef) {
        this.valueSpaceRef = valueSpaceRef.replaceAll("/Valuespace/", "");

        if (null != this.valueSpaceRef) {
            if (this.valueSpaceRef.contains("Vs_integer")) {
                type = ValueSpaceRefHolderType.VS_INT;
            } else if (this.valueSpaceRef.contains("INT")) {
                type = ValueSpaceRefHolderType.INT;
            } else if (this.valueSpaceRef.contains("STR")) {
                type = ValueSpaceRefHolderType.STR;
            } else if (this.valueSpaceRef.contains("TTPAR")) {
                type = ValueSpaceRefHolderType.TTPAR;
            } else {
                type = ValueSpaceRefHolderType.DEFAULT;
            }
        }
        extractAndSetValues();
    }

    /**
     * Retrieves {@code {@link #type}}
     *
     * @return value of {@link #type}
     */
    public ValueSpaceRefHolderType getType() {
        return type;
    }

    /**
     * Sets {@code type}
     *
     * @param type the {@code com.avispl.dal.communicator.cisco.dto.ValueSpaceRefHolderType} field
     */
    public void setType(ValueSpaceRefHolderType type) {
        this.type = type;
    }

    /**
     * Retrieves {@code {@link #values}}
     *
     * @return value of {@link #values}
     */
    public List<Object> getValues() {
        return values;
    }

    /**
     * Sets {@code values}
     *
     * @param values the {@code java.util.List<java.lang.Object>} field
     */
    public void setValues(List<Object> values) {
        this.values = values;
    }

    /***
     * Normalize min/max parameter values based on its type.
     * Values have format similar to TYPE_MINVALUE_MAXVALUE, e.g INT_1_100
     */
    private void extractAndSetValues() {
        if (null != type && null != valueSpaceRef) {
            if (type.equals(ValueSpaceRefHolderType.INT)) {
                String[] values = valueSpaceRef.split("_");
                for (int i = 1; i < values.length; i++) {
                    this.values.add(values[i]);
                }
            } else if (type.equals(ValueSpaceRefHolderType.VS_INT)) {
                String[] values = valueSpaceRef.split("_");
                for (int i = 2; i < values.length; i++) {
                    this.values.add(values[i]);
                }
            } else {
                values.add("N/A");
            }
        }
    }
}
