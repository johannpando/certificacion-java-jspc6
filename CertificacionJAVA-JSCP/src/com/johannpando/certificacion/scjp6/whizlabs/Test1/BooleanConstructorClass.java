package com.johannpando.certificacion.scjp6.whizlabs.Test1;

public class BooleanConstructorClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Existen dos constructores para esta clase
		// Una recibe un valor booleano
		// El otro una cadena, ésta cadena puede ser:
		// "True" o "False", independientemente si está
		// En mayúsucula o no.
		Boolean c = new Boolean("TrUe");
		// Por lo que imprimirá "true"
		System.out.println(c);

		// Pero se puede dar el caso de que la cadena sea..
		// Vacía o que contenga cualquier cadena.
		Boolean a = new Boolean("");
		Boolean b = new Boolean("cualquierCadena");
		// En ese caso, imprimirá "false"
		System.out.println(a);
		System.out.println(b);

	}

}
