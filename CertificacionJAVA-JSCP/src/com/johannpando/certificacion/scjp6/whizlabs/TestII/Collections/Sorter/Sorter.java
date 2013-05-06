package com.johannpando.certificacion.scjp6.whizlabs.TestII.Collections.Sorter;

import java.util.ArrayList;
import java.util.Collections;

public class Sorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("USA");
		aList.add("Russia");
		aList.add("UK");
		/**
		 * El método de ordenación en la clase de utilidad colecciones se puede
		 * utilizar para ordenar los objetos de cualquier clase que implementa
		 * la interfaz List.
		 * 
		 * public static void sort (list Listado)
		 * 
		 * El tipo de método de la lista especificada en orden ascendente, según
		 * el orden natural de sus elementos. Todos los elementos de la lista
		 * deben implementar la interfaz Comparable. Además, todos los elementos
		 * de la lista deben ser comparables entre sí (es decir, e1.compareTo
		 * (e2) no debe lanzar una ClassCastException de los elementos E1 y E2
		 * en la lista).
		 */
		Collections.sort(aList);
	}

}
