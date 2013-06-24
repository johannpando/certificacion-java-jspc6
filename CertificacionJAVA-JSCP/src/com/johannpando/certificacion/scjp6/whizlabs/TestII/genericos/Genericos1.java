package com.johannpando.certificacion.scjp6.whizlabs.TestII.genericos;

import java.util.LinkedList;
import java.util.List;

public class Genericos1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Parámetros genéricos no adminten primitivos, lo tenía claro.
		// LinkedList<Integer> l = new LinkedList<int>();

		// No tuve dudas de que era correcto.
		List<Number> l = new LinkedList<Number>();

		// Type safety: The expression of type LinkedList needs unchecked
		// conversion to conform to LinkedList<Integer>
		// Seguridad de tipos: La expresión de tipo LinkedList necesita
		// conversión sin marcar para cumplir con LinkedList <Integer>.
		// Pero compila y no lo marqué como correcto.
		LinkedList<Integer> l1 = new LinkedList();

		// The constructor LinkedList() of type LinkedList is not generic; it
		// cannot be parameterized with arguments <Integer>
		// El LinkedList constructor () de tipo LinkedList no es genérico, no se
		// puede parametrizar con argumentos <Integer>
		// ERROR de COMPILACIÓN: Error de asignación.
		// es incorrecta porque el lado derecho de la asignación utiliza la
		// sintaxis incorrecta.
		// LinkedList<Integer> l2 = new<Integer> LinkedList();

		// Type mismatch: cannot convert from LinkedList<Integer> to
		// List<Number>
		// List<Number> l3 = new LinkedList<Integer>();
	}
}
