package org.bucle;

public class Bucle {
	public static void main(String[] args) {

		//STRUCTURI REPERTITIVE, LOOPS (BUCLE)
		// while, do while, for, foreach

		//ne ajuta, sa rulam un cod de mai multe ori

		int numaratoare = 1000;

//		while(numaratoare > 0) {
//			System.out.println(numaratoare + "...");
//			numaratoare--;
//			numaratoare = 500;
//			if(numaratoare == 500) {
//				break;
//			}
//		}

//		int age = 18;
//
//		do {
//			System.out.println("Nu poti conduce :(");
//			age++;
//		} while (age < 18);

//		do {
//
//		} while();

//		int numar = 1;
//		while(numar <= 10) {
//			System.out.println("Numarul este: " + numar);
//			numar++;
//		}

//		for(int numar = 1; numar <= 10; ) {
//			System.out.println("Numarul este: " + numar);
//		}

//		SCOPE - scop, fiecare variabila are un SCOPE, SCOPE = zice, de unde pana unde e valabila variabila aia

		int[] numereImpare = new int[10];
		int numarDeInceput = 1;

//		variabila pe care o declaram in primul pas, are un SCOPE limitat la FOR
		for(int index = 0; index < 10; index++) {

			numereImpare[index] = numarDeInceput;
			numarDeInceput = numarDeInceput + 2;
		}

//		animal are un scop limitat la if;

		String animal = "elefant";

//		un bloc cu scop mai mic, mosteneste scop-ul parintelui
//		if(true) {
//			System.out.println(animal);
//			String altAnimal = "camila";
//			System.out.println(altAnimal);
//		}

//		if(true) {
//			String altAnimal = "delfin";
//			System.out.println(altAnimal);
//		}

//		System.out.println(animal);
//		System.out.println(altAnimal);

//		for(int index = 0; index < 10; index++) {
//			System.out.println(numereImpare[index]);
//		}

//		FOREACH - in timp ce for, foloseste un index, foreach ia fiecare element in parte
//                              0           1       2       3       4           5           6
		String[] salata = {"castraveti", "rosii", "ton", "oua", "dressing", "salata", "crutoane"};

		for(int i = 0; i < salata.length; i = i + 2) {
			System.out.println(salata[i]);
		}

		for (String ingredient : salata) {
			System.out.println(ingredient);
		}

//		System.out.println("LA MULTI ANI, 2024!");

//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		numaratoare--;
//		System.out.println(numaratoare + "...");
//		System.out.println("LA MULTI ANI, 2024!");
	}
}
