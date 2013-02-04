package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.casteo;

class A {

}

class B extends A {

}

class C extends A {

}

/**
 * Intentar que la clase de un error de ejecuci�n.
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

		// Error: no exsite relaci�n entre z (clase C) e y(clase B)
		// z = (C) y;

		// Error: "(A)y" Type mismatch: cannot convert from A to B
		// y = (A) y;

		// Compila pero no ejecuta.
		// Compilar�, pero lanzar� una excepci�n ClassCastException en tiempo de
		// ejecuci�n, ya que el objeto que se convierte en B no es una instancia
		// de B.
		y = (B) x;
	}

}
