package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

public class TestSobrecargaSobrescritura1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		print();
	}

	public static void print() {
		System.out.println("Test");
	}

	/**
	 * Error por duplicidad de m�todos.<br>
	 * <br>
	 * --El c�digo parece estar tratando de sobrecargar el m�todo print ().
	 * 
	 * Sin embargo, la �nica caracter�stica diferenciadora entre los m�todos es
	 * la palabra clave static. esto no es suficiente para la sobrecarga. Por lo
	 * tanto, la opci�n C es la correcta y la elecci�n de A es incorrecta porque
	 * el c�digo no se compila debido a la duplicaci�n m�todos.
	 */
	// public void print() {
	// System.out.println("Another Test");
	// }

	/**
	 * M�todo sobrecargado correctamente
	 * 
	 * @param x
	 */
	public void print(int x) {
		System.out.println("Another Test");
	}
}
