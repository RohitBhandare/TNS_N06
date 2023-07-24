package com.tns.operators;

public class IncDecOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=7;
		
		int c=a++ - --b; // c=a, c=a+1
				
		int d=a++ + --a - a++; // a
		System.out.println(c);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);


	}

}
