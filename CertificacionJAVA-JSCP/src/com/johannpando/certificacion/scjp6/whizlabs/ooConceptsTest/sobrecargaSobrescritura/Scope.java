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
	 * El primer error de compilaci�n es:<br>
	 * Cannot reduce the visibility of the inherited method from Base. <br>
	 * <br>
	 * Luego de cambiar el modificador de acce a Public, lanza el siguiente
	 * error de compilaci�n: <br>
	 * Exception Exception is not compatible with throws clause in
	 * Base.aMethod(int) <br>
	 * <br>
	 * Se intenta lanzar una excepci�n que no est� declarada en el m�todo de la
	 * superclase. Y recordar:<br>
	 * Sobrescritura de m�todos no pueden lanzar m�s amplias excepciones
	 * comprobadas que los arrojados por m�todos sobrescritos.
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
