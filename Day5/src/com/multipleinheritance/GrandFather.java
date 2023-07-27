package com.multipleinheritance;

public class GrandFather {
	
	private String name;
	private String farm;
	private String house;
	
	
	
	public GrandFather(String name, String farm, String house) {
		super();
		this.name = name;
		this.farm = farm;
		this.house = house;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarm() {
		return farm;
	}
	public void setFarm(String farm) {
		this.farm = farm;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	
	
	private void fatherDisplay() {
		
		System.out.println("I am grandfather of Newton");

	}
	
	

}
