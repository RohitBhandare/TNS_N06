package com.multipleinheritance;

public class Child extends Father {
	
	private String name;
	private int age;
	
	public Child(String name, String farm, String house, String name2, boolean vehicle, String name3, int age) {
		super(name, farm, house, name2, vehicle);
		this.name = name3;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", isVehicle()=" + isVehicle() + ", getFarm()=" + getFarm() + ", getHouse()=" + getHouse()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
