package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Switch;

public class Switch1 {

	String f(int i) {
		switch (i) {
		case 0:
			return "a";
		case 1:
			return "b";
		case 2:
			return "c";
		default:
			return "d";
		}
	}

	// La función f devuelve un String, por lo que el default debe devolver un
	// String.
	// String f(int i) {
	// switch (i) {
	// case 0:
	// return "a";
	// case 1:
	// return "b";
	// case 2:
	// return "c";
	// default:
	// assert false;
	// }
	// }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Switch1 s = new Switch1();
		for (int i = 20; i < 30; i++) {
			System.out.println(s.f(i));
		}
	}

}
