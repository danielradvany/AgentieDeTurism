package org.stringstutorial;

public class StringsTutorial {
	public static void main(String[] args) {
		String salut = "_bunA zIua_\u2000";

//		dimensiunea
		System.out.println("Dimensiune salut: " + salut.length());

//		contine un sir de caractere
		System.out.println("Contine ziua? : " + salut.contains("ziua"));

//      verifica daca e empty
		System.out.println("Sirul este gol? : " + salut.isEmpty());

//		converste in uppercase
		System.out.println("Text uppercase: " + salut.toUpperCase());

//		converteste in lowercase
		System.out.println("Text lowercase: " + salut.toLowerCase());

//		testeaza daca string-ul incepe cu prefix
		System.out.println("Incepe cu ' bun'? " + salut.startsWith(" bun"));

//		testeaza daca string-ul se termina cu prefix
		System.out.println("Se termina cu ' ua'? " + salut.endsWith("ua "));

//		Modifica un o bucata dintr-un string
		System.out.println("Mesajul modificat: " +
				salut.replace("un", "seara"));

//		elimina spatiile de la inceput si de la sfarsit
		System.out.println("Sirul striped:" + salut.strip());

//		elimina orice caracter mai mic sau egal cu "U+0020"
		System.out.println("Sirul trimmed:" + salut.trim());


	}
}
