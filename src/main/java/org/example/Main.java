package org.example;

public class Main {
	public static void main(String[] args) {

		// Aceasta linie de cod, printeaza un mesaj

		//Conversia = modificarea unei variabile dintr-un tip, in alt tip
//		String ecuatie = "4 + 5 = " + String.valueOf(4 + 5);

		//Casting = modificarea tipului unei variabile

		// Doua tipuri de tipuri de date
		// Tipurile primitive => salveaza in ele valori
		// int -> este primitiv
		// boolean ->

		// Tipurile reference => salveaza in ele adrese,
		// toate tipurile refence incep cu litera mare
		// String -> este reference

		// Clase Wrapper => echivalentele tipurilor primitive, sub forma de tip reference

		int ecuatie = 4 + 5;
		boolean plouaAfara = true;

		System.out.println("Ploua afara? " + plouaAfara);

		//concatenare = lipirea a doua variabile
		System.out.println(ecuatie);

		// VARIABILE = o bucata de memorie care are un tip, are un nume, si contine date

		// Java este un STRONGLY TYPED LANGUAGE
		// inseamna ca fiecare variabila are un tip,
		// fiecare expresie are un tip, fiecare tip este bine definit

		//prima noastra variabila
		// String mesaj = "salutare!";
		// System.out.println(mesaj);
	}
}