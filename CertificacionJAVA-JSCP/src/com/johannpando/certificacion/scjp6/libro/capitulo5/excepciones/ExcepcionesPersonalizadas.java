package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

public class ExcepcionesPersonalizadas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta();
		try {
			cuenta.extraer(100);
		} catch (ExcepcionPersonalizadaCantidadInsuficiente e) {
			System.out.println(e.getMessage());
		}
	}

}
