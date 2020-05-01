package com.hunter.demoLoadElisticsearch.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(indexName = "Hunt-R", type = "Device")
public class Device {
	
	@Id
	private String id;
	
	private String deviceId;
	private String location;
	private String source;
	private String sourceType;
	private String tags;
	
	private Long stateTime;
	private String stateID;
	private String thingName;
	private String stateHours;

	private Long temperature;
	private Long pressure;
	private Long radioSignalStrength;
	private Long gForceX;
	private Long gForceY;
	private Long gForceZ;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date recoverDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date originialDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date timestamp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Long getStateTime() {
		return stateTime;
	}

	public void setStateTime(Long stateTime) {
		this.stateTime = stateTime;
	}

	public String getStateID() {
		return stateID;
	}

	public void setStateID(String stateID) {
		this.stateID = stateID;
	}

	public String getThingName() {
		return thingName;
	}

	public void setThingName(String thingName) {
		this.thingName = thingName;
	}

	public String getStateHours() {
		return stateHours;
	}

	public void setStateHours(String stateHours) {
		this.stateHours = stateHours;
	}

	public Long getTemperature() {
		return temperature;
	}

	public void setTemperature(Long temperature) {
		this.temperature = temperature;
	}

	public Long getPressure() {
		return pressure;
	}

	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}

	public Long getRadioSignalStrength() {
		return radioSignalStrength;
	}

	public void setRadioSignalStrength(Long radioSignalStrength) {
		this.radioSignalStrength = radioSignalStrength;
	}

	public Long getgForceX() {
		return gForceX;
	}

	public void setgForceX(Long gForceX) {
		this.gForceX = gForceX;
	}

	public Long getgForceY() {
		return gForceY;
	}

	public void setgForceY(Long gForceY) {
		this.gForceY = gForceY;
	}

	public Long getgForceZ() {
		return gForceZ;
	}

	public void setgForceZ(Long gForceZ) {
		this.gForceZ = gForceZ;
	}

	public Date getRecoverDate() {
		return recoverDate;
	}

	public void setRecoverDate(Date recoverDate) {
		this.recoverDate = recoverDate;
	}

	public Date getOriginialDate() {
		return originialDate;
	}

	public void setOriginialDate(Date originialDate) {
		this.originialDate = originialDate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	
	


}
