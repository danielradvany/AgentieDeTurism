package org.variabile;

public class Variabile {
	public static void main(String[] args) {
		 System.out.println("merge");

		// VARIABILE
		// TIPURI DE DATE PRIMITIVE
		//integers = numere intregi
		int variabilaInt = 128;      // ocupa 4 bytes in memorie     //camel-case
		byte variabilaByte = 127;   // ocupa in memorie 1 byte
		short variabilaShort  = 129; // ocupa 2 bytes in memorie
		long variabilaLong = 2_000_000_000_000L; //ocupa 8 bytes in memorie

		//floating-point numbers
		float variabilaFloat = 129.99F; // ocupa 4 bytes in memorie
		double variabilaDouble = 130.99; // ocupa 8 bytes in memorie

		//booleans
		boolean variabilaBoolean = false; // in general ocupa 1 byte

		//characters
		char variabilaChar = '\n'; // ocupa 2 bytes in memorie

		System.out.print("Ciocolata");
		System.out.print(variabilaChar);
		System.out.print("Vanilie");
		System.out.print(variabilaChar);

		System.out.println("El a spus: \"Nu functioneaza\" ");

//		System.out.println(variabilaInt);
//		System.out.println(variabilaByte);
//		System.out.println(variabilaShort);
//		System.out.println(variabilaLong);
//
//		System.out.println(variabilaFloat);
//		System.out.println(variabilaDouble);
//
//		System.out.println(variabilaBoolean);
//
//		System.out.println(variabilaChar);
	}
}
