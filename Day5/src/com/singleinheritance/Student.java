package com.singleinheritance;

public class Student extends Citizen{
	
	private int roll;
	private String name;
	
	
	
	public Student(String city, int pincode, long uid, int roll, String name) {
		super(city, pincode, uid);
		this.roll = roll;
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", getRoll()=" + getRoll() + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getUid()=" + getUid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	

}
