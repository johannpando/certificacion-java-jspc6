package com.johannpando.certificacion.scjp6.controlflujo.erroresExcepciones;

import java.util.ArrayList;
import java.util.List;

public class ClassCastException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List arreglo = new ArrayList();
		arreglo.add("25");
		// Integer numero = (Integer) arreglo.get(0);// java.lang.String cannot
		// be
		// cast to java.lang.Integer
		Object valor = arreglo.get(0);
		System.out.println(valor.toString());
		System.out.println(valor);
		String stringValor = (String) arreglo.get(0);
		System.out.println("stringValor: " + stringValor);

		Integer integerValor = Integer.parseInt((String) arreglo.get(0));

		System.out.println("integerValor: " + integerValor);
	}

}
