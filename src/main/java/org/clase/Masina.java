package org.clase;

public class Masina {
	//clasele sunt ca si un plan (schita) dupa care
	// putem crea mai multe obiecte
	//proprietati = specifica CUM este clasa
	String brand;
	String culoare;
	float viteza;
	int kilometraj;

	//constructori = metoda speciala, care se
	// apeleaza in momentul in care obiectul este creat

	//Orice clasa, are un constructor cu 0 parametri, by default (de la sine)
	//Ce rol are constructorul:
	//1. in primul rand, constructorul ii spune lui
	//   java "creaza un obiect nou din clasa asta"
	//2. in al doilea rand, constructorul poate fi
	//   folosit ca sa rulam un cod in momentul in care obiectul este creat
	//foarte des folosit pentru a initializa proprietatile clasei
	Masina(String brand, String culoare, float viteza, int kilometraj) {
		System.out.println("Masina a fost creata!");
		this.brand = brand;
		this.culoare = culoare;
		this.viteza = viteza;
		this.kilometraj = kilometraj;
//		int c = a + b;
	}

	Masina() {
		System.out.println("Se face masina");
	}

	Masina(String brand) {
		this.brand = brand;
	}

	Masina(int numar1, int numar2) {
		System.out.println(numar1 + numar2);
	}

	//metode = specifica CE FACE clasa
	void accelereaza(float kilometri) {
		viteza += kilometri;
		System.out.println(brand + " merge cu: " + viteza);
	}

	void franeaza(float kilometri) {
		viteza -= kilometri;
		System.out.println(brand + " merge cu: " + viteza);
	}
}
