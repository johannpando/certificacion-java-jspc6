package com.johannpando.certificacion.scjp6.whizlabs.TestIII.TreeSet1;

import java.util.Set;
import java.util.TreeSet;

class MyClass1 implements java.io.Serializable, Comparable<MyClass1> {
	int i;

	MyClass1(int i) {
		this.i = i;
	}

	public String toString() {
		return ("" + i);
	}

	@Override
	public int compareTo(MyClass1 o) {
		// No está bien sobrescrito.
		return 0;
	}

}

public class TreeSet1Solucion {
	public static void main(String[] args) {
		Set<MyClass1> s = new TreeSet<MyClass1>();
		// ERROR Ejecución:
		/**
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.johannpando.certificacion.scjp6.whizlabs.TestIII.TreeSet1.MyClass
		 * cannot be cast to java.lang.Comparable at
		 * java.util.TreeMap.put(Unknown Source) at
		 * java.util.TreeSet.add(Unknown Source) at
		 * com.johannpando.certificacion
		 * .scjp6.whizlabs.TestIII.TreeSet1.TreeTest.main(TreeTest.java:21)
		 */
		s.add(new MyClass1(2));
		System.out.println(s.size());
		s.add(new MyClass1(3));
		System.out.println(s.size());
		s.add(new MyClass1(1));
		System.out.println(s.size());
		for (MyClass1 m : s)
			System.out.println(m);

		/**
		 * The add() method of TreeSet throws ClassCastException if the elements
		 * of the Set cannot be compared. For this, the element class needs to
		 * implement Comparable interface and override the compareTo() method.
		 * 
		 * Here the MyClass class does not implement Comparable, hence the
		 * error. There are no compiler errors in this code, so choice A is
		 * incorrect.
		 */
	}
}