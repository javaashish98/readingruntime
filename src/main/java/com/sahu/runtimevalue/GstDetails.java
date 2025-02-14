package com.sahu.runtimevalue;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "gst")
@Component
public class GstDetails {
	public Double getFood() {
		return food;
	}
	public void setFood(Double food) {
		this.food = food;
	}
	public Double getCloth() {
		return cloth;
	}
	public void setCloth(Double cloth) {
		this.cloth = cloth;
	}
	public Double getMedical() {
		return medical;
	}
	public void setMedical(Double medical) {
		this.medical = medical;
	}
	private Double food;
	private Double cloth;
	private Double medical;

}
