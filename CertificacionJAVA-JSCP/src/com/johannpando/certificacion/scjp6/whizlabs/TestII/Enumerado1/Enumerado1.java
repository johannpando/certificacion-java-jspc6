package com.johannpando.certificacion.scjp6.whizlabs.TestII.Enumerado1;

enum Fish {
	GOLDFISH, ANGELFISH, GUPPY;
}

public class Enumerado1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fish f = Fish.valueOf("GUPPY");
		System.out.println(f);
		if (f == Fish.GUPPY) {
			System.out.println("Iguales");
		}

		if (f.equals(Fish.GUPPY)) {
			System.out.println("Iguales");
		}
	}

}
