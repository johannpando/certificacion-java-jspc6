package com.johannpando.certificacion.scjp6.whizlabs.TestII.GarbageCollection;

class MyClass {
	private MyClass z;

	public void other(MyClass c) {
		z = c;
	}

	protected void finalize() {
		System.out.println("called");
	}
}

public class GarbageCollection {
	private static void f() {
	}

	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		c1.other(c2);
		c2.other(c1);
		MyClass c3 = new MyClass();
		c1 = c3;
		c2 = c3;
		f();
	}
}