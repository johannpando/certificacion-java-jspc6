package com.johannpando.certificacion.scjp6.whizlabs.Scanner;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * Un escáner rompe su entrada en tokens utilizando un patrón de delimitación,
 * que, por defecto, coincide con espacios. El findInLine () método intenta
 * buscar la siguiente aparición de un patrón construido a partir de la cadena
 * especificada, haciendo caso omiso de delimitadores. El código aquí utiliza
 * una expresión regular para analizar las cuatro fichas a la vez.
 * 
 * @author Johann
 * 
 */
public class ScannerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "jojan done 2 done all done";
		Scanner s = new Scanner(input);
		s.findInLine("(\\w+) done (\\d+) done (\\w+) done");
		MatchResult result = s.match();
		for (int i = 1; i <= result.groupCount(); i++) {
			System.out.println(result.group(i));
		}
		s.close();
	}

}
