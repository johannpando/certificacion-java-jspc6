package com.johannpando.certificacion.scjp6.whizlabs.TestII.NumberFormat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * NumberFormat es la clase base abstracta para todos los formatos de número.
 * Esta clase proporciona la interfaz para formatear y parsear los números.
 * 
 * Usted puede utilizar el método getCurrencyInstance (Configuración regional)
 * para obtener el formato de número de moneda para una configuración regional
 * específica. Aquí tenemos que analizar la cadena de moneda para la
 * configuración regional para los Estados Unidos, que se da por Locale.US.
 * 
 * Para el método de análisis, tenemos que pasar la cadena de moneda en el
 * formato de moneda de EE.UU., que es "$ 5,000.56". El método parse devuelve el
 * valor de la moneda se extrae como un número.
 * 
 * @author Johann
 * 
 */
public class NumberFormatI {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) {
		NumberFormat currencyFormat = NumberFormat.getInstance(Locale.US);
		try {
			// Number number = currencyFormat.parse("$5,000.56"); Error de
			// ejecución
			Number number = currencyFormat.parse("5,000.56");// Así no compila..
																// le he quitado
																// el símbolo $.
		} catch (ParseException e1) {
			// Unparseable number: "$5,000.56". Por usar
			// NumberFormat.getInstance(Locale.US) en vez de
			// NumberFormat.getCurrencyInstance(Locale.US)
			e1.printStackTrace();
		}

		NumberFormat currencyFormat1 = NumberFormat
				.getCurrencyInstance(Locale.US);
		try {
			Number number1 = currencyFormat1.parse("$5,000.56");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
