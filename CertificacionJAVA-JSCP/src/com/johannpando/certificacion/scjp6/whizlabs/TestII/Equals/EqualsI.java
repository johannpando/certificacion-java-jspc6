package com.johannpando.certificacion.scjp6.whizlabs.TestII.Equals;

/**
 * A pesar de que tanto los objetos Float y Double encapsulan el mismo valor, el
 * método Equals devuelve false en la línea 5. Esto es debido a que el método
 * equals se sobreescribe para devolver true si los objetos que se comparan
 * pertenecen a la misma clase de contenedor, además de envolver los mismos
 * valores primitivos.
 * 
 * El operador == devuelve true si las referencias a objetos que se comparan se
 * refieren al mismo objeto, por lo que la línea 6, el resultado devuelve falso
 * como el de salida. La clase StringBuffer no sobrescribe el método equals y la
 * implementación predeterminada del método Equals de la clase de objeto utiliza
 * el operador == para la comparación. Así que la línea 7 imprime también falso.
 * Como la opción C es correcta, todas las demás opciones son automáticamente
 * incorrecta.
 * 
 * @author Johann
 * 
 */
public class EqualsI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");// Línea 1
		StringBuffer s2 = new StringBuffer("hello");// Línea 2
		Float f1 = 9.0F;// Línea 3
		Double f2 = 9.0;// Línea 4
		System.out.println(f1.equals(f2));// Línea 5
		System.out.println(s1 == s2);// Línea 6
		// El método equals de la clase Object implementa el más exigente
		// posible relación de equivalencia en los objetos, es decir, para
		// cualquier valor de referencia no nula x e y, este método devuelve
		// true si y sólo si x e y se refieren al mismo objeto (x == y tiene el
		// valor true).
		System.out.println(s1.equals(s2));// Línea 7

		String hola1 = new String("Hola");
		String hola2 = new String("Hola");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(hola1));
		System.out.println(System.identityHashCode(hola2));
	}

}
