package org.conditionale;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Conditionale {
	public static void main(String[] args) {
		//STRUCTURI CONDITIONALE
		//ne ajuta sa executam un cod, doar daca o
		// anumita conditie este indeplinita
		// doua structuri: if, switch

//		int numar = -4;
//
//		if (numar > 0) {
//			System.out.println("Numarul este mai mare decat zero!");
//		} else if(numar == 0) {
//			System.out.println("Numarul este zero!");
//		} else {
//			System.out.println("Numarul este mai mic decat zero!");
//		}
//
//		System.out.println("Programul este gata :D");

//		Sa facem un cod care sa afiseze ce si a saptamanii este


//		nu e hardcodat
//		String numarulZilei = LocalDateTime.now().getDayOfWeek().toString();

//		cod hardcodat
//		String numarulZilei = "JOI";

//
//		if(numarulZilei == 1) {
//			numeleZilei = "Luni";
//		}else if(numarulZilei == 2) {
//			numeleZilei = "Marti";
//		}else if(numarulZilei == 3) {
//			numeleZilei = "Miercuri";
//		}else if(numarulZilei == 4) {
//			numeleZilei = "Joi";
//		}else if(numarulZilei == 5) {
//			numeleZilei = "Vineri";
//		}else if(numarulZilei == 6) {
//			numeleZilei = "Sambata";
//		}else if(numarulZilei == 7) {
//			numeleZilei = "Duminica";
//		}

		// SWITCH

//		switch (numarulZilei) {
//			case 1:
//				numeleZilei = "Luni";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			case 2:
//				numeleZilei = "Marti";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			case 3:
//				numeleZilei = "Miercuri";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			case 4:
//				numeleZilei = "Joi";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			case 5:
//				numeleZilei = "Vineri";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			case 6:
//				numeleZilei = "Sambata";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			case 7:
//				numeleZilei = "Duminica";
//				System.out.println("Astazi este " + numeleZilei);
//				break;
//			default:
//				System.out.println("Scuze, ai introdus un numar gresit pentru ziua de azi!");
//		}

		// hardcodata
//		int numarulZilei = 6;
		String numeleZilei = "Zi necunoscuta";

//		input = informatii care intra in calculator
//		output = informatii care ies din calculator

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ce zi este azi? (1-7): ");
		int numarulZilei = scanner.nextInt();

		System.out.println("Ai introdus: " + numarulZilei);

		// am folosit o prescurtare a switch-ului
		switch (numarulZilei) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Du-te la lucru >:(");
				break;
			case 6:
			case 7:
				System.out.println("Este weekend yeeey!");
				break;
		}


//		int numar = 10;
//		int numarator = 1;
//
//		System.out.println("Numaram pana la " + numar + "!");
//
//		while(numarator <= numar) {
//			numarator++;
//
//			if(numarator == 3) {
//				System.out.println("Nu mai am chef :(");
//				break;
//			}
//
//			System.out.println(numarator);
//		}
//		System.out.println("Am terminat de numarat!");

//		System.out.println("Ziua de astazi este: " + numeleZilei);
	}
}
