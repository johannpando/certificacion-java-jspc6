package com.johannpando.certificacion.scjp6.whizlabs.TestIII.OO.Casteo;

class Animal {
}

class Mamifero extends Animal {

}

public class Leon extends Mamifero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal = new Animal();
		Mamifero m = new Mamifero();
		Leon l = new Leon();
		Animal x = m;
		Animal y = l;
		// Mamifero mm = (Mamifero) animal;
		// Leon ll = (Leon) m;// No puedo castear de Mamifero a Leon
		prueba();
	}

	static void prueba() {
		int output = 10;
		boolean b1 = false;
		if ((b1 == false) && ((output += 10) == 20)) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}
