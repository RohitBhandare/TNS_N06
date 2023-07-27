package com.multipleinheritance;

public class Father extends GrandFather {
	
	private String name;
	private boolean vehicle;
	
	public Father(String name, String farm, String house, String name2, boolean vehicle) {
		super(name, farm, house);
		name = name2;
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVehicle() {
		return vehicle;
	}

	public void setVehicle(boolean vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	
	

}
