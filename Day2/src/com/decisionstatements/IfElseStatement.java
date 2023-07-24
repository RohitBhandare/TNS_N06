package com.decisionstatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		
		if(age>=18){
			System.out.println("Hey!, You're Eligible for Voting");
		}
		else {
			System.out.println("Hey!, You're NOT Eligible for Voting");
		}
	}

}
