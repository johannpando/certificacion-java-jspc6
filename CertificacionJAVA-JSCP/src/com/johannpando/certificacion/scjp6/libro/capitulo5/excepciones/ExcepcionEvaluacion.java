package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

public class ExcepcionEvaluacion {

	public static void delimitador(String cadena) {
		if (cadena.length() > 10) {
			throw new NullPointerException();
		}
	}

	public static void main(String args[]) {
		delimitador("johannpandodelossantos");
	}

}
