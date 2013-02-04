package com.johannpando.certificacion.scjp6.dia.clasesanidadas.clasesInternasEstandares;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Externa ex = new Externa();
		Externa.Interna in = ex.new Interna();
		in.muestra();
	}

}
