package com.johannpando.certificacion.scjp6.whizlabs.Test1;

import java.util.Vector;

class Shape {

}

class Circle extends Shape {

}

class Rectangle extends Shape {

}

/**
 * <p>
 * The wildcard character (?) indicates unknown types, so the compiler does not
 * allow adding or inserting into such types.
 * 
 * It is allowed to assign generic types to raw types, so Vector<Shape> can be
 * assigned to Vector type. However, since we use a generic class without
 * specifying the type of its element, the compiled code is not type-safe and
 * the compiler will issue a warning.
 * </p>
 * 
 * <p>
 * El carácter comodín (?) Indica tipos desconocidos, por lo que el compilador
 * no permite agregar o insertar en dichos tipos.
 * 
 * Se permite asignar tipos genéricos para tipos raw, así <forma> Vector puede
 * ser asignado a tipo de vector. Sin embargo, como utilizar una clase genérica,
 * sin especificar el tipo de su elemento, el código compilado no es con
 * seguridad de tipos y el compilador emitirá una advertencia.
 * </p>
 * 
 * @author Johann
 * 
 */
public class VectorComodin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// El carácter comodín (?) Indica tipos desconocidos, por lo que el
		// compilador no permite agregar o insertar en dichos tipos.

		// Se permite asignar tipos genéricos para tipos raw, así <forma> Vector
		// puede ser asignado a tipo de vector. Sin embargo, como utilizar una
		// clase genérica, sin especificar el tipo de su elemento, el código
		// compilado no es con seguridad de tipos y el compilador emitirá una
		// advertencia.
		// Vector picture = new Vector<? extends Shape>();

		Vector picture = new Vector<Shape>();

	}
}
