/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/***
 * Representation of nodes, that contain values, item and valueSpaceRef attrubutes, example
 * <DviType valueSpaceRef="/Valuespace/TTPAR_DviType">AutoDetect</DviType>
 * or
 * <Connector item="2" maxOccurrence="2"></Connector>
 *
 * valueSpaceRef is later used for fetching additional value details from /valuespace.xml, to define control limits,
 * controllable property type etc.
 */

@XmlAccessorType(XmlAccessType.NONE)
public class ValueSpaceRefHolder {
    @XmlAttribute(name = "item")
    private String item;

    protected String valueSpaceRef;

    @XmlValue
    private String value;

    @JsonIgnore
    private ValueSpaceRefHolderType type;

    private List<Object> values = new ArrayList<>();

    public ValueSpaceRefHolder() {
    }

    public ValueSpaceRefHolder(String value) {
        this.value = value;
    }

    public ValueSpaceRefHolder(Object value) {
        this.value = String.valueOf(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueSpaceRef() {
        return valueSpaceRef;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Defining the ValueSpaceRefHolder type to address it for a future use (Different types have different applications
     *  - INT/Vs_integer have Min/Max Values, for TTPAR entries - details are fetched from valuespace.xml, STR contains
     *  min/max string length etc.)
     *
     * @param valueSpaceRef schema name value
     */

    @XmlAttribute(name = "valueSpaceRef")
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

    public ValueSpaceRefHolderType getType() {
        return type;
    }

    public void setType(ValueSpaceRefHolderType type) {
        this.type = type;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

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
