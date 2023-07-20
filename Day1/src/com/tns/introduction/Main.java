package com.tns.introduction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// primitive data types
		byte b = 127;  // 1 byte
		short sh = 300; // 2 bytes
		int a = 12345; // 4 bytes
		long l=1234_5678_9234L; // 8 bytes
		float f = 9.1f; // 4 bytes
		double db=34.56; // 8 bytes
		boolean bool=true; // 1 bit
		char ch='a'; // 2 byte
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name=sc.nextLine();
		
		System.out.println(name);
		
		
		
		

	}

}
