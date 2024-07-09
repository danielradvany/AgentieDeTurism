package org.clase;

public class Main {
	public static void main(String[] args) {
		//.....
		// Dorim sa facem o aplicatie pentru masini
		// Masinile ar trebui sa aiba, brand, culoare, viteza, kilometraj etc etc...

//		Scanner scanner1 = new Scanner(System.in);
//		Scanner scanner2 = new Scanner(System.in);
//		Scanner scanner3 = new Scanner(System.in);

//		Accesam metoda radix() din obiectul scanner1
//		scanner1.radix();
//		scanner1.nextInt();

//		int valoareMaxima = Short.MAX_VALUE;

//		Masina = clasa
//		mercedes, bmw, audi = obiecte create din clasa
		Masina mercedes = new Masina("Mercedes Benz", "Gri", 210.0f, 350000);
		Masina bmw = new Masina("BMW M3", "Negru", 240.0f, 80000);

//		1) Am specificat clasa (Masina)
//		2) i-am dat un nume masini mele (obiectului meu) -> audi
//		3) am folosit cuvantul "new" ca sa ii spun lui java sa creeze un loc in memorie pentru obiectul meu
//		4) am apelat constructorul Masina(); ca sa creez un nou obiect, din clasa Masina
//		Casa primaCasa = new Casa();
		Masina audi = new Masina("A5 S-Line", "Rosu", 220.0f, 200000);

		bmw.accelereaza(20.0f);
		audi.franeaza(15.0f);

//		Masina volvo = new Cauciuc();
//		int numar = "banane";
		Masina skoda = new Masina(4, 5);

		System.out.println(audi.brand + " are culoarea " + audi.culoare);

//		Lucram cu tipuri de date primitive
//		int masini = 1;
//		char masini2 = 'c';

//		Lucram cu un tip de data refference (o clasa)
//		String alteMasini = "Mercedes";
//		Arrays;
//		Math;
//		FileWriter;

		//mie imi trebuie masini;
	}
}
