package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

public class ExcepcionPersonalizadaCantidadInsuficiente extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionPersonalizadaCantidadInsuficiente(String mensaje) {
		super(mensaje);
	}

}
