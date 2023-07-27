package com.hirarchicalinheritance;

public class Audi extends Car {
	
	private String name;
	private String color;
	private int milege;
	private float speed;
	
	public Audi(int noOfWheels, String engine, int noOfDoors, String name, String color, int milege, float speed) {
		super(noOfWheels, engine, noOfDoors);
		this.name = name;
		this.color = color;
		this.milege = milege;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMilege() {
		return milege;
	}

	public void setMilege(int milege) {
		this.milege = milege;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Audi [name=" + name + ", color=" + color + ", milege=" + milege + ", speed=" + speed + ", getName()="
				+ getName() + ", getColor()=" + getColor() + ", getMilege()=" + getMilege() + ", getSpeed()="
				+ getSpeed() + ", getNoOfWheels()=" + getNoOfWheels() + ", getEngine()=" + getEngine()
				+ ", getNoOfDoors()=" + getNoOfDoors() + ", toString()=" + super.toString() + "]";
	}
	
	

}
