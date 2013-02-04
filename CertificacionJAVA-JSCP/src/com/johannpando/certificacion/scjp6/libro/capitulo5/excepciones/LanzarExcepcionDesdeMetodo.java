package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

public class LanzarExcepcionDesdeMetodo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			imprime(null);
		} catch (Exception e) {
			// throw e;// Relanzando una excepción, además debería declararse en
			// la
			// cabecera del método o añadir un try/catch
			System.out.println("nulo");// Si lanzo la excepción, este código no
										// se puede leer.
		}
	}

	static void imprime(Integer i) throws Exception {
		if (i != null) {
			System.out.println(i);
		} else {
			// Se lanza la excepción desde el método con la palabra "throw"
			throw new Exception();
		}
	}
}
