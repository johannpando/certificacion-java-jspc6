package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.sobrecarga;

/**
 * Sobrecarga de métodos - Cada versión del método debe distinguirse de las
 * otras en el número o tipo de parámetros. <br>
 * <br>
 * NOTA IMPORTANTE: Si cambia el orden de los argumentos, se considera que se
 * cambia la lista de argumentos. Ver método listaArgumentosCambiados
 * 
 * @author jpandode
 * 
 */
public class Sobrecarga {

	public void sobrecarga(String parametro) {

	}

	// Método sobrecargado
	void sobrecarga() {
		sobrecarga(0);
	}

	// Método sobrecargado
	private String sobrecarga(int parametro) {
		return null;
	}

	// Error de compilación, porque no cumple la condición
	// "Cada versión del método debe distinguirse de las otras en el número o tipo de parámetros."
	// public void sobrecarga(String cadena) {

	// }

	// Método sobrecargado
	public void sobrecarga(String parametro, String parametro1) {

	}

	/***
	 * Método que se sobrecargará
	 * 
	 * @param a
	 * @param b
	 */
	public void listaArgumentosCambiados(Integer a, String b) {

	}

	/**
	 * Se ha sobrecargado correctamente porque se ha cambiado la lista de
	 * parámetros original(Integer, String) sobrecargado (String, Integer)
	 * 
	 * @param b
	 * @param a
	 */
	public void listaArgumentosCambiados(String b, Integer a) {

	}
}
