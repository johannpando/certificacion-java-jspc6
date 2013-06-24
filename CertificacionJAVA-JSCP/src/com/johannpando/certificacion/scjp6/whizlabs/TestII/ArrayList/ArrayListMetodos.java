package com.johannpando.certificacion.scjp6.whizlabs.TestII.ArrayList;

import java.util.Arrays;

/**
 * El método asList devuelve una lista de tamaño fijo respaldado por la matriz
 * especificada.
 * 
 * El método sort ordena la matriz especificada.
 * 
 * El método toArray se define en la interfaz de Colección y no en la clase de
 * matrices. Así opción C es incorrecta.
 * 
 * No hay métodos llamados toList y búsqueda. Así que las opciones B y D son
 * también correctos.
 * 
 * @author Johann
 * 
 */
public class ArrayListMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] cadenas = { "hola", "adios" };
		Arrays.asList(cadenas);

		Integer[] numeros = { 2, 1 };
		Arrays.sort(numeros);

	}

}
