package com.johannpando.certificacion.scjp6.dia.clasesAnonimas.clasesInternasEstaticas;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instanciaci�n de la clase est�tica
		Externa.Interna ej = new Externa.Interna();
		ej.muestra();// Llamada al m�todo de la clase est�tica.
	}

}
