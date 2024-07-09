package org.operatori;

public class Operatori {
	public static void main(String[] args) {

		//OPERATORI
		//Operatori unari = lucreaza cu o singura variabila
		// +, -
		// ++, -- = operatori de incrementare/decrementare

		int variabila1 = +10;
		int variabila2 = -10;

//		incrementarea modifica valoarea variabilei;
//		++variabila1 ===== variabila1 = variabila1 + 1

//		daca "++/--" este la sfarsit, java mai intai salveaza
//		in variabila3 valoarea lui variabila1, si abia apoi
//		creste/scade valoarea lui variabila 1 cu 1
		int variabila3 = variabila1++;

//		daca "++/--" este la inceput, java mai intai creste/scade
//		valorea lui variabila1 cu 1, si abia apoi salveaza valoarea lui
//		variabila 1 in variabila5
		int variabila5 = ++variabila1;


//		int variabila4 = --variabila;

//		System.out.println("variabila1 = " + variabila1);
//		System.out.println("variabila5 = " + variabila5);

		int numarPreferat = 3;

//		++numarPreferat;
//		++numarPreferat;
//		++numarPreferat;
//		--numarPreferat;

		System.out.println("Numar meu favorit este: " + numarPreferat++);
		System.out.println("Numarul dupa operatie: " + numarPreferat);

//		OPERATORI BINARI = lucreaza cu 2 variabile
//      +, -, *, /,
//      % = modulo

//		int variabila6 = 10 + 1;
//		int variabila6 = 10 - 1;
//		int variabila6 = 10 * 3;
		double variabila6 =  10.5 / 3.3;
//		int variabila6 = 10 % 3;

		System.out.println("Variabila6: " + variabila6);

//		OPERATORI DE ASIGNARE
//		=, +=, -=, *=, /=, %=

		int variabila7 = 10;

//		variabila7 = variabila7 + 3;
//		variabila7 += 3;
//		char variabila8 = 'x';

//		variabila7 = variabila7 - 3;
//		variabila7 -= 3;

//		variabila7 = variabila7 * 3;
//		variabila7 *= 3;

//		variabila7 = variabila7 + 3;
//		variabila7 /= 3;

		variabila7 = variabila7 % 3; // variabila7 devine 1
		variabila7 %= 3;

		// % (modulo) = ne ofera restul unei impartiri
		// 10 / 3 = 3
		// 10 % 3 = 1
		// 10 / 3 = 3 rest 1
		// 14 / 6 = 2
		// 14 % 6 = 2
		// 15 % 6 = 3

//		System.out.println("aici:" + 15 % 6);
//		Modulo poate fi folosit pentru a verifica daca un numar este par sau nu
		// 8 / 2 = 4
		// 10 / 2 = 5...
		// 9 / 2 = 4 rest 1
		//5 / 2 = 2 rest 1

		int numarRandom = 103512155;

		int estePar = numarRandom % 2;

		System.out.println("Este par? " + estePar);

//		System.out.println("variabila7: " + variabila7);

//		CTRL + / => comenteaza/decomenteaza o linie de cod

		//OPERATORI LOGICI = lucreaza cu 2 variabile boolene
		// & (and), && (short circuit and)
		// | (or), || (short circuit or)
		// ! (not)
		// ^ (xor, exclusive or)

		// &, &&  => o sa fie adevarat, daca si numai daca, toate conditiile sunt adevarate
		// |, || => o sa adevarat daca si numai daca, cel putin una dintre conditii este adevarata

		boolean adevarat = true;
		boolean fals = false;

		boolean rezultat = adevarat | fals; //adevarat pentru ca in ambele cazuri este adevarat

//		System.out.println("Rezultat adevarat cu adevarat: " + rezultat);
		System.out.println("Rezultat adevarat sau fals: " + rezultat);

		// adevarat & adevarat = adevarat
		// adevarat & fals = fals
		// fals & adevarat = fals
		// fals & fals = fals

//		face scurt circuit
		// adevarat && adevarat = adevarat
		// adevarat && fals = fals
		// fals && adevarat = fals
		// fals && fals = fals

		// adevarat | adevarat = adevarat
		// adevarat | fals = adevarat
		// fals | adevarat = adevarat
		// fals | fals = fals

		// adevarat || adevarat = adevarat
		// adevarat || fals = adevarat
		// fals || adevarat = adevarat
		// fals || fals = fals

		//         adevarat           adevarat  adevarat  fals
//		rezultat = (2 / 2 == 1) && (4 < 5) && (6 > 3) && (2 == 5);

//		rezultat = 6 <= 5 | 1 != 1 | 11 > 12 | true | 'x' < 'b';
//
//		System.out.println("Este adevarat? " + rezultat);

		int numar = 6;
					// adevarat       adevarat
		rezultat = numar > 5 || ++numar > 3;

		System.out.println("Rezultatul este: " + rezultat);
		System.out.println("Numarul este: " + numar);

//		! => returneaza opusul rezultatului conditiei

		rezultat = 2 + 2 == 4;

		System.out.println("Opusul rezultatului este: " + !rezultat);

//		^ (xor, exclusive or) = returneaza true, daca cel putin o conditie este true,
//		dar nu toate conditiile

		boolean conditie1 = 5 < 7;
		boolean conditie2 = 2 != 3;

		System.out.println("Rezultatul xor intre conditii: " + (conditie1 ^ conditie2));

//		OPERATORI DE COMPARATIE = sunt folositi pentru a compara mai multe valori,
//		si returneaza ca si rezultat adevarat sau fals
//		==, - verifica daca doua valori sunt egale
//		!=, - verifica daca doua valori nu sunt egale
//		>, - verifica daca prima valoare este mai mare decat a doua
//		<, - verifica daca prima valoare este mai mica decat a doua
//		>=, - verifica daca prima valoare este mai mare SAU EGALA cu a doua
//		<= - verifica daca prima valoare este mai mica SAU EGALA cu a doua

//		System.out.println("Este adevarat: " + (4 < 6));
//		System.out.println("Este adevarat: " + (4 <= 6));

		boolean atiInteles = false;

		if(atiInteles) {
			System.out.println("Sunt cel mai bun trainer");
		} else {
			System.out.println("Mai incercam maine :(");
		}

	}
}

