package com.johannpando.certificacion.scjp6.whizlabs.API;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "April 19, 2005";
		try {
			Date date = java.text.DateFormat.getDateInstance(
					java.text.DateFormat.LONG, Locale.US).parse(str);
			System.out.println(date);

			// Error: Compilación
			// No se puede convertir DateFormat en Date
			// Date date2 = new DateFormat();

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
