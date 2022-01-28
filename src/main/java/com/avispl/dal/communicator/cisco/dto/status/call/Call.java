/*
 * Copyright (c) 2021-2022 AVI-SPL Inc. All Rights Reserved.
 */
package com.avispl.dal.communicator.cisco.dto.status.call;

import com.avispl.dal.communicator.cisco.dto.status.media.Channel;
import com.avispl.symphony.dal.util.StringUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Device call status class.
 * Represents an call status structure from /status.xml device info
 *
 * @author Maksym.Rossiitsev / Symphony Dev Team<br>
 * Created on Apr 26, 2021
 * @since 1.0
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Call {
    @JacksonXmlProperty(isAttribute = true, localName="item")
    private String item;
    @JacksonXmlProperty(isAttribute = true, localName="status")
    private String attributeStatus;
    @JacksonXmlProperty(isAttribute = true, localName="protocol")
    private String attributeProtocol;
    @JacksonXmlProperty(isAttribute = true, localName="direction")
    private String attributeDirection;
    @JacksonXmlProperty(isAttribute = true, localName="logTag")
    private String attributeLogTag;
    @JacksonXmlProperty(localName="AnswerState")
    private String answerState;
    @JacksonXmlProperty(localName="CallType")
    private String callType;
    @JacksonXmlProperty(localName="CallbackNumber")
    private String callbackNumber;
    @JacksonXmlProperty(localName="DeviceType")
    private String deviceType;
    @JacksonXmlProperty(localName="Direction")
    private String direction;
    @JacksonXmlProperty(localName="DisplayName")
    private String displayName;
    @JacksonXmlProperty(localName="Duration")
    private String duration;
    @JacksonXmlProperty(localName="Encryption")
    private CallEncryption encryption;
    @JacksonXmlProperty(localName="FacilityServiceId")
    private String facilityServiceId;
    @JacksonXmlProperty(localName="HoldReason")
    private String holdReason;
    @JacksonXmlProperty(localName="PlacedOnHold")
    private String placedOnHold;
    @JacksonXmlProperty(localName="Protocol")
    private String protocol;
    @JacksonXmlProperty(localName="ReceiveCallRate")
    private String receiveCallRate;
    @JacksonXmlProperty(localName="RemoteNumber")
    private String remoteNumber;
    @JacksonXmlProperty(localName="Status")
    private String status;
    @JacksonXmlProperty(localName="TransmitCallRate")
    private String transmitCallRate;

    @JacksonXmlProperty(localName="Channels")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Channel[] channels;
    @JacksonXmlProperty(localName="CallRate")
    private Integer callRate;

    /**
     * Retrieves callId value, based on either {@link #attributeLogTag}
     * or {@link #item} values
     *
     * @return String value of the callId
     * @since 1.1.1
     */
    public String getCallId() {
       if (!StringUtils.isNullOrEmpty(attributeLogTag)) {
           return attributeLogTag;
       }
       return item;
    }

    /**
     * Retrieves {@link #item}
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
     * Retrieves {@link #attributeStatus}
     *
     * @return value of {@link #attributeStatus}
     * @since 1.1.1
     */
    public String getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * Sets {@code attributeStatus}
     *
     * @param attributeStatus the {@code java.lang.String} field
     * @since 1.1.1
     */
    public void setAttributeStatus(String attributeStatus) {
        this.attributeStatus = attributeStatus;
    }

    /**
     * Retrieves {@link #attributeProtocol}
     *
     * @return value of {@link #attributeProtocol}
     * @since 1.1.1
     */
    public String getAttributeProtocol() {
        return attributeProtocol;
    }

    /**
     * Sets {@code attributeProtocol}
     *
     * @param attributeProtocol the {@code java.lang.String} field
     * @since 1.1.1
     */
    public void setAttributeProtocol(String attributeProtocol) {
        this.attributeProtocol = attributeProtocol;
    }

    /**
     * Retrieves {@link #attributeDirection}
     *
     * @return value of {@link #attributeDirection}
     * @since 1.1.1
     */
    public String getAttributeDirection() {
        return attributeDirection;
    }

    /**
     * Sets {@code attributeDirection}
     *
     * @param attributeDirection the {@code java.lang.String} field
     * @since 1.1.1
     */
    public void setAttributeDirection(String attributeDirection) {
        this.attributeDirection = attributeDirection;
    }

    /**
     * Retrieves {@link #attributeLogTag}
     *
     * @return value of {@link #attributeLogTag}
     * @since 1.1.1
     */
    public String getAttributeLogTag() {
        return attributeLogTag;
    }

    /**
     * Sets {@code attributeLogTag}
     *
     * @param attributeLogTag the {@code java.lang.String} field
     * @since 1.1.1
     */
    public void setAttributeLogTag(String attributeLogTag) {
        this.attributeLogTag = attributeLogTag;
    }

    /**
     * Retrieves {@link #answerState}
     *
     * @return value of {@link #answerState}
     */
    public String getAnswerState() {
        return answerState;
    }

    /**
     * Sets {@code answerState}
     *
     * @param answerState the {@code java.lang.String} field
     */
    public void setAnswerState(String answerState) {
        this.answerState = answerState;
    }

    /**
     * Retrieves {@link #callType}
     *
     * @return value of {@link #callType}
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Sets {@code callType}
     *
     * @param callType the {@code java.lang.String} field
     */
    public void setCallType(String callType) {
        this.callType = callType;
    }

    /**
     * Retrieves {@link #callbackNumber}
     *
     * @return value of {@link #callbackNumber}
     */
    public String getCallbackNumber() {
        return callbackNumber;
    }

    /**
     * Sets {@code callbackNumber}
     *
     * @param callbackNumber the {@code java.lang.String} field
     */
    public void setCallbackNumber(String callbackNumber) {
        this.callbackNumber = callbackNumber;
    }

    /**
     * Retrieves {@link #deviceType}
     *
     * @return value of {@link #deviceType}
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets {@code deviceType}
     *
     * @param deviceType the {@code java.lang.String} field
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Retrieves call direction based on either {@link #attributeDirection} or
     * {@link #direction}, if former is present and latter is not - former is used
     *
     * @return value of {@link #direction}
     */
    public String getDirection() {
        if (!StringUtils.isNullOrEmpty(attributeDirection) && StringUtils.isNullOrEmpty(direction)) {
            return attributeDirection;
        }
        return direction;
    }

    /**
     * Sets {@code direction}
     *
     * @param direction the {@code java.lang.String} field
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * Retrieves {@link #displayName}
     *
     * @return value of {@link #displayName}
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets {@code displayName}
     *
     * @param displayName the {@code java.lang.String} field
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Retrieves {@link #duration}
     *
     * @return value of {@link #duration}
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets {@code duration}
     *
     * @param duration the {@code java.lang.String} field
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Retrieves {@link #encryption}
     *
     * @return value of {@link #encryption}
     */
    public CallEncryption getEncryption() {
        return encryption;
    }

    /**
     * Sets {@code encryption}
     *
     * @param encryption the {@code com.avispl.dal.communicator.cisco.dto.status.call.CallEncryption} field
     */
    public void setEncryption(CallEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * Retrieves {@link #facilityServiceId}
     *
     * @return value of {@link #facilityServiceId}
     */
    public String getFacilityServiceId() {
        return facilityServiceId;
    }

    /**
     * Sets {@code facilityServiceId}
     *
     * @param facilityServiceId the {@code java.lang.String} field
     */
    public void setFacilityServiceId(String facilityServiceId) {
        this.facilityServiceId = facilityServiceId;
    }

    /**
     * Retrieves {@link #holdReason}
     *
     * @return value of {@link #holdReason}
     */
    public String getHoldReason() {
        return holdReason;
    }

    /**
     * Sets {@code holdReason}
     *
     * @param holdReason the {@code java.lang.String} field
     */
    public void setHoldReason(String holdReason) {
        this.holdReason = holdReason;
    }

    /**
     * Retrieves {@link #placedOnHold}
     *
     * @return value of {@link #placedOnHold}
     */
    public String getPlacedOnHold() {
        return placedOnHold;
    }

    /**
     * Sets {@code placedOnHold}
     *
     * @param placedOnHold the {@code java.lang.String} field
     */
    public void setPlacedOnHold(String placedOnHold) {
        this.placedOnHold = placedOnHold;
    }

    /**
     * Retrieves protocol value, based on either {@link #attributeProtocol} or
     * {@link #protocol} if former is present and latter is not - former is used
     *
     * @return value of {@link #protocol}
     */
    public String getProtocol() {
        if (!StringUtils.isNullOrEmpty(attributeProtocol) && StringUtils.isNullOrEmpty(protocol)) {
            return attributeProtocol;
        }
        return protocol;
    }

    /**
     * Sets {@code protocol}
     *
     * @param protocol the {@code java.lang.String} field
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Retrieves {@link #receiveCallRate}
     *
     * @return value of {@link #receiveCallRate}
     */
    public String getReceiveCallRate() {
        return receiveCallRate;
    }

    /**
     * Sets {@code receiveCallRate}
     *
     * @param receiveCallRate the {@code java.lang.String} field
     */
    public void setReceiveCallRate(String receiveCallRate) {
        this.receiveCallRate = receiveCallRate;
    }

    /**
     * Retrieves {@link #remoteNumber}
     *
     * @return value of {@link #remoteNumber}
     */
    public String getRemoteNumber() {
        return remoteNumber;
    }

    /**
     * Sets {@code remoteNumber}
     *
     * @param remoteNumber the {@code java.lang.String} field
     */
    public void setRemoteNumber(String remoteNumber) {
        this.remoteNumber = remoteNumber;
    }

    /**
     * Retrieves call status value, based on either {@link #attributeStatus} or
     * {@link #status} if former is present and latter is not - former is used
     *
     * @return value of {@link #status}
     */
    public String getStatus() {
        if (!StringUtils.isNullOrEmpty(attributeStatus) && StringUtils.isNullOrEmpty(status)) {
            return attributeStatus;
        }
        return status;
    }

    /**
     * Sets {@code status}
     *
     * @param status the {@code java.lang.String} field
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Retrieves {@link #transmitCallRate}
     *
     * @return value of {@link #transmitCallRate}
     */
    public String getTransmitCallRate() {
        return transmitCallRate;
    }

    /**
     * Sets {@code transmitCallRate}
     *
     * @param transmitCallRate the {@code java.lang.String} field
     */
    public void setTransmitCallRate(String transmitCallRate) {
        this.transmitCallRate = transmitCallRate;
    }

    /**
     * Retrieves {@link #channels}
     *
     * @return value of {@link #channels}
     * @since 1.1.1
     */
    public Channel[] getChannels() {
        return channels;
    }

    /**
     * Sets {@code channels}
     *
     * @param channels the {@code com.avispl.dal.communicator.cisco.dto.status.media.Channel[]} field
     * @since 1.1.1
     */
    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    /**
     * Retrieves {@link #callRate}
     *
     * @return value of {@link #callRate}
     * @since 1.1.1
     */
    public Integer getCallRate() {
        return callRate;
    }

    /**
     * Sets {@code callRate}
     *
     * @param callRate the {@code java.lang.Integer} field
     * @since 1.1.1
     */
    public void setCallRate(Integer callRate) {
        this.callRate = callRate;
    }
}
