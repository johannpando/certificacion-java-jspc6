package com.johannpando.certificacion.scjp6.whizlabs.TestII.printf;

public class Printf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Redondea pero a un decima, según el patrón %.1f, por ello devuelve
		// 3.9 - 4.0
		double val1 = 3.91;
		double val2 = 3.97;

		System.out.printf("%.1f %.1f", val1, val2);
	}

}
