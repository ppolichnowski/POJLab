/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ded3;

/**
 *
 * @author Phantom
 */
class Liczby {
	private int a = 15;
	static int b = 8;

	Liczby(int i) {
		a = a * i;
		b = a - b;
	}
	Liczby() {
		b = a - 1;
		a = a / b;
	}
	void wyswietl() {
		System.out.println("a = " + a + " b = " + b);
	}
	static {
		b = 2 * (b + 1);
	}
}
class Ded3 {
	public static void main(String[] args) {
		Liczby.b++;
		System.out.println(Liczby.b);
		Liczby licz1 = new Liczby(1);
		licz1.wyswietl();
		Liczby.b++;
		Liczby licz2 = new Liczby(-1);
		Liczby licz3 = new Liczby();
		Liczby.b++;
		licz2.wyswietl();
		licz3.wyswietl();
	}
}