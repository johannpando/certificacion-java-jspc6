package com.johannpando.certificacion.scjp6.whizlabs.API;

import java.util.Formatter;
import java.util.Locale;

/**
 * <p>
 * Ingl�s
 * </p>
 * The "Formatter" class has a constructor which creates a new formatter with
 * the specified destination and locale.
 * 
 * Formatter(Appendable a, Locale l)
 * 
 * The Appendable interface must be implemented by any class whose instances are
 * intended to receive formatted output from a Formatter. This interface is
 * implemented by StringBuilder and not by the String class.
 * 
 * Based on above only option D is correct.
 * <p>
 * Castellano
 * </p>
 * La clase "Formatter" tiene un constructor que crea un nuevo formateador con
 * el destino especificado y la configuraci�n regional.
 * 
 * Formatter (Appendable una, Locale l)
 * 
 * La interfaz Appendable debe ser implementada por cualquier clase cuyas
 * instancias est�n destinadas a recibir la salida con formato de un Formatter.
 * Esta interfaz se implementa mediante StringBuilder y no por la clase String.
 * 
 * Basado en lo anterior �nica opci�n D es correcta.
 * 
 * @author Johann
 * 
 */
public class ClaseFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String();
		StringBuilder sb = new StringBuilder();
		// Error de compilaci�n, el constructor recibe un StringBuilder y no un
		// String
		// Formatter formatter = new Formatter(s, Locale.US);

		Formatter formatter = new Formatter(sb, Locale.US);

		// Error de compilaci�n, no existe el m�todo parse
		// formatter.parse("");

		formatter.format("PI=%12.10f", Math.PI);

		System.out.println(formatter);
	}

}
