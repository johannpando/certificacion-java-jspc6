package com.johannpando.certificacion.scjp6.whizlabs.TestIII.TreeSet1;

import java.util.Set;
import java.util.TreeSet;

class MyClass implements java.io.Serializable {
	int i;

	MyClass(int i) {
		this.i = i;
	}

	public String toString() {
		return ("" + i);
	}
}

public class TreeTest {
	public static void main(String[] args) {
		Set<MyClass> s = new TreeSet<MyClass>();
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
		s.add(new MyClass(2));
		s.add(new MyClass(3));
		s.add(new MyClass(1));
		for (MyClass m : s)
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