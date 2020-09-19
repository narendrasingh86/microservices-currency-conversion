package com.narendra.limitservice.bean;

public class LimitService {

	private String minimum;
	
	private String maximum;
	
	public LimitService(String minimum, String maximum) {
		this.minimum=minimum;
		this.maximum=maximum;
	}
	
	public String getMaximum() {
		return maximum;
	}
	
	public String getMinimum() {
		return minimum;
	}
}
