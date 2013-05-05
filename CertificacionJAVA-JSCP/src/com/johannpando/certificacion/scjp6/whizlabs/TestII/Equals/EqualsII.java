package com.johannpando.certificacion.scjp6.whizlabs.TestII.Equals;

public class EqualsII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Objetos String pueden estar compuestos por secuencias idénticas de
		// caracteres. El operador ==, cuando se utiliza en las referencias a
		// objetos de cadena, se acaba de comparar las referencias y sólo
		// devolverá true si ambas referencias se refieren al mismo objeto, es
		// decir, son alias. Así que las opciones A y B son incorrectas,
		// mientras opción C es la correcta.

		String a = new String("hello");
		String b = new String(a);
		String c = a;
		char[] d = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(a == "hello");// Opción A
		System.out.println(a == b);// Opción B
		System.out.println(a == c);// Opción C
		System.out.println(a.equals(b));// Opción D
		System.out.println(a.equals(d));// Opción E

		// El método equals () devolverá true siempre que el contenido de los
		// objetos String son idénticos. Así opción D también es correcta. Un
		// conjunto de caracteres y una cadena son dos tipos completamente
		// diferentes y no se puede comparar con el método equals () de la clase
		// String. Así opción E es incorrecta.

		// String aa = "hello";
		// System.out.println("a:" + System.identityHashCode(a));
		// System.out.println("hello:" + System.identityHashCode("hello"));
		// System.out.println("hello:" + System.identityHashCode("hello"));
		// System.out.println("aa:" + System.identityHashCode(aa));
		// System.out.println(aa == "hello");
	}
}
