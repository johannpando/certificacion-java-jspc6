package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.casteo;

class A {

}

class B extends A {

}

class C extends A {

}

/**
 * Intentar que la clase de un error de ejecución.
 * 
 * @author jpandode
 * 
 */
public class TestCasteo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A x = new A();
		B y = new B();
		C z = new C();

		// Ok, debido a que se permite asignar a un objeto de una subclase una
		// referencia de su superclase
		x = y;

		// Error: No se puede convertir la clase A(superclase) en la clase
		// C(subclase)
		// z = x;

		// Error: no exsite relación entre z (clase C) e y(clase B)
		// Cannot cast from B to C
		// z = (C) y;

		// Error: "(A)y" Type mismatch: cannot convert from A to B
		// El error de compilación se produce porque se está intentando ASIGNAR
		// el resultado del casteo, que es correcto (porque el objeto y(clase B)
		// se castea a (A) <<A es mayor que B>>), y como resultado tiene una
		// referencia de la clase A y se intenta asignar a una referencia del
		// objeto B, es decir, B no puede contener a A, porque B es menor que A.
		// Un ejemplo correcto sería:
		// x = (A) y;
		// y = (A) y;

		x = (A) y;

		// Compila pero no ejecuta.
		// Compilará, pero lanzará una excepción ClassCastException en tiempo de
		// ejecución, ya que el objeto que se convierte en B no es una instancia
		// de B.
		y = (B) x;
	}
}
