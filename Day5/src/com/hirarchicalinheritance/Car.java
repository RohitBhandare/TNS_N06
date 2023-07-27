package com.hirarchicalinheritance;

public class Car {
	
	private int noOfWheels;
	private String engine;
	private int noOfDoors;
	
	
	
	public Car(int noOfWheels, String engine, int noOfDoors) {
		super();
		this.noOfWheels = noOfWheels;
		this.engine = engine;
		this.noOfDoors = noOfDoors;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	

}
