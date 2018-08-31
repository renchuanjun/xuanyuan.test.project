package org.open.model;

public class RelatedCity implements java.io.Serializable{

	private Integer cityId;
	private String cityName;
	private String cityEngName;
	private String areaName;
	private String areaEngName;
	
	
	public RelatedCity() {
		// TODO Auto-generated constructor stub
	}


	public Integer getCityId() {
		return cityId;
	}


	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityEngName() {
		return cityEngName;
	}

	public void setCityEngName(String cityEngName) {
		this.cityEngName = cityEngName;
	}

	public String getAreaName() {
		return areaName;
	}
	
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaEngName() {
		return areaEngName;
	}
	public void setAreaEngName(String areaEngName) {
		this.areaEngName = areaEngName;
	}
}
