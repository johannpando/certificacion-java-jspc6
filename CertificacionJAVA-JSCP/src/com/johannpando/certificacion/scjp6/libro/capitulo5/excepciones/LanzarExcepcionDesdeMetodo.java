package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

public class LanzarExcepcionDesdeMetodo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			imprime(null);
		} catch (Exception e) {
			// throw e;// Relanzando una excepci�n, adem�s deber�a declararse en
			// la
			// cabecera del m�todo o a�adir un try/catch
			System.out.println("nulo");// Si lanzo la excepci�n, este c�digo no
										// se puede leer.
		}
	}

	static void imprime(Integer i) throws Exception {
		if (i != null) {
			System.out.println(i);
		} else {
			// Se lanza la excepci�n desde el m�todo con la palabra "throw"
			throw new Exception();
		}
	}
}
