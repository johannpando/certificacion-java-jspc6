package com.johannpando.certificacion.scjp6.whizlabs.TestII.Scanner;

import java.util.Scanner;

public class ScannerI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "10 apples 20 oranges 33 pears";
		Scanner s = new Scanner(input).useDelimiter("\\d\\d\\s");
		while (s.hasNext()) {
			System.out.println("**" + s.next() + "**");
		}
	}

}
