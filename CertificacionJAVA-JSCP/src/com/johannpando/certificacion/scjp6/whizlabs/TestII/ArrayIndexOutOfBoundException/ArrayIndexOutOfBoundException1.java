package com.johannpando.certificacion.scjp6.whizlabs.TestII.ArrayIndexOutOfBoundException;

public class ArrayIndexOutOfBoundException1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		String[] names = { "John", "Merry", "Tom" };
		// names[--a] = names[--a] + "-";
		names[--a] += "-";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
