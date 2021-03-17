/*
 * Copyright (c) 2021 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.call;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class Call {
    @XmlAttribute(name = "item")
    private String item;
    @XmlElement(name = "AnswerState")
    private String answerState;
    @XmlElement(name = "CallType")
    private String callType;
    @XmlElement(name = "CallbackNumber")
    private String callbackNumber;
    @XmlElement(name = "DeviceType")
    private String deviceType;
    @XmlElement(name = "Direction")
    private String direction;
    @XmlElement(name = "DisplayName")
    private String displayName;
    @XmlElement(name = "Duration")
    private String duration;
    @XmlElement(name = "Encryption")
    private CallEncryption encryption;
    @XmlElement(name = "FacilityServiceId")
    private String facilityServiceId;
    @XmlElement(name = "HoldReason")
    private String holdReason;
    @XmlElement(name = "PlacedOnHold")
    private String placedOnHold;
    @XmlElement(name = "Protocol")
    private String protocol;
    @XmlElement(name = "ReceiveCallRate")
    private String receiveCallRate;
    @XmlElement(name = "RemoteNumber")
    private String remoteNumber;
    @XmlElement(name = "Status")
    private String status;
    @XmlElement(name = "TransmitCallRate")
    private String transmitCallRate;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAnswerState() {
        return answerState;
    }

    public void setAnswerState(String answerState) {
        this.answerState = answerState;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getCallbackNumber() {
        return callbackNumber;
    }

    public void setCallbackNumber(String callbackNumber) {
        this.callbackNumber = callbackNumber;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public CallEncryption getEncryption() {
        return encryption;
    }

    public void setEncryption(CallEncryption encryption) {
        this.encryption = encryption;
    }

    public String getFacilityServiceId() {
        return facilityServiceId;
    }

    public void setFacilityServiceId(String facilityServiceId) {
        this.facilityServiceId = facilityServiceId;
    }

    public String getHoldReason() {
        return holdReason;
    }

    public void setHoldReason(String holdReason) {
        this.holdReason = holdReason;
    }

    public String getPlacedOnHold() {
        return placedOnHold;
    }

    public void setPlacedOnHold(String placedOnHold) {
        this.placedOnHold = placedOnHold;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getReceiveCallRate() {
        return receiveCallRate;
    }

    public void setReceiveCallRate(String receiveCallRate) {
        this.receiveCallRate = receiveCallRate;
    }

    public String getRemoteNumber() {
        return remoteNumber;
    }

    public void setRemoteNumber(String remoteNumber) {
        this.remoteNumber = remoteNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransmitCallRate() {
        return transmitCallRate;
    }

    public void setTransmitCallRate(String transmitCallRate) {
        this.transmitCallRate = transmitCallRate;
    }
}
