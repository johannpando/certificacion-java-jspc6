package com.johannpando.certificacion.scjp6.dia.clasesAnonimas.clasesInternasEstaticas;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instanciación de la clase estática
		Externa.Interna ej = new Externa.Interna();
		ej.muestra();// Llamada al método de la clase estática.
	}

}
