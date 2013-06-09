package com.johannpando.certificacion.scjp6.whizlabs.API;

import java.util.regex.Matcher;

/**
 * <p>
 * Ingl�s
 * </p>
 * The compile method of the Pattern class compiles the given regular expression
 * into a pattern, then the matcher method creates a matcher that will match the
 * given input against this pattern. The find method scans the input sequence
 * looking for the next sequence that matches the pattern. The group method
 * returns the input based on above only option A is correct.
 * 
 * Now let us analize how the given regular expression helps in extracting the
 * e-mails ids. The (\w+) grouping looks for word characters, as denoted by the
 * \w. The + indicates that one or more word characters must appear. This must
 * be followed by a literal @ character. The (\W+\.) grouping is similar, but
 * expects a period to follow in order to make a match. The period has been
 * scaped using a backslash because the period character is itself a regex
 * meta-character (a wildcard that matches any character).
 * 
 * The next (\W+) grouping is identical to the first grouping -- it looks forn
 * one or more word characters. Finally the expression (\.\W+)* asks to match a
 * period followed by one or more word characters, and match that combination
 * zero or more times.
 * 
 * <p>
 * Castellano
 * </p>
 * El m�todo de compilaci�n de la clase Pattern compila la expresi�n regular
 * dada en un patr�n, entonces el m�todo matcher crea un comparador que
 * coincidir� con la entrada dada contra este modelo. El m�todo de b�squeda
 * explora la secuencia de entrada en busca de la secuencia siguiente que
 * coincide con el patr�n. El m�todo devuelve el grupo de entrada basado en lo
 * anterior la �nica opci�n A es la correcta.
 * 
 * Ahora vamos a analizar c�mo la expresi�n regular dada ayuda en la extracci�n
 * de los identificadores de e-mails. El (\ w +) agrupaci�n busca caracteres de
 * palabra, como lo indica el w \. El signo + indica que uno o m�s caracteres de
 * palabra debe aparecer. Esto debe ser seguido por un car�cter literal @. El (\
 * W + \.) Grupos es similar, pero espera un per�odo de seguimiento con el fin
 * de hacer una pareja. El per�odo se ha scaped usando una barra invertida,
 * porque el car�cter de punto en s� es una expresi�n regular meta-car�cter (un
 * comod�n que coincide con cualquier car�cter).
 * 
 * La siguiente (\ W +) agrupaci�n es id�ntica a la primera agrupaci�n - se ve
 * forn uno o m�s caracteres de palabra. Finalmente la expresi�n (\. \ W +) *
 * pregunta para que coincida con un punto seguido por uno o m�s caracteres de
 * palabra, y de acuerdo con esa combinaci�n de cero o m�s veces.
 * 
 * @author Johann
 * 
 */

public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String regex = "(\\W+)@(\\W+\\.)(\\W+)(\\.\\W+)*";

		String s = "The e-mail ids are tom@abc.com and harry@wyz.com";

		java.util.regex.Pattern pattern = java.util.regex.Pattern
				.compile(regex);

		// Error de compilaci�n: No existe el m�todo matcher
		// java.util.regex.Pattern pattern2 = java.util.regex.Pattern
		// .matcher(regex);

		Matcher matcher = pattern.matcher(s);

		// Error de compilaci�n: No existe el m�todo next
		// matcher.next()

		while (matcher.find()) {
			System.out.println("The e-mail id is: " + matcher.group());
		}

		masPattern();
	}

	private static void masPattern() {

		String expresionRegular = "comer";

		String cadena = "¿Puedo comer pizza ahora?";

		java.util.regex.Pattern myPattern = java.util.regex.Pattern
				.compile(expresionRegular);

		Matcher matcher = myPattern.matcher(cadena);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
