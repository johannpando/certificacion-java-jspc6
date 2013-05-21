package com.johannpando.certificacion.scjp6.whizlabs.TestII.GarbageCollection;

public class GarbageCollection2 {
	public static void main(String[] args) {
		String msg; // 1
		String a = new String("abc"); // 2
		System.out.println("a - " + System.identityHashCode(a));
		String b = null; // 3
		b = a; // 4
		System.out.println("b - " + System.identityHashCode(b));
		a = new String("abc"); // 5
		System.out.println("a - " + System.identityHashCode(a));
		System.out.println("b - " + System.identityHashCode(b));
		b += "de"; // 6
		System.out.println("b - " + System.identityHashCode(b));
		System.out.println(b); // 7
		b = null; // 8
	}
}
