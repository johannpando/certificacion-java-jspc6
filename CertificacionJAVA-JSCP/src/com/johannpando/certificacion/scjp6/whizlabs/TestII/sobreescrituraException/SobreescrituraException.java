package com.johannpando.certificacion.scjp6.whizlabs.TestII.sobreescrituraException;

/**
 * El método de la clase A3 test () sólo puede lanzar RuntimeException y
 * Exception2. Dado que el método de la clase A2 está lanzando sólo Exception2
 * como una excepción comprobada, el método predominante en el A3 clase derivada
 * sólo puede también lanzar Exception2 como una excepción comprobada.
 * Exception1 y Exception2 se comprueban excepciones, ya que se extienden de
 * excepción. Así que las opciones A y B son incorrectas.
 * 
 * Sin embargo, RuntimeException puede ser lanzado, ya que es una excepción sin
 * control y métodos de alteración temporal no tienen restricciones en el
 * lanzamiento de excepciones sin control. Así opción D es incorrecta.
 * 
 * @author Johann
 * 
 */
public class SobreescrituraException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Exception1 extends Exception {

}

class Exception2 extends Exception {

}

class A1 {
	void test() throws Exception1, Exception2 {
	}
}

class A2 extends A1 {
	void test() throws Exception2 {
	}
}

class A3 extends A2 {
	void test() throws RuntimeException, Exception2, ArithmeticException {
	}

}
