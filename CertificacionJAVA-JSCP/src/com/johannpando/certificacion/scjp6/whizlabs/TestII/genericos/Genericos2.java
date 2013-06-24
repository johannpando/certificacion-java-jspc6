package com.johannpando.certificacion.scjp6.whizlabs.TestII.genericos;

/**
 * Los métodos genéricos son métodos que son parametrizados por uno o más
 * parámetros de tipo. Los métodos genéricos permiten parámetros de tipo a ser
 * utilizados para expresar las dependencias entre los tipos de uno o más
 * argumentos a un método y / o su tipo de retorno. Los parámetros de tipo se
 * deben declarar antes del tipo de valor devuelto del método, pero después de
 * los modificadores. Esta condición es satisfecha por la opción A, pero no por
 * las opciones B y C.
 * 
 * @author Johann
 * 
 */
public class Genericos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	// public <X, Y extends X> static boolean isPresent1(X x, Y[] y){
	//
	// }

	// Los métodos genéricos son métodos que son parametrizados por uno o más
	// parámetros de tipo. Los métodos genéricos permiten parámetros de tipo a
	// ser utilizados para expresar las dependencias entre los tipos de uno o
	// más argumentos a un método y / o su tipo de retorno. Los parámetros de
	// tipo se deben declarar antes del tipo de valor devuelto del método, pero
	// después de los modificadores. Esta condición es satisfecha por la opción
	// A, pero no por las opciones B y C.
	// Opción A
	public static <X, Y extends X> boolean isPresent(X x, Y[] y) {
		return false;
	}

	// Opción B
	// Error de compilación
	// public <X, Y extends X> static boolean isPresent1(X x, Y[] y){

	// }

	// Opción C
	// public static boolean <X, Y extends X> isPresent1(X x, Y[] y){
	//
	// }

	// Correcto
	public <X, Y, Z extends X> void isPresent3() {

	}

	// Correcto
	public <X, Y, Z extends X> void isPresent4(Z z) {

	}
}
