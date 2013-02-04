package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest;

class A1 {
	static void f() {
		System.out.println("Inside A");
	}

	// void f1() {
	//
	// }
}

class B1 extends A1 {

	static void f() {
		System.out.println("Inside B");
	}

	// void f1() {
	//
	// }
}

class C1 extends B1 {
	static void f() {

		System.out.println("Inside C");
	}
}

public class D {

	/**
	 * Aquí tenemos que señalar que los métodos estáticos no son realmente
	 * sobreescritos, Por Ejemplo, el método invocado se basa en el tipo de
	 * variable de referencia y no en el tipo de objeto en tiempo de ejecución
	 * real. Así, en todas las tres invocaciones, a través del objeto real
	 * invocando es de tipo C, los tipos de variables de referencia son
	 * diferentes.<br>
	 * <br>
	 * Here we have to note that static methods are not actually overridden, por
	 * ejemplo, the method invoked is based on the reference variable type and
	 * not on the actual object type at runtime. So in all the three
	 * invocations, through the actual invoking object is of type C, the
	 * reference variable types are different.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		C1 c = new C1();
		c.f();
		B1 b = c;
		b.f();
		A1 a = (B1) c;
		a.f();
	}
}
