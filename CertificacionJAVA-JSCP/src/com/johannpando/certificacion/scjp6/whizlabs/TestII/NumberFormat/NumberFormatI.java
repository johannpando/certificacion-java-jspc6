package com.johannpando.certificacion.scjp6.whizlabs.TestII.NumberFormat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatI {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) {
		NumberFormat currencyFormat = NumberFormat.getInstance(Locale.US);
		try {
			Number number = currencyFormat.parse("$5,000.56");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		NumberFormat currencyFormat1 = NumberFormat
				.getCurrencyInstance(Locale.US);
		try {
			Number number1 = currencyFormat.parse("$5,000.56");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
