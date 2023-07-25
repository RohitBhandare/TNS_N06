package com.decisionstatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String degree = "Master's"; // You can change this value to test different cases
        int yearsOfExperience = 4; // You can change this value to test different cases

        if (degree.equals("Master's")) {
            if (yearsOfExperience >= 3) {
                System.out.println("Congratulations! You are eligible for the Senior Software Engineer position.");
            } else {
                System.out.println("Sorry, you do not meet the minimum work experience requirement for the Senior Software Engineer position.");
            }
        } else if (degree.equals("Bachelor's")) {
            if (yearsOfExperience >= 5) {
                System.out.println("Congratulations! You are eligible for the Senior Software Engineer position.");
            } else {
                System.out.println("Sorry, you do not meet the minimum work experience requirement for the Senior Software Engineer position.");
            }
        } else {
            System.out.println("Sorry, you do not meet the minimum education requirement for the Senior Software Engineer position.");
        }

	}

}
