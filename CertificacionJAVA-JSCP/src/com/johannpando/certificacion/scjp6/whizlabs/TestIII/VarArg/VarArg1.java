package com.johannpando.certificacion.scjp6.whizlabs.TestIII.VarArg;

public class VarArg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i[] = { 1, 2, 3, 4 };
		test();
		int ii[] = { 1, 2, 3, 4 };
		test(ii);
		// Aquí no existe el 'autoboxing', es decir se puede 'leer' int a
		// Integer y viceversa, pero no int[] a Integer[] y viceversa.
		// test(i);

	}

	public static void test(int... s) {
		for (int i : s) {
			System.out.printf("%d\n", i);
		}
	}
}
