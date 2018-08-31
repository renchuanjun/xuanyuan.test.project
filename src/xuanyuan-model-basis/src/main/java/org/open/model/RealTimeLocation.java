package org.open.model;
/**
 * 飞机实时位置 
 */
public class RealTimeLocation implements java.io.Serializable{
	
	private String gatewayTime ;//网关时间UTC
	private String flightNo ;//航班号
	private String aircraftNo ;//飞机号
	private String lat ;//纬度
	private String lon ;//经度
	private String alt ;//气压高度（单位米）
	private String cas ;//地速（单位km/h）
	private String vec ;//航向角
	private String oil ;//油量(单位kg)
	private String distance ;//距目的机场距离（米）
	private String virtual ;//是否为推演点
	private String type ;//位置报类型
	private String updateTime;//更新时间UTC
	
	public String getGatewayTime() {
		return gatewayTime;
	}
	public void setGatewayTime(String gatewayTime) {
		this.gatewayTime = gatewayTime;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getAircraftNo() {
		return aircraftNo;
	}
	public void setAircraftNo(String aircraftNo) {
		this.aircraftNo = aircraftNo;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getCas() {
		return cas;
	}
	public void setCas(String cas) {
		this.cas = cas;
	}
	public String getVec() {
		return vec;
	}
	public void setVec(String vec) {
		this.vec = vec;
	}
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getVirtual() {
		return virtual;
	}
	public void setVirtual(String virtual) {
		this.virtual = virtual;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
