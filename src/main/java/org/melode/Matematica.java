package org.melode;

public class Matematica {
	// metoda(a, b) => a + b;
	public int adunare(int numar1, int numar2, int numar3) {
		calculare();
		return numar1 + numar2 + numar3;
	}

	public void inmultire(int n1, int n2) {
		calculare();
		System.out.println(n1 * n2);
	}

	private void calculare() {
		System.out.println("calculul se incarca......");
	}
}
