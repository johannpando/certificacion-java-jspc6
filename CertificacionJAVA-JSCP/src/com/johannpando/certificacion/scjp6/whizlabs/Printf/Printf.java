package com.johannpando.certificacion.scjp6.whizlabs.Printf;

public class Printf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 123.456;
		char c = 65;
		int i = 65;

		System.out.printf("%s", x);
		System.out.printf("%b", x);
		System.out.printf("%c", c);
		System.out.printf("%5.0f", x);
		System.out.printf("%d", i);
	}

}
