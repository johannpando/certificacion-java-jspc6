package com.johannpando.certificacion.scjp6.dia.clasesAnonimas.clasesInternasEstaticas;

public class Externa {

	/**
	 * Una clase estática interna puede tener métodos no estáticos.
	 * 
	 * @author jpandode
	 * 
	 */
	static class Interna {
		public void muestra() {
			System.out.println("Texto estático");
		}
	}

}
