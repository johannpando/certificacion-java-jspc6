package com.johannpando.certificacion.scjp6.whizlabs.Test1;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Shape2 {
}

class Circle2 extends Shape2 {
}

class Rectangle2 extends Shape2 {
}

/**
 * <p>
 * Insert the correct code at #1 so that the code compiles and runs without
 * errors.
 * </p>
 * <li>A. Vector picture = new Vector < Shape > ();</li> <li>B. Vector picture =
 * new Vector < ? > ();</li> <li>C. Vector picture = new Vector <? extends Shape
 * >();</li>
 */
class Vector2 {
	public static void main(String[] args) {

		// #1
		// Cannot instantiate the type Vector<?>
		// Vector picture = new Vector<?>();

		// Cannot instantiate the type Vector<? extends Shape2>
		// Vector picture = new Vector<? extends Shape2>();

		Vector picture = new Vector<Shape2>();

		picture.add(new Circle2());
		picture.add(new Rectangle2());
		Rectangle2 rect = (Rectangle2) picture.get(1);

		linkedList();
	}

	private static void linkedList() {
		// TODO Auto-generated method stub
		List l1 = new LinkedList();
		List<Object> l2 = new LinkedList<Object>();
		// List<? extends Object> l3 = new LinkedList<? extends Object>();
		List<? extends Object> l3 = new LinkedList<Object>();
		// List<Object> l4 = new List<Object>();

	}
}
