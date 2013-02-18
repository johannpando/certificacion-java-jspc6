package com.johannpando.certificacion.scjp6.whizlabs.API;

import java.util.regex.Matcher;

/**
 * <p>
 * Inglés
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
 * El método de compilación de la clase Pattern compila la expresión regular
 * dada en un patrón, entonces el método matcher crea un comparador que
 * coincidirá con la entrada dada contra este modelo. El método de búsqueda
 * explora la secuencia de entrada en busca de la secuencia siguiente que
 * coincide con el patrón. El método devuelve el grupo de entrada basado en lo
 * anterior la única opción A es la correcta.
 * 
 * Ahora vamos a analizar cómo la expresión regular dada ayuda en la extracción
 * de los identificadores de e-mails. El (\ w +) agrupación busca caracteres de
 * palabra, como lo indica el w \. El signo + indica que uno o más caracteres de
 * palabra debe aparecer. Esto debe ser seguido por un carácter literal @. El (\
 * W + \.) Grupos es similar, pero espera un período de seguimiento con el fin
 * de hacer una pareja. El período se ha scaped usando una barra invertida,
 * porque el carácter de punto en sí es una expresión regular meta-carácter (un
 * comodín que coincide con cualquier carácter).
 * 
 * La siguiente (\ W +) agrupación es idéntica a la primera agrupación - se ve
 * forn uno o más caracteres de palabra. Finalmente la expresión (\. \ W +) *
 * pregunta para que coincida con un punto seguido por uno o más caracteres de
 * palabra, y de acuerdo con esa combinación de cero o más veces.
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

		// Error de compilación: No existe el método matcher
		// java.util.regex.Pattern pattern2 = java.util.regex.Pattern
		// .matcher(regex);

		Matcher matcher = pattern.matcher(s);

		// Error de compilación: No existe el método next
		// matcher.next()

		while (matcher.find()) {
			System.out.println("The e-mail id is: " + matcher.group());
		}
	}
}
