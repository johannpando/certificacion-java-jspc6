package com.johannpando.certificacion.scjp6.whizlabs.Test1;

public class StringEqualsIgualIgual {

	static String s1 = "I am Unique!";

	public static void main(String[] args) {
		String s2 = "I am Unique!";

		// s1 y s2 apuntan al mismo objeto = "I am Unique!"
		// Por lo tanto se imprimirá dos veces "true"
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		// Los String son inmutables...
		// Se está creando un nuevo objeto que contiene una cadena
		String s3 = new String(s1);
		// Por ello, se imprimirá false
		System.out.println(s3 == s2);

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

	}

}
