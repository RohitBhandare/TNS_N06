package com.decisionstatements;

public class CascadedIfElse {

	public static void main(String[] args) {
		
		int age=40;
		
		if(age>20) {
			System.out.println("Age is greater than 20");
			if(age>60) {
				System.out.println("Age is greater than 60");
				if(age>70) {	
					System.out.println("Age is greater than 60");
				}
				else {
					System.out.println("Age is greater than 60");
				}
			}
			else {
				
			}
		}
		else {
			
		}

	}

}
