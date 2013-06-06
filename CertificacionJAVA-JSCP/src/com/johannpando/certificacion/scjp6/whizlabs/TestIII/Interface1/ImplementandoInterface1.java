package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Interface1;

abstract class SuperTest {
	static int i = 10;
}

class ImplementandoInterface1 extends SuperTest implements Inter {
	final static int i;
	static {
		i = 9;
	}

	// Los métodos de una interface, en este caso, de nuestra Interface (Inter),
	// son implícimante públicos (y estáticos), por lo que al implementarlos,
	// también se deben implementar como públicos, de lo contrario se está
	// reduciendo su visbilidad, regla inrompible de la sobreescritura de
	// métodos.
	// void f() {
	// System.out.println("i is " + i);
	// }

	// REPARADO
	public void f() {
		System.out.println("i is" + i);
	}

	public static void main(String[] args) {
		Inter t = new ImplementandoInterface1();
		t.f();
	}
}

interface Inter {
	int i = 1;

	void f();
}