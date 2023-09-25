package com.tns.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		int b=3;
		
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a | b);
		
		System.out.println(a<<b); // left shift
		System.out.println(a>>b); // right shift
		
		System.out.println(3<<1);  // a * 2^b
		System.out.println(3>>1);  // a/2^b
	}

}
