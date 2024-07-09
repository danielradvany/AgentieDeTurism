package org.melode;

import java.util.Arrays;

public class Metode {
	public static void main(String[] args) {
		// METODE = o metoda, este un bloc de
		// cod pe care putem sa il apelam (folosit) de mai multe ori
		// separation of concerns = toate clasele si metodele ar trebui sa fac un singur lucru

//		public => access modifier (modificator de acces)
//		static => declara metoda statica
//		void => return type (tipul returnat)
//		main => numele metodei
//		(String[] args) => arguments (argumente)



//		String[] salutari = {"Salut", "Bonjour", "Priviet", "Ola", "Marhaba"};
//		String[] alteSalutari = {"Namaste", "Ciao", "Hola", "Gunten Tag", "Merhaba"};
//		int numarDeSalutari = 0;
//
//		int deCateOriAmSalutat = salutaInvitatii(salutari, numarDeSalutari);
//		deCateOriAmSalutat += salutaInvitatii(alteSalutari, numarDeSalutari);
//
//		System.out.println("Am salutat pe toata lumea, in total: " + deCateOriAmSalutat);

		//METODE PENTRU OPERATII MATEMATICE
		// metoda(a, b) => a + b;

//		Matematica = clasa, => sablon, o chema, o schita, dupa care se creaza obiecte
//		matematica = obiect => o instanta, un caz concret pentru clasa
		Matematica matematica = new Matematica();
//		Matematica matematica1 = new Matematica();
//		Matematica matematica2 = new Matematica();

		Arrays.sort(new int[]{1, 4, 2});
//		System.out.println(matematica1);


//		System.out.println("Rezultat: " + matematica.adunare(2, 3, 4));
//		System.out.println("Rezultat: " + matematica.adunare(6, 8, 7));
//		System.out.println("Rezultat: " + matematica.adunare(-3, 9, 8));
//		System.out.println("Rezultat: " + matematica.adunare(0, 11, -12));

		int numar1 = 1;
		int numar2 = 2;
		int numar3 = 3;

		int numar4 = 4;
		int numar5 = 5;
		int numar6 = 6;

		System.out.println(matematica.adunare(numar1, numar2, numar3));
		matematica.inmultire(numar4, numar5);
//		matematica.calculare();
//		matematica.calculare();
//		matematica.calculare();

//		int rezultat = Matematica.adunare(numar1, numar2, numar3);
//		int rezultat2 = Matematica.adunare(numar4, numar5, numar6);

//		System.out.println(rezultat);
//		System.out.println(rezultat2);
//		matematica.inmultire(6, 6);
	}

	//void (return type) = nu returneza nimic
	//parametrii = valori pe care metoda le primeste, si poate sa le foloseasca
	static int salutaInvitatii(String[] salutari, int numarDeSalutari) {
		for (String salutare : salutari) {
			System.out.println(salutare);
			numarDeSalutari++;
			System.out.println("Aveti rezervare?");
		}

		return numarDeSalutari;
	}
}
