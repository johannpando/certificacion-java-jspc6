package com.johannpando.certificacion.scjp6.libro.capitulo4.poo.sobrecarga;

/**
 * Sobrecarga de m�todos - Cada versi�n del m�todo debe distinguirse de las
 * otras en el n�mero o tipo de par�metros. <br>
 * <br>
 * NOTA IMPORTANTE: Si cambia el orden de los argumentos, se considera que se
 * cambia la lista de argumentos. Ver m�todo listaArgumentosCambiados
 * 
 * @author jpandode
 * 
 */
public class Sobrecarga {

	public void sobrecarga(String parametro) {

	}

	// M�todo sobrecargado
	void sobrecarga() {
		sobrecarga(0);
	}

	// M�todo sobrecargado
	private String sobrecarga(int parametro) {
		return null;
	}

	// Error de compilaci�n, porque no cumple la condici�n
	// "Cada versi�n del m�todo debe distinguirse de las otras en el n�mero o tipo de par�metros."
	// public void sobrecarga(String cadena) {

	// }

	// M�todo sobrecargado
	public void sobrecarga(String parametro, String parametro1) {

	}

	/***
	 * M�todo que se sobrecargar�
	 * 
	 * @param a
	 * @param b
	 */
	public void listaArgumentosCambiados(Integer a, String b) {

	}

	/**
	 * Se ha sobrecargado correctamente porque se ha cambiado la lista de
	 * par�metros original(Integer, String) sobrecargado (String, Integer)
	 * 
	 * @param b
	 * @param a
	 */
	public void listaArgumentosCambiados(String b, Integer a) {

	}
}
