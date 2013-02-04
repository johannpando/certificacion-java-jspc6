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
	 * Error por duplicidad de métodos.<br>
	 * <br>
	 * --El código parece estar tratando de sobrecargar el método print ().
	 * 
	 * Sin embargo, la única característica diferenciadora entre los métodos es
	 * la palabra clave static. esto no es suficiente para la sobrecarga. Por lo
	 * tanto, la opción C es la correcta y la elección de A es incorrecta porque
	 * el código no se compila debido a la duplicación métodos.
	 */
	// public void print() {
	// System.out.println("Another Test");
	// }

	/**
	 * Método sobrecargado correctamente
	 * 
	 * @param x
	 */
	public void print(int x) {
		System.out.println("Another Test");
	}
}
