/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.valuespace;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ValueSpace")
@XmlAccessorType(XmlAccessType.NONE)
public class ValueSpace {

    @XmlAccessorType(XmlAccessType.NONE)
    public static class TTPARValue {
        @XmlAttribute(name = "item")
        private String item;
        @XmlValue
        private String value;

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    @XmlAttribute(name = "type")
    private String type;

    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "Value")
    private TTPARValue[] values;

    public TTPARValue[] getValues() {
        return values;
    }

    public void setValues(TTPARValue[] values) {
        this.values = values;
    }
}
