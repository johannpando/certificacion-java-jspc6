package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest;

interface I {
	int i = 0;
}

class A implements I {
	int i = I.i + 1;
}

public class B extends A {

	int i = I.i + 2;

	static void printAll(A obj) {

		System.out.println(obj.i);
	}

	public static void main(String[] args) {
		B b = new B();
		A a = new B();
		I i = new B();
		printAll(b);
		printAll(a);
		// The method printAll(A) in the type B is not applicable for the
		// arguments (I)
		// Error de compilación: Una referencia interface/superclase puede ser
		// asignada a una
		// referencia de una subclase pero no se permite lo contrario.
		// printAll(i);
	}

}
