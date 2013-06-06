package com.johannpando.certificacion.scjp6.whizlabs.TestIII.RetornoCovariante;

interface Inter {
}

class First implements Inter {
	public Inter method1() {
		System.out.println("super");
		return new First();
	}
}

class Second extends First {
	public First method1() {
		System.out.println("sub");
		return new Second();
	}
}

/**
 * El código se muestra el uso de los tipos de cambio covariante es decir, el
 * tipo de devolución del método principal es un subtipo del tipo de devolución
 * del método reemplazado.
 * 
 * Aquí el supertipo es una interfaz, lo cual es perfectamente legal. El objeto
 * de la segunda clase se ha asignado a una variable declarada de tipo First.
 * Esto es posible también desde la segunda clase es una subclase de la primera
 * clase. Dado que el código se compila sin errores, la opción A es incorrecta.
 * 
 * Anulación entra en juego aquí, así que a pesar de que el tipo declarado de la
 * variable primero es lo primero, el método invocado es el de segunda clase.
 * Entonces, la salida es "sub". Así opción C es incorrecta, mientras opción D
 * es la correcta.
 * 
 * @author Johann
 * 
 */
public class RetornoCovariante1 {
	public static void main(String[] args) {
		First first = new Second();
		Inter first1 = first.method1();
	}
}