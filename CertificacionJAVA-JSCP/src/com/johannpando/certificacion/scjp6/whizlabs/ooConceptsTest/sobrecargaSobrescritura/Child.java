package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.sobrecargaSobrescritura;

class Parent {
	static int i = 10;

	void m1() {
		System.out.println("In parent " + i);
	}

	static void m1(String s) {
		System.out.println(s + i);
	}
}

public class Child extends Parent {

	static int i = 20;

	void m1() {
		System.out.println("In child " + Child.i);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
		System.out.println("Child data " + p.i);
	}

}
