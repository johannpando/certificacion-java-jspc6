package com.johannpando.certificacion.scjp6.whizlabs.Test1;

public class BooleanConstructorClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Existen dos constructores para esta clase
		// Una recibe un valor booleano
		// El otro una cadena, �sta cadena puede ser:
		// "True" o "False", independientemente si est�
		// En may�sucula o no.
		Boolean c = new Boolean("TrUe");
		// Por lo que imprimir� "true"
		System.out.println(c);

		// Pero se puede dar el caso de que la cadena sea..
		// Vac�a o que contenga cualquier cadena.
		Boolean a = new Boolean("");
		Boolean b = new Boolean("cualquierCadena");
		// En ese caso, imprimir� "false"
		System.out.println(a);
		System.out.println(b);

	}

}
