package com.johannpando.certificacion.scjp6.whizlabs.Test1;

public class StringBuilderAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("a");
		for (int i = 1; i < 5; i++) {
			sb.append("a");
		}
		// el nombre del método lo dice bastante claro:
		// insert... por lo tanto imprimirá "aaaa123a"
		sb.insert(4, "123");

		System.out.println(sb);
	}

}
