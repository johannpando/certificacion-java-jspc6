package com.johannpando.certificacion.scjp6.dia.clasesAnonimas.clasesInternasEstaticas;

public class Externa {

	/**
	 * Una clase est�tica interna puede tener m�todos no est�ticos.
	 * 
	 * @author jpandode
	 * 
	 */
	static class Interna {
		public void muestra() {
			System.out.println("Texto est�tico");
		}
	}

}
