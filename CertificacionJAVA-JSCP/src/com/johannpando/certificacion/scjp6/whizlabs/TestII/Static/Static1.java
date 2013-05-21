package com.johannpando.certificacion.scjp6.whizlabs.TestII.Static;

public class Static1 {

	private static int x = getValue();
	private static int y = 5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Devuelve 0 porque en el momento en el que se llama al método
		// getValue, el atributo 'y' está inicializado a su valor por defecto
		// que es cero, luego asigna el valor de 5.
		System.out.println(x);
		System.out.println(getValue());
	}

	private static int getValue() {
		return y;
	}
}
