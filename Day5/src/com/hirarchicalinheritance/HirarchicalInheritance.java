package com.hirarchicalinheritance;

public class HirarchicalInheritance {

	public static void main(String[] args) {
		
		BMW bmz=new BMW(4, "Turbo engine", 4, "BMW i3", "Blue", 20, 500);
		System.out.println(bmz);
		
		Audi audi=new Audi(4, "Turbo engine", 4, "audi pro", "white", 15, 700);
		System.out.println(audi);
	}

}
