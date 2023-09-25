package com.singleinheritance;

public class Citizen {
	
	private String city;
	private int pincode;
	private long uid;
	
	
	
	public Citizen(String city, int pincode, long uid) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.uid = uid;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	
	
	
	

}
