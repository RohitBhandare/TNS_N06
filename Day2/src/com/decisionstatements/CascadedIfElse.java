package com.decisionstatements;

public class CascadedIfElse {

	public static void main(String[] args) {
		
		 int score = 85; 

	        if (score >= 90) {
	            System.out.println("Grade: A");
	        } else if (score >= 80 && score <= 89) {
	            System.out.println("Grade: B");
	        } else if (score >= 70 && score <= 79) {
	            System.out.println("Grade: C");
	        } else if (score >= 60 && score <= 69) {
	            System.out.println("Grade: D");
	        } else {
	            System.out.println("Grade: F");
	        }

	}

}
