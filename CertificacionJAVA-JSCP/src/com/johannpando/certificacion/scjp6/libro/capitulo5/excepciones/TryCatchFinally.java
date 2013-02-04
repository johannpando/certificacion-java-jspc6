/**
 * 
 */
package com.johannpando.certificacion.scjp6.libro.capitulo5.excepciones;

/**
 * @author jpandode
 * 
 */
public class TryCatchFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int s = 4 / 0;
			System.out.println("int s = 4 / 0;");
		} catch (ArithmeticException e) {
			System.out.println("División por cero 1");
			System.out.println("División por cero 2");
			return;
		} finally {
			System.out.println("Ejecución de finally");
		}
	}
}
