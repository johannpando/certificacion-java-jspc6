package com.johannpando.certificacion.scjp6.libro.capitulo5.aserciones;

/**
 * Para habilitar las aserciones, en eclipse están deshabilitadas por defecto,
 * hay que editar el jdk y en la casilla de jvm arguments, "-ea".
 * 
 * @author jpandode
 * 
 */
public class Asercion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		procesa(-5);
		procesa(-6, " no es positivo");
	}

	/**
	 * Lanzará un AssertionError
	 * <code><strong>que no deberá ser capturado</strong></code> si el número es
	 * negativo.
	 * 
	 * @param num
	 */
	private static void procesa(int num) {
		assert (num > 0);
	}

	/**
	 * Segunda forma de dos de utilizar aserciones que permite enviar
	 * información adidicional a la consola cuando se produce el error de
	 * asercion.
	 * 
	 * @param num
	 * @param cadena
	 */
	private static void procesa(int num, String cadena) {
		assert (num > 0) : num + cadena;
	}

}
