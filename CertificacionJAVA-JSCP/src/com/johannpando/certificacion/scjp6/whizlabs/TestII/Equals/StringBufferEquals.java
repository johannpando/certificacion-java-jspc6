package com.johannpando.certificacion.scjp6.whizlabs.TestII.Equals;

/**
 * El operador == devuelve true, cuando se utiliza para comparar las referencias
 * a objetos, si ambos operandos se refieren al mismo objeto. Aquí, tanto s1 y
 * s2 son referencias al mismo objeto StringBuffer. Puesto que el objeto es el
 * mismo, el método también devuelve es igual a verdadero. Así que las opciones
 * A y B son correctas.
 * 
 * Si dos objetos son iguales, sus hashcodes también deben ser iguales. Así
 * opción C también es correcta. Desde s3 y s1 se refieren a dos objetos
 * distintos, devuelve s1 s3 == false. Así opción D es incorrecta.
 * 
 * Dos objetos desiguales pueden tener iguales hashcodes, a pesar de que es
 * preferible tener diferentes hashcodes para un mejor rendimiento.
 * 
 * @author Johann
 * 
 */
public class StringBufferEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = s1;

		System.out.println("s2==s1: " + (s2 == s1));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		System.out.println("s1.hashCode() == s2.hashCode(): "
				+ (s1.hashCode() == s2.hashCode()) + "\n\n");

		StringBuffer ss1 = new StringBuffer("test");
		StringBuffer ss2 = new StringBuffer("test");

		System.out.println("ss2==ss1: " + (ss2 == ss1));
		System.out.println("ss1.equals(ss2): " + ss1.equals(ss2));
		System.out.println("ss1.hashCode() == ss2.hashCode(): "
				+ (ss1.hashCode() == ss2.hashCode()));

	}
}
