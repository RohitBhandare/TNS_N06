package com.classobject;

public class Main {

	public static void main(String[] args) {
	
		
		Employee einstein = new Employee();
		
		einstein.setEid(1001);
		einstein.setEname("Einstein");
		einstein.setEmail("xyz@gmail.com");
		einstein.setSalary(30_00_000);
		
		System.out.println(einstein);

	}

}
