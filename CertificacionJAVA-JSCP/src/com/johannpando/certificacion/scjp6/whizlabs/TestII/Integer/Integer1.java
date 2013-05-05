package com.johannpando.certificacion.scjp6.whizlabs.TestII.Integer;

public class Integer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Pensé que no tenía como argumento un String
		Integer i1 = new Integer("1");
		Integer i2 = new Integer("2");
		Integer i3 = Integer.valueOf("3");
		int i4 = i1 + i2 + i3;
		System.out.println(i4);
	}

}
