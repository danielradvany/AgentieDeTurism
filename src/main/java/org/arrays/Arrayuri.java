package org.arrays;

public class Arrayuri {
	public static void main(String[] args) {

		//Arrays = un array este un obiect ce contine mai multe elemente,
		//         fiecare cu acelasi tip de data, ce pot fi accesate printr-un index

		int dimensiuneArray = 5;
		int[] numereImpare = new int[dimensiuneArray];
		int[] numerePare = {2, 4, 6, 8, 10, 12};

		numereImpare[0] = 1;
		numereImpare[1] = 3;
		numereImpare[2] = 5;
		numereImpare[3] = 7;
		numereImpare[4] = 9;

		// vreau array-ul asta
		// 1 3 5 7 9 11 13 15
		// 0 1 2 3 4 5  6  7

//		System.out.print(Character.valueOf(' '));

		System.out.print(numereImpare[0] + " ");
		System.out.print(numereImpare[1] + " ");
		System.out.print(numereImpare[2] + " ");
		System.out.print(numereImpare[3] + " ");
		System.out.println(numereImpare[4] + " ");

		//DRY = DO NOT REPEAT YOURSELF
		System.out.print(numerePare[0] + " ");
		System.out.print(numerePare[1] + " ");
		System.out.print(numerePare[2] + " ");
		System.out.print(numerePare[3] + " ");
		System.out.println(numerePare[4] + " ");

		int[][] numere = new int[5][5];
		int[][] matriceNoua = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
//                            0,0 0,1 0,2  1,0 1,1 1,2.....
		numere[0][0] = 2;
		numere[0][1] = 4;
		numere[0][2] = 6;
		numere[1][0] = 1;
		numere[1][1] = 3;
		numere[1][2] = 5;
		numere[2][0] = -1;
		numere[2][1] = -2;
		numere[2][2] = -3;

		System.out.println();
		System.out.print(numere[0][0] + " ");
		System.out.print(numere[0][1] + " ");
		System.out.print(numere[0][2] + " ");
		System.out.println();
		System.out.print(numere[1][0] + " ");
		System.out.print(numere[1][1] + " ");
		System.out.print(numere[1][2] + " ");
		System.out.println();
		System.out.print(numere[2][0] + " ");
		System.out.print(numere[2][1] + " ");
		System.out.print(numere[2][2] + " ");
		System.out.println();

		float[] arrayNesortat = {1.2f, -5.7f, 14.67f, -22.03f, 101.0f};

		System.out.println();
		java.util.Arrays.sort(arrayNesortat);
		System.out.println(java.util.Arrays.toString(arrayNesortat));
		System.out.println();

		String matriceSubFormaDeString =
				java.util.Arrays.toString(matriceNoua[0]) + '\n' +
						java.util.Arrays.toString(matriceNoua[1]) + '\n' +
						java.util.Arrays.toString(matriceNoua[2]);

		System.out.println(matriceSubFormaDeString);



		System.out.println();
		System.out.println(java.util.Arrays.toString(matriceNoua[2]));

		System.out.println("Elementul de pe linia 2, coloana 3 este: " + numere[1][2]);
	}
}
