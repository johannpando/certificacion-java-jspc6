package com.johannpando.certificacion.scjp6.whizlabs.TestIII.ExcepcionesEnHerencia;

class SuperTest {
	int f() {
		return 0;
	}
}

/**
 * The code compiles without errors and prints 5.
 * 
 * Choice C is not valid because protected is more public than default access,
 * so you can override a default method to be protected.
 * 
 * Error and RuntimeException are unchecked exceptions, so they can be thrown in
 * the overriding subclass method even if the overridden method does not throw
 * them.
 * 
 * The variable t is of type Test, so at runtime the method invoked is the
 * method f() defined in the subclass. Thus 5 is printed.
 * 
 * @author Johann
 * 
 */
public class ExcepcionEnHerencia extends SuperTest {
	int i;

	protected int f() throws Error {
		return i;
	}

	ExcepcionEnHerencia(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		SuperTest t = new ExcepcionEnHerencia(5);
		System.out.println(t.f());
	}
}
