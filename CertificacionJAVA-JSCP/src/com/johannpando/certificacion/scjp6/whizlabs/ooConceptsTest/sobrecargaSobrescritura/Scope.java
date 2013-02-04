package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

class Base {
	public void aMethod(int i) {

	}
}

public class Scope extends Base {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * El primer error de compilación es:<br>
	 * Cannot reduce the visibility of the inherited method from Base. <br>
	 * <br>
	 * Luego de cambiar el modificador de acce a Public, lanza el siguiente
	 * error de compilación: <br>
	 * Exception Exception is not compatible with throws clause in
	 * Base.aMethod(int) <br>
	 * <br>
	 * Se intenta lanzar una excepción que no está declarada en el método de la
	 * superclase. Y recordar:<br>
	 * Sobrescritura de métodos no pueden lanzar más amplias excepciones
	 * comprobadas que los arrojados por métodos sobrescritos.
	 */
	// public void aMethod(int i) throws Exception {
	//
	// }

	/**
	 * Claro caso de sobrecarga
	 * 
	 * @param i
	 * @throws Exception
	 */
	// void aMethod(long i) throws Exception {
	//
	// }

	/**
	 * Otro ejemplo de sobrecarga.
	 */
	void aMethod(long i) {

	}

}
