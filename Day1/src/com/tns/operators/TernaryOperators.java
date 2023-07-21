package com.tns.operators;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=13;
		int b=7;
		
		System.out.println(a%b==0? even():odd());

	}

	private static String odd() {
	
		return "Odd";
	}

	private static String even() {
	
		return "Even";
	}

}
